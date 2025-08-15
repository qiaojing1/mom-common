package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 序列号控制方式
 */
public enum SerialNumberControlTypeEnum implements IEnum<Object> {

    NOT_CONTROL("0", "不管控"),
    MUST_NO("1", "不可有序列号"),
    MUST("2", "必须有序列号"),
    ;

    private final String value;

    private final String name;

    SerialNumberControlTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SerialNumberControlTypeEnum element : values()) {
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
        for (SerialNumberControlTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (SerialNumberControlTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (SerialNumberControlTypeEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SerialNumberControlTypeEnum element : SerialNumberControlTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (SerialNumberControlTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
