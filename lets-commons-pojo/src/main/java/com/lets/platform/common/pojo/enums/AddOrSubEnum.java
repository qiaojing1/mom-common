package com.lets.platform.common.pojo.enums;

/**
 * 加-减
 * @author DING WEI
 * @date 2023/8/28 15:07
 * @version 1.0
 */
public enum AddOrSubEnum {

    ADD("add"),
    SUB("sub"),
    ;

    private String value;

    private AddOrSubEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
