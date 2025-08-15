package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 水气价格配置表-分段区间
 * @author DING WEI
 * @since 2024-12-30
 */
@Getter
@Setter
@TableName("coll_energy_water_gas_price_range")
@ApiModel(value = "CollEnergyWaterGasPriceRange对象", description = "水气价格配置表-分段区间")
public class CollEnergyWaterGasPriceRange extends BaseEntity {

    @ApiModelProperty("配置主键")
    @TableField("price_id")
    private String priceId;

    @ApiModelProperty("起始值(包含)")
    @TableField("start_value")
    private Long startValue;

    @ApiModelProperty("结束值(不包含)")
    @TableField("end_value")
    private Long endValue;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
}
