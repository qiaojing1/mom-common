package com.lets.platform.model.common.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

public enum CodeTypeEnum implements IEnum<Object> {

    FIXED_VALUE("1", "固定值"),
    FIELD_VALUE("2", "字段值"),
    DATETIME("3", "日期时间"),
    SERIAL_NUMBER("4", "流水号"),
    MATERIAL_FIELD("5", "物料字段"),
    ;

    private final String value;

    @Getter
    private final String name;

    CodeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CodeTypeEnum element : CodeTypeEnum.values()) {
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
        for (CodeTypeEnum element : CodeTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
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
