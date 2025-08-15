package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.mes.enums.produceOrder.PlanStatusEnum;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import com.lets.platform.model.psi.entity.PsiOrderCategoryDetailField;
import com.lets.platform.model.psi.entity.PsiProduceOrderPursuanceSchedule;
import com.lets.platform.model.psi.mrpModel.BomModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 生产工单-明细
 *
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_detail")
@ApiModel(value = "MesProduceOrderDetail对象", description = "生产工单-明细")
public class MesProduceOrderDetail extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @TableField(exist = false)
    private PsiOrderCategory produceOrderCategory;

    @TableField(exist = false)
    private String key;

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @TableField(exist = false)
    private Integer orderStatus;

    @TableField(exist = false)
    private String detailCode;

    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private String orderRemark;
    @TableField(exist = false)
    private Map<String, PsiOrderCategoryDetailField> detailFieldMap;
    @TableField(exist = false)
    private String orderCategoryCode;

    @TableField(exist = false)
    private LocalDateTime orderTime;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @ApiModelProperty("物料是否开启可存货")
    @TableField("material_storable")
    private String materialStorable;
    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;
    /**
     * @see com.lets.platform.model.psi.enums.LotControlTypeEnum
     */
    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    /**
     * @see com.lets.platform.model.psi.enums.LotUseRangeEnum
     */
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;
    @ApiModelProperty("日产量")
    @TableField("production_daily_output")
    private BigDecimal productionDailyOutput;

    @TableField(exist = false)
    private String serialNumberControlType;
    @TableField(exist = false)
    private String serialNumberScope;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private List<MesProduceOrderDetailSpecific> detailSpecifics;
    @ApiModelProperty("物料特征属性名称")
    @TableField("material_specific")
    private String materialSpecificName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.ProductTypeEnum
     */
    @ApiModelProperty("产品类型")
    @TableField("product_type")
    private String productType;
    @TableField(exist = false)
    private String productTypeName;

    @ApiModelProperty("生产单位")
    @TableField("produce_unit_id")
    private String produceUnitId;
    @ApiModelProperty("生产单位编码")
    @TableField("produce_unit_code")
    private String produceUnitCode;
    @ApiModelProperty("生产单位名称")
    @TableField("produce_unit_name")
    private String produceUnitName;
    @ApiModelProperty("生产单位精度")
    @TableField("produce_unit_accuracy")
    private Integer produceUnitAccuracy;
    @ApiModelProperty("生产单位舍入类型")
    @TableField("produce_unit_round_off_type")
    private Integer produceUnitRoundOffType;
    @ApiModelProperty("启用试压检验")
    @TableField("quality_detect_inspection")
    private Integer qualityDetectInspection;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String proAndBasicConvert;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String basicAndProConvert;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String orderAndBomConvert;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String bomAndOrderConvert;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("退料套数")
    @TableField(exist = false)
    private BigDecimal returnSetNumber;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;
    @ApiModelProperty("智能车间")
    @TableField("intelligence_workshop")
    private String intelligenceWorkshop;

    @ApiModelProperty("BOM版本")
    @TableField("bom_id")
    private String bomId;
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;
    @TableField(exist = false)
    @ApiModelProperty("是否包含多个bom版本")
    private boolean mutiBomVersion;

    @ApiModelProperty("工艺路线")
    @TableField("route_id")
    private String routeId;
    @TableField("route_name")
    private String routeName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("计划开始时间")
    @TableField("plan_start_time")
    private LocalDateTime planStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("计划结束时间")
    @TableField("plan_end_time")
    private LocalDateTime planEndTime;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;

    @ApiModelProperty("基本单位")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @ApiModelProperty("基本单位编码")
    @TableField("basic_unit_code")
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField("basic_unit_accuracy")
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入类型")
    @TableField("basic_unit_round_off_type")
    private Integer basicUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("基本数量")
    @TableField("basic_number")
    private BigDecimal basicNumber;

    /**
     * @see PlanStatusEnum
     */
    @ApiModelProperty("计划状态")
    @TableField("plan_status")
    private String planStatus;
    @TableField(exist = false)
    private String planStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.TaskStatusEnum
     */
    @ApiModelProperty("任务状态")
    @TableField("task_status")
    private String taskStatus;
    @TableField(exist = false)
    private String taskStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.BusinessStatusEnum
     */
    @ApiModelProperty("业务状态")
    @TableField("business_status")
    private String businessStatus;
    @TableField(exist = false)
    private String businessStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingStatusEnum
     */
    @ApiModelProperty("领料状态")
    @TableField("picking_status")
    private String pickingStatus;
    @TableField(exist = false)
    private String pickingStatusName;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.CuttingStatusEnum
     */
    @ApiModelProperty("下料状态[0未发出、1部分发出、2全部发出、3未接收、4部分接收、5全部接收]")
    @TableField("cutting_status")
    private Integer cuttingStatus;
    @TableField(exist = false)
    private String cuttingStatusName;

    @ApiModelProperty("成品率")
    @TableField("yield_rate")
    private BigDecimal yieldRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("待入库数量")
    @TableField("wait_stock_in_number")
    @Deprecated
    private BigDecimal waitStockInNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("待入库合格数量")
    @TableField(exist = false)
    private BigDecimal waitStockInQualifiedQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工数量")
    @TableField("report_number")
    private BigDecimal reportNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超产数量=报工数量（需要扣减关联返修报工数量）-工单数量")
    @TableField("over_produce_number")
    private BigDecimal overProduceNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格数量")
    @TableField("poor_number")
    private BigDecimal poorNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格品入库数量")
    @TableField("stock_in_rich_number")
    private BigDecimal stockInRichNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格品入库数量")
    @TableField("stock_in_poor_number")
    private BigDecimal stockInPoorNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField("defect_quantity")
    private BigDecimal defectQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返工数量")
    @TableField("rework_number")
    private BigDecimal reworkNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField("scrap_number")
    private BigDecimal scrapNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("预计报废数量")
    @TableField("expect_scrap_number")
    private BigDecimal expectScrapNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废品入库数量")
    @TableField("stock_in_scrap_number")
    private BigDecimal stockInScrapNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良品入库数量")
    @TableField("stock_in_defect_quantity")
    private BigDecimal stockInDefectQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返工品入库数量")
    @TableField("stock_in_rework_quantity")
    private BigDecimal stockInReworkQuantity;

    @ApiModelProperty("入库仓库主键")
    @TableField("stock_in_store_id")
    private String stockInStoreId;

    @ApiModelProperty("入库仓库名称")
    @TableField("stock_in_store_name")
    private String stockInStoreName;

    @ApiModelProperty("入库库区主键")
    @TableField("stock_in_area_id")
    private String stockInAreaId;

    @ApiModelProperty("入库库区名称")
    @TableField("stock_in_area_name")
    private String stockInAreaName;

    @ApiModelProperty("入库库位主键")
    @TableField("stock_in_position_id")
    private String stockInPositionId;

    @ApiModelProperty("入库库位名称")
    @TableField("stock_in_position_name")
    private String stockInPositionName;

    @ApiModelProperty("上限允差(%)")
    @TableField("upper_limit_percent")
    private BigDecimal upperLimitPercent;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上限数量")
    @TableField("upper_limit_number")
    private BigDecimal upperLimitNumber;

    @ApiModelProperty("下限允差(%)")
    @TableField("lower_limit_percent")
    private BigDecimal lowerLimitPercent;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("下限数量")
    @TableField("lower_limit_number")
    private BigDecimal lowerLimitNumber;

    @ApiModelProperty("完工时间")
    @TableField("finish_time")
    private LocalDateTime finishTime;
    @TableField(exist = false)
    private Boolean emptyFinishTime;

    @ApiModelProperty("关闭时间")
    @TableField("close_time")
    private LocalDateTime closeTime;
    @TableField(exist = false)
    private Boolean emptyCloseTime;

    @ApiModelProperty("订单需求日期")
    @TableField("order_demand_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderDemandTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.ProduceOrderSourceEnum
     */
    @ApiModelProperty("单据来源[0手动创建,1计划订单投放]")
    @TableField("order_source")
    private String orderSource;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单单据主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单据编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单单据行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @TableField("version")
    private Integer version;

    @TableField("occupy_number")
    private BigDecimal occupyNumber;

    @ApiModelProperty(value = "相同BOM版本的明细主键", hidden = true)
    @TableField("same_bom_detail_id")
    private String sameBomDetailId;

    @ApiModelProperty(value = "相同工艺路线的明细主键", hidden = true)
    @TableField("same_route_detail_id")
    private String sameRouteDetailId;

    @ApiModelProperty(value = "首件检验")
    @TableField("is_first_check")
    private String isFirstCheck;

    @ApiModelProperty(value = "首件检验数量(已转换成生产单位)")
    @TableField(exist = false)
    private BigDecimal firstCheckQuantity;

    @ApiModelProperty(value = "首检状态[1:未首检;2:首检中;3:已首检]")
    @TableField("first_check_status")
    private String firstCheckStatus;

    @ApiModelProperty(value = "首检状态[1:未首检;2:首检中;3:已首检]")
    @TableField(exist = false)
    private String firstCheckStatusName;

    @TableField(exist = false)
    private Long rowCount;

    @TableField(exist = false)
    private boolean autoGenerate;

    @TableField(exist = false)
    private BomModel bomModel;

    @TableField(exist = false)
    private List<BomModel> flatBomList;

    @TableField(exist = false)
    private List<MesProduceMaterialBillOrderDetail> materialBillOrderDetailList;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("领料套数")
    @TableField(exist = false)
    private BigDecimal kittingQuantity;

    @ApiModelProperty("最大领料套数")
    @TableField(exist = false)
    private BigDecimal maxKittingQuantity;

    @ApiModelProperty("已领套数")
    @TableField(exist = false)
    private BigDecimal receivedKittingQuantity;

    @ApiModelProperty("BOM明细中真实的detailId")
    @TableField(exist = false)
    private String realBomDetailId;

    @TableField(exist = false)
    private String targetOrderCategoryId;

    @ApiModelProperty("实际开工时间=下达时间")
    @TableField("real_start_time")
    private LocalDateTime realStartTime;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyRealStartTime;

    @TableField(exist = false)
    private String currentOrderCategoryId;

    public BigDecimal repairNumberNN() {
        if (Objects.isNull(repairNumber)) {
            return BigDecimal.ZERO;
        } else {
            return repairNumber;
        }
    }

    public BigDecimal reportNumberNN() {
        if (Objects.isNull(reportNumber)) {
            return BigDecimal.ZERO;
        } else {
            return reportNumber;
        }
    }

    @ApiModelProperty("MRP任务ID")
    @TableField("mrp_task_id")
    private String mrpTaskId;

    @ApiModelProperty("MRP来源ID")
    @TableField("mrp_source_id")
    private String mrpSourceId;

    @ApiModelProperty("MRP来源明细ID")
    @TableField("mrp_source_detail_id")
    private String mrpSourceDetailId;

    @ApiModelProperty("MRP数量(基本单位)")
    @TableField("mrp_quantity")
    private BigDecimal mrpQuantity;

    @ApiModelProperty("编码规则id")
    @TableField("rule_id")
    private String ruleId;
    @ApiModelProperty("流水号类型的编码规则明细id")
    @TableField("rule_detail_id")
    private String ruleDetailId;
    @ApiModelProperty("流水号类型的编码规则明细流水id")
    @TableField("rule_detail_serial_id")
    private String ruleDetailSerialId;

    @ApiModelProperty("是否存在领料方式为直接倒冲领料的用料清单[YN]")
    @TableField("has_directly_reverse_bill")
    private String hasDirectlyReverseBill;

    @ApiModelProperty("工位机-工单执行-生产执行-是否开工")
    @TableField(exist = false)
    private Boolean pursuanceStartWork;
    @ApiModelProperty("工位机-工单执行-生产执行-开工主键")
    @TableField(exist = false)
    private String pursuanceStartWorkId;

    @TableField(exist = false)
    private List<MesProduceOrderDetailSerial> serials;

    @ApiModelProperty("条码生成规则ID")
    @TableField("barcode_rule_id")
    private String barcodeRuleId;

    @TableField("barcode_rule_name")
    private String barcodeRuleName;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @TableField("detect_order_code")
    private String detectOrderCode;

    @TableField("already_detect_number")
    private BigDecimal alreadyDetectNumber;
    @TableField(exist = false)
    private BigDecimal alreadyDetectNumberOld;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.GenerateMaterialBarcodeMomentEnum
     */
    @ApiModelProperty("生成物料条码时机[1:扫码上料;2:报工]")
    @TableField("generate_material_barcode_moment")
    private String generateMaterialBarcodeMoment;

    @ApiModelProperty("工位机-启用设备自动计数(0否1是)")
    @TableField(exist = false)
    private Integer deviceAutoCount;
    @ApiModelProperty("工位机-生产单元")
    @TableField(exist = false)
    private String hmiProductUnitId;
    @ApiModelProperty("工位机")
    @TableField(exist = false)
    private CommonHmiSettings hmiSettings;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已委外数量")
    @TableField("already_outsourcing_number")
    private BigDecimal alreadyOutsourcingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外占用数量")
    @TableField("occupy_outsourcing_number")
    private BigDecimal occupyOutsourcingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingNumber;

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
    @TableField(exist = false)
    private String isMateialDemand;

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

    @TableField("calculated")
    @ApiModelProperty("是否已计划运算(新计划运算)")
    private int calculated;
    @TableField(exist = false)
    private String orderCategoryId;
    @TableField(exist = false)
    private String orderCategoryName;

    @TableField(exist = false)
    private PsiProduceOrderPursuanceSchedule schedule;

    @ApiModelProperty("生产要求")
    @TableField(exist = false)
    private MesProduceOrderDetailDemand detailDemand;

    @ApiModelProperty("是否有生产要求[N:否，Y:是]")
    @TableField("is_produce_demand")
    private String isProduceDemand;

    @ApiModelProperty("在制数量 在制数量=工单数量-合格品入库数量-报废数量-不良品入库数量-返工品入库数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quantityProcess;

    @ApiModelProperty("产值分配")
    @TableField(exist = false)
    private List<MesProduceOrderDetailOutputPercent> outputPercentList;

    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}
