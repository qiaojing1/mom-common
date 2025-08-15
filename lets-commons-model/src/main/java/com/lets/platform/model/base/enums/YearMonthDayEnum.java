package com.lets.platform.model.base.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 单据状态
 */
public enum YearMonthDayEnum implements IEnum<Object> {

    YEAR(0, "年"),
    MONTH(1, "月"),
    DAY(2, "日"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    YearMonthDayEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (YearMonthDayEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (value == null) {
            return null;
        }
        for (YearMonthDayEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (YearMonthDayEnum element : values()) {
            if (Integer.valueOf(value).equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (YearMonthDayEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (YearMonthDayEnum element : values()) {
            if (value.equals(element.getValue().toString())) {
                return true;
            }
        }
        return false;
    }

    public static YearMonthDayEnum getSelf(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (YearMonthDayEnum element : values()) {
            if (value.equals(element.getValue().toString())) {
                return element;
            }
        }
        return null;
    }


    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (YearMonthDayEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

    public boolean equals(String value) {
        return this.value.toString().equals(value);
    }
}
