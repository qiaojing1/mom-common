package com.lets.platform.common.pojo.enums;

/**
 * 被引用字段 key
 * @author DING WEI
 * @date 2023/8/28 15:07
 * @version 1.0
 */
public enum QuoteFieldRedisEnum {

    ORG("orgId"),
    USER("userId"),
    ORDER_CATEGORY_ID("orderCategoryId"),
    SUPPLIER_ID("supplierId"),
    CURRENCY_ID("currencyId"),
    MATERIAL_ID("materialId"),
    UNIT_ID("unitId"),
    TAX_ID("taxId"),

    /** 设备属性 */
    DEVICE_TYPE("deviceTypeId"),
    DEVICE_MODEL("deviceModelId"),
    DEVICE_CONTROLLER("deviceControllerId"),
    DEVICE_MANUFACTURER("deviceManufacturerId"),
    DEVICE_SUPPLIER("deviceSupplierId"),
    DEVICE_FACTORY_MODE("deviceFactoryModeId"),
    ;

    private String redisKey;

    QuoteFieldRedisEnum(String redisKey) {
        this.redisKey = redisKey;
    }

    public String getRedisKey() {
        return redisKey;
    }

}
