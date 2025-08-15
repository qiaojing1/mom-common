package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 检验优先级
 */
public enum InspectPriorityEnum implements IEnum<String> {
    CRITICAL("1", "最高"),
    HIGH("2", "高"),
    MEDIUM("3", "普通"),
    LOW("4", "低"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectPriorityEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (InspectPriorityEnum element : InspectPriorityEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectPriorityEnum element : InspectPriorityEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static InspectPriorityEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectPriorityEnum element : InspectPriorityEnum.values()) {
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
