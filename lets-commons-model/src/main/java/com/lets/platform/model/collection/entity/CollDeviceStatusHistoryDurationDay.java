package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 设备历史状态时长-天表
 * @author DING WEI
 * @since 2025-04-17
 */
@Getter
@Setter
@TableName("coll_device_status_history_duration_day")
@ApiModel(value = "CollDeviceStatusHistoryDurationDay对象", description = "设备历史状态时长-天表")
public class CollDeviceStatusHistoryDurationDay extends BaseEntity {

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("大类状态编码")
    @TableField("big_status_code")
    private String bigStatusCode;

    @ApiModelProperty("大类状态名称")
    @TableField("big_status_name")
    private String bigStatusName;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("持续时长(毫秒数)")
    @TableField("date_time")
    private Long dateTime;

    @ApiModelProperty("年月日格式化[如2022-05-25存储为20220525]")
    @TableField("time_format")
    private Integer timeFormat;
}
