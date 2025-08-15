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
 * 设备-数据配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-10
 */
@Getter
@Setter
@TableName("common_device_data_setting")
@ApiModel(value = "CommonDeviceDataSetting对象", description = "设备-数据配置")
public class CommonDeviceDataSetting extends BaseEntity {

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备生产单元id")
    @TableField("device_factory_mode_id")
    private String deviceFactoryModeId;

    @ApiModelProperty("页签名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("数据来源 1：大屏配置工具 2：报表工作台")
    @TableField("source")
    private String source;

    @ApiModelProperty("数据来源 1：大屏配置工具 2：报表工作台")
    @TableField(exist = false)
    private String sourceName;

    @ApiModelProperty("url")
    @TableField("url")
    private String url;
}
