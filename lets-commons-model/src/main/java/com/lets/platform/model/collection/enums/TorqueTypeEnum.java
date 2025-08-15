
/*
 * csy
 */

package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.collection.vo.CollRoutinePerformanceTestVo;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * @author: csy
 **/
public enum TorqueTypeEnum implements IEnum<Object> {

    DESIGN("1", "设计扭矩"),
    LOAD("2", "有载扭矩"),
    UNLOAD("3", "空载扭矩"),
    ;

    private String value;

    private String name;

    TorqueTypeEnum(String value, String name) {
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
        for (TorqueTypeEnum element : TorqueTypeEnum.values()) {
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
        for (TorqueTypeEnum element : TorqueTypeEnum.values()) {
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
        for (TorqueTypeEnum element : TorqueTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static TorqueTypeEnum getSelf(String value){
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TorqueTypeEnum element : TorqueTypeEnum.values()) {
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
