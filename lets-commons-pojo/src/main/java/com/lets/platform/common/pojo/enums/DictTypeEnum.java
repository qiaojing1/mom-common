package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 数据字典分类 枚举
 *
 * @ClassName DictTypeEnum
 * @author: Qiao
 * @create: 2021/08/21 08:26
 * @Version 1.0
 **/
public enum DictTypeEnum implements IEnum<Object> {

    MATERIAL_TYPE("materialType", "物料属性"),
    ORG_TYPE("orgType", "组织类型"),
    ORG_ATTRIBUTE("orgAttribute", "组织属性"),
    NOT_PROFIT_CALE_TYPE("notProfitCaleType", "计算方式[非利润]"),
    PROFIT_CALE_TYPE("profitCaleType", "计算方式[利润]"),

    INTERNETSTATUS("internetStatus", "联网"),
    DEVICEGRADE("deviceGrade", "设备等级"),
    ASSETSSTATUS("assetsStatus", "资产编码状态"),
    CODETYPE("codeType", "编码类型"),
    COLLECTORTYPE("collectorType", "采集器类型"),
    DATAITEMTYPE("dataItemType", "数据类型"),
    DATAMAPPINGTYPE("dataMappingType", "数据格式类型"),
    FACTORYMODETYPE("factoryModeType", "工厂建模类型"),
    STATUS("status", "通用状态"),
    TAXTYPE("taxType", "税率分类"),
    PROJECTTYPE("projectType", "客户等级项目"),
    SETTLEMENTPERIOD("settlementPeriod", "结算周期"),
    CHECKWAY("checkWay", "检查类型"),
    ORDERTYPE("orderType", "工单类型"),
    TIGGEREVENT("tiggerEvent", "触发事件"),
    ORDERSTATUS("orderStatus", "单据状态"),
    ORDERCATEGORY("orderCategory", "工单类型"),
    STORE_CONTROL_BATCH("storeControlBatch", "库存批号控制方式"),
    STORE_CONTROL_BATCH_ONLY("storeControlBatchOnly", "库存批号控制唯一性"),
    PURCHASE_TYPE("purchaseType", "采购类型"),
    RECEIVE_GOODS_TYPE("receiveGoodsType", "收货类型"),
    STOCK_IN_TYPE("stockInType", "入库类型"),
    STOCK_OUT_TYPE("stockOutType", "出库类型"),
    CHANGECATEGORY("changeCategory", "变更类型"),
    ORDERSOURCE("orderSource", "工单来源"),
    RETURNORDERTYPE("returnOrderType", "退货单据类型"),
    RETURNTYPE("returnType", "销退方式"),
    STOREORDERTYPE("storeOrderType", "工单类型"),
    ALLOCATIONORDERTYPE("allocationOrderType", "调拨申请单据类型"),
    ALLOCATIONTESTWAY("allocationTestWay", "调拨申请质检方式"),
    INVENTORYTYPE("inventoryType", "盘点方式"),
    INPUTTYPE("inputType", "录入方式"),
    INVENTORYORDERSTATUSENUM("inventoryOrderStatusEnum", "盘点单状态"),
    REPORTWAY("reportWay", "报工方式"),
    STANDARDTYPE("standardType", "质检标准类型"),
    NATURETYPE("natureType", "定性/定量"),
    OPERATIONSTATUS("operationStatus", "MRP运算状态"),
    PRODUCESTATUS("produceStatus", "生产状态"),
    DEMANDORDERSOURCE("demandOrderSource", "订单来源"),
    PRODUCEPLANSTATUS("producePlanStatus", "生产计划状态"),
    PRODUCEORDERSTATUS("produceOrderStatus", "生产工单状态"),
    LINESTOREORDERTYPE("lineStoreOrderType", "线边库库存异动类型"),
    DISTRIBUTEPLANSTATUS("distributePlanStatus", "发料计划状态"),
    DEVICESTATUSTYPE("deviceStatusType", "设备状态分类"),
    CONFIGCYCLE("configCycle", "检查周期"),
    PREPARETYPE("prepareType", "备件分类"),
    UNQUALIFIEDHANDLERESULT("unqualifiedHandleResultEnum", "质检返工分类"),
    STORETYPE("STORETYPE", "仓库配置使用类型"),
    TESTLEVEL("testLevel", "检验水平"),
    AQL("AQL", "AQL"),
    FIGURE("figure", "字码");

    private String value;
    private String description;

    DictTypeEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public static String getSort(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (DictTypeEnum element : DictTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescription();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
