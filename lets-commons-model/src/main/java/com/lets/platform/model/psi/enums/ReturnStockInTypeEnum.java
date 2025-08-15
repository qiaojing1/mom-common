package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 退货入库类型
 */
public enum ReturnStockInTypeEnum implements IEnum<Object> {

    QUALIFIED("1", "良品入库"),
    DEFECT("2", "不良品入库"),
    SCRAP("3", "报废入库"),
    REWORK("4", "返工品入库"),
    ;

    private final String value;

    @Getter
    private final String name;

    ReturnStockInTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReturnStockInTypeEnum element : values()) {
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
        for (ReturnStockInTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (ReturnStockInTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static ReturnStockInTypeEnum getEnum(String value) {
        for (ReturnStockInTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
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
