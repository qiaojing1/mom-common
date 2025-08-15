package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public enum SourceOrderTypeEnum implements IEnum<Object> {

    SALE_ORDER("saleOrder", "销售订单"),
    SALE_REPLACEMENT_ORDER("saleReplacementOrder", "销售换货申请单"),
    DELIVERY_NOTIFY_ORDER("deliveryNotifyOrder", "出货通知单"),
    SALE_STOCK_OUT_ORDER("saleStockOutOrder", "销售出库单"),
    WIP_STOCK_IN_ORDER("wipStockIn", "完工入库单"),
    UNPLANNED_STOCK_IN_ORDER("unplannedIn", "计划外入库单"),
    UNPLANNED_STOCK_OUT_ORDER("unplannedOut", "计划外出库单"),
    SALE_RETURN_APPLICATION_ORDER("returnApplyOrder", "销售退货申请单"),
    SALE_RETURN_ORDER("returnOrder", "销售退货单"),
    PURCHASE_ORDER("purchaseOrder", "采购订单"),
    PURCHASE_AP_DOC("purchaseApDoc", "应付单"),
    SALE_AR_DOC("saleArDoc", "应收单"),
    PRODUCTION_ORDER("productionOrder", "生产工单"),
    PROCESS_PLAN("processPlan", "工序计划"),
    PURCHASE_APPLICATION_ORDER("purchaseApplyOrder", "采购申请单"),
    PURCHASE_STOCK_IN_ORDER("purchaseStockInOrder", "采购入库单"),
    PLAN_ORDER("planOrder", "计划工单"),
    INSPECTION_APPLICATION_ORDER("inspectionApplicationOrder", "检验申请单"),
    PURCHASE_RETURN_ORDER("purchaseReturnOrder", "采购退货单"),
    INSPECTION_ORDER("inspectionOrder", "检验单"),
    PRODUCE_REPORT_ORDER("produceReportOrder", "工单报工单"),
    PURCHASE_DELIVERY_ORDER("purchaseDeliveryOrder", "采购收货单"),
    TRANSFER_ORDER("transferOrder", "直接调拨单"),
    STEP_TRANSFER_ORDER("stepTransferOrder", "分步调出单"),
    PRODUCE_MATERIAL_BILL("materialBillOrder", "生产用料清单"),
    SALE_INVOICE_ORDER("saleInvoice", "销售发票登记单"),
    MPS_PLAN_ORDER("mpsPlanOrder", "MPS计划订单"),
    PROCESS_TRANSFER_ORDER("processTransferOrder", "工序转移单"),
    PROCESS_REPORT_ORDER("processReportOrder", "工序汇报单"),
    DISPATCH_DETAIL_ORDER("dispatchDetailOrder", "派工单明细"),
    PROCESS_OUTSOURCING_OUT("processOutsourcingOut", "工序委外发出单"),
    PROCESS_OUTSOURCING_IN("processOutsourcingIn", "工序委外接收单"),
    PROCESS_OUTSOURCING_SETTLEMENT("processOutsourcingSettlement", "工序委外结算单"),
    PROCESS_OUTSOURCING_OUT_1("processOutsourcingOut1", "工序委外转移单(发出)"),
    PROCESS_OUTSOURCING_IN_1("processOutsourcingIn1", "工序委外转移单(接收)"),

    SALE_QUOTATION_ORDER("saleQuotationOrder", "销售报价单"),
    SALE_PREDICTION_ORDER("salePredictionOrder", "销售预测单"),
    CONTRACT_MANAGE("contractManage", "合同管理"),
    MRP_PLAN_ORDER("mrpPlanOrder", "MRP计划订单"),
    TPM_REPAIR_ORDER("tpmRepairOrder", "维修工单"),
    TPM_MAINTENANCE_ORDER("tpmMaintenanceOrder", "保养工单"),
    TPM_INSPECT_ORDER("tpmInspectOrder", "点检工单"),
    MES_PRODUCT_REPAIR("209", "产品维修工单"),
    MES_PRODUCE_PICKING("20400", "生产领料单"),
    ;

    private final String value;

    @Getter
    private final String name;


    SourceOrderTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SourceOrderTypeEnum element : values()) {
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
        for (SourceOrderTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (SourceOrderTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (SourceOrderTypeEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SourceOrderTypeEnum element : SourceOrderTypeEnum.values()) {
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
        for (SourceOrderTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static SourceOrderTypeEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (SourceOrderTypeEnum sourceOrderTypeEnum : values()) {
            if (sourceOrderTypeEnum.equals(value)) {
                return sourceOrderTypeEnum;
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
