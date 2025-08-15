package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public enum StockSourceEnum implements IEnum<Object> {

    PURCHASE("1", "采购订单", "采购入库单", ""),
    PURCHASE_STOCK_IN("2", "采购入库订单", "采购退货单", "采购订单"),
    INVENTORY_STOCK_IN("3", "盘盈入库单", "盘盈入库单", "盘点单"),
    UNPLANNED_STOCK_IN("4", "计划外入库单", "计划外入库单", "无"),
    WIP_STOCK_IN("5", "完工入库单", "完工入库单", "无"),
    PURCHASE_RETURN_APPLY_ORDER("6", "采购退货申请单", "采购退货单", "采购入库订单"),
    PURCHASE_DELIVERY_ORDER("7", "采购收货单", "采购入库单", "采购入库订单"),
    PURCHASE_APPLY_ORDER("8", "采购申请单", "采购订单", "采购订单"),
    PURCHASE_INVOICE_ORDER("9", "采购发票登记", "采购发票登记", "采购入库单"),

    SALES_STOCK_OUT("100", "销售出库", "销售出库", "出库通知单"),
    PURCHASE_RETURN("101", "采购退货", "采购退货", "采购入库单"),
    INVENTORY_STOCK_OUT("102", "盘亏出库订单", "盘亏出库订单", "盘点单"),
    UNPLANNED_STOCK_OUT("103", "计划外出库", "计划外出库", "无"),
    SALE_RETURN_STOCK_IN("104", "销售退货入库", "销售退货入库", "销售退货申请单"),
    PICKING_STOCK_OUT("105", "生产领料单", "生产领料单", "生产用料清单"),
    RETURN_STOCK_IN("106", "生产退料单", "生产退料单", "生产领料单"),
    SALE_ORDER("107", "销售订单", "销售订单", "销售订单"),

    TRANSFER_STOCK_OUT("120", "调拨出库", "调拨出库", "调拨单"),
    TRANSFER_STOCK_IN("121", "调拨入库", "调拨入库", "调拨单"),
    STEP_TRANSFER_STOCK_OUT("122", "分步调出", "分步调出", ""),
    STEP_TRANSFER_STOCK_IN("123", "分步调入", "分步调入", "分步调出单"),

    MES_PRODUCE_ORDER("199", "生产工单", "生产工单", ""),
    MES_PROCESS_PLAN("200", "工序计划", "工序计划", ""),
    MES_PROCESS_OUTSOURCING_IN("201", "工序委外接收单", "工序委外接收", ""),
    MES_PROCESS_OUTSOURCING_SETTLEMENT("202", "工序委外结算单", "工序委外结算", ""),
    MES_PRODUCE_MATERIAL_BILL("203", "生产用料清单", "生产用料清单", ""),
    MES_PRODUCE_PICKING_APPLY("204", "生产领料申请单", "生产领料申请单", ""),
    MES_PRODUCE_PICKING("20400", "生产领料单", "生产领料单", ""),
    TPM_SPARE_PARTS_REQUISITION("205", "备件领用单", "备件领用单", ""),
    STOCK_TRANSFER_ORDER_OUT("206", "转储出库", "转储出库", ""),
    STOCK_TRANSFER_ORDER_IN("207", "转储入库", "转储入库", ""),
    PSI_PURCHASE_INQUIRY("208", "采购询价单", "采购询价单", ""),
    MES_PRODUCT_REPAIR("209", "产品维修工单", "产品维修工单", ""),
    ;

    private String value;

    private String name;

    private String name1;

    private String sourceOrderName;

    StockSourceEnum(String value, String name, String name1, String sourceOrderName) {
        this.value = value;
        this.name = name;
        this.name1 = name1;
        this.sourceOrderName = sourceOrderName;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (StockSourceEnum element : values()) {
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
        for (StockSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getSourceOrderName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (StockSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getSourceOrderName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (StockSourceEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (StockSourceEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (StockSourceEnum element : StockSourceEnum.values()) {
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
        for (StockSourceEnum element : values()) {
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

    public String getName1() {
        return name1;
    }

    public String getSourceOrderName() {
        return sourceOrderName;
    }
}
