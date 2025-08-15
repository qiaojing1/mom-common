package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

public enum CollLeakageTypeEnum implements IEnum<String> {

    Valve_Stem_Diameter("1", "阀杆直径"),
    Outer_diameter_sealing_ring("2", "密封圈外径"),
    Rated_capacity("3", "额定容量"),
    OTHER("4", "其他类型"),
    ;

    private final String value;

    @Getter
    private final String name;

    CollLeakageTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollLeakageTypeEnum element : CollLeakageTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CollLeakageTypeEnum element : CollLeakageTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (CollLeakageTypeEnum element : CollLeakageTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static CollLeakageTypeEnum getSelf(String value) {
        if (StringUtils.isEmpty(value)) {
            return OTHER;
        }
        for (CollLeakageTypeEnum element : CollLeakageTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return OTHER;
    }

    @Override
    public String getValue() {
        return value;
    }

}
