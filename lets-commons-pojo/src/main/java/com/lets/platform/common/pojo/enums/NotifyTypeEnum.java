package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 消息类型 枚举
 */
public enum NotifyTypeEnum implements IEnum<Object> {

    WARN("1", "告警"), INQUIRY("2", "询问"), REFUSE("3", "留置"), NOTICE("4", "通知"),
    ;

    private final String value;

    @Getter
    private final String name;

    NotifyTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (NotifyTypeEnum element : NotifyTypeEnum.values()) {
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
        for (NotifyTypeEnum element : NotifyTypeEnum.values()) {
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
}
