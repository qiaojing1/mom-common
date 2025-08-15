package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @EnumName SaleControlTypeEnum
 * @Description 销售-客户控制
 * @Date 2024/6/27 15:25
 **/
public enum SaleControlTypeEnum implements IEnum<Object> {
//    SALEABLE("0", "可销售"),
    UNSALEABLE("1", "不可销售"),
    ONLY_SALE("2", "仅可销售"),
    ;
    private final String value;

    @Getter
    private final String name;

    SaleControlTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SaleControlTypeEnum element : values()) {
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
        for (SaleControlTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (SaleControlTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> values = new ArrayList<>();
        for (SaleControlTypeEnum element : values()) {
            values.add(element.getName());
        }
        return values;
    }

    public static SaleControlTypeEnum getEnum(String value) {
        for (SaleControlTypeEnum element : values()) {
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
