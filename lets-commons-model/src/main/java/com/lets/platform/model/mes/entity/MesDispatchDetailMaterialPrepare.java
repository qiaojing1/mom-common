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
 * 派工-明细-物料准备
 * @author DING WEI
 * @since 2024-01-11
 */
@Getter
@Setter
@TableName("mes_dispatch_detail_material_prepare")
@ApiModel(value = "MesDispatchDetailMaterialPrepare对象", description = "派工-明细-物料准备")
public class MesDispatchDetailMaterialPrepare extends BaseEntity {

    @ApiModelProperty("工序任务主键")
    @TableField("dispatch_id")
    private String dispatchId;

    @ApiModelProperty("生产工单主键")
    @TableField("produce_order_id")
    private String produceOrderId;

    @ApiModelProperty("生产工单明细主键")
    @TableField("produce_detail_id")
    private String produceDetailId;

    @ApiModelProperty("工序计划主键")
    @TableField("process_plan_id")
    private String processPlanId;

    @ApiModelProperty("工序计划明细主键")
    @TableField("process_plan_detail_id")
    private String processPlanDetailId;

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
    @ApiModelProperty("需求数量")
    @TableField("demand_number")
    private BigDecimal demandNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可接收数量")
    @TableField(exist = false)
    private BigDecimal canReceiveNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已接收数量")
    @TableField("received_number")
    private BigDecimal receivedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("接收数量")
    @TableField(exist = false)
    private BigDecimal receiveNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("上料数量")
    @TableField("feeding_number")
    private BigDecimal feedingNumber;

    @ApiModelProperty("是否准备")
    @TableField("is_prepare")
    private String isPrepare;

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

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转换系数")
    @TableField("convert_ratio")
    private BigDecimal convertRatio;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    public BigDecimal canReceiveNumberNotNull() {
        if (Objects.isNull(canReceiveNumber)) {
            return BigDecimal.ZERO;
        } else {
            return canReceiveNumber;
        }
    }
}
