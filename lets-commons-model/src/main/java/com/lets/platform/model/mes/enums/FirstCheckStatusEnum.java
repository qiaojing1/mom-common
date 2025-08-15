package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 首检状态 枚举
 */
public enum FirstCheckStatusEnum implements IEnum<String> {

    NOT_INSPECTED("1", "未首检"),
    INSPECTING("2", "首检中"),
    INSPECTED("3", "已首检"),
    ;

    private final String value;

    @Getter
    private final String name;

    FirstCheckStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (FirstCheckStatusEnum element : FirstCheckStatusEnum.values()) {
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
        for (FirstCheckStatusEnum element : FirstCheckStatusEnum.values()) {
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
