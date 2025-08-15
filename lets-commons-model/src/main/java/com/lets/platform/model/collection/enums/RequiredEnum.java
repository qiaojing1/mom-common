package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @author zhangweiyan
 * @ClassName MediumEnum
 * @Description 介质
 * @Date 2024/1/8 15:21
 **/
public enum RequiredEnum implements IEnum<Object> {
    MUST("1", "必选"),
    OPTIONAL("2", "可选"),
    ;

    private String value;

    private String name;

    RequiredEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String mediaTypeName) {
        if (StringUtils.isEmpty(mediaTypeName)) {
            return null;
        }
        for (RequiredEnum element : RequiredEnum.values()) {
            if (mediaTypeName.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (RequiredEnum element : RequiredEnum.values()) {
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
        for (RequiredEnum element : RequiredEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
