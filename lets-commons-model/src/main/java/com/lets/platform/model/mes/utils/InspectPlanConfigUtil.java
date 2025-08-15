package com.lets.platform.model.mes.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.model.mes.entity.InspectPlanConfig;
import com.lets.platform.model.mes.entity.InspectPlanConfigMaterialExt;
import com.lets.platform.model.mes.enums.InspectProcessRangeEnum;
import com.lets.platform.model.mes.enums.MaterialRangeEnum;
import com.lets.platform.model.psi.entity.PsiMaterial;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 检验方案 工具类
 *
 * @author: DING WEI
 * @date: 2024/5/20 17:12
 */
public class InspectPlanConfigUtil {

    public static List<InspectPlanConfig> getInspectPlanConfigList(PsiMaterial material, String processId, List<InspectPlanConfig> inspectPlanConfigList) {
        if (material == null || CollUtil.isEmpty(inspectPlanConfigList)) {
            return new ArrayList<>();
        }
        Map<String, String> extMap = getExtFieldMap(material);

        Stream<InspectPlanConfig> stream = inspectPlanConfigList.stream().filter(inspectPlanConfig -> MaterialRangeEnum.ALL.equals(inspectPlanConfig.getMaterialRange())
                                                                                                      || isMatchMaterial(inspectPlanConfig, material)
                                                                                                      || isMatchMaterialGroup(inspectPlanConfig, material)
                                                                                                      || isMatchMaterialExt(inspectPlanConfig, extMap));

        if (StrUtil.isNotEmpty(processId)) {
            stream = stream.filter(inspectPlanConfig -> InspectProcessRangeEnum.ALL.equals(inspectPlanConfig.getProcessRange())
                                                        || isMatchProcess(inspectPlanConfig, processId));
        } else {
            stream = stream.filter(inspectPlanConfig -> InspectProcessRangeEnum.ALL.equals(inspectPlanConfig.getProcessRange()));
        }

        return stream.collect(Collectors.toList());
    }

    public static boolean isMatchMaterial(InspectPlanConfig config, PsiMaterial material) {
        if (config == null || material == null || CollUtil.isEmpty(config.getMaterialList())) {
            return false;
        }

        if (MaterialRangeEnum.MATERIAL.equals(config.getMaterialRange())) {
            return config.getMaterialList().stream().anyMatch(item -> item.getMaterialId().equals(material.getId()));
        }

        return false;
    }

    public static boolean isMatchProcess(InspectPlanConfig config, String processId) {
        if (config == null || processId == null || CollUtil.isEmpty(config.getProcessList())) {
            return false;
        }

        if (InspectProcessRangeEnum.PROCESS.equals(config.getProcessRange())) {
            return config.getProcessList().stream().anyMatch(item -> item.getProcessId().equals(processId));
        }

        return false;
    }

    public static boolean isMatchMaterialGroup(InspectPlanConfig config, PsiMaterial material) {
        if (config == null || material == null || CollUtil.isEmpty(config.getMaterialGroupList())) {
            return false;
        }

        if (MaterialRangeEnum.MATERIAL_GROUP.equals(config.getMaterialRange())) {
            return config.getMaterialGroupList().stream().anyMatch(item -> item.getMaterialGroupId().equals(material.getGroupId()));
        }

        return false;
    }

    public static boolean isMatchMaterialExt(InspectPlanConfig config, Map<String, String> extMap) {
        if (config == null || extMap == null || CollUtil.isEmpty(config.getMaterialExtList())) {
            return false;
        }

        if (MaterialRangeEnum.MATERIAL_EXT.equals(config.getMaterialRange())) {
            List<InspectPlanConfigMaterialExt> materialExtList = config.getMaterialExtList().stream().filter(item -> StrUtil.isNotEmpty(item.getExtParentCode())).collect(Collectors.toList());
            Map<String, Set<String>> map = materialExtList.stream().collect(
                    Collectors.groupingBy(InspectPlanConfigMaterialExt::getExtParentCode, Collectors.mapping(InspectPlanConfigMaterialExt::getExtId, Collectors.toSet())));
            return map.entrySet().stream().allMatch(item -> {
                String code = item.getKey();
                if (!extMap.containsKey(code)) {
                    return false;
                }
                String value = extMap.get(code);
                return item.getValue().contains(value);
            });
        }

        return false;
    }

    public static Map<String, String> getExtFieldMap(PsiMaterial material) {
        Map<String, String> result = new HashMap<>();
        for (Field field : PsiMaterial.class.getDeclaredFields()) {
            if (field.getName().startsWith("extFl")) {
                field.setAccessible(true);
                try {
                    Object value = field.get(material);
                    if (!StrUtil.isEmptyIfStr(value)) {
                        result.put(field.getName().replace("extFl", "FL").toUpperCase(), value.toString());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("无法访问字段: " + field.getName(), e);
                }
            }
        }
        return result;
    }
}
