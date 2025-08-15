package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * HMI配置关联设备信息
 * @author zhangweiyan
 * @since 2023-12-22
 */
@Getter
@Setter
@TableName("common_hmi_setting_devices")
@ApiModel(value = "CommonHmiSettingDevices对象", description = "HMI配置关联设备信息")
public class CommonHmiSettingDevices extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("HMI配置表头id")
    @TableField("setting_id")
    private String settingId;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备型号id")
    @TableField("device_model_id")
    private String deviceModelId;

    @ApiModelProperty("设备编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("设备名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("设备型号编码")
    @TableField("model_code")
    private String modelCode;

    @ApiModelProperty("设备型号名称")
    @TableField("model_name")
    private String modelName;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;
}