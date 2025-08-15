package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

public enum CheckResultEnum implements IEnum<String> {

    QUALIFIED("1", "合格"),
    NOT_QUALIFIED("2", "不合格"),
    ;

    private final String value;

    @Getter
    private final String name;

    CheckResultEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CheckResultEnum element : CheckResultEnum.values()) {
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
