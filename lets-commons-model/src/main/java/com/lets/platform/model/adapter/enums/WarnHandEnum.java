package com.lets.platform.model.adapter.enums;

import org.springframework.util.StringUtils;

/**
 * 点位类型 枚举
 *
 * @ClassName RelationTypeEnum
 * @author: DING WEI
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum WarnHandEnum {

    NOT_DEAL("0", "未处理"),
    DEAL("1", "已处理"),
    ;

    private String value;
    private String name;

    WarnHandEnum(String value, String name) {
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
        for (WarnHandEnum element : WarnHandEnum.values()) {
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
