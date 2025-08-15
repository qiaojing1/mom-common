package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 结算周期
 * 默认结算周期[1周、2月、3季度、4半年、5年]
 */
public enum SettlementCycleEnum implements IEnum<Object> {

    WEEK("1", "周"),
    MONTH("2", "月"),
    QUARTER("3", "季度"),
    HALF_A_YEAR("4", "半年"),
    YEAR("5", "年"),
    ;

    private final String value;

    private final String name;

    SettlementCycleEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SettlementCycleEnum element : values()) {
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
        for (SettlementCycleEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllValues() {
        List<String> values = new ArrayList<>();
        for (SettlementCycleEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }
    public static List<String> getAllName() {
        List<String> values = new ArrayList<>();
        for (SettlementCycleEnum element : values()) {
            values.add(element.getName());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SettlementCycleEnum element : SettlementCycleEnum.values()) {
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
        for (SettlementCycleEnum element : values()) {
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
