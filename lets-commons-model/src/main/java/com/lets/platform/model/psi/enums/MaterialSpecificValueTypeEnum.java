package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 值类型
 * @author DING WEI
 * @date 2023/7/14 10:10
 * @version 1.0
 */
public enum MaterialSpecificValueTypeEnum implements IEnum<Object> {

    STRING("string", "字符型"),
    number("number", "数字型"),
//    enumeration("enumeration", "枚举型"),
    date_interval("date interval", "日期型"),
    date_time_interval("date time interval", "日期时间型"),
    BOOLEAN("boolean", "布尔型"),
    ;

    private String value;

    private String name;

    MaterialSpecificValueTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialSpecificValueTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MaterialSpecificValueTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (MaterialSpecificValueTypeEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    public static List<String> getAllValue() {
        List<String> allValue = new ArrayList<>();
        for (MaterialSpecificValueTypeEnum element : values()) {
            allValue.add(element.getValue());
        }
        return allValue;
    }

    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }
}
