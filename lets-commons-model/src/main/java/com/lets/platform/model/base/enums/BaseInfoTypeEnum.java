package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;

/**
 * 异常类型
 */
public enum BaseInfoTypeEnum implements IEnum<Object> {

    SUCCESS("success"),
    WARNING("warning"),
    ERROR("error"),
    ;

    private String value;

    BaseInfoTypeEnum(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

}
