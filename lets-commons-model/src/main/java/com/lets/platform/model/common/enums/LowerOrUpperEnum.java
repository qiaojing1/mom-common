package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 大写或小写 枚举
 * @author DING WEI
 * @date 2023/11/21 11:31
 * @version 1.0
 */
public enum LowerOrUpperEnum implements IEnum<Object> {

    LOWER("0", "转为小写"),
    UPPER("1", "转为大写"),
    ;

    private final String value;

    private final String name;

    LowerOrUpperEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (LowerOrUpperEnum element : LowerOrUpperEnum.values()) {
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
        for (LowerOrUpperEnum element : LowerOrUpperEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
