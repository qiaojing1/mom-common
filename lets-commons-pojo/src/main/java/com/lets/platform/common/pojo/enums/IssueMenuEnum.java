package com.lets.platform.common.pojo.enums;


import com.lets.platform.common.pojo.exception.LetsException;
import lombok.Getter;

/**
 * 下发 功能菜单
 */
public enum IssueMenuEnum implements IEnum<String> {

    REPORT_ORDER("6282b4de-b206-4bbe-acf3-0007d6066444", "工单报工单"),
    INSPECT_ORDER("723674d1-0486-4ca5-aeb9-c01527bc087d", "检验单"),
    WIP_STOCK_IN_ORDER("a03cf895-d5e2-4755-971b-dbac1848a272", "完工入库单"),
    INSPECT_APPLICATION_ORDER("2f801379-f2d4-4d8f-83ae-cf0780bd2099", "检验申请单"),
    DISPATCH_DETAIL("09675237-5773-4c3b-905d-aaa88d444e15", "派工单明细"),
    PROCESS_REPORT("c58d27e0-cb77-4ebe-bc87-569115283b79", "工序汇报单"),
    PROCESS_PLAN("8c6a65c4-d157-42f6-b57d-994389ec8b11", "工序计划管理"),
    PRODUCE_ORDER("055d60ab-fb14-41d5-b4ee-ca26eb90826b", "生产工单"),
    PROCESS_OUTSOURCING_OUT("1810b334-1e6d-4f6c-8a59-b7ce0e1a3528", "工序委外发出"),
    PROCESS_OUTSOURCING_IN("577d51e6-64ed-44f4-9ec3-c617aceb3ac6", "工序委外接收"),
    PROCESS_OUTSOURCING_SET("dbe20195-15f4-4da6-a50e-7c8a2d56a85c", "工序委外结算"),
    PRODUCE_MATERIAL_BILL_ORDER("5e1f6f57-6a39-4173-9111-08922a45aba0", "生产用料清单"),
    PRODUCE_PICKING_APPLY("9ae723c8-3312-4e5d-8335-bea94409e9c7", "生产领料申请单"),
    PRODUCE_USED_RETURN_APPLY("81a87c77-299c-42c7-8e0c-2e1e6e39e2bb", "生产退料单"),
    PRODUCE_PICKING("2c3ccc46-8b13-43ea-adb6-b78836ddabc1", "生产领料单"),
    PRODUCE_RETURN_PICKING("81a87c77-299c-42c7-8e0c-2e1e6e39e2bb", "生产退料单"),
    CONTRACT_ORDER("1da0dee3-24f9-4a64-88d2-72eee381c4b7", "合同管理"),
    SALE_QUOTATION_ORDER("c6e36fe9-8aa2-4505-a7d0-9bee50643a48", "销售报价单"),
    SALE_ORDER("7e76eee8-c8be-411c-8a60-d522c46ad948", "销售订单"),
    SALE_PREDICTION_ORDER("48441ced-ab99-4aa3-8afa-e40fcfdae5fa", "销售预测单"),
    DELIVERY_NOTIFY_ORDER("cacb7011-731f-492e-8c7d-8b9a0ddbb6ec", "出货通知单"),
    SALE_STOCK_OUT_ORDER("ccd6f395-5273-4f4f-8d3a-17ed0cfdf9d9", "销售出库单"),
    SALE_RETURN_APPLY_ORDER("0a1e2aeb-9db5-4c6d-ba96-7d63de142893", "销售退货申请"),
    SALE_RETURN_ORDER("34dfbbaf-04cd-4142-a4fc-8f88d2fd611d", "销售退货"),
    SALE_INVOICE("669cddcd-ff5b-47ad-90a9-21a3f6937286", "销售发票登记"),
    TRANSFER_ORDER("bea028bb-862b-4533-9da5-4a1052fbf3ab", "直接调拨单"),
    STEP_TRANSFER_ORDER("79e3fd44-e92e-4700-b8f0-8f01ea2c9afb", "分步调拨出库单"),
    STEP_TRANSFER_IN_ORDER("c77a0d44-d6d0-4af3-97e8-3d73501c5e67", "分步调拨入库单"),
    PURCHASE_APPLICATION_ORDER("79839776-942e-4458-9487-272a3632a1f1", "采购申请单"),
    PURCHASE_ORDER("42e6e4a1-09bd-4cfc-ab60-29c08cd17bad", "采购订单"),
    PURCHASE_DELIVERY_ORDER("13f4f037-581b-4a84-8798-e333b090d36d", "采购收货单"),
    PURCHASE_INQUIRY("c047fa69-2554-4883-8a53-dd2f7fd6d1ed", "采购询价单"),
    PURCHASE_STOCK_IN_ORDER("8aa9f41d-e785-4630-b8f4-e78f7367c082", "采购入库单"),
    PURCHASE_RETURN_APPLICATION_ORDER("457d063c-c0c3-4326-a724-20849c182d21", "采购退货申请单"),
    PURCHASE_RETURN_ORDER("0a9a63da-d496-46b9-92e2-d443b7ef1bde", "采购退货单"),
    PURCHASE_INVOICE_ORDER("41352f71-5a83-41e7-bdd8-6e1c934b8c0e", "采购发票登记"),
    PAYMENT_ORDER("e79337d7-216e-4605-8ac3-a241729bbdc7", "付款单"),
    REFUND_DOC("637f8ff2-b930-4d1f-9b16-620212d391be", "付款退款单"),
    UNPLANNED_STOCK_OUT_ORDER("9bda27ad-75b6-445f-9980-ff74cd9eca1c", "计划外出库"),
    DETECT_ORDER("85221baf-b0cf-4c09-a4f3-3deb468ebe6d", "试压工单"),
    OUTSOURCING_BATCH_OUT("d2b0752c-eed3-4360-93dd-3e59d263ae7f", "工序委外合并发出"),
    OUTSOURCING_BATCH_IN("27adc514-acb0-4251-915b-20584aa74a5a", "工序委外合并接收"),
    PURCHASE_AP("8ec5c1eb-8342-41ab-8f34-2576df8ceabc", "应付单"),
    SALE_AR("d74bce02-165e-4192-8e54-94b4c598bf08", "应收单"),
    PSI_COOPERATE_QUOTE_ORDER("892152c9-0617-46fc-ae36-bb6ac6d0fad1", "协同报价单"),
    COOPERATE_PURCHASE_ORDER("8f5844e7-e9a5-41a5-bb3d-7d13fec274e4", "协同采购订单"),
    COOPERATE_DELIVER_ORDER("8a985e0c-8058-45c7-941b-8ed5e9e52137", "协同送货订单"),
    PSI_RECEIPT_ORDER("d9436eab-854f-4db5-95d1-8e371ba17ced", "收款单"),
    SALE_REPLACEMENT_ORDER("e4b407ef-d149-4425-b98a-438c3483ce9b", "销售换货申请"),
    PRODUCT_REPAIR("ec3bbe11-b7e8-4968-a731-069851404c5a", "产品维修工单"),
    ;

    private final String menuCode;
    @Getter
    private final String menuName;


    IssueMenuEnum(String menuCode, String menuName) {
        this.menuCode = menuCode;
        this.menuName = menuName;
    }

    public static IssueMenuEnum getEnum(String value) {
        for (IssueMenuEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        throw new LetsException(0, "不支持的下发类型");
    }

    @Override
    public String getValue() {
        return menuCode;
    }

    public boolean equals(String menuCode) {
        return this.menuCode.equals(menuCode);
    }
}
