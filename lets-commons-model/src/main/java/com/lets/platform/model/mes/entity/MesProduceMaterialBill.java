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
import java.util.Objects;

/**
 * 生产用料清单
 *
 * @author DING WEI
 * @since 2023-12-12
 */
@Getter
@Setter
@TableName("mes_produce_material_bill")
@ApiModel(value = "MesProduceMaterialBill对象", description = "生产用料清单")
public class MesProduceMaterialBill extends BaseEntity {

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("生产工单编码")
    @TableField("order_code")
    private String orderCode;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("生产工单单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;

    @ApiModelProperty("生产工单明细主键")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("生产工单-行号")
    @TableField("produce_line_number")
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-物料主键")
    @TableField("produce_material_id")
    private String produceMaterialId;
    @ApiModelProperty("生产工单-物料编码")
    @TableField("produce_material_code")
    private String produceMaterialCode;
    @ApiModelProperty("生产工单-物料名称")
    @TableField("produce_material_name")
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料规格型号")
    @TableField("produce_material_specs")
    private String produceMaterialSpecs;
    @ApiModelProperty("生产工单-物料特征属性")
    @TableField("produce_material_specific")
    private String produceMaterialSpecific;
    @ApiModelProperty("生产工单-生产单位")
    @TableField("produce_produce_unit_id")
    private String produceProduceUnitId;
    @ApiModelProperty("生产工单-生产单位名称")
    @TableField("produce_produce_unit_name")
    private String produceProduceUnitName;
    @ApiModelProperty("生产工单-生产单位精度")
    @TableField("produce_produce_unit_accuracy")
    private Integer produceProduceUnitAccuracy;
    @ApiModelProperty("生产工单-生产单位舍入方式")
    @TableField("produce_produce_unit_round_off_type")
    private Integer produceProduceUnitRoundOffType;

    @ApiModelProperty("生产工单-计划开始时间")
    @TableField("produce_plan_start_time")
    private LocalDateTime producePlanStartTime;
    @ApiModelProperty("生产工单-计划结束时间")
    @TableField("produce_plan_end_time")
    private LocalDateTime producePlanEndTime;
    @ApiModelProperty("BOM版本主键")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("版本号")
    @TableField(exist = false)
    private String bomVersion;
    @ApiModelProperty("BOM版本明细主键")
    @TableField("bom_detail_id")
    private String bomDetailId;

    @ApiModelProperty("子项行号")
    @TableField("sub_line_number")
    private Long subLineNumber;

    @ApiModelProperty("子项物料主键")
    @TableField("sub_material_id")
    private String subMaterialId;
    @ApiModelProperty("子项物料编码")
    @TableField("sub_material_code")
    private String subMaterialCode;
    @ApiModelProperty("子项物料名称")
    @TableField("sub_material_name")
    private String subMaterialName;
    @ApiModelProperty("子项物料规格型号")
    @TableField("sub_material_specs")
    private String subMaterialSpecs;

    @ApiModelProperty("子项单位")
    @TableField("sub_unit_id")
    private String subUnitId;
    @ApiModelProperty("子项单位名称")
    @TableField("sub_unit_name")
    private String subUnitName;
    @ApiModelProperty("子项单位精度")
    @TableField("sub_unit_accuracy")
    private Integer subUnitAccuracy;
    @ApiModelProperty("子项单位舍入方式")
    @TableField("sub_unit_round_off_type")
    private Integer subUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("需求数量")
    @TableField("demand_number")
    private BigDecimal demandNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可领用数量")
    @TableField("can_use_number")
    private BigDecimal canUseNumber;
    /**
     * @see com.lets.platform.model.psi.enums.ProductionOverTypeEnum
     */
    @ApiModelProperty("超发控制")
    @TableField("production_over_type")
    private Integer productionOverType;

    @ApiModelProperty("MRP数量")
    @TableField(exist = false)
    private BigDecimal mrpQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已锁定数量")
    @TableField("locked_number")
    private BigDecimal lockedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已领用数量")
    @TableField("used_number")
    private BigDecimal usedNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal writeBackNumber4Return;

    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField("dosage_type")
    private String dosageType;
    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private BigDecimal numeratorDosage;
    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private BigDecimal denominatorDosage;
    @ApiModelProperty("固定损耗")
    @TableField("fixed_loss")
    private BigDecimal fixedLoss;
    @ApiModelProperty("变动损耗率(%)")
    @TableField("change_loss_rate")
    private BigDecimal changeLossRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产工单-数量")
    @TableField(exist = false)
    private BigDecimal produceNumber;
    @ApiModelProperty("生产工单-报工数量")
    @TableField(exist = false)
    private BigDecimal produceReportNumber;

    @ApiModelProperty("默认发料仓库")
    @TableField(exist = false)
    private String productionIssueStoreId;
    @TableField(exist = false)
    private String productionIssueStoreName;
    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    @TableField(exist = false)
    private String productionIssueStoreEnableArea;
    @ApiModelProperty("默认发料库区")
    @TableField(exist = false)
    private String productionIssueAreaId;
    @TableField(exist = false)
    private String productionIssueAreaName;
    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    @TableField(exist = false)
    private String productionIssueAreaEnablePosition;
    @ApiModelProperty("默认发料库位")
    @TableField(exist = false)
    private String productionIssuePositionId;
    @TableField(exist = false)
    private String productionIssuePositionName;

    @ApiModelProperty("基本单位")
    @TableField(exist = false)
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitName;
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;

    /**
     * @see com.lets.platform.model.psi.enums.PickStrategyEnum
     */
    @ApiModelProperty("拣货策略")
    @TableField(exist = false)
    private String pickStrategy;
    @ApiModelProperty("批号控制方式")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号控制范围")
    @TableField(exist = false)
    private String lotNoScope;

    @ApiModelProperty("明细编码")
    @TableField(exist = false)
    private String detailCode;

    @ApiModelProperty("单据类别ID")
    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("MRP已计算数量")
    @TableField("mrp_calculated_quantity")
    private BigDecimal mrpCalculatedQuantity;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    public BigDecimal canUseNumberNotNull() {
        if (Objects.isNull(canUseNumber)) {
            return BigDecimal.ZERO;
        } else {
            return canUseNumber;
        }
    }

    public BigDecimal demandNumberNotNull() {
        if (Objects.isNull(demandNumber)) {
            return BigDecimal.ZERO;
        } else {
            return demandNumber;
        }
    }
    public BigDecimal lockedNumberNotNull() {
        if (Objects.isNull(lockedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return lockedNumber;
        }
    }
}
