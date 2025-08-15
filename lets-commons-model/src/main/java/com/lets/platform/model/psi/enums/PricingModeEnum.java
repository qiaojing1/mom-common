package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 发票红字蓝字枚举
 */
public enum PricingModeEnum implements IEnum<Object> {

    PRICE_INCLUDE_TAX("1", "按含税单价录入"),
    PRICE("2", "按单价录入"),
    AMOUNT_INCLUDING_TAX("3", "按价税合计录入"),
    AMOUNT_EXCLUDED_TAX("4", "按未税金额录入"),
    ;

    private final String value;

    @Getter
    private final String name;

    PricingModeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PricingModeEnum element : values()) {
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
        for (PricingModeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (PricingModeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean onlyMatch(String pricingMode) {
        if (StringUtils.isEmpty(pricingMode)) {
            return false;
        }
        PricingModeEnum selfByValue = getSelfByValue(pricingMode);
        if (Objects.isNull(selfByValue)) {
            return false;
        }
        switch (selfByValue) {
            case PRICE:
            case PRICE_INCLUDE_TAX:
                return true;
            case AMOUNT_EXCLUDED_TAX:
            case AMOUNT_INCLUDING_TAX:
                return false;
        }
        return false;
    }

    public static boolean containsValue(String pricingMode) {
        if (StringUtils.isEmpty(pricingMode)) {
            return false;
        }
        PricingModeEnum selfByValue = getSelfByValue(pricingMode);
        return !Objects.isNull(selfByValue);
    }

    public static boolean containsName(String pricingMode) {
        if (StringUtils.isEmpty(pricingMode)) {
            return false;
        }
        PricingModeEnum selfByValue = getSelfByName(pricingMode);
        return !Objects.isNull(selfByValue);
    }

    public static PricingModeEnum getSelfByValue(String pricingMode) {
        if (StringUtils.isEmpty(pricingMode)) {
            return null;
        }
        for (PricingModeEnum element : values()) {
            if (pricingMode.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static PricingModeEnum getSelfByName(String pricingMode) {
        if (StringUtils.isEmpty(pricingMode)) {
            return null;
        }
        for (PricingModeEnum element : values()) {
            if (pricingMode.equals(element.getName())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
