package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 检验维度
 */
public enum InspectDimensionEnum implements IEnum<String> {
    SAMPLE("1", "样本"),
    ORDER("2", "单据"),
    BOM("3", "BOM"),
    SAMPLE_AND_BOM("4", "样本+BOM"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectDimensionEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (InspectDimensionEnum element : InspectDimensionEnum.values()) {
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
        for (InspectDimensionEnum element : InspectDimensionEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static InspectDimensionEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectDimensionEnum element : InspectDimensionEnum.values()) {
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
