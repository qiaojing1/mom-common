package com.lets.platform.model.collection.enums;

import org.springframework.util.StringUtils;

/**
 * @ClassName PressureTestEnum
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/1/9 10:47
 * @Version 1.0
 */
public enum PressureTestEnum {
    PRODUCT("1","产品","product"),
    MODEL("2","型号","model"),
    PROJECT("3","测试项目","project"),
    STANDARD("4","标准","standards"),
    MEDIUM("5","介质","media"),
    CALIBER("6","口径(mm)","caliber"),
    PRESSURE("7","压力(MPa)","pressure");

    private String value;
    private String name;
    private String fieldName;

    PressureTestEnum(String value,String name,String fieldName){
        this.name=name;
        this.value=value;
        this.fieldName=fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PressureTestEnum element : PressureTestEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getField(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PressureTestEnum element : PressureTestEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getFieldName();
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
