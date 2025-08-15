package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 设备负荷时长(天表)
 * @author DING WEI
 * @since 2025-04-30
 */
@Getter
@Setter
@TableName("tpm_repair_duration_device_load_day")
@ApiModel(value = "TpmRepairDurationDeviceLoadDay对象", description = "设备负荷时长(天表)")
public class TpmRepairDurationDeviceLoadDay extends BaseEntity {

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("资产编码")
    @TableField("assets_code")
    private String assetsCode;

    @ApiModelProperty("设备类型主键")
    @TableField("type_id")
    private String typeId;

    @ApiModelProperty("设备类型名称")
    @TableField("type_name")
    private String typeName;

    @ApiModelProperty("设备型号主键")
    @TableField("model_id")
    private String modelId;

    @ApiModelProperty("设备型号名称")
    @TableField("model_name")
    private String modelName;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("设备负荷时长")
    @TableField("device_load_duration")
    private BigDecimal deviceLoadDuration;

    @TableField(exist = false)
    private String groupFormat;
}
