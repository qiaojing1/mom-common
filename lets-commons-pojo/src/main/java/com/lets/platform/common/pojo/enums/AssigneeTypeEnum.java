package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

public enum AssigneeTypeEnum implements IEnum<Object> {

    LEADER("1", "本部门负责人"), ROLE("2", "指定角色"), USER("3", "指定用户"),
    ;

    private final String value;

    @Getter
    private final String name;

    AssigneeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (AssigneeTypeEnum element : AssigneeTypeEnum.values()) {
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
