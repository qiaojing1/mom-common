package com.lets.platform.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiMaterial;
import com.lets.platform.model.psi.vo.MaterialQueryParam;
import com.lets.platform.model.whereBuild.SpringContextUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * @author zhangweiyan
 * @ClassName SetMaterialExtFlUtil
 * @Description 设置物料扩展规格属性
 * @Date 2024/11/21 09:38
 **/
public class SetMaterialExtFlUtil {
    public static final Integer currentMaterialExtNumLimit = 32;
    public static final Integer currentMaterialRemarkNumLimit = 2;

    public static <T> void setExtFl(T record, PsiMaterial psiMaterial) {
        if (Objects.isNull(psiMaterial)) {
            return;
        }
        if (Objects.isNull(record)) {
            return;
        }

        IntStream.range(1, currentMaterialExtNumLimit + 1).forEach(i -> {
            try {
                String extFlIdMethodId = "getExtFl" + i;
                String extFlIdMethodName = "getExtFlName" + i;
                Method getExtFlIdMethodId = PsiMaterial.class.getMethod(extFlIdMethodId);
                Method getExtFlIdMethodName = PsiMaterial.class.getMethod(extFlIdMethodName);
                String extFlName = Optional.ofNullable(getExtFlIdMethodName.invoke(psiMaterial)).orElse("").toString();
                Optional.ofNullable(getExtFlIdMethodId.invoke(psiMaterial)).ifPresent(item -> {
                    String extFlId = item.toString();
                    String setExtFlNameFunction = "setExtFlName" + i;
                    String setExtFlIdFunction = "setExtFl" + i;
                    Method setExtFlNameMethod;
                    Method setExtFlIdMethod;
                    try {
                        // 使用反射获取目标泛型类中的set方法
                        setExtFlNameMethod = record.getClass().getMethod(setExtFlNameFunction, String.class);
                        setExtFlIdMethod = record.getClass().getMethod(setExtFlIdFunction, String.class);
                        setExtFlIdMethod.invoke(record, extFlId);
                        setExtFlNameMethod.invoke(record, extFlName);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        IntStream.range(1, currentMaterialRemarkNumLimit + 1).forEach(i -> {
            try {
                String remarkMethodId = "getRemark" + i;
                Method remarkMethod = PsiMaterial.class.getMethod(remarkMethodId);
                Optional.ofNullable(remarkMethod.invoke(psiMaterial)).ifPresent(item -> {
                    String remark = item.toString();
                    String setRemarkFunction = "setRemark" + i;
                    Method setRemarkMethod;
                    try {
                        // 使用反射获取目标泛型类中的set方法
                        setRemarkMethod = record.getClass().getMethod(setRemarkFunction, String.class);
                        setRemarkMethod.invoke(record, remark);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    // 缓存每个类的方法
    private static final Map<Class<?>, RecordSetter> SETTER_CACHE = new ConcurrentHashMap<>();

    // 物料类的方法缓存（只需初始化一次）
    private static final MaterialMethods MATERIAL_METHODS = initMaterialMethods();

    public static <T> void setExtFl(List<T> records, Collection<String> materialIds) {
        if (CollectionUtil.isEmpty(records) || CollectionUtil.isEmpty(materialIds)) {
            return;
        }
        // 获取物料数据
        Map<String, PsiMaterial> materialMap = fetchMaterials(materialIds);
        if (CollectionUtil.isEmpty(materialMap)) return;

        for (T record : records) {
            try {
                Class<?> recordClass = record.getClass();
                RecordSetter setter = SETTER_CACHE.computeIfAbsent(recordClass,
                        cls -> createRecordSetter(cls, MATERIAL_METHODS));

                // 获取物料ID
                String materialId = setter.getMaterialId(record);
                if (StrUtil.isBlank(materialId)) continue;

                // 获取物料数据
                PsiMaterial material = materialMap.get(materialId);
                if (material == null) continue;

                // 设置字段
                setter.setFields(record, material);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // 初始化物料类方法缓存
    private static MaterialMethods initMaterialMethods() {
        MaterialMethods methods = new MaterialMethods();
        Class<PsiMaterial> clazz = PsiMaterial.class;

        // 图纸编号
        methods.getDrawingNumber = findMethod(clazz, "getDrawingNumber");

        // 扩展字段 (32个)
        methods.getExtFlIdMethods = new Method[currentMaterialExtNumLimit];
        methods.getExtFlNameMethods = new Method[currentMaterialExtNumLimit];
        for (int i = 0; i < currentMaterialExtNumLimit; i++) {
            int index = i + 1;
            methods.getExtFlIdMethods[i] = findMethod(clazz, "getExtFl" + index);
            methods.getExtFlNameMethods[i] = findMethod(clazz, "getExtFlName" + index);
        }

        // 备注字段 (2个)
        methods.getRemarkMethods = new Method[currentMaterialRemarkNumLimit];
        for (int i = 0; i < currentMaterialRemarkNumLimit; i++) {
            int index = i + 1;
            methods.getRemarkMethods[i] = findMethod(clazz, "getRemark" + index);
        }

        return methods;
    }

    // 创建记录类的设置器
    private static RecordSetter createRecordSetter(Class<?> recordClass, MaterialMethods materialMethods) {
        return new RecordSetter() {
            // 获取物料ID的方法
            private final Method getMaterialIdMethod = findGetMaterialIdMethod(recordClass);

            // 设置图纸编号的方法
            private final Method setDrawingNumberMethod = findMethod(recordClass, "setDrawingNumber", String.class);

            // 扩展字段设置器 (32个)
            private final FieldSetter[] extFlSetters = createExtFlSetters(recordClass);

            // 备注字段设置器 (2个)
            private final FieldSetter[] remarkSetters = createRemarkSetters(recordClass);

            @Override
            public String getMaterialId(Object record) throws Exception {
                if (getMaterialIdMethod == null) return null;
                Object result = getMaterialIdMethod.invoke(record);
                return result != null ? result.toString() : null;
            }

            @Override
            public void setFields(Object record, PsiMaterial material) throws Exception {
                // 1. 设置图纸编号
                if (setDrawingNumberMethod != null && materialMethods.getDrawingNumber != null) {
                    Object value = materialMethods.getDrawingNumber.invoke(material);
                    setDrawingNumberMethod.invoke(record, value != null ? value.toString() : null);
                }

                // 2. 设置扩展字段
                for (int i = 0; i < currentMaterialExtNumLimit; i++) {
                    if (extFlSetters[i] != null) {
                        extFlSetters[i].set(record, material, materialMethods, i);
                    }
                }

                // 3. 设置备注字段
                for (int i = 0; i < currentMaterialRemarkNumLimit; i++) {
                    if (remarkSetters[i] != null) {
                        remarkSetters[i].set(record, material, materialMethods, i);
                    }
                }
            }
        };
    }

    // 创建扩展字段设置器
    private static FieldSetter[] createExtFlSetters(Class<?> recordClass) {
        FieldSetter[] setters = new FieldSetter[currentMaterialExtNumLimit];
        for (int i = 0; i < currentMaterialExtNumLimit; i++) {
            int index = i + 1;
            try {
                Method setIdMethod = findMethod(recordClass, "setExtFl" + index, String.class);
                Method setNameMethod = findMethod(recordClass, "setExtFlName" + index, String.class);

                if (setIdMethod != null && setNameMethod != null) {
                    setters[i] = (record, material, methods, idx) -> {
                        // 获取ID值
                        Object idValue = methods.getExtFlIdMethods[idx].invoke(material);
                        setIdMethod.invoke(record, idValue != null ? idValue.toString() : null);

                        // 获取名称值
                        Object nameValue = methods.getExtFlNameMethods[idx].invoke(material);
                        setNameMethod.invoke(record, nameValue != null ? nameValue.toString() : null);
                    };
                }
            } catch (Exception e) {
                // 忽略缺失方法
                e.printStackTrace();
            }
        }
        return setters;
    }

    // 创建备注字段设置器
    private static FieldSetter[] createRemarkSetters(Class<?> recordClass) {
        FieldSetter[] setters = new FieldSetter[currentMaterialRemarkNumLimit];
        for (int i = 0; i < currentMaterialRemarkNumLimit; i++) {
            int index = i + 1;
            try {
                Method setMethod = findMethod(recordClass, "setRemark" + index, String.class);

                if (setMethod != null) {
                    setters[i] = (record, material, methods, idx) -> {
                        Object value = methods.getRemarkMethods[idx].invoke(material);
                        setMethod.invoke(record, value != null ? value.toString() : null);
                    };
                }
            } catch (Exception e) {
                // 忽略缺失方法
                e.printStackTrace();
            }
        }
        return setters;
    }

    private static Method findMethod(Class<?> clazz, String methodName, Class<?>... paramTypes) {
        try {
            return clazz.getMethod(methodName, paramTypes);
        } catch (NoSuchMethodException e) {
            // 尝试查找可能存在的变体
            return Arrays.stream(clazz.getMethods())
                    .filter(m -> m.getName().equals(methodName))
                    .filter(m -> Arrays.equals(m.getParameterTypes(), paramTypes))
                    .findFirst()
                    .orElse(null);
        }
    }

    private static Method findGetMaterialIdMethod(Class<?> clazz) {
        // 1. 尝试标准方法名
        try {
            return clazz.getMethod("getMaterialId");
        } catch (NoSuchMethodException ignored) {}

        // 2. 尝试常见变体
        for (String name : Arrays.asList("getMaterialID", "getMaterialIdString", "getMaterialIdentifier")) {
            try {
                return clazz.getMethod(name);
            } catch (NoSuchMethodException ignored) {}
        }

        // 3. 查找包含"MaterialId"的getter方法
        return Arrays.stream(clazz.getMethods())
                .filter(m -> m.getName().startsWith("get"))
                .filter(m -> m.getName().contains("MaterialId"))
                .filter(m -> m.getParameterCount() == 0)
                .findFirst()
                .orElse(null);
    }

    // ===== 辅助类 =====
    interface RecordSetter {
        String getMaterialId(Object record) throws Exception;
        void setFields(Object record, PsiMaterial material) throws Exception;
    }

    interface FieldSetter {
        void set(Object record, PsiMaterial material, MaterialMethods methods, int index) throws Exception;
    }

    static class MaterialMethods {
        Method getDrawingNumber;
        Method[] getExtFlIdMethods;    // 32个
        Method[] getExtFlNameMethods;  // 32个
        Method[] getRemarkMethods;     // 2个
    }

    // 获取物料数据的方法（实际实现）
    private static Map<String, PsiMaterial> fetchMaterials(Collection<String> materialIds) {
        // 查询物料
        Object materialClient = SpringContextUtil.getBean("com.lets.platform.client.psi.MaterialClient");
        MaterialQueryParam queryParam = new MaterialQueryParam();
        queryParam.setMaterialIds(new ArrayList<>(materialIds));
        queryParam.setTabs(new ArrayList<>());
        List<PsiMaterial> materials = new ArrayList<>();
        try {
            Object byMaterialIds = MethodUtils.invokeMethod(materialClient, "getMaterialByMaterialIds", queryParam);
            if (byMaterialIds instanceof RespMsgBean && ((RespMsgBean) byMaterialIds).getCode() == 200) {
                materials.addAll(((RespMsgBean<List<PsiMaterial>>) byMaterialIds).getData());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (CollectionUtil.isEmpty(materials)) {
            return Collections.emptyMap();
        }
        Map<String, PsiMaterial> materialMap = materials.stream().collect(Collectors.toMap(BaseEntity::getId, Function.identity()));

        return materialMap;
    }
}
