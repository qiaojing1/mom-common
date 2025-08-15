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
import java.util.Objects;

/**
 * 派工单-操作记录-明细
 *
 * @author DING WEI
 * @since 2024-01-22
 */
@Getter
@Setter
@TableName("mes_dispatch_operate_record_detail")
@ApiModel(value = "MesDispatchOperateRecordDetail对象", description = "派工单-操作记录-明细")
public class MesDispatchOperateRecordDetail extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    /**
     * @see com.lets.platform.model.mes.enums.processPlan.MaterialPrepareTypeEnum
     */
    @ApiModelProperty("类型[1:主物料(派工单中的物料),2:工艺路线中的物料]")
    @TableField("type")
    private String type;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("操作数量(接收|报工数量)")
    @TableField("number")
    private BigDecimal number;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("rich_number")
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报废数量")
    @TableField("scrap_number")
    private BigDecimal scrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField("repair_number")
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField("poor_number")
    private BigDecimal poorNumber;
    @ApiModelProperty("转移到下工序的数量")
    @TableField("move_next_process_number")
    private BigDecimal moveToNextProcessNumber;
    @ApiModelProperty("超产数量异动")
    @TableField("process_over_produce_number")
    private BigDecimal processOverProduceNumber;


    @TableField("work_price")
    private BigDecimal workPrice;
    @TableField(exist = false)
    private BigDecimal totalPrice;
    @TableField("is_single_wage")
    private String isSingleWage;
    @TableField(exist = false)
    private Boolean enableSingleWage;

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

    @ApiModelProperty("接收之前的是否准备状态[YN]")
    @TableField("before_is_prepare")
    private String beforeIsPrepare;

    @ApiModelProperty("本次报工生成的工序汇报单明细主键")
    @TableField("process_report_detail_id")
    private String processReportDetailId;

    public BigDecimal numberNotNull() {
        if (Objects.isNull(number)) {
            return BigDecimal.ZERO;
        } else {
            return number;
        }
    }
}
