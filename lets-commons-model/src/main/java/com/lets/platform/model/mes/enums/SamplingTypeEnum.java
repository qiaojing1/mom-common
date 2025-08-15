package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 抽样类型
 */
public enum SamplingTypeEnum implements IEnum<String> {
    GB_T2828_1("GB/T2828.1", "国标GB/T2828.1"),
    PERCENT("percent", "按百分批抽样"),
    FIX("fix", "按固定数量抽样"),
    ;

    private final String value;

    @Getter
    private final String name;

    SamplingTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SamplingTypeEnum element : SamplingTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SamplingTypeEnum element : SamplingTypeEnum.values()) {
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
