package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 条件比较 枚举
 * 1:大于2:等于3:大于等于4:小于5:小于等于
 * @ClassName StatusEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum ConditionCompareEnum implements IEnum<Object> {

    MORE_THAN("1","大于"),
    EQUALS("2","等于"),
    MORE_THAN_EQUALS("3","大于等于"),
    LESS_THAN("4","小于"),
    LESS_THAN_EQUALS("5","小于等于"),;

    private String value;

    private String describe;

    ConditionCompareEnum(String value, String describe) {
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
        for (ConditionCompareEnum element : ConditionCompareEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static ConditionCompareEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ConditionCompareEnum element : ConditionCompareEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return name;
        }
        for (ConditionCompareEnum element : ConditionCompareEnum.values()) {
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
        for (ConditionCompareEnum element : ConditionCompareEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }
}
