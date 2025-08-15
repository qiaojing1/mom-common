package com.lets.platform.customize.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSON;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.util.AESEncodeDecodeUtils;
import com.lets.platform.common.pojo.util.IdUtil;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.ReplacementRule;
import com.lets.platform.model.uc.entity.SysRole;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
@Slf4j
public class DynamicIdReplacer {
    private final Map<Object, Map<String, String>> idMappings = new HashMap<>();

    /**
     * 动态替换多层级ID
     * @param rules 替换规则（按依赖顺序传入）
     * @param lists 对应的数据列表
     */
    public final void replaceIds(List<ReplacementRule> rules, boolean firstReplace, List<?>... lists) {
        for (int i = 0; i < lists.length; i++) {
            List<?> list = lists[i];
            ReplacementRule rule = rules.get(i);

            for (Object obj : list) {
                // 生成新ID并记录映射（使用 rule.entityClass 作为键）
                String oldId = getFieldValue(obj, rule.getIdField());
                String newId = oldId;
                String currOldId = getFieldValue(obj, "oldId");
                if (!firstReplace && CollUtil.isEmpty(rule.getRelationMappings())) {  //不关联
                    oldId = getFieldValue(obj, "oldId");
                }

                if (firstReplace || CollUtil.isNotEmpty(rule.getRelationMappings())) {
                    newId = IdUtil.getStrId(); // 确保生成新ID
                }

                setFieldValue(obj, rule.getIdField(), newId);
                idMappings
                        .computeIfAbsent(rule.getEntityClass(), k -> new HashMap<>())
                        .put(oldId, newId); // 关键修改：使用 rule.entityClass 作为键

                // 替换关联字段
                if (rule.getRelationMappings() != null) {
                    for (Map.Entry<String, Class<?>> entry : rule.getRelationMappings().entrySet()) {
                        String relationField = entry.getKey();
                        Class<?> refEntityClass = entry.getValue();
                        String oldRelationId = getFieldValue(obj, relationField);

                        // 通过 refEntityClass 获取映射（不再依赖 obj.getClass()）
                        Map<String, String> refMap = idMappings.get(refEntityClass);
                        if (refMap == null) {
                            throw new IllegalStateException("未找到映射对于类: " + refEntityClass.getSimpleName());
                        }

                        String newRelationId = refMap.get(oldRelationId);
                        if (newRelationId == null) {
                            log.error("旧ID未映射: {}" , oldRelationId);
                            continue;
//                            throw new IllegalStateException("旧ID未映射: " + oldRelationId);
                        }

                        setFieldValue(obj, relationField, newRelationId);
                    }
                }
            }
        }
    }

    private String getFieldValue(Object obj, String fieldName) {
        try {
            // 1. 获取字段对象（支持私有字段）
            Field field = findFieldIncludingSuperclasses(obj.getClass(), fieldName); // 关键修改
            field.setAccessible(true);

            // 2. 获取值并校验类型
            Object value = field.get(obj);
            if (value == null) return null;
            if (value instanceof String) {
                return (String) value;
            } else {
                throw new IllegalArgumentException(
                        "字段类型不匹配: " + fieldName + " 期望类型 String，实际类型 " + value.getClass().getSimpleName()
                );
            }
        }  catch (IllegalAccessException e) {
            throw new RuntimeException("字段访问失败: " + fieldName, e);
        }
    }

    private void setFieldValue(Object obj, String fieldName, String value) {
        try {
            // 1. 获取字段对象
            Field field = findFieldIncludingSuperclasses(obj.getClass(), fieldName); // 关键修改
            field.setAccessible(true);

            // 2. 处理基本类型兼容（如 long 类型字段）
            Class<?> type = field.getType();
            if (type == String.class) {
                field.set(obj, value);
            } else {
                throw new IllegalArgumentException(
                        "字段类型不匹配: " + fieldName + " 期望类型 String，实际类型 " + type.getSimpleName()
                );
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException("字段访问失败: " + fieldName, e);
        }
    }
    private Field findFieldIncludingSuperclasses(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            // 递归查找父类
            Class<?> superClass = clazz.getSuperclass();
            if (superClass != null && !superClass.equals(Object.class)) {
                return findFieldIncludingSuperclasses(superClass, fieldName);
            } else {
                throw new RuntimeException("字段不存在: " + fieldName + "，类名: " + clazz.getSimpleName(), e);
            }
        }
    }


    /** 验证ZIP文件格式 */
    public void validateZipFile(MultipartFile file) {
        String filename = file.getOriginalFilename();
        String suffixName = null;
        if (filename != null) {
            suffixName = filename.split("\\.")[1];
        }
        ServiceAssert.isTrue("zip".equalsIgnoreCase(suffixName), 0, "文件格式非法,请导入ZIP文件");
    }

    /** 创建ZIP输入流 */
    public ZipInputStream createZipInputStream(MultipartFile file) throws IOException {
        return new ZipInputStream(file.getInputStream(), StandardCharsets.UTF_8);
    }

    /** 通用方法：提取ZIP中指定条目的内容（支持大文件） */
    public String extractZipEntryContent(ZipInputStream zipIn, String targetEntryName)
            throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ZipEntry entry;

        while ((entry = zipIn.getNextEntry()) != null) {
            if (targetEntryName.equals(entry.getName())) {
                byte[] tempBuffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = zipIn.read(tempBuffer)) != -1) {
                    buffer.write(tempBuffer, 0, bytesRead);
                }
                zipIn.closeEntry();
                return buffer.toString(StandardCharsets.UTF_8.name());
            }
            zipIn.closeEntry(); // 关闭非目标条目
        }
        return "";
    }

    public Map<String, String> extractZipEntryContent(ZipInputStream zipIn, Set<String> targetEntryNames)
            throws IOException {

        Map<String, String> result = new LinkedHashMap<>();
        ZipEntry entry;

        while ((entry = zipIn.getNextEntry()) != null) {
            String entryName = entry.getName();

            // 判断是否匹配目标条目
            boolean isMatch = targetEntryNames.stream().anyMatch(pattern -> {
                // 支持简单通配符匹配，如 "*.json"
                if (pattern.contains("*")) {
                    String regex = pattern.replace(".", "\\.").replace("*", ".*");
                    return entryName.matches(regex);
                }
                return entryName.equals(pattern);
            });

            if (isMatch) {
                try (ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
                    byte[] tempBuffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = zipIn.read(tempBuffer)) != -1) {
                        buffer.write(tempBuffer, 0, bytesRead);
                    }
                    result.put(entryName, buffer.toString(StandardCharsets.UTF_8.name()));
                }
            }
            zipIn.closeEntry();
        }
        return result;
    }


    /** 处理数据（带泛型可复用） */
    public <T> List<T> processJsonData(String jsonContent, Class<T> clazz, String tenancyId) {
        String decodedJson = AESEncodeDecodeUtils.decode(jsonContent);
        List<T> dataList = JSON.parseArray(decodedJson, clazz);
        // 如果对象有tenancyId字段则统一设置
        if (dataList != null && !dataList.isEmpty()) {
            dataList.forEach(entity ->
                    ((BaseEntity) entity).setTenancyId(tenancyId));

        }
        return dataList;
    }
}


