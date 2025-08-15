package com.lets.platform.model.common.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

public enum SerialMenuCodeMapTableNameEnum implements IEnum<Object> {

    PRODUCE_ORDER("055d60ab-fb14-41d5-b4ee-ca26eb90826b", "mes_produce_order_detail_serial", "生产工单"),
    PURCHASE_ORDER("42e6e4a1-09bd-4cfc-ab60-29c08cd17bad", "psi_purchase_order_detail_serial", "采购订单"),
    SALE_ORDER("7e76eee8-c8be-411c-8a60-d522c46ad948", "psi_sale_order_detail_serial", "销售订单"),
    ;

    private final String menuCode;
    @Getter
    private final String menuName;

    @Getter
    private final String tableName;

    SerialMenuCodeMapTableNameEnum(String value, String name, String menuName) {
        this.menuCode = value;
        this.tableName = name;
        this.menuName = menuName;
    }

    public static String getMenuCode(String tableName) {
        if (StringUtils.isEmpty(tableName)) {
            return null;
        }
        for (SerialMenuCodeMapTableNameEnum element : SerialMenuCodeMapTableNameEnum.values()) {
            if (tableName.equals(element.getTableName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getTableName(String menuCode) {
        if (StrUtil.isEmpty(menuCode)) {
            return null;
        }
        for (SerialMenuCodeMapTableNameEnum element : SerialMenuCodeMapTableNameEnum.values()) {
            if (menuCode.equals(element.getValue())) {
                return element.getTableName();
            }
        }
        return null;
    }

    public static String getMenuName(String menuCode) {
        if (StrUtil.isEmpty(menuCode)) {
            return null;
        }
        for (SerialMenuCodeMapTableNameEnum element : SerialMenuCodeMapTableNameEnum.values()) {
            if (menuCode.equals(element.getValue())) {
                return element.getMenuName();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return menuCode;
    }

    public boolean equals(String value) {
        return this.menuCode.equals(value);
    }

}
