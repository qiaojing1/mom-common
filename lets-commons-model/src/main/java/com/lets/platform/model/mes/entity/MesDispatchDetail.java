package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.ProcessTechniqueEnum;
import com.lets.platform.model.psi.entity.PsiContainerMaterialRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 派工-明细
 *
 * @author csy
 * @since 2024-01-03
 */
@Getter
@Setter
@TableName("mes_dispatch_detail")
@ApiModel(value = "MesDispatchDetail对象", description = "派工-明细")
public class MesDispatchDetail extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

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

    @ApiModelProperty("生产工单编码")
    @TableField("produce_order_code")
    private String produceOrderCode;
    @ApiModelProperty("生产工单编码")
    @TableField("produce_order_id")
    private String produceOrderId;
    @ApiModelProperty("生产工单明细id")
    @TableField("produce_order_detail_id")
    private String produceOrderDetailId;
    @ApiModelProperty("生产工单明细行号")
    @TableField("produce_order_line_number")
    private String produceOrderLineNumber;
    @ApiModelProperty("生产工单-批号")
    @TableField("produce_batch_number")
    private String produceBatchNumber;
    @ApiModelProperty("生产工单-单据类别主键")
    @TableField(exist = false)
    private String produceOrderCategoryId;
    @ApiModelProperty("生产工单-单据类别名称")
    @TableField(exist = false)
    private String produceOrderCategoryName;
    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PickingStatusEnum
     */
    @ApiModelProperty("领料状态")
    @TableField(exist = false)
    private String pickingStatus;
    @TableField(exist = false)
    private String pickingStatusName;

    @ApiModelProperty("工序计划主键")
    @TableField("process_plan_id")
    private String processPlanId;
    @ApiModelProperty("工序计划单号")
    @TableField("process_plan_code")
    private String processPlanCode;
    @ApiModelProperty("工序计划明细id")
    @TableField("process_plan_detail_id")
    private String processPlanDetailId;
    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDataSourceEnum
     */
    @ApiModelProperty(value = "数据来源[0：工单下发、1：页面新增]", hidden = true)
    @TableField(exist = false)
    private String dataSource;
    @ApiModelProperty("工艺路线-工序主键")
    @TableField("route_process_id")
    private String routeProcessId;
    @ApiModelProperty("工序号")
    @TableField("process_no")
    private String processNo;
    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;
    @ApiModelProperty("工艺路线主键")
    @TableField(exist = false)
    private String routeId;

    @ApiModelProperty(value = "上道工序", hidden = true)
    @TableField(exist = false)
    private MesProcessPlanDetail preProcess;
    @ApiModelProperty(value = "当前工序", hidden = true)
    @TableField(exist = false)
    private MesProcessPlanDetail currentProcess;
    @ApiModelProperty(value = "下道工序", hidden = true)
    @TableField(exist = false)
    private MesProcessPlanDetail nextProcess;

    @ApiModelProperty("上道工序主键")
    @TableField(exist = false)
    private String preProcessId;
    @ApiModelProperty("上道工序编码")
    @TableField(exist = false)
    private String preProcessCode;
    @ApiModelProperty("上道工序名称")
    @TableField(exist = false)
    private String preProcessName;

    @ApiModelProperty("下道工序主键")
    @TableField(exist = false)
    private String nextProcessId;
    @ApiModelProperty("下道工序编码")
    @TableField(exist = false)
    private String nextProcessCode;
    @ApiModelProperty("下道工序名称")
    @TableField(exist = false)
    private String nextProcessName;

    @ApiModelProperty("工序类型")
    @TableField("process_type")
    private String processType;
    @TableField(exist = false)
    private String processTypeName;
    /**
     * @see ProcessTechniqueEnum
     */
    @ApiModelProperty("加工工艺[1“车床加工”、2“铣床加工”、3“钳工加工”、4“冲压加工”、5“注塑加工”、6“锻造加工”]")
    @TableField("process_technique")
    private Integer processTechnique;
    @ExcelProperty("加工工艺")
    @TableField(exist = false)
    private String processTechniqueName;

    @ApiModelProperty("物料id")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料id")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @ApiModelProperty("规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("特征属性")
    @TableField("material_characteristic_name")
    private String materialCharacteristicName;

    @ApiModelProperty("生产单元id")
    @TableField("produce_factory_mode_id")
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("produce_factory_mode_name")
    private String produceFactoryModeName;

    @ApiModelProperty("计划开始时间")
    @TableField("plan_start_time")
    private LocalDateTime planStartTime;
    @ApiModelProperty("实际开始时间")
    @TableField("real_start_time")
    private LocalDateTime realStartTime;
    @ApiModelProperty("计划结束时间")
    @TableField("plan_end_time")
    private LocalDateTime planEndTime;
    @ApiModelProperty("实际结束时间")
    @TableField("real_end_time")
    private LocalDateTime realEndTime;

    @ApiModelProperty("工序单位主键")
    @TableField("process_unit_id")
    private String processUnitId;
    @ApiModelProperty("工序单位code")
    @TableField("process_unit_code")
    private String processUnitCode;
    @ApiModelProperty("工序单位名称")
    @TableField("process_unit_name")
    private String processUnitName;
    @ApiModelProperty("工序单位精度")
    @TableField("process_unit_accuracy")
    private Integer processUnitAccuracy;
    @ApiModelProperty("工序单位舍入方式")
    @TableField("process_unit_round_off_type")
    private Integer processUnitRoundOffType;

    @ApiModelProperty("班组id")
    @TableField("team_id")
    private String teamId;
    @ApiModelProperty("班组名称")
    @TableField("team_name")
    private String teamName;

    @ApiModelProperty("班次id")
    @TableField("shift_id")
    private String shiftId;
    @ApiModelProperty("班次名称")
    @TableField("shift_name")
    private String shiftName;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("操作工id")
    @TableField("operator_id")
    private String operatorId;
    @ApiModelProperty("操作工名称")
    @TableField("operator_name")
    private String operatorName;

    @TableField("is_single_wage")
    private String isSingleWage;

    @TableField("work_price")
    private BigDecimal workPrice;

    @ApiModelProperty("工单派工的工序计划id")
    @TableField("order_dispatch_id")
    private String orderDispatchId;

    @TableField(exist = false)
    private Boolean enableSingleWages;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("派工数量(工序数量)")
    @TableField("dispatch_number")
    private BigDecimal dispatchNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已接收数量")
    @TableField("received_number")
    private BigDecimal receivedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("完成数量")
    @TableField("finish_number")
    private BigDecimal finishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("完成率=完成数量/计划数量")
    @TableField(exist = false)
    private BigDecimal finishRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField(exist = false)
    private BigDecimal scrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField(exist = false)
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField(exist = false)
    private BigDecimal poorNumber;

    @ApiModelProperty("派工日期")
    @TableField("dispatch_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime dispatchTime;

    /**
     * @see com.lets.platform.model.mes.enums.DispatchDetailStatusEnum
     */
    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty(hidden = true)
    @TableField("old_status")
    private Integer oldStatus;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyOldStatus;

    @ApiModelProperty("关键字(派工任务-模糊查询[工单编码 工序计划编码 任务编码])")
    @TableField("key_word")
    private String keyWord;

    @ApiModelProperty("是否逾期(true、false)")
    @TableField(exist = false)
    private Boolean isOverdue;

    @ApiModelProperty("生产准备(YN)")
    @TableField("product_prepare")
    private String productPrepare;
    @ApiModelProperty("物料准备(YN)")
    @TableField("material_prepare")
    private String materialPrepare;
    @ApiModelProperty("任务准备(YN)")
    @TableField("task_prepare")
    private String taskPrepare;
    @ApiModelProperty("完工确认(YN)")
    @TableField("finish_confirm")
    private String finishConfirm;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String isMateialDemand;
    @ApiModelProperty("可接收数量(计划明细)")
    @TableField(exist = false)
    private BigDecimal canReceiveNumber;
    /**
     * @see com.lets.platform.model.mes.enums.HmiOperationTypeEnum
     */
    @ApiModelProperty("0:不可接收,1:可接收,2:可报工,3:不可报工")
    @TableField(exist = false)
    private List<String> operationTypeList;
    @TableField(exist = false)
    private List<String> operationTypeNameList;

    @ApiModelProperty("生产工单-物料id")
    @TableField(exist = false)
    private String produceMaterialId;
    @ApiModelProperty("生产工单-物料id")
    @TableField(exist = false)
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料编码")
    @TableField(exist = false)
    private String produceMaterialCode;
    @ApiModelProperty("生产工单-物料类型")
    @TableField(exist = false)
    private String produceMaterialType;
    @ApiModelProperty("生产工单-物料规格型号")
    @TableField(exist = false)
    private String produceMaterialSpecs;
    @ApiModelProperty("生产工单-物料特征属性")
    @TableField(exist = false)
    private String produceMaterialSpecific;
    @ApiModelProperty("生产工单-物料特征属性名称")
    @TableField(exist = false)
    private String produceMaterialSpecificName;

    @ApiModelProperty("销售订单-物料id")
    @TableField(exist = false)
    private String saleMaterialId;
    @ApiModelProperty("销售订单(产品名称)")
    @TableField(exist = false)
    private String saleMaterialName;
    @ApiModelProperty("销售订单(产品编码)")
    @TableField(exist = false)
    private String saleMaterialCode;
    @ApiModelProperty("销售订单(规格型号)")
    @TableField(exist = false)
    private String saleMaterialSpecs;

    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNo;
    @ApiModelProperty("工艺卡片")
    @TableField(exist = false)
    private String processCard;

    @ApiModelProperty("试压工序生成的试压工单编号")
    @TableField(value = "detect_order_code", updateStrategy = FieldStrategy.IGNORED)
    private String detectOrderCode;
    @ApiModelProperty("是否齐套--工位机用")
    @TableField(exist = false)
    private String isComplete;

    @ApiModelProperty("容器条码信息(载具)")
    @TableField(exist = false)
    private PsiContainerMaterialRecord containerMaterialRecord;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("启用汇报顺序控制")
    @TableField(exist = false)
    private Integer reportOrderly;

    @ApiModelProperty("是否二次派工(是否有设备+操作人员)")
    @TableField(exist = false)
    private String isDispatch;

    @ApiModelProperty("是否二次派工[YN]")
    @TableField("secondary_dispatching")
    private String secondaryDispatching;

    /**
     * @see com.lets.platform.model.mes.enums.InspectionStatusEnum
     */
    @ApiModelProperty("巡检状态[0:质量异常,1:正常]")
    @TableField("inspection_status")
    private Integer inspectionStatus;
    @TableField(exist = false)
    private Integer inspectionStatusName;

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

    @ApiModelProperty("材质")
    @TableField(exist = false)
    private String materialExtAttr;

    public BigDecimal finishNumberNotNull() {
        if (Objects.isNull(finishNumber)) {
            return BigDecimal.ZERO;
        } else {
            return finishNumber;
        }
    }
}
