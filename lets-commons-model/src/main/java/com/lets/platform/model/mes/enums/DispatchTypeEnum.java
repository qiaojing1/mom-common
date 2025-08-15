package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 派工类型
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum DispatchTypeEnum implements IEnum<Object> {

    MAIN_DISPATCH("1", "主要派工"),
    POSTPONE_DISPATCH("2", "顺延派工"),
    ;

    private String value;

    private String name;

    DispatchTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DispatchTypeEnum element : DispatchTypeEnum.values()) {
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
        for (DispatchTypeEnum element : DispatchTypeEnum.values()) {
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
