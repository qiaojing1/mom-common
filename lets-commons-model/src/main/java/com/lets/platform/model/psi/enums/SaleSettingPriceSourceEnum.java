package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售取价方案取价来源枚举
 * @author zhangweiyan
 * @date 2023年11月18日09:44:01
 */
public enum SaleSettingPriceSourceEnum implements IEnum<Object> {
    SALE_QUOTATION("1", "销售报价单"),
    SALE_PRICE_LIST("2", "销售价目表"),
    LATEST_GUEST_PRICE_LIST("3", "最近客户销售价"),
    LATEST_PRICE_LIST("4", "最近销售价"),
    LATEST_LOWEST_PRICE_LIST("5", "最近最低销售价"),
    ;

    private final String value;

    private final String name;

    SaleSettingPriceSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SaleSettingPriceSourceEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static SaleSettingPriceSourceEnum getSelfByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SaleSettingPriceSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SaleSettingPriceSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (SaleSettingPriceSourceEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SaleSettingPriceSourceEnum element : SaleSettingPriceSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (SaleSettingPriceSourceEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
