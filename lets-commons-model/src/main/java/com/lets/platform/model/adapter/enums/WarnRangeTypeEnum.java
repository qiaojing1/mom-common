package com.lets.platform.model.adapter.enums;

import org.springframework.util.StringUtils;

/**
 * 报警规则范围 枚举
 *
 * @ClassName WarnRangeTypeEnum
 * @author: DING WEI
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum WarnRangeTypeEnum {

    DEVICE("1", "按设备"),
    TYPE("2", "按类型"),
    MODEL("3", "按型号"),
    ALL("4", "全部设备"),
    ;

    private String value;
    private String name;

    WarnRangeTypeEnum(String value, String name) {
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
        for (WarnRangeTypeEnum element : WarnRangeTypeEnum.values()) {
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
