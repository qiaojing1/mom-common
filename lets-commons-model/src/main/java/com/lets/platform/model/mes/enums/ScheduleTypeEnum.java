package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 日程类型 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum ScheduleTypeEnum implements IEnum<Object> {

    HOLIDAY("1", "节假日"),
    WORK("2", "加班"),
    ;

    private String value;

    private String name;

    ScheduleTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ScheduleTypeEnum element : ScheduleTypeEnum.values()) {
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
        for (ScheduleTypeEnum element : ScheduleTypeEnum.values()) {
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
