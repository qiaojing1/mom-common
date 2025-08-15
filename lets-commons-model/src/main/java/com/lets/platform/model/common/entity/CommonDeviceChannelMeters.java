package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 设备—通道-计量仪器
 * </p>
 *
 * @author csy
 * @since 2024-03-02
 */
@Getter
@Setter
@TableName("common_device_channel_meters")
@ApiModel(value = "CommonDeviceChannelMeters对象", description = "设备—通道-计量仪器")
public class CommonDeviceChannelMeters extends BaseEntity {

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("通道")
    @TableField("channel")
    private String channel;

    @ApiModelProperty("压力表id")
    @TableField("pressure_meter_number")
    private String pressureMeterNumber;
    @TableField(exist = false)
    private String pressureMeterCode;

    @ApiModelProperty("图标仪id")
    @TableField("icon_number")
    private String iconNumber;
    @TableField(exist = false)
    private String iconNumberCode;

    @ApiModelProperty("传感器id")
    @TableField("sensor_number")
    private String sensorNumber;
    @TableField(exist = false)
    private String sensorNumberCode;

    @ApiModelProperty("测温仪id")
    @TableField("temperature_number")
    private String temperatureNumber;
    @TableField(exist = false)
    private String temperatureNumberCode;
}
