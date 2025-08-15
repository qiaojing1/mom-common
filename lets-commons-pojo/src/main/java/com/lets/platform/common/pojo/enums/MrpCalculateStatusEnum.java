package com.lets.platform.common.pojo.enums;

import lombok.Getter;

public enum MrpCalculateStatusEnum implements IEnum<String> {

    NOT_CALCULATED("1", "未计算"),
    PARTIALLY_CALCULATED("2", "部分计算"),
    CALCULATED("3", "已计算");


    private final String value;
    @Getter
    private final String name;

    private MrpCalculateStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
