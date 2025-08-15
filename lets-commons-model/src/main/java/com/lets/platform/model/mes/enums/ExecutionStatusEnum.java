package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 执行状态
 */
public enum ExecutionStatusEnum implements IEnum<Integer> {
    NOT_EXECUTED(0, "未执行"),
    IN_PROGRESS(1, "执行中"),
    COMPLETED(2, "已完成"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ExecutionStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (ExecutionStatusEnum element : ExecutionStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (value == null) {
            return null;
        }
        for (ExecutionStatusEnum element : ExecutionStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static ExecutionStatusEnum getEnum(Integer value) {
        if (value == null) {
            return null;
        }
        for (ExecutionStatusEnum element : ExecutionStatusEnum.values()) {
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
