package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 工艺路线-明细-工序信息-加工设备
 * </p>
 *
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route_process_device")
@ApiModel(value = "CommonRouteProcessDevice对象", description = "工艺路线-明细-工序信息-加工设备")
public class CommonRouteProcessDevice extends BaseEntity {

    @ApiModelProperty("工艺路线主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @TableField("process_id")
    private String processId;

    @NotBlank(message = "CommonRouteProcessDevice.deviceId", groups = {Save.class, Update.class})
    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @NotBlank(message = "CommonRouteProcessDevice.deviceCode", groups = {Save.class, Update.class})
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @NotBlank(message = "CommonRouteProcessDevice.deviceName", groups = {Save.class, Update.class})
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;
    @NotBlank(message = "CommonRouteProcessDevice.deviceType", groups = {Save.class, Update.class})
    @ApiModelProperty("设备类型")
    @TableField("device_type_id")
    private String deviceTypeId;
    @NotBlank(message = "CommonRouteProcessDevice.deviceType", groups = {Save.class, Update.class})
    @ApiModelProperty("设备类型名称")
    @TableField("device_type_name")
    private String deviceTypeName;
    @NotBlank(message = "CommonRouteProcessDevice.deviceModel", groups = {Save.class, Update.class})
    @ApiModelProperty("设备型号")
    @TableField("device_model_id")
    private String deviceModelId;
    @NotBlank(message = "CommonRouteProcessDevice.deviceModel", groups = {Save.class, Update.class})
    @ApiModelProperty("设备型号名称")
    @TableField("device_model_name")
    private String deviceModelName;

    @TableField("standard_hour")
    private String standardHour;

    @TableField("hour_factor")
    private String hourFactor;

    @TableField(exist = false)
    private Integer processStep;
    @TableField(exist = false)
    private Integer processSort;

}
