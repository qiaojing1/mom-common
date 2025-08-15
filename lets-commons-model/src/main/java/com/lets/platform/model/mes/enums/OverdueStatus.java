package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

public enum OverdueStatus implements IEnum<Object> {

    NOT_OVERDUE("0", "未逾期"),
    OVERDUE("1", "已逾期"),
    ALMOST_OVERDUE("2", "即将逾期"),
    ;

    private String value;

    private String name;

    OverdueStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OverdueStatus element : OverdueStatus.values()) {
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
        for (OverdueStatus element : OverdueStatus.values()) {
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
