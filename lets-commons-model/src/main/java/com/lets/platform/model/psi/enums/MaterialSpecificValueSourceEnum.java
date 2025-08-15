package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 值来源
 * @author DING WEI
 * @date 2023/7/14 10:10
 * @version 1.0
 */
public enum MaterialSpecificValueSourceEnum implements IEnum<Object> {

    USER_DICT("1", "用户数据字典"),
    MANUAL_INPUT("2", "手工输入"),
    ;

    private String value;

    private String name;

    MaterialSpecificValueSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialSpecificValueSourceEnum element : values()) {
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
        for (MaterialSpecificValueSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (MaterialSpecificValueSourceEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }
}