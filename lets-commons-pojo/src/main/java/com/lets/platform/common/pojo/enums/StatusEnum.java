package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 状态 枚举 @ClassName StatusEnum
 *
 * @author: DING WEI
 * @create: 2021/04/27 13:32 @Version 1.0
 */
public enum StatusEnum implements IEnum<Object> {
    DISABLE("0", "停用", "否"),
    ENABLE("1", "启用", "是"),
    CANCELLATION("2", "销户", "");

    private String value;

    private String describe;

    private String shortName;

    StatusEnum(String value, String describe, String shortName) {
        this.value = value;
        this.describe = describe;
        this.shortName = shortName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getShortName() {
        return shortName;
    }

    public static String getTenancyTypeName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (StatusEnum element : StatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static String getShortNameByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (StatusEnum element : StatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getShortName();
            }
        }
        return null;
    }

    public static String getDescribeByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (StatusEnum element : StatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static String getValueByShortName(String shortName) {
        if (StringUtils.isEmpty(shortName)) {
            return "";
        }
        for (StatusEnum element : StatusEnum.values()) {
            if (shortName.equals(element.getShortName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return name;
        }
        for (StatusEnum element : StatusEnum.values()) {
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
        for (StatusEnum element : StatusEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(ENABLE.getDescribe());
        allName.add(DISABLE.getDescribe());
        return allName;
    }

    public static List<String> getAllShortName() {
        List<String> allShortName = new ArrayList<>();
        for (StatusEnum element : StatusEnum.values()) {
            String shortName = element.getShortName();
            if (!StringUtils.isEmpty(shortName)) {
                allShortName.add(shortName);
            }
        }
        return allShortName;
    }
}
