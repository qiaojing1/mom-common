package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 逻辑运算符
 * @author DING WEI
 * @date 2023/4/18 14:13
 * @version 1.0
 */
public enum LogicalOperatorEnum implements IEnum<Object> {

    OR("or","或"),
    AND("and", "且"),
    ;

    private String value;

    private String describe;

    LogicalOperatorEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static LogicalOperatorEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (LogicalOperatorEnum element : LogicalOperatorEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getDescribeByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (LogicalOperatorEnum element : LogicalOperatorEnum.values()) {
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
        for (LogicalOperatorEnum element : LogicalOperatorEnum.values()) {
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
        for (LogicalOperatorEnum element : LogicalOperatorEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(String code) {
        return this.value.equals(code);
    }
}
