package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 电时段配置方案-明细
 * @author DING WEI
 * @since 2025-01-22
 */
@Getter
@Setter
@TableName("coll_energy_power_period_detail")
@ApiModel(value = "CollEnergyPowerPeriodDetail对象", description = "电时段配置方案-明细")
public class CollEnergyPowerPeriodDetail extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("时段名称")
    @TableField("period_name")
    private String periodName;

    /**
     * @see com.lets.platform.model.collection.enums.PeriodTypeEnum
     */
    @ApiModelProperty("时段类型[1:尖峰时段,2:峰平谷时段]")
    @TableField("period_type")
    private String periodType;
    @TableField(exist = false)
    private String periodTypeName;

    @ApiModelProperty("执行月份")
    @TableField("period_month")
    private String periodMonth;
    @TableField(exist = false)
    private List<String> periodMonthList;

    @ApiModelProperty("时段")
    @TableField(exist = false)
    private List<CollEnergyPowerPeriodTime> timeList;
}
