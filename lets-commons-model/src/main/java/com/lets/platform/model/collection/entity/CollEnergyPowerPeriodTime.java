package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

/**
 * 电时段配置-时间
 * @author DING WEI
 * @since 2024-12-30
 */
@Getter
@Setter
@TableName("coll_energy_power_period_time")
@ApiModel(value = "CollEnergyPowerPeriodTime对象", description = "电时段配置-时间")
public class CollEnergyPowerPeriodTime extends BaseEntity {

    @ApiModelProperty("配置主键")
    @TableField("period_id")
    private String periodId;

    @ApiModelProperty("主键")
    @TableField("order_id")
    private String orderId;

    /**
     * @see com.lets.platform.model.collection.enums.PowerSignEnum
     */
    @ApiModelProperty("时段类型[1:尖,2:峰,3:平,4:谷]")
    @TableField("type")
    private String type;

    @JsonFormat(pattern = "HH:mm:ss")
    @ApiModelProperty("开始时刻")
    @TableField("start_time")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm:ss")
    @ApiModelProperty("结束时刻")
    @TableField("end_time")
    private LocalTime endTime;
}
