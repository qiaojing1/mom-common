package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.interfaces.ProductionParamInterface;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * 工序汇报单-明细
 *
 * @author DING WEI
 * @since 2024-01-02
 */
@Getter
@Setter
@TableName("mes_process_report_detail")
@ApiModel(value = "MesProcessReportDetail对象", description = "工序汇报单-明细")
public class MesProcessReportDetail extends BaseEntity implements ProductionParamInterface {

    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private Integer orderStatus;
    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;
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
    @ApiModelProperty("生产工单-批号")
    @TableField("produce_batch_number")
    private String produceBatchNumber;
    @ApiModelProperty("工序任务-派工主键")
    @TableField("dispatch_id")
    private String dispatchId;
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
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;
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
    @ApiModelProperty("工序类型")
    @TableField("process_type")
    private String processType;
    @TableField(exist = false)
    private String processTypeName;
    @ApiModelProperty("工序组主键")
    @TableField("process_group_id")
    private String processGroupId;
    @ApiModelProperty("工序组名称")
    @TableField("process_group_name")
    private String processGroupName;
    @ApiModelProperty("工序单位主键")
    @TableField("process_unit_id")
    private String processUnitId;
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
    @ApiModelProperty("完工数量")
    @TableField("finish_work_number")
    private BigDecimal finishWorkNumber;
    @ApiModelProperty("工序检验[0:否;1:是]")
    @TableField("process_inspect")
    private Integer processInspect;
    @TableField(exist = false)
    private String processInspectName;
    /**
     * @see com.lets.platform.model.common.enums.InspectionTypeEnum
     */
    @ApiModelProperty("检验类型[1自检,2PQC]")
    @TableField("inspect_type")
    private String inspectType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工数量=合格+报废+返修+不良")
    @TableField("report_number")
    private BigDecimal reportNumber;
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
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldRepairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField("poor_number")
    private BigDecimal poorNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldPoorNumber;
    @ApiModelProperty("班次主键")
    @TableField("shift_id")
    private String shiftId;
    @ApiModelProperty("班次名称")
    @TableField("shift_name")
    private String shiftName;
    @ApiModelProperty("班组主键")
    @TableField("teams_id")
    private String teamsId;
    @ApiModelProperty("班组名称")
    @TableField("teams_name")
    private String teamsName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计件工资")
    @TableField("work_price")
    private BigDecimal workPrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工时单价")
    @TableField("hour_price")
    private BigDecimal hourPrice;
    @TableField(exist = false)
    private BigDecimal totalPrice;
    @TableField(exist = false)
    private Boolean enableSingleWage;
    @ApiModelProperty("是否计件")
    @TableField("is_single_wage")
    private String isSingleWage;
    @TableField(exist = false)
    private String isSingleWageName;
    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;
    @ApiModelProperty("操作工主键")
    @TableField("operator_id")
    private String operatorId;
    @ApiModelProperty("操作工名称")
    @TableField("operator_name")
    private String operatorName;
    @ApiModelProperty("工时(min)")
    @TableField("standard_time")
    private Long standardTime;
    @ApiModelProperty("源单类型[1：工序计划单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单主键(工序计划单-主键)")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单编码(工序计划单-编码)")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键(工序计划单-明细-主键)")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;
    @ApiModelProperty("源单行号(工序计划工序号)")
    @TableField("source_line_number")
    private String sourceLineNumber;
    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @ApiModelProperty("已质检数量")
    @TableField("already_inspect_number")
    private BigDecimal alreadyInspectNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldAlreadyInspectNumber;
    @ApiModelProperty("质检占用数量")
    @TableField("occupy_inspect_number")
    private BigDecimal occupyInspectNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldOccupyInspectNumber;
    @ApiModelProperty("可入库报废数量")
    @TableField("can_stock_in_scrap_number")
    private BigDecimal canStockInScrapNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldCanStockInScrapNumber;
    @TableField("already_stock_in_scrap_number")
    private BigDecimal alreadyStockInScrapNumber;
    @TableField(exist = false)
    private BigDecimal oldAlreadyStockInScrapNumber;
    @TableField("occupy_stock_in_scrap_number")
    private BigDecimal occupyStockInScrapNumber;
    @TableField(exist = false)
    private BigDecimal oldOccupyStockInScrapNumber;
    @ApiModelProperty("可入库不良数量")
    @TableField("can_stock_in_poor_number")
    private BigDecimal canStockInPoorNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal oldCanStockInPoorNumber;
    @TableField("already_stock_in_poor_number")
    private BigDecimal alreadyStockInPoorNumber;
    @TableField(exist = false)
    private BigDecimal oldAlreadyStockInPoorNumber;
    @TableField("occupy_stock_in_poor_number")
    private BigDecimal occupyStockInPoorNumber;
    @TableField(exist = false)
    private BigDecimal oldOccupyStockInPoorNumber;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private List<MesProductionParam> productionParamList;

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

    @ApiModelProperty("工单报工单主键")
    @TableField("produce_report_id")
    private String produceReportId;

    public BigDecimal alreadyStockInScrapNumberNN() {
        if (Objects.isNull(alreadyStockInScrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyStockInScrapNumber;
        }
    }

    public BigDecimal occupyStockInScrapNumberNN() {
        if (Objects.isNull(occupyStockInScrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyStockInScrapNumber;
        }
    }

    public BigDecimal canStockInScrapNumberNN() {
        if (Objects.isNull(canStockInScrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return canStockInScrapNumber;
        }
    }

    public BigDecimal canStockInPoorNumberNN() {
        if (Objects.isNull(canStockInPoorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return canStockInPoorNumber;
        }
    }

    public BigDecimal alreadyStockInPoorNumberNN() {
        if (Objects.isNull(alreadyStockInPoorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyStockInPoorNumber;
        }
    }

    public BigDecimal occupyStockInPoorNumberNN() {
        if (Objects.isNull(occupyStockInPoorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyStockInPoorNumber;
        }
    }

    public BigDecimal alreadyInspectNumberNN() {
        if (Objects.isNull(alreadyInspectNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyInspectNumber;
        }
    }

    public BigDecimal occupyInspectNumberNN() {
        if (Objects.isNull(occupyInspectNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyInspectNumber;
        }
    }

    public BigDecimal reportNumberNotNull() {
        if (Objects.isNull(reportNumber)) {
            return BigDecimal.ZERO;
        } else {
            return reportNumber;
        }
    }

    public BigDecimal richNumberNotNull() {
        if (Objects.isNull(richNumber)) {
            return BigDecimal.ZERO;
        } else {
            return richNumber;
        }
    }

    public BigDecimal repairNumberNotNull() {
        if (Objects.isNull(repairNumber)) {
            return BigDecimal.ZERO;
        } else {
            return repairNumber;
        }
    }

    public BigDecimal poorNumberNotNull() {
        if (Objects.isNull(poorNumber)) {
            return BigDecimal.ZERO;
        } else {
            return poorNumber;
        }
    }

    public BigDecimal scrapNumberNotNull() {
        if (Objects.isNull(scrapNumber)) {
            return BigDecimal.ZERO;
        } else {
            return scrapNumber;
        }
    }

    @TableField(exist = false)
    private String orderCategoryId;

    @Override
    public String getOrderDetailId() {
        return getId();
    }

    @Override
    public String getCustomerId() {
        return sourceOrderCustomerId;
    }

    @TableField(exist = false)
    private MesProductionArchiveScheme productionArchiveScheme;
}
