package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 自动生成编码 枚举
 *
 * @ClassName LetsAutoCreateFieldEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum LetsAutoCreateFieldEnum implements IEnum<Object> {

    // lets_device_factory_mode 工厂建模表
    MODE_CODE("mode_code", "code"),

    // sys_org 组织表
    ORG_CODE("org_code", "code"),
    CUSTOMER_CODE("customer_code", "code"),
    SUPPLIER_CODE("supplier_code", "code"),
    DEFAULT_CODE("code", "code"),

    // psi_purchase_order 采购订单
    PURCHASE_APPLY_CODE("code", "code"),
    // 销售出库申请
    SALES_STOCK_OUT_APPLY_CODE("code", "code"),

    RECEIVE_GOODS_CODE("code", "code"),

    STOCK_IN("code", "code"),
    STOCK_OUT("code", "code"),

    DELIVER_CODE("deliver_code", "deliverCode"),

    // psi_stock_in_detail 入库详情
    STOCK_IN_BATCH("stock_in_batch", "stockInBatch"),
    // psi_stock_out_detail 出库详情
    STOCK_OUT_BATCH("stock_out_batch", "stockOutBatch"),
    //mes_bom_version 版本号
    VERSION("version", "version"),
    MATERIAL_CODE("code", "code"),

    //mes_die_fixture_category 模治具类别
    DIE_FIXTURE_CATEGORY("code", "code"),
    MES_DIE_FIXTURE_ADVERSE_CAUSES("code", "code"),

    // TPM 点巡检编码
    TPM_SPOT_CODE("spot_order", "spotOrder"),
    TPM_INSPECTION_CODE("inspection_order", "inspectionOrder"),
    TPM_MAINTAIN_CODE("code", "code"),

    DISTRIBUTE_PLAN_CODE("distribute_plan_code", "distributePlanCode"),
    RELATION_ORDER_CODE("relation_order_code", "relationOrderCode"),
    RETURN_BATCH_CODE("return_batch", "returnBatch"),
    ;

    // TODO 其他表字段

    private String value;

    private String field;

    LetsAutoCreateFieldEnum(String value, String field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrderField(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (LetsAutoCreateFieldEnum element : LetsAutoCreateFieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getField();
            }
        }
        return null;
    }

    public String getField() {
        return field;
    }
}
