package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 报警分类关联报警码配置表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-02
 */
@Getter
@Setter
@TableName("coll_alarm_classify_warn_code")
@ApiModel(value = "CollAlarmClassifyWarnCode对象", description = "报警分类关联报警码配置表")
public class CollAlarmClassifyWarnCode extends BaseEntity {

    @ApiModelProperty("报警分类id")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("父编码")
    @TableField(exist = false)
    @ExcelProperty("报警分类编码")
    private String parentCode;

    @ApiModelProperty("报警码id")
    @TableField("warn_code_id")
    @ExcelIgnore
    private String warnCodeId;

    @ApiModelProperty("设备类型id")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceTypeId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备类型")
    private String deviceTypeName;

    @ApiModelProperty("设备型号id")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceModelId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备型号")
    private String deviceModelName;

    @ApiModelProperty("设备控制器id")
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceControllerId;
    @TableField(exist = false)
    @ExcelProperty(value = "设备控制器")
    private String deviceControllerName;

    @ApiModelProperty("报警码")
    @TableField("warn_code")
    @ExcelProperty("报警码")
    private String warnCode;

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private Integer excelIndex;
}
