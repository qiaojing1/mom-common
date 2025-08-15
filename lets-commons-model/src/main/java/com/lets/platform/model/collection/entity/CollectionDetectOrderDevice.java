package com.lets.platform.model.collection.entity;

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
 * 试压工单-设备
 * </p>
 *
 * @author csy
 * @since 2025-03-21
 */
@Getter
@Setter
@TableName("collection_detect_order_device")
@ApiModel(value = "CollectionDetectOrderDevice对象", description = "试压工单-设备")
public class CollectionDetectOrderDevice extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("设备")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("设备类型")
    @TableField("device_type_id")
    private String deviceTypeId;

    @ApiModelProperty("设备类型")
    @TableField("device_type_name")
    private String deviceTypeName;

    @ApiModelProperty("设备型号")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("设备型号")
    @TableField("device_model_name")
    private String deviceModelName;
}
