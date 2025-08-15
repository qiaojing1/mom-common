package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 采购取价方案取价来源枚举
 * @author zhangweiyan
 * @date 2023年11月18日09:44:01
 */
public enum PruchaseSettingPriceSourceEnum implements IEnum<Object> {
    PURCHAS_PRICE_LIST("1", "采购价目表"),
    LATEST_SUPPLIER_PRICE_LIST("2", "最近供应商采购价"),
    LATEST_PRICE_LIST("3", "最近采购价"),
    LATEST_LOWEST_PRICE_LIST("4", "最近最低采购价"),
    OUTSOURCING_PRICE_LIST("5", "工序委外价目表"),
    ;

    private final String value;

    private final String name;

    PruchaseSettingPriceSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PruchaseSettingPriceSourceEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static PruchaseSettingPriceSourceEnum getSelfByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PruchaseSettingPriceSourceEnum element : values()) {
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
        for (PruchaseSettingPriceSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (PruchaseSettingPriceSourceEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (PruchaseSettingPriceSourceEnum element : PruchaseSettingPriceSourceEnum.values()) {
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
        for (PruchaseSettingPriceSourceEnum element : values()) {
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
