/*
 * csy
 */

package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @author: csy
 **/
public enum TestMethodEnum implements IEnum<Object> {

    ONEWAY("1", "单向"),
    DOUBLE_SWITCH("2", "开关双向"),
    ;

    private String value;

    private String name;

    TestMethodEnum(String value, String name) {
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
        for (TestMethodEnum element : TestMethodEnum.values()) {
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
        for (TestMethodEnum element : TestMethodEnum.values()) {
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
        for (TestMethodEnum element : TestMethodEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static TestMethodEnum getSelf(String value){
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TestMethodEnum element : TestMethodEnum.values()) {
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
