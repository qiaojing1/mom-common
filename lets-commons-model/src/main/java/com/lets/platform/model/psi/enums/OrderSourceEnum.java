package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 单据来源[1手动创建2运算创建]
 * @author DING WEI
 * @date 2023/12/19 16:40
 * @version 1.0
 */
public enum OrderSourceEnum implements IEnum<Object> {

    MANUAL_CREATION("1", "手动创建"),
    OPERATION_CREATION("2", "运算创建");

    private final String value;

    @Getter
    private final String name;

    OrderSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OrderSourceEnum element : OrderSourceEnum.values()) {
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
        for (OrderSourceEnum element : OrderSourceEnum.values()) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
