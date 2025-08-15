package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 备件金额统计来源【1 采购价目表 2 采购订单】
 * @author DING WEI
 * @date 2024/12/18 17:24
 * @version 1.0
 */
public enum SparePriceStatisticsSourceEnum implements IEnum<Object> {

    PURCHASE_PRICE_LIST("1","采购价目表"),
    PURCHASE_ORDER("2","采购订单"),

    ;

    private String value;

    private String name;

    SparePriceStatisticsSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SparePriceStatisticsSourceEnum element : SparePriceStatisticsSourceEnum.values()) {
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
        for (SparePriceStatisticsSourceEnum element : SparePriceStatisticsSourceEnum.values()) {
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


    public String getName() {
        return name;
    }

}
