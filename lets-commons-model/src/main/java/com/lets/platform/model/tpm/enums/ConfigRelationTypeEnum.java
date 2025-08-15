package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 关联类型 枚举
 *
 * @author Qiao
 * @version 1.0
 * @date 11/18/21 14:30
 */
public enum ConfigRelationTypeEnum implements IEnum<Object> {

    DEVICE("4", "设备"),
    TYPE("2", "设备类型"),
    MODEL("3", "设备型号"),
    ALL("1", "通用"),
    PRODUCT_UNIT("5", "生产单元")
    ;

    private String value;

    private String name;

    ConfigRelationTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ConfigRelationTypeEnum element : ConfigRelationTypeEnum.values()) {
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
        for (ConfigRelationTypeEnum element : ConfigRelationTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static ConfigRelationTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ConfigRelationTypeEnum element : ConfigRelationTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
