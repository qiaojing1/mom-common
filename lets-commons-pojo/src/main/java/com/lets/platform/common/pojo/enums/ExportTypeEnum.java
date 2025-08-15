package com.lets.platform.common.pojo.enums;

/**
 * 导出类型
 **/
public enum ExportTypeEnum {

    USER("user"),
    ROLE("role");

    private final String value;

    ExportTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
