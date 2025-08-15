package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 舍入类型 枚举
 * @author DING WEI
 * @date 2023/7/3 13:49
 * @version 1.0
 */
public enum RoundOffTypeCurrencyEnum implements IEnum<Object> {

    ROUND_HALF_UP("4", "四舍五入"),
    ROUND_HALF_EVEN("6", "四舍六入五成双"),
    ;

    private final String value;

    @Getter
    private final String name;

    RoundOffTypeCurrencyEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RoundOffTypeCurrencyEnum element : values()) {
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
        for (RoundOffTypeCurrencyEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (RoundOffTypeCurrencyEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
