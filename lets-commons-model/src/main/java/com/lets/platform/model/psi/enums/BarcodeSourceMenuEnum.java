package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * 条码控制方式
 */
public enum BarcodeSourceMenuEnum implements IEnum<String> {
    //销售退货申请单
    SALE_RETURN_APPLICATION_ORDER("0a1e2aeb-9db5-4c6d-ba96-7d63de142893", "销售退货申请单"),
    //计划外入库单管理
    UNPLANNED_STOCK_IN_ORDER("f19106e7-b98a-40d1-a49d-bedf1ad092dd", "计划外入库单管理"),
    //采购订单管理
    PURCHASE_ORDER("42e6e4a1-09bd-4cfc-ab60-29c08cd17bad", "采购订单管理"),
    //采购入库单管理
    PURCHASE_STOCK_IN_ORDER("8aa9f41d-e785-4630-b8f4-e78f7367c082", "采购入库单管理"),
    //生产工单管理
    PRODUCE_ORDER("055d60ab-fb14-41d5-b4ee-ca26eb90826b", "生产工单管理"),
    //工单报工单管理
    PRODUCE_REPORT_ORDER("6282b4de-b206-4bbe-acf3-0007d6066444", "工单报工单管理");

    @Getter
    private final String menuCode;
    @Getter
    private final String menuName;


    BarcodeSourceMenuEnum(String menuCode, String menuName) {
        this.menuCode = menuCode;
        this.menuName = menuName;
    }

    public static BarcodeSourceMenuEnum getEnum(String value) {
        for (BarcodeSourceMenuEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (BarcodeSourceMenuEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getMenuName();
            }
        }
        return null;
    }

    public static Set<String> getValues() {
        return Arrays.stream(values()).map(BarcodeSourceMenuEnum::getValue).collect(Collectors.toSet());
    }

    @Override
    public String getValue() {
        return menuCode;
    }

    public boolean equals(String menuCode) {
        return this.menuCode.equals(menuCode);
    }
}
