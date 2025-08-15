package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.SolveTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 报警原因配置表
 * @author zhangweiyan
 * @since 2023-11-29
 */
@Getter
@Setter
@TableName("coll_alarm_reason")
@ApiModel(value = "CollAlarmReason对象", description = "报警原因配置表")
public class CollAlarmReason extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("设备类型id")
    @TableField("device_type_id")
    @ExcelIgnore
    private String deviceTypeId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备类型")
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField("device_model_id")
    @ExcelIgnore
    private String deviceModelId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备型号")
    private String deviceModelName;

    @ApiModelProperty("设备控制器id")
    @TableField("device_controller_id")
    @ExcelIgnore
    private String deviceControllerId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备控制器")
    private String deviceControllerName;

    @ApiModelProperty("报警码")
    @TableField("code")
    @NotBlank
    @Min(value = 1, message = "CommonAlarmReason.code")
    @Max(value = 20, message = "CommonAlarmReason.code")
    @ExcelProperty("报警码")
    private String code;

    /**
     * @see SolveTypeEnum
     */
    @ApiModelProperty("报警处理方式 1:维修 2:保养 3:不做处理")
    @TableField("solve_type")
    @ExcelIgnore
    private String solveType;
    @ApiModelProperty("报警处理方式 1:维修 2:保养 3:不做处理")
    @TableField(exist = false)
    @ExcelProperty("报警处理方式")
    private String solveTypeName;

    @ApiModelProperty("报警内容")
    @TableField("warn_reason")
    @NotBlank
    @Min(value = 1, message = "CommonAlarmReason.name")
    @Max(value = 20, message = "CommonAlarmReason.name")
    @ExcelProperty("报警内容")
    private String warnReason;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Integer rowIndex;
}
