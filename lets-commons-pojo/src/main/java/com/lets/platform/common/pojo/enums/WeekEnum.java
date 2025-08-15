package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 星期 枚举
 *
 * @ClassName WeekEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum WeekEnum implements IEnum<Object> {

    SUNDAY(1,"周日"),
    MONDAY(2,"周一"),
    TUESDAY(3,"周二"),
    WEDNESDAY(4,"周三"),
    THURSDAY(5,"周四"),
    FRIDAY(6,"周五"),
    SATURDAY(7,"周六"),;

    private Integer value;

    private String describe;

    WeekEnum(Integer value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public static String getDescribeByValue(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return "";
        }
        for (WeekEnum element : WeekEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static Integer getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (WeekEnum element : WeekEnum.values()) {
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
        for (WeekEnum element : WeekEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }
}
