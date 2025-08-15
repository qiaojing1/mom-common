
/*
 * csy
 */

package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @author: csy
 **/
public enum TestContentEnum implements IEnum<Object> {

    TORQUE("1", "扭矩"),
    TIME("2", "时间"),
    ALL("3", "时间和扭矩"),
    ;

    private String value;

    private String name;

    TestContentEnum(String value, String name) {
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
        for (TestContentEnum element : TestContentEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containName(String name){
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (TestContentEnum element : TestContentEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TestContentEnum element : TestContentEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static TestContentEnum getSelf(String value){
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TestContentEnum element : TestContentEnum.values()) {
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
