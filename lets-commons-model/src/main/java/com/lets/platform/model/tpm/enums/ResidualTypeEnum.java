package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 残值类型 枚举
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 11:55:43 2025/01/21
 */
public enum ResidualTypeEnum implements IEnum<Object> {

    Percentage("1", "百分比"),
    Amount("2", "金额"),
    ;

    private String value;

    private String name;

    ResidualTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ResidualTypeEnum element : ResidualTypeEnum.values()) {
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
        for (ResidualTypeEnum element : ResidualTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static ResidualTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ResidualTypeEnum element : ResidualTypeEnum.values()) {
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


    public String getName() {
        return name;
    }

}
