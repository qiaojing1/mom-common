package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 检验水平
 */
public enum InspectComparatorEnum implements IEnum<String> {
    EQUAL("=", "等于"),
    GREATER_THAN(">", "大于"),
    GREATER_THAN_OR_EQUAL_TO(">=", "大于等于"),
    LESS_THAN("<", "小于"),
    LESS_THAN_OR_EQUAL_TO("<=", "小于等于"),
    BETWEEN("between", "在...之间"),
    TOLERANCE("tolerance", "公差"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectComparatorEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InspectComparatorEnum element : InspectComparatorEnum.values()) {
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
        for (InspectComparatorEnum element : InspectComparatorEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (InspectComparatorEnum element : InspectComparatorEnum.values()) {
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
