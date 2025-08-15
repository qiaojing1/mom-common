package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.device.enums.DeviceAssetStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 设备实时状态表
 * @author DING WEI
 * @since 2023-11-27
 */
@Getter
@Setter
@TableName("coll_device_status_realtime")
@ApiModel(value = "CollDeviceStatusRealtime对象", description = "设备实时状态表")
public class CollDeviceStatusRealtime extends BaseEntity {

    /**
     * @see com.lets.platform.model.common.enums.CommonDeviceStatusEnum
     */
    @ApiModelProperty("大类状态编码")
    @TableField("big_status_code")
    private String bigStatusCode;

    @ApiModelProperty("大类状态名称")
    @TableField("big_status_name")
    private String bigStatusName;

    @ApiModelProperty("小类状态编码")
    @TableField("small_status_code")
    private String smallStatusCode;

    @ApiModelProperty("实时状态")
    @TableField("small_status_name")
    private String smallStatusName;

    @ApiModelProperty("颜色")
    @TableField(exist = false)
    private String color;

    @TableField(exist = false)
    @ApiModelProperty("设备名称")
    private String deviceName;

    @TableField(exist = false)
    @ApiModelProperty("设备类型")
    private String deviceTypeName;
    @TableField(exist = false)
    @ApiModelProperty("设备类型id")
    private String deviceTypeId;
    @ApiModelProperty("设备类型分类[1电表,2天然气表,3水表,4压缩空气表,5其他设备]")
    @TableField(exist = false)
    private String classify;

    /**
     * @see DeviceAssetStatusEnum
     */
    @ApiModelProperty("设备资产状态")
    @TableField(exist = false)
    private String assetStatus;
    @TableField(exist = false)
    private String assetStatusName;
    @ApiModelProperty("设备资产编码")
    @TableField(exist = false)
    private String assetCode;

    @TableField(exist = false)
    @ApiModelProperty("设备型号")
    private String deviceModelId;
    @TableField(exist = false)
    @ApiModelProperty("设备型号")
    private String deviceModelName;

    @TableField(exist = false)
    @ApiModelProperty("设备编码")
    private String deviceCode;

    @TableField(exist = false)
    @ApiModelProperty("生产单元")
    private String factoryModeId;
    @TableField(exist = false)
    @ApiModelProperty("生产单元")
    private String factoryModeName;

    @ApiModelProperty("设备主键,和主键id一样的")
    @TableField(exist = false)
    private String deviceId;
    @ApiModelProperty("状态原因主键")
    @TableField("status_reason_id")
    private String statusReasonId;
    @ApiModelProperty("状态原因编码")
    @TableField("status_reason_code")
    private String statusReasonCode;
    @ApiModelProperty("状态原因名称")
    @TableField("status_reason_name")
    private String statusReasonName;
}
