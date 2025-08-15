package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 呆滞范围[1:只进未出,2:未进未出,3:有进有出]
 * @author DING WEI
 * @date 2025/7/17 11:03
 * @version 1.0
 */
public enum ObsoleteScopeEnum implements IEnum<Object> {

    IN_NOT_OUT("1", "只进未出"),
    NOT_IN_NOT_OUT("2", "未进未出"),
    IN_OUT("3", "有进有出"),

    ;

    private final String value;

    @Getter
    private final String name;

    ObsoleteScopeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ObsoleteScopeEnum element : values()) {
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
        for (ObsoleteScopeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (ObsoleteScopeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
