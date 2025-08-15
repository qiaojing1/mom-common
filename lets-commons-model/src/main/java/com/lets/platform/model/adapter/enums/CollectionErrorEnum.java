package com.lets.platform.model.adapter.enums;

import org.springframework.util.StringUtils;

/**
 * 采集异常 枚举
 * 异常类型，1-倍率异常,2- 电表异常,3-采集器异常,4-异常关机
 * @ClassName CollectionErrorEnum
 * @author: DING WEI
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum CollectionErrorEnum {

    DROP_LINE_ERROR("0", "异常掉线"),
    MAGNIFICATION_ERROR("1", "倍率异常"),
    ELECTRIC_ERROR("2", "电表异常"),
    COLLECTION_ERROR("3", "采集器异常"),
    SHUT_DOWN_ERROR("4", "异常关机"),
    ;

    private String value;
    private String name;

    CollectionErrorEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollectionErrorEnum element : CollectionErrorEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

}
