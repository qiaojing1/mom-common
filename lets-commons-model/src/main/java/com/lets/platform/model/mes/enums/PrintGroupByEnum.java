package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 检验类型
 */
public enum PrintGroupByEnum implements IEnum<String> {
    PRODUCT("2", "供应商+产品"),
    SUPPLIER("1", "供应商"),
    ;

    private final String value;

    @Getter
    private final String name;

    PrintGroupByEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialRangeEnum element : MaterialRangeEnum.values()) {
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
        for (MaterialRangeEnum element : MaterialRangeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static MaterialRangeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MaterialRangeEnum element : MaterialRangeEnum.values()) {
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
