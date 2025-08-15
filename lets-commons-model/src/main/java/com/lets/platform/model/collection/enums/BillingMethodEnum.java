package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 计费方式[1:均价计费,2:分段计费]
 * @author DING WEI
 * @date 2024/12/30 14:14
 * @version 1.0
 */
public enum BillingMethodEnum implements IEnum<Object> {

    AVG("1", "均价计费"),
    PERIOD("2", "分段计费"),
    ;

    private String value;

    private String name;

    BillingMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (BillingMethodEnum element : BillingMethodEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
