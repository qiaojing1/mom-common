package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public enum MrpOccupyOrderTypeEnum implements IEnum<Object> {

    WIP_COMPLETION_STOCK_IN_ORDER("wipCompletionStockInOrder", "完工入库单"),
    PURCHASE_STOCK_IN_ORDER("purchaseStockInOrder", "采购入库单"),
    PURCHASE_ORDER("purchaseOrder", "采购订单"),
    PURCHASE_APPLICATION_ORDER("purchaseApplicationOrder", "采购申请单"),
    SALE_RETURN_APPLICATION_ORDER("returnApplicationOrder", "销售退货申请单"),
    SALE_RETURN_ORDER("returnOrder", "销售退货单"),
    PRODUCTION_ORDER("productionOrder", "生产工单"),
    PLAN_ORDER("planOrder", "计划工单");

    private final String value;

    @Getter
    private final String name;


    MrpOccupyOrderTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MrpOccupyOrderTypeEnum element : values()) {
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
        for (MrpOccupyOrderTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (MrpOccupyOrderTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (MrpOccupyOrderTypeEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (MrpOccupyOrderTypeEnum element : MrpOccupyOrderTypeEnum.values()) {
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
        for (MrpOccupyOrderTypeEnum element : values()) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
