package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

public enum BarcodeRuleParseFieldEnum implements IEnum<String> {

    MATERIAL_CODE_0("0", "materialCode", "物料编码"),
    MATERIAL_NAME_0("0", "materialName", "物料名称"),
    MATERIAL_SPECS_0("0", "materialSpecs", "规格型号"),
    QUANTITY_0("0", "quantity", "装箱数量"),
    SERIAL_NUMBER_0("0", "serialNumber", "流水号"),
    BATCH_NUMBER_0("0", "batchNumber", "批次号"),

    PRODUCE_ORDER_ID("1", "produceOrderId", "生产工单ID"),
    PRODUCE_ORDER_CODE("1", "produceOrderCode", "生产工单编号"),
    PRODUCE_ORDER_DETAIL_ID("1", "produceOrderDetailId", "生产工单明细ID"),
    PRODUCE_ORDER_LINE_NUMBER("1", "lineNumber", "行号"),

    PURCHASE_ORDER_CODE_2("2", "purchaseOrderCode", "采购订单编号"),
    PURCHASE_ORDER_ID_2("2", "purchaseOrderId", "采购订单ID"),
    PURCHASE_ORDER_DETAIL_ID_2("2", "purchaseOrderDetailId", "采购订单明细ID"),
    MATERIAL_CODE_2("2", "materialCode", "物料编码"),

    MATERIAL_CODE_3("3", "materialCode", "物料编码"),
    BATCH_NUMBER_3("3", "batchNumber", "批次号"),

    MATERIAL_CODE_4("4", "materialCode", "物料编码"),
    BATCH_NUMBER_4("4", "batchNumber", "批次号"),

    MATERIAL_CODE_5("5", "materialCode", "物料编码"),
    EXTERNAL_BARCODE_5("5", "externalBarcode", "外部码"),

    MATERIAL_CODE_6("6", "materialCode", "物料编码"),
    ;

    @Getter
    private final String menu;

    private final String value;

    @Getter
    private final String name;

    BarcodeRuleParseFieldEnum(String menu, String value, String name) {
        this.menu = menu;
        this.value = value;
        this.name = name;
    }

    public static boolean contains(String menu, String value) {
        for (BarcodeRuleParseFieldEnum fieldEnum : BarcodeRuleParseFieldEnum.values()) {
            if (fieldEnum.menu.equals(menu) && fieldEnum.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }
}
