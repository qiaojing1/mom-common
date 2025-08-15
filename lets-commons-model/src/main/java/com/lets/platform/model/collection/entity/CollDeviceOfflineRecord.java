package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 设备异常掉线记录
 * @author DING WEI
 * @since 2023-11-27
 */
@Getter
@Setter
@TableName("coll_device_offline_record")
@ApiModel(value = "CollDeviceOfflineRecord对象", description = "设备异常掉线记录")
public class CollDeviceOfflineRecord extends BaseEntity {

    @ApiModelProperty("设备")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("持续时长")
    @TableField("datetime")
    private Long datetime;
    @TableField(exist = false)
    private BigDecimal datetimeMin;

    @ApiModelProperty("采集器异常类型[1网络异常,2采集器异常,3服务异常,4系统异常]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("采集器主键")
    @TableField("collector_id")
    private String collectorId;
    @ApiModelProperty("采集器编码")
    @TableField("collector_code")
    private String collectorCode;

    @ApiModelProperty("网关ID")
    @TableField("gateway_id")
    private String gatewayId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private LocalDateTime collectorTime;

    @ApiModelProperty("状态值")
    @TableField(exist = false)
    private String statusValue;

    @TableField(exist = false)
    private String factoryModeId;
    @TableField(exist = false)
    private String factoryModeName;
}
