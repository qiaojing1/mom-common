
/*
 * csy
 */

package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @author: csy
 **/
public enum PowerSourceEnum implements IEnum<Object> {

    MAN("1", "手动"),
    ELECTRIC("2", "电动"),
    GAS("3", "气动"),
    ;

    private String value;

    private String name;

    PowerSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PowerSourceEnum element : PowerSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PowerSourceEnum element : PowerSourceEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static boolean containName(String name){
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (PowerSourceEnum element : PowerSourceEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static PowerSourceEnum getSelf(String value){
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PowerSourceEnum element : PowerSourceEnum.values()) {
            if (value.equals(element.getName())) {
                return element;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
