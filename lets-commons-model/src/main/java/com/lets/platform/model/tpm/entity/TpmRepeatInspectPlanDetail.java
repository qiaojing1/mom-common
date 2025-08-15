package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

/**
 * 复检计划-明细
 * @author DING WEI
 * @since 2025-07-14
 */
@Getter
@Setter
@TableName("tpm_repeat_inspect_plan_detail")
@ApiModel(value = "TpmRepeatInspectPlanDetail对象", description = "复检计划-明细")
public class TpmRepeatInspectPlanDetail extends BaseEntity {

    @ApiModelProperty("计划主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元编码")
    @TableField("factory_mode_code")
    private String factoryModeCode;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("设备类型主键")
    @TableField("device_type_id")
    private String deviceTypeId;
    @ApiModelProperty("设备类型名称")
    @TableField("device_type_name")
    private String deviceTypeName;

    @ApiModelProperty("设备型号主键")
    @TableField("device_mode_id")
    private String deviceModeId;
    @ApiModelProperty("设备型号名称")
    @TableField("device_mode_name")
    private String deviceModeName;

    @ApiModelProperty("设备等级")
    @TableField("device_level")
    private String deviceLevel;

    @ApiModelProperty(value = "点检已复检次数", hidden = true)
    @TableField("spot_inspect_times")
    private Integer spotInspectTimes;
    @ApiModelProperty(value = "上次点检复检时间", hidden = true)
    @TableField("spot_inspect_time")
    private LocalDateTime spotInspectTime;
    @ApiModelProperty(value = "保养已复检次数", hidden = true)
    @TableField("main_inspect_times")
    private Integer mainInspectTimes;
    @ApiModelProperty(value = "保养已复检次数", hidden = true)
    @TableField("main_inspect_time")
    private LocalDateTime mainInspectTime;

    public String getRelationId() {
        if (StringUtils.isNotBlank(deviceId)) {
            return deviceId;
        } else {
            return factoryModeId;
        }
    }

    public String getRelationName() {
        if (StringUtils.isNotBlank(deviceName)) {
            return deviceName;
        } else {
            return factoryModeName;
        }
    }

}
