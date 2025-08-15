package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 关闭状态
 */
public enum CloseStatusEnum implements IEnum<Object> {

    CLOSE(0, "关闭"), NORMAL(1, "正常"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    CloseStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CloseStatusEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (Objects.isNull(value)) {
            return null;
        }
        for (CloseStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (CloseStatusEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}
