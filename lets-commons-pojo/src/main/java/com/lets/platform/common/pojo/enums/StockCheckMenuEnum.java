package com.lets.platform.common.pojo.enums;


import com.lets.platform.common.pojo.exception.LetsException;
import lombok.Getter;

/**
 * 下发 功能菜单
 */
public enum StockCheckMenuEnum implements IEnum<String> {

    PRODUCE_PICKING("91979f44-7b5f-41aa-a9e9-c431c336608e", "生产领料单"),
    SALE_STOCK_OUT_ORDER("4c4c22e2-3482-45b3-88d5-7d9ddd277510", "销售出库单"),
    TRANSFER_ORDER("5c80ac30-f42e-48a3-8937-a66307c5f939", "直接调拨单"),
    STEP_TRANSFER_ORDER("a36145b1-f085-4b1a-9567-90d2cac5fc01", "分步调拨出库单"),
    PURCHASE_RETURN_ORDER("7c1c8ac7-a610-4013-b3b8-45079e1cfad3", "采购退货单"),
    UNPLANNED_STOCK_OUT_ORDER("96d6c2b7-9178-4ac9-bb77-5ed8b9a7cfb5", "计划外出库"),
    ;

    private final String menuCode;
    @Getter
    private final String menuName;


    StockCheckMenuEnum(String menuCode, String menuName) {
        this.menuCode = menuCode;
        this.menuName = menuName;
    }

    public static StockCheckMenuEnum getEnum(String value) {
        for (StockCheckMenuEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return menuCode;
    }

    public boolean equals(String menuCode) {
        return this.menuCode.equals(menuCode);
    }
}
