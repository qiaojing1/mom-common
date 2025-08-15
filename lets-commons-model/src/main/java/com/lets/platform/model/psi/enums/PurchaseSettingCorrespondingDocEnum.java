package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 采购取价方案对应单据枚举
 * @author zhangweiyan
 * @date 2024年02月28日15:44:01
 */
public enum PurchaseSettingCorrespondingDocEnum implements IEnum<Object> {
    PURCHASE_ORDER("1", "采购订单"),
    PURCHASE_PRICE_LIST("2", "采购价目表"),
    OUTSOURCING_PRICE_LIST("3", "工序委外结算单"),
    ;

    private final String value;

    private final String name;

    PurchaseSettingCorrespondingDocEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PurchaseSettingCorrespondingDocEnum element : values()) {
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
        for (PurchaseSettingCorrespondingDocEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (PurchaseSettingCorrespondingDocEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (PurchaseSettingCorrespondingDocEnum element : values()) {
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
        for (PurchaseSettingCorrespondingDocEnum element : values()) {
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
