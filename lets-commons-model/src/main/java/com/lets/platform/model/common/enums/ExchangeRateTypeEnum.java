package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * @author zhangweiyan
 * @ClassName ExchangeRateTypeEnum
 * @Description 汇率表类型
 * @Date 2024/5/20 14:02
 **/
public enum ExchangeRateTypeEnum implements IEnum<Object> {
    FIXED("1", "固定汇率")
    ;

    private String value;
    private String name;

    ExchangeRateTypeEnum(String value, String name){
        this.name=name;
        this.value=value;
    }
    @Override
    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ExchangeRateTypeEnum element : ExchangeRateTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ExchangeRateTypeEnum element : ExchangeRateTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
