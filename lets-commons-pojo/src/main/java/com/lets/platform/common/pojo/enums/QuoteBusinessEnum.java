package com.lets.platform.common.pojo.enums;

/**
 * 应用业务
 * @author DING WEI
 * @date 2023/8/28 15:07
 * @version 1.0
 */
public enum QuoteBusinessEnum {

    PURCHASE_ORDER("lets-platform-psi", "psi_purchase_order", "采购订单"),
    PURCHASE_ORDER_DETAIL("lets-platform-psi", "psi_purchase_order_detail", "采购订单物料明细"),

    DEVICE("lets-platform-common", "common_device", "台账"),

    MES_BOM("lets-platform-mes", "mes_bom", "BOM维护"),
    MES_BOM_DETAIL("lets-platform-mes", "mes_bom_detail", "BOM子项"),
    ;

    private String tableSchema;
    private String tableName;
    private String businessName;

    QuoteBusinessEnum(String tableSchema, String tableName, String businessName) {
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.businessName = businessName;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public String getBusinessName() {
        return businessName;
    }
}
