package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

public enum ApprovalTypeEnum implements IEnum<Object> {

    AND("Y", "会签"), OR("N", "或签"),
    ;

    private final String value;

    @Getter
    private final String name;

    ApprovalTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (ApprovalTypeEnum element : ApprovalTypeEnum.values()) {
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
