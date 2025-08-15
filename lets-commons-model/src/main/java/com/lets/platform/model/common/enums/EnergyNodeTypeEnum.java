package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;


/**
 * 能源节点类型 枚举
 **/
public enum EnergyNodeTypeEnum implements IEnum<Object> {

    POWER("1", "电"),
    GAS("2", "天然气"),
    WATER("3", "水"),
    COMPRESS_GAS("4", "压缩空气"),
    ;


    private final String value;

    @Getter
    private final String name;

    EnergyNodeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (EnergyNodeTypeEnum element : EnergyNodeTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (EnergyNodeTypeEnum element : EnergyNodeTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (EnergyNodeTypeEnum element : EnergyNodeTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

}
