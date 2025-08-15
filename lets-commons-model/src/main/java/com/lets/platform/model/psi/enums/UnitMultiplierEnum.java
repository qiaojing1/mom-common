package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 单位倍率
 * @author DING WEI
 * @date 2024/5/14 15:48
 * @version 1.0
 */
public enum UnitMultiplierEnum implements IEnum<Object> {

    THOUSAND("1000", "千"),
    TEN_THOUSAND("10000", "万"),
    ONE_HUNDRED_THOUSAND("100000", "十万"),
    MILLION("1000000", "百万"),
    TEN_MILLION("10000000", "千万"),
    ONE_HUNDRED_MILLION("100000000", "亿"),
    ;

    private String value;

    @Getter
    private String name;

    UnitMultiplierEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (UnitMultiplierEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (value == null) {
            return null;
        }
        for (UnitMultiplierEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (UnitMultiplierEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (UnitMultiplierEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static boolean containsValue(String value) {
        for (UnitMultiplierEnum element : values()) {
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
        for (UnitMultiplierEnum element : values()) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
