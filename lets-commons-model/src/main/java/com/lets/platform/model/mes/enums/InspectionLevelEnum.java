package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 检验水平
 */
public enum InspectionLevelEnum implements IEnum<String> {
    ONE("1", "一般Ⅰ"),
    TWO("2", "一般Ⅱ"),
    THREE("3", "一般Ⅲ"),
    S1("S1", "特殊S1"),
    S2("S2", "特殊S2"),
    S3("S3", "特殊S3"),
    S4("S4", "特殊S4"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectionLevelEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InspectionLevelEnum element : InspectionLevelEnum.values()) {
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
        for (InspectionLevelEnum element : InspectionLevelEnum.values()) {
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
