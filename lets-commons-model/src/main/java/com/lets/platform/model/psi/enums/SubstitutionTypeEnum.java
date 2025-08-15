package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 替代类型
 */
public enum SubstitutionTypeEnum implements IEnum<Object> {

    ORDER_SUBSTITUTION("1", "订单替代"),
    ;

    private final String value;
    @Getter
    private final String name;

    SubstitutionTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SubstitutionTypeEnum element : values()) {
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
        for (SubstitutionTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> codes = new ArrayList<>();
        for (SubstitutionTypeEnum element : values()) {
            codes.add(element.getValue());
        }
        return codes;
    }

    public static SubstitutionTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SubstitutionTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SubstitutionTypeEnum element : SubstitutionTypeEnum.values()) {
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
        for (SubstitutionTypeEnum element : SubstitutionTypeEnum.values()) {
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
