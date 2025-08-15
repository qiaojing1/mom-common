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
 * 产线设备配置
 * </p>
 *
 * @author qiao jing
 * @since 2025-04-02
 */
@Getter
@Setter
@TableName("common_production_unit_device_conf")
@ApiModel(value = "CommonProductionUnitDeviceConf对象", description = "产线设备配置")
public class CommonProductionUnitDeviceConf extends BaseEntity {

    @ApiModelProperty("产线id")
    @TableField("production_unit_id")
    private String productionUnitId;

    @ApiModelProperty("x轴")
    @TableField("x_axis")
    private String x;

    @ApiModelProperty("y轴")
    @TableField("y_axis")
    private String y;

    @ApiModelProperty("宽")
    @TableField("width")
    private String width;

    @ApiModelProperty("高")
    @TableField("height")
    private String height;

    @ApiModelProperty("设备id")
    @TableField(exist = false)
    private String deviceId;
    @TableField(exist = false)
    private String typeClassify;
    @ApiModelProperty("设备状态")
    @TableField(exist = false)
    private String statusCode;
    @ApiModelProperty("设备状态-名称")
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty("状态颜色")
    @TableField(exist = false)
    private String statusColor;
}
