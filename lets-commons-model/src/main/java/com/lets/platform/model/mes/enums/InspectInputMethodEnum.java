package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 检验录入方式
 */
public enum InspectInputMethodEnum implements IEnum<String> {
    FILE("1", "文件上传"),
    MANUAL("2", "手动录入"),
    AUTO("3", "自动填充"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectInputMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (InspectInputMethodEnum element : InspectInputMethodEnum.values()) {
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
        for (InspectInputMethodEnum element : InspectInputMethodEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static InspectInputMethodEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectInputMethodEnum element : InspectInputMethodEnum.values()) {
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
