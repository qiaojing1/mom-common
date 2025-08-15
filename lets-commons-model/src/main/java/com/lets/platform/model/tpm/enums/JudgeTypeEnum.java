package com.lets.platform.model.tpm.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 判断类型 枚举
 * @author zhangweiyan
 * @date 5/07/25 7:16 PM
 * @version 1.0
 */
public enum JudgeTypeEnum {

    STD("1","标准值"),
    Interval("2","区间值"),
    ;

    String value;

    String name;

    private JudgeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getNameByValue(String value) {
        JudgeTypeEnum[] values = JudgeTypeEnum.values();
        for (JudgeTypeEnum roleType : values) {
            if (roleType.getValue().equals(value)) {
                return roleType.getName();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        JudgeTypeEnum[] values = JudgeTypeEnum.values();
        for (JudgeTypeEnum roleType : values) {
            if (roleType.getName().equals(name)) {
                return roleType.getValue();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        return Arrays.asList(STD.getName(), Interval.getName());
    }
}
