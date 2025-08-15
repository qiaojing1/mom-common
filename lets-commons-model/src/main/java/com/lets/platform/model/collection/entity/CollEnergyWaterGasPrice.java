package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.BillingMethodEnum;
import com.lets.platform.model.collection.enums.EnergyTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * 水气价格配置表
 * @author DING WEI
 * @since 2024-12-30
 */
@Getter
@Setter
@TableName("coll_energy_water_gas_price")
@ApiModel(value = "CollEnergyWaterGasPrice对象", description = "水气价格配置表")
public class CollEnergyWaterGasPrice extends BaseEntity {

    @NotNull(message = "[生效时间]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("生效时间")
    @TableField("`year_month`")
    private Integer yearMonth;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ValidBigDecimal(message = "[基本费用]范围0.00-9999999999.99", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("基本费用")
    @TableField("basic_amount")
    private BigDecimal basicAmount;

    @ValidatedEnum(enumClass = EnergyTypeEnum.class, required = true, message = "[费用类型]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("费用类型[3:水,2:气]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ValidatedEnum(enumClass = BillingMethodEnum.class, required = true, message = "[计费方式]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("计费方式[1:均价计费,2:分段计费]")
    @TableField("billing_method")
    private String billingMethod;
    @TableField(exist = false)
    private String billingMethodName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("均价")
    @TableField("avg_price")
    private BigDecimal avgPrice;

    @ApiModelProperty("范围")
    @TableField(exist = false)
    private List<CollEnergyWaterGasPriceRange> details;
}
