package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lets.platform.common.pojo.constant.GlobalConstant;
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
 * 工序计划-明细
 *
 * @author DING WEI
 * @since 2023-12-26
 */
@Getter
@Setter
@TableName("mes_process_plan_detail")
@ApiModel(value = "MesProcessPlanDetail对象", description = "工序计划-明细")
public class MesProcessPlanDetail extends BaseEntity {

    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("工序号")
    @TableField(value = "process_no")
    private String processNo;

    @ApiModelProperty("是否计件")
    @TableField(value = "is_single_wage")
    private String isSingleWage;

    @ApiModelProperty("委外单价")
    @TableField(value = "outsource_price")
    private BigDecimal outsourcePrice;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;
    /**
     * @see com.lets.platform.model.common.enums.CommonProcessTypeEnum
     */
    @ApiModelProperty("工序类型")
    @TableField("process_type")
    private String processType;
    @TableField(exist = false)
    private String processTypeName;
    /**
     * @see com.lets.platform.model.common.enums.ProcessTechniqueEnum
     */
    @ApiModelProperty("加工工艺[1“车床加工”、2“铣床加工”、3“钳工加工”、4“冲压加工”、5“注塑加工”、6“锻造加工”]")
    @TableField("process_technique")
    private Integer processTechnique;
    @ExcelProperty("加工工艺")
    @TableField(exist = false)
    private String processTechniqueName;
    @ApiModelProperty("工序组主键")
    @TableField("process_group_id")
    private String processGroupId;
    @ApiModelProperty("工序组名称")
    @TableField("process_group_name")
    private String processGroupName;

    @ApiModelProperty("工艺路线-工序关系主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;
    @ApiModelProperty("计划开始时间")
    @TableField("plan_start_time")
    private LocalDateTime planStartTime;
    @TableField(exist = false)
    private String planStartTimeFormat;
    @ApiModelProperty("计划结束时间")
    @TableField("plan_end_time")
    private LocalDateTime planEndTime;

    @ApiModelProperty("理论生产工时H(计划开始时间到计划截止时间)")
    @TableField("work_duration")
    private Long workDuration;

    @TableField(exist = false)
    private String planEndTimeFormat;
    @ApiModelProperty("工序单位主键")
    @TableField("process_unit_id")
    private String processUnitId;
    @ApiModelProperty("工序单位编码")
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工序数量(生产工单名字中的数量)")
    @TableField("process_number")
    private BigDecimal processNumber;
    @ApiModelProperty("工序上限数量")
    @TableField("process_upper_number")
    private BigDecimal processUpperNumber;
    @ApiModelProperty("入库超收上限(%)")
    @TableField("production_stock_in_upper_limit")
    private BigDecimal productionStockInUpperLimit;
    @ApiModelProperty("基本批量")
    @TableField("basic_batch_size")
    private BigDecimal basicBatchSize;
    @ApiModelProperty("转换系数")
    @TableField("convert_ratio")
    private BigDecimal convertRatio;
    /**
     * @see com.lets.platform.model.common.enums.InspectionTypeEnum
     */
    @ApiModelProperty("自制检验类型[1自检,2PQC]")
    @TableField("inspect_type")
    private String inspectType;
    @TableField(exist = false)
    private String inspectTypeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计件工资")
    @TableField("work_price")
    private BigDecimal workPrice;
    @ApiModelProperty("准备时长(min)")
    @TableField("prepare_time")
    private Integer prepareTime;
    @ApiModelProperty("标准工时(min)")
    @TableField("standard_time")
    private Integer standardTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldRichNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField("scrap_number")
    private BigDecimal scrapNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    @TableField("process_scrap_number")
    private BigDecimal processScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    @TableField("material_scrap_number")
    private BigDecimal materialScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量(生产工单中的defectQuantity))")
    @TableField("poor_number")
    private BigDecimal poorNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldPoorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldRepairNumber;
    @ApiModelProperty("让步接收数量")
    @TableField("give_in_number")
    private BigDecimal giveInNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldGiveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转入数量")
    @TableField("roll_in_number")
    private BigDecimal rollInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转出数量")
    @TableField("roll_out_number")
    private BigDecimal rollOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超产数量")
    @TableField("over_produce_number")
    private BigDecimal overProduceNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldOverProduceNumber;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDetailStatusEnum
     */
    @ApiModelProperty("状态")
    @TableField("status")
    private Integer detailStatus;
    @TableField(exist = false)
    private String detailStatusName;
    @ApiModelProperty("源状态")
    @TableField("old_status")
    private Integer oldStatus;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyOldStatus;

    @ApiModelProperty("是否作废[0否1是]")
    @TableField("cancel")
    private Integer cancel;
    @TableField(exist = false)
    private String cancelName;

    @ApiModelProperty("工序检验[0否1是]")
    @TableField("process_inspect")
    private Integer processInspect;
    @TableField(exist = false)
    private String processInspectName;

    @ApiModelProperty("委外工序检验[1是0否]")
    @TableField("outsourcing_inspect_type")
    private Integer outsourcingInspectType;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ApiModelProperty("源工艺路线主键")
    @TableField("source_route_id")
    private String sourceRouteId;
    @ApiModelProperty("副本工艺路线主键")
    @TableField("copy_route_id")
    private String copyRouteId;
    @ApiModelProperty("副本工艺路线明细主键")
    @TableField("copy_route_detail_id")
    private String copyRouteDetailId;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.PlanDataSourceEnum
     */
    @ApiModelProperty(value = "数据来源[0：工单下发、1：页面新增]", hidden = true)
    @TableField("data_source")
    private String dataSource;

    // 批量派工
    @TableField("already_dispatch_number")
    private BigDecimal alreadyDispatchNumber;
    /**
     * @see com.lets.platform.common.pojo.enums.FinishEnum
     */
    @TableField("dispatch_status")
    private String dispatchStatus;
    @TableField(exist = false)
    private String dispatchStatusName;

    @TableField("max_serial_no")
    private Integer maxSerialNo;
    @TableField("version")
    private Integer version;

    /**
     * @see com.lets.platform.model.mes.enums.ProcessSignEnum
     */
    @ApiModelProperty("工序标识[0:首道工序,1:末道工序,2:只有一道工序(既是首道也是末道)]")
    @TableField("process_sign")
    private String processSign;
    @ApiModelProperty("工序步骤")
    @TableField("process_step")
    private Integer processStep;
    @ApiModelProperty("工序排序")
    @TableField("process_sort")
    private Integer processSort;
    @ApiModelProperty("可接收数量")
    @TableField("can_receive_number")
    private BigDecimal canReceiveNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldCanReceiveNumber;
    @ApiModelProperty("已接收数量|已经委外发出数量")
    @TableField("received_number")
    private BigDecimal receivedNumber;
    @ApiModelProperty("报工数量|已经委外接收数量")
    @TableField("report_number")
    private BigDecimal reportNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外发出数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已委外发出数量")
    @TableField(exist = false)
    private BigDecimal alreadySourcingOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("剩余委外发出数量")
    @TableField(exist = false)
    private BigDecimal surplusOutsourcingOutNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可委外接收数量")
    @TableField(exist = false)
    private BigDecimal canOutsourcingInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已委外发出数量")
    @TableField(exist = false)
    private BigDecimal alreadySourcingInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("剩余委外接收数量")
    @TableField(exist = false)
    private BigDecimal surplusOutsourcingInNumber;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer orderStatus;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String produceDetailId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String produceOrderCode;
    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("已经委外发出数量(计价单位)")
    @TableField("already_outsourcing_pricing_number")
    private BigDecimal alreadyOutsourcingPricingNumber;
    @ApiModelProperty("委外发出占用数量")
    @TableField("occupy_outsourcing_number")
    private BigDecimal occupyOutsourcingNumber;
    @ApiModelProperty("已经委外接收数量(计价单位)")
    @TableField("already_outsourcing_in_pricing_number")
    private BigDecimal alreadyOutsourcingInPricingNumber;
    @ApiModelProperty("委外接收占用数量")
    @TableField("occupy_outsourcing_in_number")
    private BigDecimal occupyOutsourcingInNumber;
    @ApiModelProperty("委外接收占用数量(计价单位)")
    @TableField("occupy_outsourcing_in_pricing_number")
    private BigDecimal occupyOutsourcingInPricingNumber;

    @ApiModelProperty("启用WIP库存(YN)")
    @TableField("wip_inventory")
    private String wipInventory;
    @ApiModelProperty("WIP仓库ID")
    @TableField("wip_store_id")
    private String wipStoreId;
    @ApiModelProperty("WIP仓库名称")
    @TableField("wip_store_name")
    private String wipStoreName;
    @ApiModelProperty("WIP物料ID")
    @TableField("wip_material_id")
    private String wipMaterialId;
    @ApiModelProperty("WIP物料名称")
    @TableField("wip_material_name")
    private String wipMaterialName;

    @ApiModelProperty(value = "被返修工序计划明细主键", hidden = true)
    @TableField("repaired_plan_detail_id")
    private String repairedPlanDetailId;

    @ApiModelProperty("上一工序(计划明细主键)")
    @TableField("pre_process_plan_detail_id")
    private String preProcessPlanDetailId;
    @TableField("pre_id_copy")
    private String preIdCopy;
    @ApiModelProperty("下一工序(计划明细主键)")
    @TableField("next_process_plan_detail_id")
    private String nextProcessPlanDetailId;
    @TableField("next_id_copy")
    private String nextIdCopy;

    @TableField("process_sign_copy")
    private String processSignCopy;


    @ApiModelProperty("实际完成时间(报工创建工序汇报单最新的创建时间)")
    @TableField("actual_complete_time")
    private LocalDateTime actualCompleteTime;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyActualCompleteTime;

    @ApiModelProperty("关闭时间")
    @TableField("close_time")
    private LocalDateTime closeTime;

    @TableField(exist = false)
    private String materialId;
    @TableField(exist = false)
    private String produceOrderDetailId;

    //试压工单订单号 行号 （销售订单单号 明细行号）
    @TableField(exist = false)
    private String saleOrderCode;
    @TableField(exist = false)
    private String lineNumber;
    @TableField(exist = false)
    private String dispatchId;

    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @TableField(exist = false)
    private BigDecimal splitNumber;

    @TableField(exist = false)
    private String currentOrderCategoryId;
    @TableField(exist = false)
    private String isMateialDemand;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准产能(只有物料类型的工艺路线有该属性，小数位取物料的生产单位精度)")
    @TableField("standard_capacity")
    private BigDecimal standardCapacity;
    /**
     * @see com.lets.platform.model.base.enums.StandardCapacityUnitEnum
     */
    @ApiModelProperty("标准产能单位")
    @TableField("standard_capacity_unit")
    private String standardCapacityUnit;
    @TableField(exist = false)
    private String standardCapacityUnitName;

    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField("series")
    private Integer series;

    @ApiModelProperty("启用汇报顺序控制[0:否,1:是]")
    @TableField("report_orderly")
    private Integer reportOrderly;

    @ApiModelProperty("拆分源明细id(拆分过后新增工序得原拆分明细和它本身得上一个明细相同；插入得工序和他下一个明细相同)")
    @TableField("source_split_detail_id")
    private String sourceSplitDetailId;

    @TableField(exist = false)
    private List<MesProcessPlanDetail> sameLevel;

    @TableField(exist = false)
    private BigDecimal outTransferdNumber;

    @ApiModelProperty("最后一次汇报单审核时间")
    @TableField("can_scan_complete")
    private LocalDateTime canScanComplete;
    @ApiModelProperty("清空最后一次汇报单审核时间")
    @TableField(exist = false)
    private Boolean emptyCanScanComplete;

    @ApiModelProperty("源工序计划明细Id(返修计划)")
    @TableField("source_process_plan_detail_id")
    private String sourceProcessPlanDetailId;
    @TableField("source_process_plan_id")
    private String sourceProcessPlanId;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.OutsourcingInModeEnum
     */
    @ApiModelProperty("委外接收模式[0:汇总接收,1:按单接收]")
    @TableField("outsourcing_in_mode")
    private String outsourcingInMode;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工时单价")
    @TableField("hour_price")
    private BigDecimal hourPrice;

    @ApiModelProperty("是否工序首检[0:否,1:是]")
    @TableField("first_inspection")
    private Integer firstInspection;

    @ApiModelProperty("首检数量(制程工序计划)")
    @TableField("first_inspection_number")
    private BigDecimal firstInspectionNumber;

    /**
     * @see com.lets.platform.model.mes.enums.FirstCheckStatusEnum
     */
    @ApiModelProperty("首检状态[1:未首检,3:已首检]")
    @TableField("first_inspection_status")
    private String firstInspectionStatus;
    @TableField(exist = false)
    private String firstInspectionStatusName;

    @ApiModelProperty(hidden = true, value = "生产物料主键")
    @TableField(exist = false)
    private String produceMaterialId;
    @ApiModelProperty(hidden = true, value = "生产物料分组主键")
    @TableField(exist = false)
    private String produceMaterialGroupId;


    @TableField(exist = false)
    private LocalDateTime receiveStartTime;
    @TableField(exist = false)
    private LocalDateTime receiveEndTime;

    @TableField(exist = false)
    private LocalDateTime reportStartTime;

    @TableField(exist = false)
    private String deviceId;
    @TableField(exist = false)
    private String deviceCode;
    @TableField(exist = false)
    private String deviceName;
    @TableField(exist = false)
    private String operatorId;
    @TableField(exist = false)
    private String operatorName;
    @TableField(exist = false)
    private String teamId;
    @TableField(exist = false)
    private String teamName;

    @ApiModelProperty("委外提前期")
    @TableField(exist = false)
    private Long outSourceAdvanceDay;

    public BigDecimal richNumberNotNull() {
        if (Objects.isNull(richNumber)) {
            return BigDecimal.ZERO;
        } else {
            return richNumber;
        }
    }

    public BigDecimal rollInNumberNotNull() {
        if (Objects.isNull(rollInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return rollInNumber;
        }
    }

    public BigDecimal rollOutNumberNotNull() {
        if (Objects.isNull(rollOutNumber)) {
            return BigDecimal.ZERO;
        } else {
            return rollOutNumber;
        }
    }

    public BigDecimal alreadyDispatchNumberNotNull() {
        if (Objects.isNull(alreadyDispatchNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyDispatchNumber;
        }
    }

    public BigDecimal canReceiveNumberNotNull() {
        if (Objects.isNull(canReceiveNumber)) {
            return BigDecimal.ZERO;
        } else {
            return canReceiveNumber;
        }
    }

    public BigDecimal receivedNumberNotNull() {
        if (Objects.isNull(receivedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return receivedNumber;
        }
    }

    public BigDecimal reportNumberNotNull() {
        if (Objects.isNull(reportNumber)) {
            return BigDecimal.ZERO;
        } else {
            return reportNumber;
        }
    }

    public Integer maxSerialNoNotNull() {
        if (Objects.isNull(maxSerialNo)) {
            return GlobalConstant.ZERO;
        } else {
            return maxSerialNo;
        }
    }

    public BigDecimal occupyOutsourcingNumberNotNull() {
        if (Objects.isNull(occupyOutsourcingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyOutsourcingNumber;
        }
    }

    public BigDecimal occupyOutsourcingInNumberNotNull() {
        if (Objects.isNull(occupyOutsourcingInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyOutsourcingInNumber;
        }
    }

    public BigDecimal alreadyOutsourcingPricingNumberNotNull() {
        if (Objects.isNull(alreadyOutsourcingPricingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyOutsourcingPricingNumber;
        }
    }

    public BigDecimal alreadyOutsourcingInPricingNumberNotNull() {
        if (Objects.isNull(alreadyOutsourcingInPricingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyOutsourcingInPricingNumber;
        }
    }

    public BigDecimal occupyOutsourcingInPricingNumberNotNull() {
        if (Objects.isNull(occupyOutsourcingInPricingNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyOutsourcingInPricingNumber;
        }
    }

    public BigDecimal giveInNumberNN() {
        if (Objects.isNull(giveInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return giveInNumber;
        }
    }

    public BigDecimal poorNumberNN() {
        if (Objects.isNull(poorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return poorNumber;
        }
    }

    public BigDecimal scrapNumberNN() {
        if (Objects.isNull(scrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return scrapNumber;
        }
    }

    public BigDecimal repairNumberNN() {
        if (Objects.isNull(repairNumber)) {
            return BigDecimal.ZERO;
        } else {
            return repairNumber;
        }
    }

    @JsonIgnore
    public Integer getProcessNoInt() {
        if (Objects.isNull(processNo)) {
            return Integer.MIN_VALUE;
        } else {
            return Integer.parseInt(processNo);
        }
    }

    @TableField(exist = false)
    private String groupSign;
    @ApiModelProperty("是否需要变红[YN]")
    @TableField(exist = false)
    private String firstRedProcess;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesProcessPlanDetail that = (MesProcessPlanDetail) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(processId, that.processId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orderId, processId);
    }
}
