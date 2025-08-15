package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 变更方式
 */
public enum InvoiceTypeEnum implements IEnum<Object> {

    VALUE_ADDED_TAX_ORDINARY_INVOICE("VALUE_ADDED_TAX", "增值税普通发票"),
    NATIONAL_SPECIAL_INVOICE("NATIONAL_SPECIAL", "全国专票 "),
    NATIONAL_ORDINARY_INVOICE("NATIONAL_ORDINARY", "全国普票"),
    OVERSEAS_INVOICE("OVERSEAS", "海外发票 "),
    ;

    private final String value;

    @Getter
    private final String name;

    InvoiceTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InvoiceTypeEnum element : values()) {
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
        for (InvoiceTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (InvoiceTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
