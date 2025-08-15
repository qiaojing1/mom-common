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
 * 公式关联设备详情
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-14
 */
@Getter
@Setter
@TableName("common_formula_device")
@ApiModel(value = "CommonFormulaDevice对象", description = "公式关联设备详情")
public class CommonFormulaDevice extends BaseEntity {

    @ApiModelProperty("公式id")
    @TableField("formula_id")
    private String formulaId;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("设备类型")
    @TableField(exist = false)
    private String deviceTypeName;

    @ApiModelProperty("设备型号")
    @TableField(exist = false)
    private String deviceModelName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;
}
