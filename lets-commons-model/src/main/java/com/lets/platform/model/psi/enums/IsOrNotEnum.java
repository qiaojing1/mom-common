package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 是否 枚举
 *
 * @author FZY
 * @version 1.0
 * @date 2022/11/08
 */
public enum IsOrNotEnum implements IEnum<Object> {
    IS(1, "是"),
    NOT(0, "否");

    private final Integer value;

    @Getter
    private final String name;

    IsOrNotEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (IsOrNotEnum element : IsOrNotEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Integer getIntegerValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (IsOrNotEnum element : IsOrNotEnum.values()) {
            if (Integer.valueOf(value).equals(element.getValue())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Integer getValue(Boolean isOrNot) {
        if (isOrNot) {
            return IS.getValue();
        } else {
            return NOT.getValue();
        }
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (IsOrNotEnum element : IsOrNotEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (IsOrNotEnum element : IsOrNotEnum.values()) {
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
