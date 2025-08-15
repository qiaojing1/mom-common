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

/**
 * 生产工单-变更-明细
 * @author DING WEI
 * @since 2023-12-08
 */
@Getter
@Setter
@TableName("mes_produce_order_change_detail")
@ApiModel(value = "MesProduceOrderChangeDetail对象", description = "生产工单-变更-明细")
public class MesProduceOrderChangeDetail extends BaseEntity {

    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("变更方式[1修改]")
    @TableField("change_type")
    private String changeType;
    @TableField(exist = false)
    private String changeTypeName;

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
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecificName;
    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;
    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;
    @ApiModelProperty("日产量")
    @TableField("production_daily_output")
    private BigDecimal productionDailyOutput;

    @ApiModelProperty("产品类型[1主产品]")
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
    @ApiModelProperty("生产单位舍入方式")
    @TableField("produce_unit_round_off_type")
    private Integer produceUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("变更前数量")
    @TableField("before_number")
    private BigDecimal beforeNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("变更后数量")
    @TableField("after_number")
    private BigDecimal afterNumber;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("BOM版本")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("BOM版本")
    @TableField("bom_version")
    private String bomVersion;

    @ApiModelProperty("工艺路线")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺路线名称")
    @TableField("route_name")
    private String routeName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("计划开始时间")
    @TableField("plan_start_time")
    private LocalDateTime planStartTime;
    @TableField(exist = false)
    private String planStartTimeFormat;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("计划结束时间")
    @TableField("plan_end_time")
    private LocalDateTime planEndTime;
    @TableField(exist = false)
    private String planEndTimeFormat;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

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

    @ApiModelProperty("计划状态")
    @TableField("plan_status")
    private String planStatus;
    @TableField(exist = false)
    private String planStatusName;

    @ApiModelProperty("任务状态")
    @TableField("task_status")
    private String taskStatus;
    @TableField(exist = false)
    private String taskStatusName;

    @ApiModelProperty("业务状态")
    @TableField("business_status")
    private String businessStatus;
    @TableField(exist = false)
    private String businessStatusName;

    @ApiModelProperty("领料状态")
    @TableField("picking_status")
    private String pickingStatus;
    @TableField(exist = false)
    private String pickingStatusName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("未处理不良数量")
    @TableField("untreated_poor_number")
    private BigDecimal untreatedPoorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格品入库数量")
    @TableField("stock_in_rich_number")
    private BigDecimal stockInRichNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不合格品入库数量")
    @TableField("stock_in_poor_number")
    private BigDecimal stockInPoorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField("scrap_number")
    private BigDecimal scrapNumber;

    @ApiModelProperty("成品率")
    @TableField("yield_rate")
    private BigDecimal yieldRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("预计报废数量")
    @TableField("expect_scrap_number")
    private BigDecimal expectScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废入库数量")
    @TableField("stock_in_scrap_number")
    private BigDecimal stockInScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("待入库数量")
    @TableField("wait_stock_in_number")
    private BigDecimal waitStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工数量")
    @TableField("report_number")
    private BigDecimal reportNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步数量")
    @TableField("give_way_number")
    private BigDecimal giveWayNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返工数量")
    @TableField("rework_number")
    private BigDecimal reworkNumber;

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

    @ApiModelProperty("关闭时间")
    @TableField("close_time")
    private LocalDateTime closeTime;

    @ApiModelProperty("订单需求日期")
    @TableField("order_demand_time")
    private LocalDateTime orderDemandTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ApiModelProperty("源单单据主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单据编码")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Integer sourceLineNumber;
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
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
}
