package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 试验压力
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-01-18
 */
@Getter
@Setter
@TableName("coll_test_pressure")
@ApiModel(value = "CollTestPressure对象", description = "试验压力")
public class CollTestPressure extends BaseEntity {

    @ApiModelProperty("标准id")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;
    @ApiModelProperty("标准")
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ApiModelProperty("试验项目id")
    @TableField("test_project_id")
    @ExcelIgnore
    private String testProjectId;
    @ApiModelProperty("试验项目")
    @TableField(exist = false)
    @ExcelProperty("试验项目")
    private String testProjectName;

    @ApiModelProperty("介质分类 1:液体 2:气体")
    @TableField("media_type")
    @ExcelIgnore
    private String mediaType;
    @ApiModelProperty("介质分类")
    @TableField(exist = false)
    @ExcelProperty("介质分类")
    private String mediaTypeName;

    @ApiModelProperty("试验压力 乘法系数")
    @TableField("test_pressure_multiply")
    @ExcelProperty("试验压力系数")
    private String testPressureMultiply;

    @ApiModelProperty("试验压力 加法系数")
    @TableField("test_pressure_plus")
    @ExcelProperty("试验压力加数")
    private String testPressurePlus;

    @ApiModelProperty("试验压力 前端展示")
    @TableField(exist = false)
    @ExcelIgnore
    private String testPressureTotal;

    @ApiModelProperty("是否限制最大压力 Y是N否")
    @TableField("maximum_pressure_limited")
    @ExcelIgnore
    private String maximumPressureLimited;
    @ApiModelProperty("限制最大压力")
    @TableField(exist = false)
    @ExcelProperty("限制最大压力")
    private String maximumPressureLimitedName;

    @ApiModelProperty("是否超过最大压力判定为不合格 Y是N否")
    @TableField("exceed_max_pressure_unqualified")
    @ExcelIgnore
    private String exceedMaxPressureUnqualified;
    @ApiModelProperty("超过最大压力判定为不合格")
    @TableField(exist = false)
    @ExcelProperty("超过最大压力判定不合格")
    private String exceedMaxPressureUnqualifiedName;

    @ApiModelProperty("试验最大压力 乘法系数")
    @TableField("max_pressure_multiply")
    @ExcelProperty("试验最大压力系数")
    private String maxPressureMultiply;

    @ApiModelProperty("试验最大压力 加法系数")
    @TableField("max_pressure_plus")
    @ExcelProperty("试验最大压力加数")
    private String maxPressurePlus;

    @ApiModelProperty("试验最大压力 前端展示")
    @TableField(exist = false)
    @ExcelIgnore
    private String maxPressureTotal;

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelIgnore
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    private int excelIndex;
}
