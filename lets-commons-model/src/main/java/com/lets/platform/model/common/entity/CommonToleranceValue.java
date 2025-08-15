package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 容差值
 * </p>
 *
 * @author csy
 * @since 2024-05-11
 */
@Getter
@Setter
@TableName("common_tolerance_value")
@ApiModel(value = "CommonToleranceValue对象", description = "容差值")
public class CommonToleranceValue extends BaseEntity {

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("压力")
    @TableField("pressure")
    private String pressure;

    @ApiModelProperty("容差值")
    @TableField("value")
    private String value;

    @ApiModelProperty("最大波动率")
    @TableField(exist = false)
    private String waveRate;

    @ApiModelProperty("固定容差值")
    @TableField(exist = false)
    private String fixedTolerance;
}
