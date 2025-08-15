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
 * 消息推送配置-设备
 * </p>
 *
 * @author csy
 * @since 2023-11-30
 */
@Getter
@Setter
@TableName("common_send_config_device")
@ApiModel(value = "CommonSendConfigDevice对象", description = "消息推送配置-设备")
public class CommonSendConfigDevice extends BaseEntity {

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("推送配置id")
    @TableField("config_id")
    private String configId;

    @TableField(exist = false)
    private String deviceCode;
    @TableField(exist = false)
    private String deviceName;
    @TableField(exist = false)
    private String deviceTypeName;
    @TableField(exist = false)
    private String deviceModelName;
    @TableField(exist = false)
    private String ruleId;
}
