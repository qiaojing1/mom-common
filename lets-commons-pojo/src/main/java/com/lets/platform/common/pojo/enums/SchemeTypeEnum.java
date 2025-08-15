package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 盘点类型
 */
public enum SchemeTypeEnum implements IEnum<Object> {

    CREATED(0, "全盘"), DRAFT(1, "动盘"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    SchemeTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SchemeTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SchemeTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (SchemeTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getCanDelete() {
        List<String> values = new ArrayList<>();
        values.add(CREATED.getName());
        values.add(DRAFT.getName());
        return values;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
