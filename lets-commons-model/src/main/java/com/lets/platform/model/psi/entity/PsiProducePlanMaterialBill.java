package com.lets.platform.model.psi.entity;

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
 * 计划用料清单
 *
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_material_bill")
@ApiModel(value = "PsiProducePlanMaterialBill对象", description = "计划用料清单")
public class PsiProducePlanMaterialBill extends BaseEntity {

    @ApiModelProperty("计划订单-主键")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty("计划订单-编码")
    @TableField("order_code")
    private String orderCode;
    @ApiModelProperty("计划订单-单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;
    @ApiModelProperty("计划订单-明细主键")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("计划订单单-据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("计划订单-单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("计划订单-物料主键")
    @TableField("plan_material_id")
    private String planMaterialId;
    @ApiModelProperty("计划订单-物料编码")
    @TableField("plan_material_code")
    private String planMaterialCode;
    @ApiModelProperty("计划订单-物料名称")
    @TableField("plan_material_name")
    private String planMaterialName;
    @ApiModelProperty("计划订单-物料规格型号")
    @TableField("plan_material_specs")
    private String planMaterialSpecs;
    @ApiModelProperty("计划订单-物料特征属性")
    @TableField("plan_material_specific")
    private String planMaterialSpecific;

    @ApiModelProperty("计划订单-单位主键")
    @TableField("plan_unit_id")
    private String planUnitId;
    @ApiModelProperty("计划订单-单位名称")
    @TableField("plan_unit_name")
    private String planUnitName;
    @ApiModelProperty("计划订单-单位精度")
    @TableField("plan_unit_accuracy")
    private Integer planUnitAccuracy;
    @ApiModelProperty("计划订单-单位舍入方式")
    @TableField("plan_unit_round_off_type")
    private Integer planUnitRoundOffType;

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

    @ApiModelProperty("MRP数量")
    @TableField(exist = false)
    private BigDecimal mrpQuantity;

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

    @ApiModelProperty("计划订单-计划开始时间")
    @TableField("produce_plan_start_time")
    private LocalDateTime producePlanStartTime;
    @ApiModelProperty("计划订单-计划结束时间")
    @TableField("produce_plan_end_time")
    private LocalDateTime producePlanEndTime;

    @ApiModelProperty("BOM版本主键")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("BOM明细主键")
    @TableField("bom_detail_id")
    private String bomDetailId;
    @ApiModelProperty("BOM版本")
    @TableField(exist = false)
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划数量")
    @TableField(exist = false)
    private BigDecimal planNumber;
    @TableField(exist = false)
    private String planFactoryModeId;
    @TableField(exist = false)
    private String planFactoryModeName;
    @TableField(exist = false)
    private String planBomId;
    @TableField(exist = false)
    private String planBomVersion;

    @ApiModelProperty("MRP计算状态")
    @TableField(exist = false)
    private String mrpCalculateStatus;

    @ApiModelProperty("MRP计算状态")
    @TableField(exist = false)
    private String mrpCalculateStatusName;

    @ApiModelProperty("MRP已计算数量")
    @TableField("mrp_calculated_quantity")
    private BigDecimal mrpCalculatedQuantity;

    @ApiModelProperty("明细编码")
    @TableField(exist = false)
    private String detailCode;
}
