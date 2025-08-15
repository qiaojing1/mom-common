package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 单据状态
 */
public enum MrpStatusEnum implements IEnum<Object> {

    TO_BE_CALCULATED(1, "待运算"),
    CALCULATING(2, "计算中"),
    FINISHED(3, "已完成"),
    ERROR(4, "错误"),
    STOP(5, "终止");

    private final Integer value;

    @Getter
    private final String name;

    MrpStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MrpStatusEnum element : values()) {
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
        for (MrpStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (MrpStatusEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static MrpStatusEnum getEnum(Integer value) {
        for (MrpStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}
