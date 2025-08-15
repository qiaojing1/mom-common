package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 单据状态
 */
public enum OrderStatusEnum implements IEnum<Object> {

    CREATED(0, "创建"),
    DRAFT(1, "暂存"),
    UNDER_REVIEW(2, "审核中"),
    REVIEWED(3, "已审核"),
    POSTED(4, "已过账"),
    FAILED(5, "审核不通过"),
    VOIDED(6, "已作废"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    OrderStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OrderStatusEnum element : values()) {
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
        for (OrderStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (OrderStatusEnum element : values()) {
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

    public String getValueStr() {
        return String.valueOf(value);
    }


    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

    public boolean equals(String value) {
        return this.value.equals(Integer.parseInt(value));
    }
}
