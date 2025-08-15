package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 计算公式
 * @author DING WEI
 * @since 2023-10-30
 */
@Getter
@Setter
@TableName("common_device_formula")
@ApiModel(value = "CommonDeviceFormula对象", description = "计算公式")
public class CommonDeviceFormula extends BaseEntity {

    @ApiModelProperty("公式内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("设备ID列表")
    @TableField("device_id_list")
    private String deviceIdList;

    @ApiModelProperty("变量列表")
    @TableField("variable_list")
    private String variableList;

    @ApiModelProperty("公式列表")
    @TableField("formula_list")
    private String formulaList;

    @ApiModelProperty("页面展示HTML")
    @TableField("html")
    private String html;

    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;
}
