package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 自动编码-批号
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/12 10:37
 */
@Getter
public enum AutoBatchNumberEnum {

    PSI_PURCHASE_STOCK_IN_ORDER_DETAIL("68a287e8-d338-49c0-8e2e-cd4f22ea270e", "psi_purchase_stock_in_order_detail", "batchNumber", "采购入库单"),
    PSI_PURCHASE_RETURN_STOCK_IN_ORDER_DETAIL("7c1c8ac7-a610-4013-b3b8-45079e1cfad3", "psi_purchase_return_stock_in_order_detail", "batchNumber", "采购退货单"),
    PSI_UNPLANNED_STOCK_IN("f0fa7fb7-d24c-4a26-aa11-0183fdb7249b", "psi_unplanned_stock_in_order_material", "batchNumber", "计划外入库单"),
    PSI_INVENTORY_STOCK_IN_ORDER("56c14ab0-ccb3-49eb-885d-c0a6a62173a7", "psi_inventory_stock_in_order_detail", "batchNumber", "盘盈入库单"),
    PSI_COMPLETION_STOCK_IN_ORDER("6bcc2b52-1789-4f36-af97-5bb5a5cc36ea", "psi_wip_completion_stock_in_order_material", "batchNumber", "完工入库单"),
    MATERIAL_BARCODE("50ad9693-d6c9-4821-bbf3-31ab74400f1f", "psi_material_barcode", "barcode", "物料条码明细"),
    DETECT_ORDER("cf4222b9-1b09-4c6c-804f-9bdeeaeb9c8f", "collection_detect_order_product_list", "productCode", "试压工单产品编号"),
    INVENTORY_CHECK_ORDER("bad5a711-add7-47ba-85f9-978feafcf259", "psi_inventory_check_order_material", "batchNumber", "盘点单"),
    PRODUCE_ORDER("9b8b834e-63c4-42e4-a9c0-e8640db9bcfb", "mes_produce_order_detail", "batchNumber", "生产工单"),
    PRODUCE_ORDER_SERIAL("055d60ab-fb14-41d5-b4ee-ca26eb90826b", "mes_produce_order_detail_serial", "serialNumber", "生产工单"),
    PURCHASE_DELIVERY_ORDER("fd24c8ca-907e-47de-9971-c1f4f6bb1662", "psi_purchase_delivery_order", "batchNumber", "采购收获"),
    MES_BOM_VERSION("a3e554f0-0d59-4a68-ade8-40fb12ae1b2b", "mes_bom", "bomVersion", "BOM信息"),
    ;

    private final String menuCode;

    private final String tableName;

    private final String field;
    private final String tableDisplayName;

    AutoBatchNumberEnum(String menuCode, String tableName, String field, String tableDisplayName) {
        this.menuCode = menuCode;
        this.tableName = tableName;
        this.field = field;
        this.tableDisplayName = tableDisplayName;
    }

    public static String getDisplayName(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return menuCode;
        }
        for (AutoBatchNumberEnum element : values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getTableDisplayName();
            }
        }
        return null;
    }
}
