package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 *
 * 库存检验返工后续处理 枚举
 */
public enum ReworkActionEnum implements IEnum<String> {

    HOLD("1", "置留"),
    TRANSFER("2", "调拨"),
    REWORK_ORDER("3", "重工工单"),
    ;

    private final String value;

    @Getter
    private final String name;

    ReworkActionEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReworkActionEnum element : ReworkActionEnum.values()) {
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
        for (ReworkActionEnum element : ReworkActionEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

    @Override
    public String getValue() {
        return value;
    }

}
