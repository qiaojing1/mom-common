package com.lets.platform.common.pojo.enums;

import com.lets.platform.common.pojo.constant.GlobalConstant;

/**
 * 被引用字段
 * @author DING WEI
 * @date 2023/8/28 15:07
 * @version 1.0
 */
public enum QuoteFieldEnum {

    /* 台账 */
    DEVICE_TYPE(QuoteFieldRedisEnum.DEVICE_TYPE, "typeId", QuoteBusinessEnum.DEVICE, "type_id"),
    DEVICE_MODEL(QuoteFieldRedisEnum.DEVICE_MODEL, "modelId", QuoteBusinessEnum.DEVICE, "model_id"),
    DEVICE_CONTROLLER(QuoteFieldRedisEnum.DEVICE_CONTROLLER, "controllerId", QuoteBusinessEnum.DEVICE, "controller_id"),
    DEVICE_MANUFACTURER(QuoteFieldRedisEnum.DEVICE_MANUFACTURER, "manufacturerId", QuoteBusinessEnum.DEVICE, "manufacturer_id"),
    DEVICE_SUPPLIER(QuoteFieldRedisEnum.DEVICE_SUPPLIER, "supplierId", QuoteBusinessEnum.DEVICE, "supplier_id"),
    DEVICE_USE_ORG(QuoteFieldRedisEnum.ORG, "useOrgId", QuoteBusinessEnum.DEVICE, "use_org_id"),
    DEVICE_MAINTENANCE_ORG(QuoteFieldRedisEnum.ORG, "maintenanceOrgId", QuoteBusinessEnum.DEVICE, "maintenance_org_id"),
    FACTORY_MODE(QuoteFieldRedisEnum.ORG, "factoryModeId", QuoteBusinessEnum.DEVICE, "factory_mode_id"),

    /* BOM */
    BOM_MATERIAL(QuoteFieldRedisEnum.MATERIAL_ID, "materialId", QuoteBusinessEnum.MES_BOM, "material_id"),
    BOM_MATERIAL_DETAIL(QuoteFieldRedisEnum.MATERIAL_ID, "materialId", QuoteBusinessEnum.MES_BOM_DETAIL, "material_id"),

    /* 采购订单 */
    PURCHASE_ORG(QuoteFieldRedisEnum.ORG, "purchaseOrgId", QuoteBusinessEnum.PURCHASE_ORDER, "purchase_org_id"),
    PURCHASE_USER(QuoteFieldRedisEnum.USER, "purchaseUserId", QuoteBusinessEnum.PURCHASE_ORDER, "purchase_user_id"),
    PURCHASE_ORDER_CATEGORY_ID(QuoteFieldRedisEnum.ORDER_CATEGORY_ID, "orderCategoryId", QuoteBusinessEnum.PURCHASE_ORDER, "order_category_id"),
    PURCHASE_ORDER_SUPPLIER_ID(QuoteFieldRedisEnum.SUPPLIER_ID, "orderSupplierId", QuoteBusinessEnum.PURCHASE_ORDER, "order_supplier_id"),
    PURCHASE_SUPPLY_SUPPLIER_ID(QuoteFieldRedisEnum.SUPPLIER_ID, "supplySupplierId", QuoteBusinessEnum.PURCHASE_ORDER, "supply_supplier_id"),
    PURCHASE_SETTLEMENT_SUPPLIER_ID(QuoteFieldRedisEnum.SUPPLIER_ID, "settlementSupplierId", QuoteBusinessEnum.PURCHASE_ORDER, "settlement_supplier_id"),
    PURCHASE_COLLECTION_SUPPLIER_ID(QuoteFieldRedisEnum.SUPPLIER_ID, "collectionSupplierId", QuoteBusinessEnum.PURCHASE_ORDER, "collection_supplier_id"),
    PURCHASE_BASIC_CURRENCY_ID(QuoteFieldRedisEnum.CURRENCY_ID, "basicCurrencyId", QuoteBusinessEnum.PURCHASE_ORDER, "basic_currency_id"),
    PURCHASE_SETTLEMENT_CURRENCY_ID(QuoteFieldRedisEnum.CURRENCY_ID, "settlementCurrencyId", QuoteBusinessEnum.PURCHASE_ORDER, "settlement_currency_id"),
    PURCHASE_MATERIAL_ID(QuoteFieldRedisEnum.MATERIAL_ID, "materialId", QuoteBusinessEnum.PURCHASE_ORDER_DETAIL, "material_id"),
    PURCHASE_PURCHASE_UNIT_ID(QuoteFieldRedisEnum.UNIT_ID, "purchaseUnitId", QuoteBusinessEnum.PURCHASE_ORDER_DETAIL, "purchase_unit_id"),
    PURCHASE_TAX_ID(QuoteFieldRedisEnum.TAX_ID, "taxId", QuoteBusinessEnum.PURCHASE_ORDER_DETAIL, "tax_id"),

    /* XX单据 */
    ;

    private String redisKey;
    private String attribute;
    private String tableSchema;
    private String tableName;
    private String business;
    private String field;

    QuoteFieldEnum(QuoteFieldRedisEnum redisKey, String attribute, QuoteBusinessEnum quoteBusinessEnum, String field) {
        this.attribute = attribute;
        this.tableSchema = quoteBusinessEnum.getTableSchema();
        this.tableName = quoteBusinessEnum.getTableName();
        this.business = quoteBusinessEnum.getBusinessName();
        this.field = field;
        this.redisKey = "Quote" + GlobalConstant.COLON_HALF_ANGLE + redisKey.getRedisKey() + GlobalConstant.COLON_HALF_ANGLE + tableName;
    }

    public String getRedisKey() {
        return redisKey;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public String getBusiness() {
        return business;
    }

    public String getField() {
        return field;
    }
}
