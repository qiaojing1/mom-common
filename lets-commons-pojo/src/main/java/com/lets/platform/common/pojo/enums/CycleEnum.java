package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 状态 枚举
 *
 * @ClassName StatusEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum CycleEnum implements IEnum<Object> {

    DAY("1","日"),
    WEEK("2","周"),
    MONTH("3","月"),;

    private String value;

    private String describe;

    CycleEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getDescribeByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (CycleEnum element : CycleEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return name;
        }
        for (CycleEnum element : CycleEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getDescribe() {
        return describe;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (CycleEnum element : CycleEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }
}
