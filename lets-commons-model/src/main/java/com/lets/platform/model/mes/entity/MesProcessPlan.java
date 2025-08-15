package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 工序计划
 *
 * @author DING WEI
 * @since 2023-12-26
 */
@Getter
@Setter
@TableName("mes_process_plan")
@ApiModel(value = "MesProcessPlan对象", description = "工序计划")
public class MesProcessPlan extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanTypeEnum
     */
    @ApiModelProperty("计划类型[1主计划、2返修计划、3子计划、4增补计划]")
    @TableField("plan_type")
    private String planType;
    @TableField(exist = false)
    private String planTypeName;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("生产工单-主键")
    @TableField("produce_order_id")
    private String produceOrderId;
    @ApiModelProperty("生产工单-单号")
    @TableField("produce_order_code")
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    @TableField("produce_line_number")
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;
    @ApiModelProperty("生产工单-源单单据主键")
    @TableField("produce_source_order_id")
    private String produceSourceOrderId;
    @ApiModelProperty("生产工单-源单单据编码")
    @TableField("produce_source_order_code")
    private String produceSourceOrderCode;
    @ApiModelProperty("生产工单-源单单据明细主键")
    @TableField("produce_source_detail_id")
    private String produceSourceDetailId;
    @ApiModelProperty("生产工单-源单单据行号")
    @TableField("produce_source_line_number")
    private Long produceSourceLineNumber;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.DemandSourceTypeEnum
     */
    @ApiModelProperty("需求来源类型[1:计划订单、2:销售订单、3:生产工单]")
    @TableField("demand_source_type")
    private Integer demandSourceType;
    @TableField(exist = false)
    private String demandSourceTypeName;

    @ApiModelProperty("生产工单-生产部门")
    @TableField("produce_org_id")
    private String produceOrgId;
    @ApiModelProperty("生产工单-生产部门名称")
    @TableField("produce_org_name")
    private String produceOrgName;
    @ApiModelProperty("生产工单-生产人员")
    @TableField("produce_user_id")
    private String produceUserId;
    @ApiModelProperty("生产工单-生产人员名称")
    @TableField("produce_user_name")
    private String produceUserName;

    @ApiModelProperty("生产单元")
    @TableField("produce_factory_mode_id")
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("produce_factory_mode_name")
    private String produceFactoryModeName;

    @ApiModelProperty("生产工单-物料主键")
    @TableField("produce_material_id")
    private String produceMaterialId;
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("生产工单-物料编码")
    @TableField("produce_material_code")
    private String produceMaterialCode;
    @ApiModelProperty("生产工单-物料名称")
    @TableField("produce_material_name")
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料规格型号")
    @TableField("produce_material_specs")
    private String produceMaterialSpecs;
    @ApiModelProperty("生产工单-物料类型")
    @TableField("produce_material_type")
    private String produceMaterialType;
    @TableField(exist = false)
    private String produceMaterialTypeName;
    @ApiModelProperty("生产工单-物料特征属性")
    @TableField("produce_material_specific")
    private String produceMaterialSpecific;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField("produce_bom_id")
    private String produceBomId;
    @ApiModelProperty("生产工单-BOM版本")
    @TableField("produce_bom_version")
    private String produceBomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String produceBomVersionDescribe;
    @ApiModelProperty("生产工单-工艺路线")
    @TableField("produce_route_id")
    private String produceRouteId;
    @ApiModelProperty("生产工单-工艺路线名称")
    @TableField("produce_route_name")
    private String produceRouteName;

    @ApiModelProperty("生产工单-计划开始时间")
    @TableField("produce_plan_start_time")
    private LocalDateTime producePlanStartTime;
    @TableField(exist = false)
    private String producePlanStartTimeFormat;
    @ApiModelProperty("生产工单-计划结束时间")
    @TableField("produce_plan_end_time")
    private LocalDateTime producePlanEndTime;
    @TableField(exist = false)
    private String producePlanEndTimeFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-基本数量")
    @TableField("produce_basic_number")
    private BigDecimal produceBasicNumber;
    @ApiModelProperty("生产工单-批号")
    @TableField("produce_batch_number")
    private String produceBatchNumber;

    @ApiModelProperty("生产工单-生产单位主键")
    @TableField("produce_unit_id")
    private String produceUnitId;
    @ApiModelProperty("生产工单-生产单位编码")
    @TableField("produce_unit_code")
    private String produceUnitCode;
    @ApiModelProperty("生产工单-生产单位名称")
    @TableField("produce_unit_name")
    private String produceUnitName;
    @ApiModelProperty("生产工单-生产单位精度")
    @TableField("produce_unit_accuracy")
    private Integer produceUnitAccuracy;
    @ApiModelProperty("生产工单-生产单位舍入方式")
    @TableField("produce_unit_round_off_type")
    private Integer produceUnitRoundOffType;
    @ApiModelProperty("生产工单-数量")
    @TableField("produce_number")
    private BigDecimal produceNumber;

    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核,4:已过账]")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("是否能编辑-目前IPQC生成的返修计划不可编辑(YN)")
    @TableField("can_edit")
    private String canEdit;

    @ApiModelProperty("隐藏作废 YN")
    @TableField("hide_scrap")
    private String hideScrap;

    @ApiModelProperty("生产工单-计划状态")
    @TableField(exist = false)
    private String planStatus;
    @TableField(exist = false)
    private String planStatusName;
    @ApiModelProperty("生产工单-任务状态")
    @TableField(exist = false)
    private String taskStatus;
    @TableField(exist = false)
    private String taskStatusName;
    @ApiModelProperty("生产工单-业务状态")
    @TableField(exist = false)
    private String businessStatus;
    @TableField(exist = false)
    private String businessStatusName;

    @ApiModelProperty("采购计价单位主键")
    @TableField("purchase_pricing_unit_id")
    private String purchasePricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    @TableField("purchase_pricing_unit_code")
    private String purchasePricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    @TableField("purchase_pricing_unit_name")
    private String purchasePricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    @TableField("purchase_pricing_unit_accuracy")
    private Integer purchasePricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入方式")
    @TableField("purchase_pricing_unit_round_off_type")
    private Integer purchasePricingUnitRoundOffType;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<MesProcessPlanDetail> details;

    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;
    @ApiModelProperty("工序号")
    @TableField(exist = false)
    private String processNo;

    @ApiModelProperty("工艺路线-工序主键")
    @TableField(exist = false)
    private String routeProcessId;
    @ApiModelProperty("工序主键")
    @TableField(exist = false)
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField(exist = false)
    private String processName;
    /**
     * @see com.lets.platform.model.common.enums.CommonProcessTypeEnum
     */
    @ApiModelProperty("工序类型")
    @TableField(exist = false)
    private String processType;
    @TableField(exist = false)
    private String processTypeName;
    /**
     * @see com.lets.platform.model.common.enums.ProcessTechniqueEnum
     */
    @TableField(exist = false)
    private Integer processTechnique;
    @TableField(exist = false)
    private String processTechniqueName;
    @ApiModelProperty("工序组主键")
    @TableField(exist = false)
    private String processGroupId;
    @ApiModelProperty("工序组名称")
    @TableField(exist = false)
    private String processGroupName;
    /**
     * @see com.lets.platform.model.mes.enums.ProcessSignEnum
     */
    @ApiModelProperty("工序标识[0:首道工序,1:末道工序,2:只有一道工序(既是首道也是末道)]")
    @TableField(exist = false)
    private String processSign;
    @ApiModelProperty("工序步骤")
    @TableField(exist = false)
    private Integer processStep;
    @ApiModelProperty("工序顺序")
    @TableField(exist = false)
    private Integer processSort;

    @ApiModelProperty("标准产能(只有物料类型的工艺路线有该属性，小数位取物料的生产单位精度)")
    @TableField(exist = false)
    private BigDecimal standardCapacity;
    /**
     * @see com.lets.platform.model.base.enums.StandardCapacityUnitEnum
     */
    @ApiModelProperty("标准产能单位")
    @TableField(exist = false)
    private String standardCapacityUnit;
    @ApiModelProperty("理论生产工时H(计划开始时间到计划截止时间)")
    @TableField(exist = false)
    private Long workDuration;
    @ApiModelProperty("实际完成时间(报工创建工序汇报单最新的创建时间)")
    @TableField(exist = false)
    private LocalDateTime actualCompleteTime;
    @ApiModelProperty("实际开始时间(派工单明细中的real_start_time)")
    @TableField(exist = false)
    private LocalDateTime actualStartTime;

    @ApiModelProperty("生产单元")
    @TableField(exist = false)
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String factoryModeName;
    @ApiModelProperty("计划开始时间")
    @TableField(exist = false)
    private LocalDateTime planStartTime;
    @TableField(exist = false)
    private String planStartTimeFormat;
    @ApiModelProperty("计划结束时间")
    @TableField(exist = false)
    private LocalDateTime planEndTime;
    @TableField(exist = false)
    private String planEndTimeFormat;
    @ApiModelProperty("工序单位主键")
    @TableField(exist = false)
    private String processUnitId;
    @ApiModelProperty("工序单位编码")
    @TableField(exist = false)
    private String processUnitCode;
    @ApiModelProperty("工序单位名称")
    @TableField(exist = false)
    private String processUnitName;
    @ApiModelProperty("工序单位精度")
    @TableField(exist = false)
    private Integer processUnitAccuracy;
    @ApiModelProperty("工序单位舍入方式")
    @TableField(exist = false)
    private Integer processUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工序数量(生产工单中的数量*转换系数)")
    @TableField(exist = false)
    private BigDecimal processNumber;
    @ApiModelProperty("基本批量")
    @TableField(exist = false)
    private BigDecimal basicBatchSize;
    @ApiModelProperty("转换系数")
    @TableField(exist = false)
    private BigDecimal convertRatio;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计件工资")
    @TableField(exist = false)
    private BigDecimal workPrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工时单价")
    @TableField(exist = false)
    private BigDecimal hourPrice;
    @ApiModelProperty("准备时长(min)")
    @TableField(exist = false)
    private Integer prepareTime;
    @ApiModelProperty(value = "准备时长(min)打印使用", hidden = true)
    @TableField(exist = false)
    private Integer prepareDuration;
    @ApiModelProperty("标准工时(min)")
    @TableField(exist = false)
    private Integer standardTime;
    @ApiModelProperty(value = "标准工时(min)打印使用", hidden = true)
    @TableField(exist = false)
    private Integer standardDuration;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal richNumber;
    @TableField(exist = false)
    private BigDecimal todayRichNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField(exist = false)
    private BigDecimal scrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    @TableField(exist = false)
    private BigDecimal processScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    @TableField(exist = false)
    private BigDecimal materialScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField(exist = false)
    private BigDecimal poorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField(exist = false)
    private BigDecimal repairNumber;
    @ApiModelProperty("让步接收数量")
    @TableField(exist = false)
    private BigDecimal giveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("损耗数量")
    @TableField(exist = false)
    private BigDecimal lossNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转入数量")
    @TableField(exist = false)
    private BigDecimal rollInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转出数量")
    @TableField(exist = false)
    private BigDecimal rollOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超产数量")
    @TableField(exist = false)
    private BigDecimal overProduceNumber;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDetailStatusEnum
     */
    @ApiModelProperty("状态")
    @TableField(exist = false)
    private Integer detailStatus;
    @TableField(exist = false)
    private String detailStatusName;

    @ApiModelProperty("是否作废[0否1是]")
    @TableField(exist = false)
    private Integer cancel;
    @TableField(exist = false)
    private String cancelName;
    @ApiModelProperty("工序检验[0否1是]")
    @TableField(exist = false)
    private Integer processInspect;
    @TableField(exist = false)
    private String processInspectName;

    @ApiModelProperty("自制工序检验[0否1是]")
    @TableField(exist = false)
    private Integer inspectType;

    @ApiModelProperty("委外工序检验[0否1是]")
    @TableField(exist = false)
    private Integer outsourcingInspectType;
    @TableField(exist = false)
    private String outsourcingInspectTypeName;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("副本工艺路线主键")
    @TableField(exist = false)
    private String copyRouteId;
    @ApiModelProperty("副本工艺路线明细主键")
    @TableField(exist = false)
    private String copyRouteDetailId;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDataSourceEnum
     */
    @ApiModelProperty(value = "数据来源[0：工单下发、1：页面新增]", hidden = true)
    @TableField(exist = false)
    private String dataSource;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sameRouteDetailId;

    // 批量派工
    @TableField(exist = false)
    private BigDecimal alreadyDispatchNumber;
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal notDispatchNumber;
    /**
     * @see com.lets.platform.common.pojo.enums.FinishEnum
     */
    @TableField(exist = false)
    private String dispatchStatus;
    @TableField(exist = false)
    private String dispatchStatusName;
    @TableField(exist = false)
    private String alreadyDispatchNumberStr;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @ApiModelProperty("已经委外发出数量(计价单位)")
    @TableField(exist = false)
    private BigDecimal alreadyOutsourcingPricingNumber;
    @ApiModelProperty("委外发出占用数量")
    @TableField(exist = false)
    private BigDecimal occupyOutsourcingNumber;
    @ApiModelProperty("已经委外接收数量(计价单位)")
    @TableField(exist = false)
    private BigDecimal alreadyOutsourcingInPricingNumber;
    @ApiModelProperty("委外接收占用数量")
    @TableField(exist = false)
    private BigDecimal occupyOutsourcingInNumber;
    @ApiModelProperty("委外接收占用数量(计价单位)")
    @TableField(exist = false)
    private BigDecimal occupyOutsourcingInPricingNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已接收数量|已经委外发出数量")
    @TableField(exist = false)
    private BigDecimal receivedNumber;
    @ApiModelProperty(value = "可接收数量", hidden = true)
    @TableField(exist = false)
    private BigDecimal canReceiveNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外发出数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外发出计价数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingOutPricingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已委外发出数量")
    @TableField(exist = false)
    private BigDecimal alreadySourcingOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("剩余委外发出数量")
    @TableField(exist = false)
    private BigDecimal surplusOutsourcingOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工数量|已经委外接收数量")
    @TableField(exist = false)
    private BigDecimal reportNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外接收数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外接收计价数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingInPricingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已委外接收数量")
    @TableField(exist = false)
    private BigDecimal alreadySourcingInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("剩余委外接收数量")
    @TableField(exist = false)
    private BigDecimal surplusOutsourcingInNumber;

    @TableField(exist = false)
    private String isOverdue;
    @TableField(exist = false)
    private String isOverdueName;
    @TableField(exist = false)
    private String almostOverdue;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    /**
     * 下发到委外的参数 start
     */
    @ApiModelProperty("供应商主键")
    @TableField(exist = false)
    private String supplierId;
    @ApiModelProperty("供应商名称")
    @TableField(exist = false)
    private String supplierName;
    @ApiModelProperty("委外数量")
    @TableField(exist = false)
    private BigDecimal outsourcingNumber;
    @ApiModelProperty("委外计价数量")
    @TableField(exist = false)
    private BigDecimal outsourcingPricingNumber;
    @ApiModelProperty("计价单位和工序单位是够存在转换关系")
    @TableField(exist = false)
    private String hasUnitConvert;

    @ApiModelProperty("可拆分数量")
    @TableField(exist = false)
    private BigDecimal canSplitNumber;
    @ApiModelProperty("拆分方式 1首末拆分;2当前工序至末到工序拆分;3单独工序拆分")
    @TableField("split_type")
    private String splitType;
    @TableField("split_source_order")
    private String splitSourceOrder;
    @ApiModelProperty("增补源单")
    @TableField("add_source_order")
    private String addSourceOrder;

    @ApiModelProperty("有值表示当前计划单头为工单派工产生的假计划，值为源工序计划id")
    @TableField("source_plan_id")
    private String sourcePlanId;

    @ApiModelProperty("工单派工状态")
    @TableField("order_dispatch_status")
    private Integer orderDispatchStatus;
    @TableField(exist = false)
    private String orderDispatchStatusName;

    @ApiModelProperty("派工数量,未派工时为已派工数量，派工时为已派工数量")
    @TableField("order_dispatch_number")
    private BigDecimal orderDispatchNumber;

    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField(exist = false)
    private Integer series;

    @ApiModelProperty("启用汇报顺序控制[0：否，1：是]")
    @TableField(exist = false)
    private Integer reportOrderly;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外单价")
    @TableField(exist = false)
    private BigDecimal outsourcePrice;

    @ApiModelProperty("导入的工序委外发出编码")
    @TableField(exist = false)
    private String outsourceCode;

    @ApiModelProperty("导入的工序委外发出单据日期")
    @TableField(exist = false)
    private LocalDateTime outsourceDateTime;
    /**
     * 下发到委外的参数 end
     */
    @TableField(exist = false)
    private String isMateialDemand;

    @ApiModelProperty("是否为产品物料")
    @TableField(exist = false)
    private String isProduct;
    @ApiModelProperty("产品物料")
    @TableField(exist = false)
    private String productMaterialId;
    @TableField(exist = false)
    private String productMaterialCode;
    @TableField(exist = false)
    private String productMaterialName;
    @TableField(exist = false)
    private String productMaterialSpecs;

    @TableField(exist = false)
    private String outsourcingInMode;

    @ApiModelProperty("是否工序首检[0:否,1:是]")
    @TableField(exist = false)
    private Integer firstInspection;
    @ApiModelProperty("首检数量(制程工序计划)")
    @TableField(exist = false)
    private BigDecimal firstInspectionNumber;
    /**
     * @see com.lets.platform.model.mes.enums.FirstCheckStatusEnum
     */
    @ApiModelProperty("首检状态[1:未首检,3:已首检]")
    @TableField(exist = false)
    private String firstInspectionStatus;
    @TableField(exist = false)
    private String firstInspectionStatusName;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注2")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;
    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;

    @TableField(exist = false)
    private String nextProcessPlanDetailId;
    @TableField(exist = false)
    private String preProcessPlanDetailId;

    @TableField(exist = false)
    private Boolean enableOutsourceAutoCal;
    @TableField(exist = false)
    private Boolean enableOutsourcingInAutoCal;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal richNumberNotNull() {
        if (Objects.isNull(richNumber)) {
            return BigDecimal.ZERO;
        } else {
            return richNumber;
        }
    }

    public BigDecimal giveInNumberNN() {
        if (Objects.isNull(giveInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return giveInNumber;
        }
    }

    public BigDecimal reportNumberNotNull() {
        if (Objects.isNull(reportNumber)) {
            return BigDecimal.ZERO;
        } else {
            return reportNumber;
        }
    }

    public BigDecimal occupyOutsourcingInNumberNotNull() {
        if (Objects.isNull(occupyOutsourcingInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyOutsourcingInNumber;
        }
    }

    public BigDecimal receivedNumberNotNull() {
        if (Objects.isNull(receivedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return receivedNumber;
        }
    }

    public BigDecimal occupyOutsourcingNumberNotNull() {
        if (Objects.isNull(occupyOutsourcingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyOutsourcingNumber;
        }
    }

}
