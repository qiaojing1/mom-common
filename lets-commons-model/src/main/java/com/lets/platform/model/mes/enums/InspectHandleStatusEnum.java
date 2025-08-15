package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 检验优先级
 */
public enum InspectHandleStatusEnum implements IEnum<String> {
    PENDING("1", "未处理"),
    IN_PROGRESS("2", "进行中"),
    COMPLETED("3", "已处理"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectHandleStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (InspectHandleStatusEnum element : InspectHandleStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (value == null) {
            return null;
        }
        for (InspectHandleStatusEnum element : InspectHandleStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static InspectHandleStatusEnum getEnum(String value) {
        if (value == null) {
            return null;
        }
        for (InspectHandleStatusEnum element : InspectHandleStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
