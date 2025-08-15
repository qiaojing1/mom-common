package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;
import com.lets.platform.model.tpm.enums.*;
/**
 * 备件类型 枚举
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum PrepareTypeEnum implements IEnum<Object> {

    A("1","A"),
    B("2","B"),
    C("3","C"),

    ;

    private String value;

    private String name;

    PrepareTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PrepareTypeEnum element : PrepareTypeEnum.values()) {
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
        for (PrepareTypeEnum element : PrepareTypeEnum.values()) {
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
