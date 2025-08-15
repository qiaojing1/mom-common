package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;

public enum CommonFileBussEnum implements IEnum<String> {

    SALE_PREDICTION_ORDER("sale_prediction_order", "销售预测订单"),
    SALE_ORDER("sale_order", "销售订单"),
    SALE_REPLACEMENT_ORDER("sale_replacement_order", "销售换货申请单"),
    CONTRACT_MANAGE("contract_manage", "合同管理"),
    PURCHASE_ORDER("purchase_order", "采购订单"),
    PURCHASE_CHANGE_ORDER("purchase_change_order", "采购变更单"),
    DELIVERY_NOTIFY_ORDER("delivery_notify_order", "出货通知单"),
    SALE_STOCK_OUT_ORDER("sale_stock_out_order", "销售出库单"),
    UNPLANNED_STOCK_IN_ORDER("unplanned_stock_in_order", "计划外入库单"),
    UNPLANNED_STOCK_OUT_ORDER("unplanned_stock_out_order", "计划外入库单"),
    WIP_COMPLETION_STOCK_IN_ORDER("wip_completion_stock_in_order", "完工入库单"),
    SALE_QUOTATION_ORDER("sale_quotation_order", "销售报价单"),
    SALE_CHANGE_ORDER("sale_change_order", "销售变更单"),
    PURCHASE_APPLY("purchase_apply", "采购申请单"),
    SALE_RETURN_APPLICATION_ORDER("sale_return_application_order", "销售退货申请单"),
    SALE_RETURN_ORDER("sale_return_order", "销售退货单"),
    SALE_INVOICE_REGISTER("sale_invoice_register", "销售发票登记"),
    PURCHASE_INVOICE_REGISTER("purchase_invoice_register", "销售发票登记"),
    INSPECT_PLAN_CONFIG("inspect_plan_config", "检验方案配置"),
    INSPECTION_APPLICATION_ORDER("inspection_application_order", "检验申请单"),
    INSPECTION_ORDER("inspection_order", "检验单"),
    INSPECTION_ORDER_DETAIL("inspection_order_detail", "检验项目"),
    INSPECTION_ORDER_RECORD("inspection_order_record", "检验缺陷"),
    INSPECTION_TASK_VALUE("inspection_task_value", "检验项目值"),
    programFileMainProgram("program_file_main_program", "主程序"),
    programFileSubProgram("program_file_sub_program", "子程序"),
    programFileDraw("program_file_draw", "图纸"),
    MaterialApply("material_apply", "物料申请"),
    SHIP_ORDER("ship_order", "发运单"),
    TEST_SYNOPSIS("test_synopsis", "试验大纲"),
    DETECT_REPORT("detect_report", "试验报告"),
    PROMOTIONAL_VIDEO("promotional_video", "宣传视频"),
    PAYMENT_ORDER("payment_order", "宣传视频"),
    ;

    private final String value;
    private final String name;

    CommonFileBussEnum(String code, String name) {
        this.value = code;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }
}
