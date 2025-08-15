package com.lets.platform.model.uc.enums;

import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 系统参数 编码枚举
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/1/12 9:30
 */
public enum SysParamCodeEnum implements IEnum<Object> {

    CheckPickingNumberWhenReceive("checkPickingNumberWhenReceive", "启用接收校验领料数量", "N", "领料参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端原材料接收时需要校验工序领料的已领料数量，接收数量不能超过已领料数量。"),
    CheckPickingNumberWhenFeeding("checkPickingNumberWhenFeeding", "启用上料校验领料数量", "N", "领料参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端上料时需要校验工序领料的已领料数量，上料数量不能超过已领料数量。"),
    HmiDefaultPickingCategory("hmiDefaultPickingCategory", "终端默认生产领料申请单别", "tenancyId-32001", "领料参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "设置HMI、PDA等终端使用物料申请功能生成生成领料申请单的默认单据类别。"),
    HmiDefaultPickingMaterialGroup("hmiDefaultPickingMaterialGroup", "终端默认生产领料申请默认物料分组", "", "领料参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "设置HMI、PDA等终端使用物料申请功能生成生成领料申请单的默认物料分组。"),
    GeneratePickingApplyStatus("generatePickingApplyStatus", "领料申请单生成单据状态", "3", "领料参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "设置HMI、PDA等终端使用物料申请功能生成生成领料申请单的单据状态。"),
    AllowReportWhenOrderSuspend("allowReportWhenOrderSuspend", "允许工单暂停后汇报", "Y", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端的工序任务对应的生产工单暂停后可以继续汇报；参数关闭：终端的工序任务对应的生产工单暂停后禁止汇报；"),
    allowOrderReport("allowOrderReport", "允许工单直接报工", "N", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：允许智能车间的生产工单直接报工；"),
    ProcessTaskAutoFinish("processTaskAutoFinish", "启用工序任务自动完工", "Y", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端工序汇报后系统需要判断已汇报数量汇总是否大于等于工序任务的计划数量，如果大于等于则工序任务自动完工。"),
    ProcessPlanAutoFinish("processPlanAutoFinish", "启用工序计划自动完工", "Y", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端工序汇报后系统需要判断汇报汇总数量是否大于等于工序计划数量，如果大于等于则工序计划单明细自动完工。"),
    ProcessReportFeedingKittingCheck("processReportFeedingKittingCheck", "启用工序汇报上料齐套校验", "Y", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端工序汇报时校验已上料套数是否小于汇报数量汇总，如果小于则禁止汇报。"),
    ProcessReportPickingKittingCheck("processReportPickingKittingCheck", "启用工序汇报领料齐套校验", "Y", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：终端工序汇报时校验工序领料已领料套数是否小于汇报数量汇总，如果小于则禁止汇报。"),
    ProcessTaskLoadLimit("processTaskLoadLimit", "工序任务加载限制配置", "N", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
                                     "参数开启：HMI工序任务需要扫描或输入任务查询条件,根据查询条件加载工序任务。"),
    LimitRoleId("limitRoleId", "适用角色", "", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
                                     "工序任务加载限制配置适用角色"),
    LastProcessReportCompleteCheck("lastProcessReportCompleteCheck", "启用末道工序汇报完整性校验", "N", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：末道工序汇报时系统将校验之前的工序是否已经完成报工，如果没有则禁止汇报。"),
    ProcessReportMustDevice("processReportMustDevice", "启用工序汇报时指定设备", "N", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：如果工序任务派工时没有指定设备，则在终端工序汇报时需要指定生产设备。"),
    OverReportAutoCompleteDays("overReportAutoCompleteDays", "超报工自动完工天数", "3", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：无限超报工时，首道工序报工大于等于工序计划上限数量。超过设置天数未继续报工。则工序计划明细自动完工。"),
    /**
     * @see com.lets.platform.model.mes.enums.ReportPickingControlEnum
     */
    ReportPickingCheck("reportPickingCheck", "工序汇报物料领料控制", "1", "汇报参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：已领料控制:生产工单有已过账的领料记录则表示检查通过;关键件领用套数控制:生产工单已过账的关键件领料套数是否大于等于工序汇报的总数，如果大于则表示检查通过。"),

    StampingLossMaterialGroup("stampingLossMaterialGroup", "损耗料分组", "", "冲压行业参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "设置需要统计生产过程中损耗的原材料的物料分组。"),
    EnableAutoDispatch("enableAutoDispatch", "启用自动派工", "N", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "参数开启：工序计划单明细开工后系统自动生成派工单。"),

    StampingLossExtFl("stampingLossExtFl", "损耗料特定扩展规格属性", "", "冲压行业参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "设置需要统计生产过程中损耗的原材料的材质所属扩展规格属性。"),
    SalesEnableOverdueMark("saleEnableOverdueMark", "启用订单逾期标记", "N", "单据参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：系统对于已逾期的销售订单的数据行(包括部分逾期)进行颜色标记。"),
    enableSaleAlmostOverdueMark("enableSaleAlmostOverdueMark", "启用订单即将逾期标记", "N", "单据参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：系统对于即将逾期的销售订单的数据行进行颜色标记"),
    saleAdvanceDay("saleAdvanceDay", "提前天数", "2", "单据参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            ""),
    PurchaseEnableOverdueMark("purchaseEnableOverdueMark", "启用订单预期标记", "N", "单据参数", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：系统对于已逾期的采购订单的数据行(包括部分逾期)进行颜色标记。"),
    TotalOutputKey("totalOutputKey", "总产量关联数据项", "", "产量统计参数配置", "8cbad87c-8133-4bce-8b4b-8f86a4fc7a15", ""),
    NotInDeviceStatus("notInDeviceStatus", "不计总产量设备状态", "", "产量统计参数配置", "8cbad87c-8133-4bce-8b4b-8f86a4fc7a15", ""),
    PRODUCTCODE("productCode", "产品编号", "", "产量统计参数配置", "8cbad87c-8133-4bce-8b4b-8f86a4fc7a15", ""),
    TheoreticalRosterEfficiencyLoss("theoreticalRosterEfficiencyLoss", "排班时长损耗", "1", "产量统计参数配置", "8cbad87c-8133-4bce-8b4b-8f86a4fc7a15", "班制总时长损耗百分比，计算性能稼动率使用，填写范围[0,1]"),
    StockInTip("stockInTip", "入库是否启用未入明细提示", "N", "PDA出入库参数配置", "8cbad87c-8133-4bce-8b4b-8f86a4fc7a15", ""),
    StockOutTip("stockOutTip", "出库是否启用未出明细提示", "N", "PDA出入库参数配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c", ""),
    StockOutOrderMatch("stockOutOrderMatch", "销售出库按订单匹配", "Y", "PDA出入库参数配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c", ""),
    DefaultCreateUser("defaultBusinessUserIsCreateUser", "当前人员默认系统制单员", "", "", "", ""),
    AllowChangePrice("allowChangePrice", "允许已审核单据变更单价", "N", "变更参数", "73de54c6-a938-4bad-9e52-fe327f70d72a", "参数开启：销售变更单中物料明细页签的单价或含税单价允许被修改。"),
    AutoChangeBelowFlowPrice("autoChangeBelowFlowPrice", "变更单价自动同步下游单据", "N", "变更参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：销售变更单中的单价变更生效后对应的销售订单的下游单据的单价也需要自动同步变更。"),
    AutoRefreshPrice("autoRefreshPrice", "启用自动取价", "N", "价格参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：新增和修改单据时，系统结合【销售取价方案配置】设置执行自动取价，默认影响单据范围为销售订单、销售报价、销售价目表。"),
    QuotationOrderDistributeNumControl("quotationOrderDistributeNumControl", "报价单下发时可下发数量是否管控", "N", "价格参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：报价单下发销售订单及销售订单选报价单时需要考虑“可转订单数量”，可转订单数量>0的报价单明细才可以下发和被选中，下发销售订单的数量默认为“可转订单数量”。"),
    QuotationOrderValidityPeriod("quotationOrderValidityPeriod", "报价单默认有效期", "99", "价格参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            ""),
    QuotationOrderValidityPeriodUnit("quotationOrderValidityPeriodUnit", "报价单默认有效期单位", "0", "价格参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            ""),
    PurchaseAutoRefreshPrice("purchaseAutoRefreshPrice", "启用自动取价", "N", "价格参数", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：新增和修改单据时，系统结合【采购取价方案配置】设置执行自动取价，默认影响单据范围为采购订单、采购价目表。"),
    OutsourcingAutoRefreshPrice("outsourcingAutoRefreshPrice", "启用自动取价", "N", "价格参数", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：新增和修改单据时，系统结合【采购取价方案配置】设置执行自动取价，默认影响单据范围为工序委外结算单。"),
    AllowOverDeliveryAndStockIn("allowOverDeliveryAndStockIn", "允许超订单收货及入库", "N", "业务控制", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：允许采购订单关联的收货及入库超过订单数量，开启后采购订单的超比例入库才会生效。"),
    PurStockInInProportion("purStockInInProportion", "采购入库按比例控制", "N", "业务控制", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：采购入库的数量按超收上下限进行控制，开启后物料的超收上下限控制才会生效。"),
    OverPurchaseAutoClose("overPurchaseAutoClose", "超采自动关闭", "Y", "业务控制", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：无论允不允许超采，只要系统判定采购订单明细关联的入库数量大于等于采购订单明细数量，则采购订单明细自动关闭。"),
    IqcWriteBackDeliveryNumber("iqcWriteBackDeliveryNumber", "进料检验控制收货数量", "N", "业务控制", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a",
            "参数开启：进料检验审核之后且单据类别开启[默认良品自动处理]，系统将采购收货单数量自动修改为质检合格加让步接收数量。"),

    AllowExceedOrderReportOrStockIn("allowExceedOrderReportOrStockIn", "允许超工单报工及入库", "N", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启：允许生产工单关联的工单报工及完工入库超过工单数量。"),
    WipStockInInProportion("wipStockInInProportion", "完工入库按比例控制", "N", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启：完工入库的数量按超收上下限进行控制，开启后物料的入库超收上下限控制才会生效。"),
    allowProduceOrderSetRoute("allowProduceOrderSetRoute", "允许生产工单配置工艺路线", "N", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启：允许开启只能车间并且未执行的生产工单手动配置工艺路线。"),
    ReportPickingControl("reportPickingControl", "产品报工及入库物料领用控制", "1", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "已领料控制:生产工单有已过账的领料记录则表示检查通过;领用套数控制:生产工单已过账的关键件领料套数是否大于等于报工或入库的总数，如果大于则表示检查通过。"),
    ProduceChangeCheckSet("produceChangeCheckSet", "启用生产工单变更领料套数检查", "Y", "变更参数", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启：生产工单变更时数量变小，校验数量小于已领料套数，则禁止工单变更； 参数关闭：不校验。"),
    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.BillChangeMethodEnum
     */
    ProduceBillChangeMethod("produceBillChangeMethod", "生产用料清单变更方式", "2", "变更参数", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启：按整单变更：支持勾选生产用料清单明细加载整单进行变更；按明细变更：支持勾选生产用料清单明细只加载勾选的明细进行变更。"),
    AllowOverNoticeAndStockOut("allowOverNoticeAndStockOut", "允许超订单通知及出库", "N", "业务控制", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：允许销售订单关联的出货通知及出库超过订单数量，开启后销售订单的超比例出货才会生效。"),
    NotifyOrderAutoDisable("notifyOrderAutoDisable", "出通单出库自动关闭", "N", "业务控制", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：出通单开启自动出库后关联的下游单据发生账动则出通单自动关闭。"),
    SaleStockOutInProportion("saleStockOutInProportion", "销售出库按比例控制", "N", "业务控制", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：销售出货的数量按超发上下限进行控制，开启后物料的超发上下限控制才会生效。"),
    AutoCloseOnOverload("autoCloseOnOverload", "超发自动关闭", "Y", "业务控制", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：无论允不允许超发，只要系统判定销售订单明细关联的出库数量大于等于销售订单明细数量，则销售订单明细自动关闭，出货通知单明细关联得出库数量大于等于出货通知单明细数量，则出货通知单明细自动关闭。"),
    AutoBarcodeAfterReport("autoBarcodeAfterReport", "启用报工后自动生成物料条码功能", "N", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启后，工单报工单审核通过之后，自动按物料条码生成业务选中的源单据，生成相应的物料条码，生成条码时，可生成数量为报工数量、最小包装数取物料管理中配置的；开启后，展示启用报工后自动打印物料条码功能；"),
    AutoBarcodeAfterReportControl("autoBarcodeAfterReportControl", "报工后自动生成物料条码控制", "0", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "工单数量：按照工单报工单数量生成条码；合格数量：按照完工入库单过账时良品数量生成条码"),
    AutoPrintBarcodeAfterReport("autoPrintBarcodeAfterReport", "启用报工后自动打印物料条码功能", "N", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "当启用报工后自动生成物料条码功能开启后，该选项展示，该选项开启后，显示物料条码打印模板选项（必填），条码规则字段（必填）；生成条码后，自动调用打印机，按配置的模板打印出本次生成的物料条码；"),
    AutoPrintBarcodeTemplateId("autoPrintBarcodeTemplateId", "条码打印模板", null, "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            ""),
    WebPrinterName("webPrinterName", "条码打印机", null, "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            ""),
    ProcessPlanCompleteOrderClose("processPlanCompleteOrderClose", "启用工序计划完工工单自动关闭", "N", "业务控制", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "参数开启：开关开启，则工序计划明细全部完工，工单明细自动关闭。"),

    UnitMultiplier4Company("unitMultiplier4Company", "企业目标金额单位倍率", "", "销售目标参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "企业目标金领单位倍率：如不选择，企业目标金额等于设定值，如果选择了倍率，则企业目标金额等于设定值*倍率，目标金额单位也会相应改变。"),
    UnitMultiplier4Dept("unitMultiplier4Dept", "部门目标金额单位倍率", "", "销售目标参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "部门目标金额单位倍率：如不选择，部门目标金额等于设定值，如果选择了倍率，则部门目标金额等于设定值*倍率，目标金额单位也会相应改变。"),
    UnitMultiplier4User("unitMultiplier4User", "个人目标金额单位倍率", "", "销售目标参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "个人目标金额单位倍率：如不选择，个人目标金额等于设定值，如果选择了倍率，则古人目标金额等于设定值*倍率，目标金额单位也会相应改变。"),
    UnitMultiplier4Product("unitMultiplier4Product", "产品目标金额单位倍率", "", "销售目标参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "产品目标金额单位倍率：如不选择，产品目标金额等于设定值，如果选择了倍率，则产品目标金额等于设定值*倍率，目标金额单位也会相应改变。"),
    Separator("separator", "产品编号分隔符", "", "型号解析配置", "66ce383b-d225-407d-bdc6-ae4327208207", ""),
    Advance("advance", "视频回放开始提前时间（s）", "10", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "用于计算试压视频回放开始时间"),
    onlyFiles("onlyFiles", "技术文件仅展示附件", "N", "技术文件", "66ce383b-d225-407d-bdc6-ae4327208207", "开启后，在web端试压工单的技术文件中，只展示附件列表，点击后直接打开附件（仅PDF和图片文件支持）。"),
    Delay("delay", "视频回放结束延后时间（s）", "10", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "用于计算试压视频回结束时间"),
    ProcessTimeUnit("processTimeUnit", "工时单位", "1", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "页面上显示的工时单位"),
    ProcessTimeUnitAcc("processTimeUnitAcc", "工时单位精度", "1", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "页面上显示的工时精度"),
    CadAnalysisFromIot("cadAnalysisFromIot", "CAD解析地址", "", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "CAD提取时解析接口地址"),
    EnableBomCompleteCheck("enableBomCompleteCheck", "启用业务中BOM完整性校验", "Y", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：系统中录入BOM的功能会对BOM完整性进行校验，校验通过才允许录入。"),
    AutoCreateMaterialOnBomSave("autoCreateMaterialOnBomSave", "BOM创建时自动创建物料", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：BOM维护功能如果不选物料，录入物料信息后审核时如果此物料在系统内不存在，则自动创建这个物料。"),
    EnableExtendsSpecific("enableExtendsSpecific", "启用子项特征属性继承", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：BOM子项将继承产品相同的特征属性。"),
    MaterialApproveAutoCreateBomByBomTemplate("materialApproveAutoCreateBomByBomTemplate", "物料审核后自动通过模板创建BOM", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：物料审核通过之后，如果这个物料没有BOM，则会根据模板自动创建BOM。"),
    RouteBomVersionCrossChecking("routeBomVersionCrossChecking", "启用工艺路线BOM版本勾稽", "N", "工艺参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1",
            "参数开启：工艺适用范围为“物料”的工艺路线必须录入物料的BOM。"),
    queryReportIp("queryReportIp", "试压报告在线查看地址", "", "报告查看配置", "66ce383b-d225-407d-bdc6-ae4327208207", "用于生成可以直接通过微信扫码查看报告的二维码"),
    queryOrderLikeKey("queryOrderLikeKey", "客户端查询阀门编号条件前缀", "", "客户端查询参数配置", "66ce383b-d225-407d-bdc6-ae4327208207",
            "试压客户端查询阀门编号时，会在查询条件前面添加这里设置的字符后进行查询"),
    queryReportPort("queryReportPort", "试压报告在线查看端口", "", "报告查看配置", "66ce383b-d225-407d-bdc6-ae4327208207", "用于生成可以直接通过微信扫码查看报告的二维码"),
    autoGenBatchReport("autoGenBatchReport", "自动生成批次试压报告", "N", "报告查看配置", "66ce383b-d225-407d-bdc6-ae4327208207", "开启时第一次上传报告自动生成批次试验报告，关闭需要手动生成"),
    dayDefinition("dayDefinition", "天定义起始时间", "0", "业务关联参数配置", "8cbad87c-8133-4bce-8b4b-8f86a4fc7a15", "设置新一天的起始时间，一天时长为24小时。设备相关统计报表按此设定的天为基准"),
    outAfterLoadAndShip("outAfterLoadAndShip", "启用装车发运后出库功能", "N", "智能仓储业务参数配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c",
            "参数开启:销售出库(PDA)做库存转储，装车发运后，生成过账销售出库单；"),
    SaleChangeOrderCheck("saleChangeOrderCheck", "启用销售变更生产、采购数量检查", "Y", "变更参数", "73de54c6-a938-4bad-9e52-fe327f70d72a",
            "参数开启：销售订单变更时数量变小，校验数量小于关联的生产工单、采购订单数量，则禁止销售订单变更； 参数关闭：不校验。"),
    TeamAndUserLimit("teamAndUserLimit", "启用手持终端限定班组、操作工校验", "N", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "参数开启：派工单的班组或者操作工有值，则如果登录账号不是对于的班组或者对于的操作员则给出提示，禁止加载！； 参数关闭：不校验。"),
    ReportCheckControl("reportCheckControl", "强制自检不良终端处理", "N", "质量参数", "b11fde56-667f-4733-9a99-a567c3eef42f",
            "终端报工时进行自检，如果有不良数量则必须录入不良处理结果才可以报工； 参数关闭：不校验。"),
    enableProduceOverdueMark("enableProduceOverdueMark", "启用生产逾期标记", "N", "单据参数", "d23adae9-9159-4d49-a76b-e4930d6d4fd1", "参数开启:系统对于已逾期的生产工单、工序计划单的数据行进行颜色标记。"),
    enableProduceAlmostOverdueMark("enableProduceAlmostOverdueMark", "启用生产即将预期标记", "N", "单据参数", "d23adae9-9159-4d49-a76b-e4930d6d4fd1", "参数开启:系统对于即将逾期的生产工单、工序计划单的数据行进行颜色标记。"),
    advanceDay("advanceDay", "提前天数", "2", "单据参数", "d23adae9-9159-4d49-a76b-e4930d6d4fd1", ""),
    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.ReversePickingMomentEnum
     */
    ReversePickingMoment("reversePickingMoment", "倒冲领料时机", "1", "领料参数", "d23adae9-9159-4d49-a76b-e4930d6d4fd1",
            "说明：工单报工：生产工单报工审核后自动进行倒冲领料；首道工序报工：首道工序接收(委外工序发出)后自动进行倒冲领料；完工入库：完工入库单过账后自动进行倒冲领料；"),

    EnableProcessScheduling("enableProcessScheduling", "启用工序排程", "N", "排程参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "参数开启：工序计划支持手动或自动工序排程"),
    /**
     * @see com.lets.platform.model.psi.enums.SchedulingMethodEnum
     */
    SchedulingMethod("schedulingMethod", "排程方式", null, "排程参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "排程方式"),
    ExpandDetail("expandDetail", "审批工单明细默认展开", "N", "系统参数", "0", ""),
    QUERYBYSPACE("queryBySpace", "是否根据空格分割查询", "Y", "系统参数", "0", ""),
    QueryMindCase("queryMindCase", "查询是否区分大小写", "N", "系统参数", "0", "参数开启：全域查询以及模糊查询时区分大小写匹配。"),

    enableSingleWages("enableSingleWages", "启用计件工资统计", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：启用计件工资统计，开启后工艺路线中的计件工资为必填，否则为非必填。"),
    enableSingleFormula("enableSingleFormula", "启用计件公式", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：启用计件公式，开启后计件工资通过“计件公式”进行录入。"),
    createBomAutoLoadBomTemplate("createBomAutoLoadBomTemplate", "创建BOM时自动查找并加载模板", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：每次新增BOM时会自动查询可用模板并加载。"),
    useBomTemplateAutoCreateMaterial("useBomTemplateAutoCreateMaterial", "使用BOM模板时，自动创建物料", "N", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "参数开启：使用BOM模板时，如果此物料在系统内不存在，则自动创建这个物料。"),

    enableZSHStore("enableZSHStore", "启用中石化(易派客)库存同步", "N", "接口参数", "0", "启用中石化(易派客)接口，启用后中石化物料库存可以定时同步给中石化系统。"),
    ZHSSupplyCode("ZHSSupplyCode", "中石化供应商编码", "", "接口参数", "0", "设置当前租户在中石化系统中的供应商编码。"),
    storeScope("storeScope", "", "仓库范围", "接口参数", "0", "设置当前租户物料库存同步到中石化系统的仓库范围。"),
    relationCustomer("relationCustomer", "关联客户", "", "接口参数", "0", "设置当前租户物料的库存同步到中石化系统的关联客户。"),
    relationCustomerGroup("relationCustomerGroup", "关联客户分组", "", "接口参数", "0", "设置当前租户物料的库存同步到中石化系统的关联客户分组。"),
    storeSyncCron("storeSyncCron", "库存同步时间(每天)", "", "接口参数", "0", "设置当前租户每天同步库存到中石化系统的时间。"),
    autoInvalidBarcode("autoInvalidBarcode", "物料条码定时作废", "N", "智能仓储业务参数配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c", ""),
    enablePositionShelving("enablePositionShelving", "启用库位上架功能", "N", "智能仓储业务参数配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c", "参数开启：入库时先入到当前仓库固定的待上架库位，然后扫库位码进行上架"),
    scheduledInvalidTime("scheduledInvalidTime", "定时作废时间", "00:30", "智能仓储业务参数配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c", ""),
    productionSourceMenuCode("productionSourceMenuCode", "生产业务源单类型", "6282b4de-b206-4bbe-acf3-0007d6066444", "生产业务源单类型", "d389bc9e-444a-462e-9cf1-efe9e668e81c", ""),
    purchaseSourceMenuCode("purchaseSourceMenuCode", "采购业务源单类型", "42e6e4a1-09bd-4cfc-ab60-29c08cd17bad", "制码源单类型配置", "d389bc9e-444a-462e-9cf1-efe9e668e81c", ""),
    AutoSubstituteSupplierQuotes("autoSubstituteSupplierQuotes", "询价单自动代入之前供应商报价", "Y", "业务控制", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a", "采购询价单自动代入之前供应商报价"),
    SupplierQuotesQueryMonth("supplierQuotesQueryMonth", "报价查询周期(月)", "3", "业务控制", "cbc03e82-a7ea-48f6-b847-40abb7e04f6a", "指定一定范围内的统计周期"),
    AI_SRC("aiSrc", "AI应用访问地址", "", "AI应用信息", "0", "AI交互窗口应用访问地址"),

    /**
     * 设备管理
     */
    EnableConfirmCallRepair("enableConfirmCallRepair", "启用报修确认功能", "Y", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", "参数开启：报修时，需要报修确认后才自动生成维修工单。"),

    FaultRepairDurationStaMethod("faultRepairDurationStaMethod", "故障维修时长统计方式", "1", "{\"formula\":\"repairWaitDuration + responseDuration + repairDuration - pauseDuration\"}", "维修等待时长 + 响应时长 + 维修时长 - 暂停时长", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    InDeviceLoadDurationDefinition("inDeviceLoadDurationDefinition", "已联网设备负荷时间定义", "3", "", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    NotDeviceLoadDurationDefinition("notDeviceLoadDurationDefinition", "未联网设备负荷时间定义", "3", "", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    StandardResponseDuration("standardResponseDuration", "标准响应时长(min)", "5", "", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", "维护报修后维修响应的标准时长，用于定义维修响应的及时率。"),
    SpotCheckExecuteMode("spotCheckExecuteMode", "启用不指定点检人员模式", "N", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    SpotOrderLoadMode("spotOrderLoadMode", "点检工单加载方式", "", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    MaintenanceCheckExecuteMode("maintenanceCheckExecuteMode", "启用不指定保养人员模式", "N", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    MaintenanceType("maintenanceType", "适用保养类型", "", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    MaintenanceOrderLoadMode("maintenanceOrderLoadMode", "保养工单加载方式", "", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.tpm.enums.PlanStopRelationEleEnum
     */
    PlanStopRelationEle("planStopRelationEle", "计划停机关联要素", "1", "", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.tpm.enums.SparePriceStatisticsSourceEnum
     */
    SparePriceStatisticsSource("sparePriceStatisticsSource", "备件金额统计来源", "1", "", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    SparePriceStatisticsCycle("sparePriceStatisticsCycle", "取价周期（月）", "6", "", "分析参数", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    UseCalendar2CreateOrder("useCalendar2CreateOrder", "启用行事历控制工单自动生成", "", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", "开启时定时任务自动生成工单时会根据节假日工单生成时机跳过非工作日"),
    CreateOrderStrategy("createOrderStrategy", "节假日工单生成时机", "", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * 复检工单
     */
    EnableAutoReInspect("enableAutoReInspect", "启用自动复检功能", "N", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", "参数开启：根据配置的复检范围和方式，自动生成复检工单。"),
    /**
     * @see com.lets.platform.model.tpm.enums.PlanStopRelationEleEnum
     */
    ReInspectScope("reInspectScope", "复检范围", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.common.enums.ReInspectTypeEnum
     */
    ReInspectType("reInspectType", "复检类型", "1", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.tpm.enums.ReInspectMethodEnum
     */
    ReInspectMethod("reInspectMethod", "复检方式", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.common.enums.RandomReInspectCycleEnum
     */
    RandomReInspectCycle("randomReInspectCycle", "随机复检周期", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.common.enums.ReInspectUserMethodEnum
     */
    ReInspectUserMethod("reInspectUserMethod", "复检人员指定方式", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    ReInspectUser("reInspectUser", "复检人员", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * @see com.lets.platform.model.uc.enums.ProductionUnitTypeEnum
     */
    ReInspectFactoryModeType("reInspectFactoryModeType", "生产单元类型", "", "业务控制", "54d603e6-0397-4c25-908f-9b7de80169c2", ""),
    /**
     * 能耗间隔
     */
    ENERGY_INTERVAL_WATER("energyIntervalWater", "能耗间隔-水", "1", "能耗间隔", "", "注：最小值为1小时,如果采集频率小于1小时,就配置1小时"),
    ENERGY_INTERVAL_POWER("energyIntervalPower", "能耗间隔-电", "1", "能耗间隔", "", "注：最小值为1小时,如果采集频率小于1小时,就配置1小时"),
    ENERGY_INTERVAL_GAS("energyIntervalGas", "能耗间隔-气", "1", "能耗间隔", "", "注：最小值为1小时,如果采集频率小于1小时,就配置1小时"),
    /**
     * 库存管理
     */
    AFTER_STOCK_IN_AUTO_PRINT("afterStockingInAutoPrint", "启用采购入库后自动打印功能", "", "业务控制", "12c083e5-6499-4b05-b717-6bcc3c63f21c", ""),
    enableStockReservationWarn("enableStockReservationWarn", "启用出库释放预留预警", "N", "业务控制", "12c083e5-6499-4b05-b717-6bcc3c63f21c", ""),
    AFTER_STOCK_IN_DEFAULT_PRINTER("stockInDefaultPrinter", "默认打印机", "", "业务控制", "12c083e5-6499-4b05-b717-6bcc3c63f21c", ""),
    AFTER_STOCK_IN_WHICH_STATUS_AUTO_PRINT("whichStatusAutoPrint", "单据状态", "", "业务控制", "12c083e5-6499-4b05-b717-6bcc3c63f21c", "决定何种单据状态的采购入库单自动打印条码"),
    AFTER_STOCK_IN_PRINT_TEMPLATE("stockInPrintTemplate", "打印模板", "", "业务控制", "12c083e5-6499-4b05-b717-6bcc3c63f21c", ""),

    AFTER_REPORT_STOCK_IN_AUTO_PRINT("afterWipStockingInAutoPrint", "启用完工入库后自动打印功能", "N", "业务控制", "a03cf895-d5e2-4755-971b-dbac1848a272", ""),
    AFTER_REPORT_STOCK_IN_DEFAULT_PRINTER("wipStockInDefaultPrinter", "默认打印机", "", "业务控制", "a03cf895-d5e2-4755-971b-dbac1848a272", ""),
    AFTER_REPORT_STOCK_IN_WHICH_STATUS_AUTO_PRINT("wipWhichStatusAutoPrint", "单据状态", "", "业务控制", "a03cf895-d5e2-4755-971b-dbac1848a272", "决定何种单据状态的完工入库单自动打印条码"),
    AFTER_REPORT_STOCK_IN_PRINT_TEMPLATE("wipStockInPrintTemplate", "打印模板", "", "业务控制", "a03cf895-d5e2-4755-971b-dbac1848a272", ""),


    enableVideoSave("enableVideoSave", "启用视频回放保存", "N", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "不开启，回放视频从录像机中通过视频流的方式查看；开启后，回放视频需要先从录像机中下载到服务器之后才能查看"),
    autoSubmit("autoSubmit", "试验报告自动提交", "N", "功能参数", "66ce383b-d225-407d-bdc6-ae4327208207", "开启后，创建试验报告时，会自动触发提交"),
    printAfterAudit("printAfterAudit", "试验报告审核后打印", "N", "功能参数", "66ce383b-d225-407d-bdc6-ae4327208207", "开启后，就只有审核通过的报告允许打印"),
    autoSaveVideo("autoSaveVideo", "自动保存回放视频", "N", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "开启后，每天夜间会自动下载回放视频"),
    replayIpAndPort("replayIpAndPort", "ip和端口", "", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "下载录像视频的保存路径"),
    replayUsername("replayUsername", "用户名", "", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", ""),
    replayPassword("replayPassword", "密码", "", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", ""),
    enableVideoMerge("enableVideoMerge", "启用回放视频合并", "N", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "不开启，查看回放时多个视角的视频会分别播放；开启时，多个视角的视频合并之后才能查看"),
    mergeIpAndPort("mergeIpAndPort", "ip和端口", "", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "合并之后的视频的保存路径"),
    mergeUsername("mergeUsername", "用户名", "", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", ""),
    mergePassword("mergePassword", "密码", "", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", ""),
    autoMerge("autoMerge", "回放视频下载后自动合并为多视角视频", "N", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "开启后，回放视频下载后，自动合并为多个视角的一个视频，当有多个视频合并的任务时，需要排队处理"),
    videoQuality("videoQuality", "合并视频画质", "18", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "选择合并视频画质，注意画质越高，处理速度越慢、占用的存储空间也越大"),
    viewsNumber("viewsNumber", "合并视频视角数量", "0", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "选择合并视频的视角数量，视频数量超过设定值时，多余的视频不会被合并"),
    deleteAfterMerge("deleteAfterMerge", "视频合并后删除原视频", "N", "视频回放配置", "66ce383b-d225-407d-bdc6-ae4327208207", "回放视频合并后，删除合并前的视频。这样可以减小对存储空间的需求"),
    defaultSurplusNumber("defaultSurplusNumber", "启用批量派工默认按剩余数量", "N", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：参数开启，批量派工默认按剩余数量进行派工。"),
    outsourcingDispatch("outsourcingDispatch", "允许批量派工支持委外工序", "N", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：参数开启，批量派工支持对工序类型为“委外”的工序进行派工。"),
    outPriceIncludeTax("outPriceIncludeTax", "委外单价含税", "Y", "功能参数", "4e79c02c-8a6f-419b-ba9e-73901c6c94d1", "说明：勾选后，工艺路线的委外单价为含税委外单价，不勾选，工艺路线的委外单价为不含税委外单价。"),
    processPlanStatus("processPlanStatus", "批量派工拆分生成工序计划单据状态", "3", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：设置批量派工功能中工序拆分生成工序计划单的单据状态。"),
    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.OutsourcingInModeEnum
     */
    OutsourcingInMode("outsourcingInMode", "委外工序接收模式", "1", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：按单接收”时工序委外转移单(接收)通过委外转移单（发出）下推，“汇总接收”时工序委外转移单(接收)通过工序计划明细下推。"),
    outsourceStatus("outsourceStatus", "委外工序批量派工生成单据状态", "3", "派工参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：设置批量派工功能中派工生成工序委外发出单的单据状态。"),
    enableOutsourceAutoCal("enableOutsouceAutoCal", "启用工序委外批量发出计价数量按总量自动计算", "N", "工序委外参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：当工序类型为“委外”的工序计划明细批量下发委外发出时支持录入计价总量自动计算明细的计价数量，只有在工序单位与计价单位没有转换关系时生效。"),
    enableOutsourcingInAutoCal("enableOutsourcingInAutoCal", "启用工序委外批量接收计价数量按总量自动计算", "N", "工序委外参数", "b11fde56-667f-4733-9a99-a567c3eef42f", "说明：当工序类型为“委外”的工序计划明细批量下发委外接收时支持录入计价总量自动计算明细的计价数量，只有在工序单位与计价单位没有转换关系时生效。"),
    manualCustomerMaterial("manualCustomerMaterial", "手工录入客户物料", "N", "业务控制", "73de54c6-a938-4bad-9e52-fe327f70d72a", "说明：开启后，客户物料编码支持手工录入;单据审核通过后,系统自动在客户物料管理中创建客户物料与物料的对应关系,按客户+客户物料编码+物料校验,有相同的关系时,不创建记录"),
    tableLoadType("tableLoadType", "加载方式", "1", "分页方式", "0", "说明：开启后，客户物料编码支持手工录入;单据审核通过后,系统自动在客户物料管理中创建客户物料与物料的对应关系,按客户+客户物料编码+物料校验,有相同的关系时,不创建记录"),
    tableLoadNumber("tableLoadNumber", "加载数量", "200", "分页方式", "0", "说明：开启后，客户物料编码支持手工录入;单据审核通过后,系统自动在客户物料管理中创建客户物料与物料的对应关系,按客户+客户物料编码+物料校验,有相同的关系时,不创建记录"),
    virtualXConfigGt("virtualXConfigGt", "横向虚拟滚动阈值", "50", "分页方式", "0", "说明：指定大于指定行时自动启动横向虚拟滚动，如果为 0 则总是启用；"),
    virtualYConfigGt("virtualYConfigGt", "纵向虚拟滚动阈值", "50", "分页方式", "0", "说明：指定大于指定行时自动启动纵向虚拟滚动，如果为 0 则总是启用；"),

    tableLoadModel("tableLoadModel", "加载模式", "1", "分页方式", "0", ""),
    checkAccountPeriod("checkAccountPeriod", "库存单据过账，校验账期是否关闭", "N", "功能参数", "518b17fc-1180-42f7-95cd-927775fb944f", "开启后，库存单据过账时，过账日期必须在进行中的账期内才能过账成功。"),

    ;

    private String value;
    private String name;
    private String defaultValue;
    private String jsonValue;
    private String defaultRemark;
    private String groupName;
    private String menuCode;
    private String tip;

    SysParamCodeEnum(String value, String name, String defaultValue, String groupName, String menuCode, String tip) {
        this.value = value;
        this.name = name;
        this.defaultValue = defaultValue;
        this.groupName = groupName;
        this.menuCode = menuCode;
        this.tip = tip;
    }

    SysParamCodeEnum(String value, String name, String defaultValue, String defaultRemark, String groupName, String menuCode, String tip) {
        this.value = value;
        this.name = name;
        this.defaultValue = defaultValue;
        this.defaultRemark = defaultRemark;
        this.groupName = groupName;
        this.menuCode = menuCode;
        this.tip = tip;
    }

    SysParamCodeEnum(String value, String name, String defaultValue, String jsonValue, String defaultRemark, String groupName, String menuCode, String tip) {
        this.value = value;
        this.name = name;
        this.defaultValue = defaultValue;
        this.jsonValue = jsonValue;
        this.defaultRemark = defaultRemark;
        this.groupName = groupName;
        this.menuCode = menuCode;
        this.tip = tip;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SysParamCodeEnum element : SysParamCodeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getTip(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SysParamCodeEnum element : SysParamCodeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getTip();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SysParamCodeEnum element : SysParamCodeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getNames() {
        String names[] = new String[SysParamCodeEnum.values().length];
        for (int i = 0; i < SysParamCodeEnum.values().length; i++) {
            names[i] = SysParamCodeEnum.values()[i].getName();
        }
        return String.join(",", names);
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getDefaultRemark() {
        return defaultRemark;
    }

    public String getTip() {
        return tip;
    }

    public String getJsonValue() {
        return jsonValue;
    }

    public static void main(String[] args) {
        String jsonValue = FaultRepairDurationStaMethod.getJsonValue();
        System.out.println(JSONObject.parseObject(jsonValue).getString("formula"));
    }

}
