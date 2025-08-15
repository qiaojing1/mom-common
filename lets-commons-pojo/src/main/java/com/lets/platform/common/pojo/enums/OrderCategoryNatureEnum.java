package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * 单据类别-单据性质
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/12 10:37
 */
@Getter
public enum OrderCategoryNatureEnum {

    PSI_PRODUCE_PLAN("80a85252-71e1-4577-b7d3-ae78debba47a", "psi_produce_plan", "order_category_id", "计划订单", "psi", "/defaultPage", ""),
    PSI_PRODUCTION_ORDER("055d60ab-fb14-41d5-b4ee-ca26eb90826b", "mes_produce_order", "order_category_id", "生产工单", "mes", "/defaultPage", ""),
    PSI_SALE_ORDER("7e76eee8-c8be-411c-8a60-d522c46ad948", "psi_sale_order", "order_category_id", "销售订单", "psi", "/psiSaleOrder/defaultPage", "m.id"),
    PSI_SALE_REPLACEMENT_ORDER("e4b407ef-d149-4425-b98a-438c3483ce9b", "psi_sale_replacement_order", "order_category_id", "销售换货申请单", "psi", "/psiSaleReplacementOrder/defaultPage", "m.id"),
    PSI_SALE_PREDICTION_ORDER("48441ced-ab99-4aa3-8afa-e40fcfdae5fa", "psi_sale_prediction_order", "order_category_id", "销售预测单", "psi", "/psiSaleOrder/defaultPage", "main.id"),
    PSI_SALE_CHANGE_ORDER("215b1eec-ba48-4e83-b8fa-ea6c4575cf61", "psi_sale_change_order", "order_category_id", "销售变更单", "psi", "/psiSaleChangeOrder/defaultPage", "m.id"),
    PSI_PURCHASE_ORDER("42e6e4a1-09bd-4cfc-ab60-29c08cd17bad", "psi_purchase_order", "order_category_id", "采购订单管理", "psi", "/psiPurchaseOrder/defaultPage", "detail.order_id"),
    PSI_COOPERATE_PURCHASE_ORDER("8f5844e7-e9a5-41a5-bb3d-7d13fec274e4", "psi_purchase_order", "order_category_id", "协同采购单管理", "psi", "/psiPurchaseOrder/defaultPage", "detail.order_id"),
    PSI_COOPERATE_QUOTE_ORDER("892152c9-0617-46fc-ae36-bb6ac6d0fad1", "psi_cooperate_quote_order", "order_category_id", "协同报价单", "psi", "/psiCooperateQuoteOrder/defaultPage", "detail.order_id"),
    PSI_COOPERATE_DELIVER_ORDER("8a985e0c-8058-45c7-941b-8ed5e9e52137", "psi_cooperate_deliver_order", "order_category_id", "协同送货单", "psi", "/psiCooperateDeliverOrder/defaultPage", "detail.order_id"),
    PSI_PURCHASE_CHANGE_ORDER("c0d1b6f7-8420-4e32-8c1b-32527ff4b024", "psi_purchase_change_order", "order_category_id", "采购变更单", "psi", "/psiPurchaseChangeOrder/defaultPage", "m.id"),
    PSI_PURCHASE_STOCK_IN_ORDER("8aa9f41d-e785-4630-b8f4-e78f7367c082", "psi_purchase_stock_in_order", "order_category_id", "采购入库单", "psi", "/defaultPage", ""),
    PSI_DELIVERY_NOTIFY_ORDER("cacb7011-731f-492e-8c7d-8b9a0ddbb6ec", "psi_delivery_notify_order", "order_category_id", "出货通知单信息", "psi", "/defaultPage", ""),
    PSI_DELIVERY_NOTIFY_ORDER_MGR("cacb7011-731f-492e-8c7d-8b9a0ddbb6ec", "psi_delivery_notify_order", "order_category_id", "出货通知单", "psi", "/psiDeliveryNotifyOrder/defaultPage", "m.id"),
    PSI_SALE_STOCK_OUT_ORDER("ccd6f395-5273-4f4f-8d3a-17ed0cfdf9d9", "psi_sale_stock_out_order", "order_category_id", "销售出库单", "psi", "/psiSaleStockOutOrder/defaultPage", "m.id"),
    PSI_UNPLANNED_STOCK_IN_ORDER("f19106e7-b98a-40d1-a49d-bedf1ad092dd", "psi_unplanned_stock_in_order", "order_category_id", "计划外入库单", "psi", "/defaultPage", ""),
    PSI_UNPLANNED_STOCK_OUT_ORDER("9bda27ad-75b6-445f-9980-ff74cd9eca1c", "psi_unplanned_stock_out_order", "order_category_id", "计划外出库单", "psi", "/defaultPage", ""),
    PSI_PURCHASE_RETURN_STOCK_IN_ORDER("0a9a63da-d496-46b9-92e2-d443b7ef1bde", "psi_purchase_return_stock_in_order", "order_category_id", "采购退货单", "psi", "/defaultPage", ""),
    PSI_INVENTORY_STOCK_IN_ORDER("bd574319-89e5-4756-a8ed-317a4ee27732", "psi_inventory_stock_in_order", "order_category_id", "盘盈入库单", "psi", "/defaultPage", ""),
    PSI_INVENTORY_STOCK_OUT_ORDER("1121892d-5018-45f4-bc96-2b9a1c9d776c", "psi_inventory_stock_out_order", "order_category_id", "盘亏出库单", "psi", "/defaultPage", ""),
    PSI_WIP_COMPLETION_STOCK_IN_ORDER("a03cf895-d5e2-4755-971b-dbac1848a272", "psi_inventory_stock_out_order", "order_category_id", "完工入库单", "psi", "/defaultPage", ""),
    PSI_SALE_QUOTATION_ORDER("c6e36fe9-8aa2-4505-a7d0-9bee50643a48", "psi_sale_quotation_order", "order_category_id", "销售报价单", "psi", "/defaultPage", ""),
    PSI_PURCHASE_APPLY_ORDER("79839776-942e-4458-9487-272a3632a1f1", "psi_purchase_apply_order", "order_category_id", "采购申请单", "psi", "/defaultPage", ""),
    PSI_SALE_RETURN_APPLICATION_ORDER("0a1e2aeb-9db5-4c6d-ba96-7d63de142893", "psi_sale_return_application_order", "order_category_id", "销售退货申请单", "psi", "/defaultPage", ""),
    PSI_SALE_RETURN_ORDER("34dfbbaf-04cd-4142-a4fc-8f88d2fd611d", "psi_sale_return_order", "order_category_id", "销售退货单", "psi", "/defaultPage", ""),
    PSI_PURCHASE_RETURN_APPLY_ORDER("457d063c-c0c3-4326-a724-20849c182d21", "psi_purchase_return_apply_order", "order_category_id", "采购退货申请单", "psi", "/defaultPage", ""),
    PSI_TRANSFER_ORDER("bea028bb-862b-4533-9da5-4a1052fbf3ab", "psi_transfer_order", "order_category_id", "直接调拨单管理", "psi", "", ""),
    PSI_STEP_TRANSFER_ORDER("79e3fd44-e92e-4700-b8f0-8f01ea2c9afb", "psi_step_transfer_order", "order_category_id", "分步调拨出库单管理", "psi", "", ""),
    PSI_STEP_TRANSFER_IN_ORDER("c77a0d44-d6d0-4af3-97e8-3d73501c5e67", "psi_step_transfer_in_order", "order_category_id", "分步调拨入库单管理", "psi", "", ""),
    PSI_CONTRACT_ORDER("1da0dee3-24f9-4a64-88d2-72eee381c4b7", "psi_contract_order", "order_category_id", "合同管理", "psi", "", ""),
    PSI_STORAGE_POSITION("cc2eb0d2-c497-4721-a284-25c8776e440c", "psi_storage_position", "order_category_id", "库位管理", "psi", "", ""),
    PSI_SALE_INVOICE("669cddcd-ff5b-47ad-90a9-21a3f6937286", "psi_sale_invoice_registration", "order_category_id", "销售发票登记", "psi", "", ""),
    PSI_PURCHASE_DELIVERY("13f4f037-581b-4a84-8798-e333b090d36d", "psi_purchase_delivery_order", "order_category_id", "采购收货单", "psi", "", ""),
    PSI_PURCHASE_INVOICE("41352f71-5a83-41e7-bdd8-6e1c934b8c0e", "psi_purchase_invoice_order", "order_category_id", "采购发票登记", "psi", "", ""),
    PSI_PAYMENT_ORDER("e79337d7-216e-4605-8ac3-a241729bbdc7", "psi_payment_order", "order_category_id", "付款单", "psi", "", ""),
    PSI_PAYMENT_REFUND_DOC("637f8ff2-b930-4d1f-9b16-620212d391be", "psi_purchase_payment_refund_doc", "order_category_id", "付款退款单", "psi", "", ""),
    PSI_RECEIPT_ORDER("d9436eab-854f-4db5-95d1-8e371ba17ced", "psi_receipt_order", "order_category_id", "收款单", "psi", "", ""),
    CONTAINER_CODE("ffd3b70d-c88c-4262-89ca-d288449a4f26", "psi_container_code", "order_category_id", "容器条码", "psi", "", ""),
    PSI_PURCHASE_IN("8aa9f41d-e785-4630-b8f4-e78f7367c082", "psi_purchase_stock_in_order", "order_category_id", "采购入库", "psi", "", ""),
    PSI_PURCHASE_INQUIRY("c047fa69-2554-4883-8a53-dd2f7fd6d1ed", "psi_purchase_inquiry", "order_category_id", "采购询价", "psi", "", ""),
    PSI_PURCHASE_RFQ("c047fa69-2554-4883-8a53-dd2f7fd6d1ed", "psi_purchase_rfq", "order_category_id", "采购询价", "psi", "", ""),
    PSI_PURCHASE_AP_DOC("8ec5c1eb-8342-41ab-8f34-2576df8ceabc", "psi_purchase_ap_doc", "order_category_id", "采购应付单", "psi", "", ""),
    PSI_SALE_AR_DOC("d74bce02-165e-4192-8e54-94b4c598bf08", "psi_sale_ar_doc", "order_category_id", "销售应收单", "psi", "", ""),

    MES_PROCESS_TRANSFER("d06d0327-9e46-4afa-88e5-2ad260a31db6", "mes_process_transfer", "order_category_id", "工序转移单", "mes", "/defaultPage", ""),
    MES_PROCESS_REPORT("c58d27e0-cb77-4ebe-bc87-569115283b79", "mes_process_report", "order_category_id", "工序汇报单", "mes", "/defaultPage", ""),
    MES_PRODUCE_ORDER("055d60ab-fb14-41d5-b4ee-ca26eb90826b", "mes_produce_order", "order_category_id", "生产工单管理", "mes", "/mesProduceOrder/defaultPage", "orderId"),
    MES_PRODUCE_CHANGE_ORDER("d467aeeb-72e3-4c4d-89b1-ab5b31b38509", "", "", "生产变更单", "", "", ""),
    MES_PRODUCE_MATERIAL_BILL("5e1f6f57-6a39-4173-9111-08922a45aba0", "", "", "生产用料清单", "", "", ""),
    MES_PRODUCE_PROCESS_PLAN("8c6a65c4-d157-42f6-b57d-994389ec8b11", "", "", "工序计划管理", "mes", "", ""),
    MES_DISPATCH_DETAIL("09675237-5773-4c3b-905d-aaa88d444e15", "", "", "派工单管理", "", "", ""),
    MES_PRODUCE_REPORT("6282b4de-b206-4bbe-acf3-0007d6066444", "mes_produce_report_order", "order_category_id", "工单报工单", "mes", "/mesProduceReportOrder/defaultPage", "orderId"),
    MES_PRODUCE_PICKING("2c3ccc46-8b13-43ea-adb6-b78836ddabc1", "mes_produce_picking", "order_category_id", "生产领料单", "mes", "/mesProducePicking/defaultPage", "detail.order_id"),
    MES_BOM("4d19e433-bcef-4a85-b245-8f8a01cf3ac4", "mes_bom", "", "BOM维护", "mes", "", ""),
    MES_PRODUCE_RETURN("81a87c77-299c-42c7-8e0c-2e1e6e39e2bb", "mes_produce_return", "order_category_id", "生产退料单", "mes", "/mesProduceReturn/defaultPage", "detail.order_id"),
    MES_INSPECTION_ORDER("723674d1-0486-4ca5-aeb9-c01527bc087d", "mes_inspection_order", "order_category_id", "检验单管理", "mes", "", ""),
    MES_INSPECTION_APPLY_ORDER("2f801379-f2d4-4d8f-83ae-cf0780bd2099", "mes_inspection_application_order", "order_category_id", "检验申请单", "mes", "", ""),
    MES_PROCESS_OUTSOURCING_OUT("1810b334-1e6d-4f6c-8a59-b7ce0e1a3528", "mes_process_outsourcing_out", "order_category_id", "工序委外发出单", "mes", "", ""),
    MES_PROCESS_OUTSOURCING_IN("577d51e6-64ed-44f4-9ec3-c617aceb3ac6", "mes_process_outsourcing_in", "order_category_id", "工序委外接收单", "mes", "", ""),
    MES_PROCESS_OUTSOURCING_SETTLEMENT("dbe20195-15f4-4da6-a50e-7c8a2d56a85c", "mes_process_outsourcing_settlement", "order_category_id", "工序委外接结算", "mes", "", ""),
    MES_PROCESS_OUTSOURCING_OUT_BATCH("d2b0752c-eed3-4360-93dd-3e59d263ae7f", "mes_process_outsourcing_batch", "order_category_id", "工序委外合并发出单", "mes", "", ""),
    MES_PROCESS_OUTSOURCING_IN_BATCH("27adc514-acb0-4251-915b-20584aa74a5a", "mes_process_outsourcing_batch", "order_category_id", "工序委外合并接收单", "mes", "", ""),
    MES_PRODUCE_MATERIAL_BILL_ORDER("5e1f6f57-6a39-4173-9111-08922a45aba0", "mes_produce_material_bill_order", "order_category_id", "用料清单", "mes", "", ""),
    MES_PRODUCE_MATERIAL_BILL_CHANGE_ORDER("1b1ee11e-857b-42e2-9bf4-f665f384d9ef", "mes_produce_material_bill_change_order", "order_category_id", "用料清单变更", "mes", "", ""),
    MES_PRODUCE_PICKING_APPLY("9ae723c8-3312-4e5d-8335-bea94409e9c7", "mes_produce_picking_apply", "order_category_id", "生产领料申请", "mes", "", ""),
    MES_PRODUCT_REPAIR_ORDER("ec3bbe11-b7e8-4968-a731-069851404c5a", "mes_product_repair_order", "order_category_id", "产品维修工单", "mes", "", ""),

    DETECT_REPORT("364d5d6e-f8b7-44ad-b940-27c101dc7f8c", "collection_detect_report", "order_category_id", "试验记录", "collection", "/collectionDetectReport/defaultPage", ""),
    QUALITY_CERTIFICATION("7afd8988-9130-4261-8514-5b5b2f20adb3", "collection_quality_certification", "order_category_id", "质量证明书", "collection", "/collectionQualityCertification/defaultPage", ""),
    DETECT_REPORT_QUALIFIED("d8832fe6-1a18-460f-a9af-f28147241bcb", "collection_detect_report", "order_category_id", "单件试验报告", "collection", "/collectionDetectReport/defaultPage", ""),
    REMOTE_SUPERVISION("aeeed32d-487c-4c69-90e6-87fcca9cd8d0", "collection_remote_supervision", "", "远程监造", "collection", "", ""),

    ROUTINE("7e1d1d62-e424-4704-9f25-6da9b26e813f", "collection_routine_performance_test", "order_category_id", "常规性能试验", "collection", "", ""),
    LOW_TEMP_SEAL("a161d67e-f61e-4104-9be3-dfb38ee37166", "collection_routine_performance_test", "order_category_id", "低温密封试验", "collection", "", ""),
    CLEAN("0651f68b-23ce-4f41-8bb8-d20bdd48e013", "collection_routine_performance_test", "order_category_id", "洁净性能试验", "collection", "", ""),
    MOVEMENT("0a960a99-b2ac-438e-b757-37f7820b5376", "collection_routine_performance_test", "order_category_id", "动作实验标准", "collection", "", ""),
    DETECT_ORDER_DETAIL("cf4222b9-1b09-4c6c-804f-9bdeeaeb9c8f", "collection_detect_order_product_list", "order_category_id", "试压工单详情", "collection", "", ""),
    BATCH_DETECT_REPORT("a0958735-69f4-477a-af20-f8769004b00a", "collection_detect_batch_report", "order_category_id", "批次试验报告", "collection", "", ""),
    MATERIAL_APPLY("607d1d6f-b948-4ffc-b16f-b133fbf4f994", "psi_material_apply", "order_category_id", "物料申请", "psi", "", ""),
    DETECT_ORDER("85221baf-b0cf-4c09-a4f3-3deb468ebe6d", "collection_detect_order", "order_category_id", "试压工单", "collection", "", ""),
    PACKAGE_ORDER("f7918272-b96e-4c7c-a99f-b36e361c7444", "psi_package_order", "", "装箱单", "psi", "", ""),
    SHIP_ORDER("2a2c1c4d-1a81-4e72-8a83-09fd41bfe018", "psi_ship_order", "", "发运单", "psi", "", ""),
    BATCH_RECORD("4bd5b52b-00a5-4c2a-ba3c-c515be14215e", "psi_store_material", "", "批号档案", "psi", "", ""),
    STOCK_TRANSFER_ORDER("6720e9c5-0c5e-4fbb-82a3-9d18f61d09e5", "psi_stock_transfer_order", "", "库存转储单", "psi", "", ""),

    TPM_SPAREPARTS_REQUISITION("e0dacb65-0caf-4da9-9c8c-e10901fb93d1", "tpm_spare_parts_requisition_order", "", "备件领用单", "tpm", "", ""),
    TPM_INSPECTION_ITEMS_ORDER("f0f94b7c-b832-47f5-94cc-e8cbf769f7a7", "tpm_inspection_items_order", "", "点检工单", "tpm", "", ""),
    TPM_REPAIR_RECORD("920c23d2-aab0-4542-a388-a964805eb297", "tpm_call_repair_order", "", "维修记录", "tpm", "", ""),
    TPM_MAINTENANCE_ITEMS_ORDER("d85977bf-847b-44db-83ed-23ef49da986e", "tpm_maintenance_items_order", "", "保养工单", "tpm", "", ""),
    COMMON_TRANSACTION_APPROVAL("8c1615ba-99a4-42f0-8cbe-6d6d70d45a4d", "common_transaction_approval", "", "事务审批单", "common", "", ""),

    /** MRP **/
    FIRST_MRP("e70bd464-d7a0-4ba9-999e-b451f55817f1", "", "", "一级MRP", "psi", "", ""),
    /** 物料条码生产追溯 **/
    PSI_PRODUCE_ORDER_PURSUANCE_RECORD("e4e7dcb7-2743-4bb7-af06-15f4852ce1df", "", "", "物料条码生产追溯", "psi", "", ""),
    ;

    private String orderNature;
    private String tableName;
    private String field;
    private String name;
    private String serverName;
    private String feignUrl;
    private String conditionKey;

    OrderCategoryNatureEnum(String orderNature, String tableName, String field, String name, String serverName, String feignUrl, String conditionKey) {
        this.orderNature = orderNature;
        this.tableName = tableName;
        this.field = field;
        this.name = name;
        this.serverName = serverName;
        this.feignUrl = feignUrl;
        this.conditionKey = conditionKey;
    }

    public static OrderCategoryNatureEnum getEnumByOrderNature(String orderNature) {
        if (StringUtils.isBlank(orderNature)) {
            return null;
        }
        for (OrderCategoryNatureEnum value : values()) {
            if (orderNature.equals(value.getOrderNature())) {
                return value;
            }
        }
        return null;
    }

    public static String getFieldByOrderNature(String orderNature) {
        if (StringUtils.isBlank(orderNature)) {
            return null;
        }
        for (OrderCategoryNatureEnum value : values()) {
            if (orderNature.equals(value.getOrderNature())) {
                return value.getField();
            }
        }
        return null;
    }

    public static String getNameByOrderNature(String orderNature) {
        if (StringUtils.isBlank(orderNature)) {
            return null;
        }
        for (OrderCategoryNatureEnum value : values()) {
            if (orderNature.equals(value.getOrderNature())) {
                return value.getName();
            }
        }
        return null;
    }

}
