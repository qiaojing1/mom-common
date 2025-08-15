package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 复检策略[1:依次执行,2:交替执行]
 * @author DING WEI
 * @date 2025/7/14 15:10
 * @version 1.0
 */
public enum ReInspectStrategyEnum implements IEnum<Object> {

    IN_TURN("1", "依次执行"),
    ALTERNATE("2", "交替执行"),
    ;

    private String value;

    private String name;

    ReInspectStrategyEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ReInspectStrategyEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ReInspectStrategyEnum element : ReInspectStrategyEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReInspectStrategyEnum element : ReInspectStrategyEnum.values()) {
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
        for (ReInspectStrategyEnum element : ReInspectStrategyEnum.values()) {
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
