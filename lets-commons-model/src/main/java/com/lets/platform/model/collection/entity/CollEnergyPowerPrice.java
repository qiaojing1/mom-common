package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.BillingMethodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 电价格配置表
 * @author DING WEI
 * @since 2024-12-30
 */
@Getter
@Setter
@TableName("coll_energy_power_price")
@ApiModel(value = "CollEnergyPowerPrice对象", description = "电价格配置表")
public class CollEnergyPowerPrice extends BaseEntity {

    @NotNull(message = "[生效时间]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("生效日期")
    @TableField("`year_month`")
    private Integer yearMonth;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("基本电费")
    @TableField("basic_amount")
    private BigDecimal basicAmount;

    @ValidatedEnum(enumClass = BillingMethodEnum.class, required = true, message = "[计费方式]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("计费方式[1:均价计费,2:分段计费]")
    @TableField("billing_method")
    private String billingMethod;
    @TableField(exist = false)
    private String billingMethodName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("尖电价")
    @TableField("tip_price")
    private BigDecimal tipPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("峰电价")
    @TableField("peak_price")
    private BigDecimal peakPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("平电价")
    @TableField("flat_price")
    private BigDecimal flatPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("谷电价")
    @TableField("vally_price")
    private BigDecimal vallyPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("均电价")
    @TableField("avg_price")
    private BigDecimal avgPrice;
}
