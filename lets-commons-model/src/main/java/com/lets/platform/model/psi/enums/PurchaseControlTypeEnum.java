package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @EnumName PurchaseControlTypeEnum
 * @Description 采购-物料控制
 * @Date 2025/4/22 15:25
 **/
public enum PurchaseControlTypeEnum implements IEnum<Object> {
//    SALEABLE("0", "可销售"),
    UNSALEABLE("1", "不可采购"),
    ONLY_SALE("2", "仅可采购"),
    ;
    private final String value;

    @Getter
    private final String name;

    PurchaseControlTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PurchaseControlTypeEnum element : values()) {
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
        for (PurchaseControlTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (PurchaseControlTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> values = new ArrayList<>();
        for (PurchaseControlTypeEnum element : values()) {
            values.add(element.getName());
        }
        return values;
    }

    public static PurchaseControlTypeEnum getEnum(String value) {
        for (PurchaseControlTypeEnum element : values()) {
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
