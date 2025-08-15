package com.lets.platform.common.pojo.enums;

/**
 * 其他系统
 * @author DING WEI
 * @date 2025/6/12 9:40
 * @version 1.0
 */
public enum OtherSysEnum {

    E9("E9"),
    ;

    private String value;

    private OtherSysEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
