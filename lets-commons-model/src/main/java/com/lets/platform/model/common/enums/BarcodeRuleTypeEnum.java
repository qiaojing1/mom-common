package com.lets.platform.model.common.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

public enum BarcodeRuleTypeEnum implements IEnum<Object> {

    GENERATE("1", "条码生成"),
    PARSE("2", "条码解析"),
    ;

    private final String value;

    @Getter
    private final String name;

    BarcodeRuleTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BarcodeRuleTypeEnum element : BarcodeRuleTypeEnum.values()) {
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
        for (BarcodeRuleTypeEnum element : BarcodeRuleTypeEnum.values()) {
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
