package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 加工工艺[1“车床加工”、2“铣床加工”、3“钳工加工”、4“冲压加工”、5“注塑加工”、6“锻造加工”] 枚举
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/4/22 14:06
 */
public enum ProcessTechniqueEnum implements IEnum<Object> {

    LATHE(1, "车床加工"),
    MILLING_MACHINE(2, "铣床加工"),
    FITTER(3, "钳工加工"),
    STAMPING(4, "冲压加工"),
    INJECTION_MOLDING(5, "注塑加工"),
    FORGING(6, "锻造加工"),
    ;


    private Integer value;
    private String name;

    ProcessTechniqueEnum(Integer value, String name) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProcessTechniqueEnum element : ProcessTechniqueEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProcessTechniqueEnum element : ProcessTechniqueEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> result = new ArrayList<>();
        for (ProcessTechniqueEnum element : ProcessTechniqueEnum.values()) {
            result.add(element.getName());
        }
        return result;
    }
}
