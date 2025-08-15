/*
 * csy
 */

package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 公差等级
 */
public enum ToleranceLevelEnum implements IEnum<Object> {

    F("1", "精密f"),
    M("2", "中等m"),
    C("3", "粗糙c"),
    V("4", "最粗v"),
    ;

    private String value;

    private String name;

    ToleranceLevelEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ToleranceLevelEnum element : ToleranceLevelEnum.values()) {
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
        for (ToleranceLevelEnum element : ToleranceLevelEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> nameLike(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        List<String> list = new ArrayList<>();
        for (ToleranceLevelEnum element : ToleranceLevelEnum.values()) {
            if (element.getName().contains(key)) {
                list.add(element.getValue());
            }
        }
        return list;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
