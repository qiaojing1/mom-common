package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;

/**
 * 能源计划
 * @author zhangweiyan
 * @since 2025-02-18
 */
@Getter
@Setter
@TableName("coll_energy_plan")
@ApiModel(value = "CollEnergyPlan对象", description = "能源计划")
public class CollEnergyPlan extends BaseEntity {

    @ApiModelProperty("计划日期(年份)")
    @TableField("plan_date")
    private String planDate;

    @ApiModelProperty("区域配置id")
    @TableField("regional_id")
    private String regionalId;

    @ApiModelProperty("区域配置名称")
    @TableField("regional_name")
    private String regionalName;

    /**
     * @see com.lets.platform.model.collection.enums.EnergyTypeEnum
     */
    @ApiModelProperty("能量类型 1:用电 3：用水 2：用气")
    @TableField("energy_type")
    private String energyType;
    @ApiModelProperty("能量类型 1:用电 3：用水 2：用气")
    @TableField(exist = false)
    private String energyTypeName;

    @ApiModelProperty("一月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_1")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "一月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "一月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "一月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "一月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage1;

    @ApiModelProperty("一月金额 单位为本位币")
    @TableField("amount_1")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "一月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "一月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "一月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "一月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount1;

    @ApiModelProperty("二月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_2")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "二月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "二月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "二月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "二月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage2;

    @ApiModelProperty("二月金额 单位为本位币")
    @TableField("amount_2")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "二月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "二月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "二月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "二月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount2;

    @ApiModelProperty("三月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_3")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "三月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "三月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "三月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "三月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage3;

    @ApiModelProperty("三月金额 单位为本位币")
    @TableField("amount_3")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "三月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "三月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "三月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "三月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount3;

    @ApiModelProperty("四月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_4")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "四月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "四月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "四月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "四月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage4;

    @ApiModelProperty("四月金额 单位为本位币")
    @TableField("amount_4")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "四月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "四月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "四月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "四月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount4;

    @ApiModelProperty("五月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_5")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "五月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "五月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "五月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "五月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage5;

    @ApiModelProperty("五月金额 单位为本位币")
    @TableField("amount_5")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "五月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "五月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "五月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "五月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount5;

    @ApiModelProperty("六月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_6")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "六月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "六月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "六月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "六月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage6;

    @ApiModelProperty("六月金额 单位为本位币")
    @TableField("amount_6")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "六月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "六月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "六月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "六月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount6;

    @ApiModelProperty("七月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_7")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "七月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "七月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "七月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "七月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage7;

    @ApiModelProperty("七月金额 单位为本位币")
    @TableField("amount_7")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "七月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "七月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "七月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "七月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount7;

    @ApiModelProperty("八月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_8")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "八月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "八月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "八月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "八月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage8;

    @ApiModelProperty("八月金额 单位为本位币")
    @TableField("amount_8")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "八月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "八月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "八月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "八月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount8;

    @ApiModelProperty("九月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_9")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "九月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "九月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "九月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "九月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage9;

    @ApiModelProperty("九月金额 单位为本位币")
    @TableField("amount_9")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "九月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "九月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "九月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "九月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount9;

    @ApiModelProperty("十月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_10")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "十月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "十月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "十月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "十月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage10;

    @ApiModelProperty("十月金额 单位为本位币")
    @TableField("amount_10")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "十月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "十月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "十月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "十月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount10;

    @ApiModelProperty("十一月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_11")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "十一月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "十一月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "十一月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "十一月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage11;

    @ApiModelProperty("十一月金额 单位为本位币")
    @TableField("amount_11")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "十一月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "十一月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "十一月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "十一月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount11;

    @ApiModelProperty("十二月用量 单位在能量类型为用电时为kWh 其他为m³")
    @TableField("dosage_12")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "十二月用量为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "十二月用量不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "十二月用量不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "十二月用量不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal dosage12;

    @ApiModelProperty("十二月金额 单位为本位币")
    @TableField("amount_12")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @Null(message = "十二月金额为空时不进行范围校验", groups = EmptyGroup.class)
//    @NotNull(message = "十二月金额不能为空", groups = NotEmptyGroup.class)
    @DecimalMin(value = "0.00", inclusive = true, message = "十二月金额不能小于 0.00", groups = NotEmptyGroup.class)
    @DecimalMax(value = "9999999999.99", inclusive = true, message = "十二月金额不能大于 9999999999.99", groups = NotEmptyGroup.class)
    private BigDecimal amount12;

    @ApiModelProperty("启用停用 0否 1是")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("启用停用 0否 1是")
    @TableField(exist = false)
    private String enableName;

    public interface EmptyGroup {};
    public interface NotEmptyGroup {};
}
