package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 保压时长
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-01-22
 */
@Getter
@Setter
@TableName("coll_holding_time")
@ApiModel(value = "CollHoldingTime对象", description = "保压时长")
public class CollHoldingTime extends BaseEntity {

    @ApiModelProperty("标准id")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;
    @ApiModelProperty("标准")
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ApiModelProperty("口径(DN)范围起始")
    @TableField("dn_range_start")
    @ExcelProperty("口径(DN)最小值")
    private String dnRangeStart;
    @ApiModelProperty("口径(DN)范围结束")
    @TableField("dn_range_end")
    @ExcelProperty("口径(DN)最大值")
    private String dnRangeEnd;
    @TableField(exist = false)
    @ExcelIgnore
    private String dnRange;

    @ApiModelProperty("口径(NPS)范围起始")
    @TableField("nps_range_start")
    @ExcelProperty("口径(NPS)最小值")
    private String npsRangeStart;
    @ApiModelProperty("口径(NPS)范围结束")
    @TableField("nps_range_end")
    @ExcelProperty("口径(NPS)最大值")
    private String npsRangeEnd;
    @TableField(exist = false)
    @ExcelIgnore
    private String npsRange;

    @ApiModelProperty("压力（Class）最小值")
    @TableField("pressure_class_start")
    @ExcelProperty("压力(CLASS)最小值")
    private String pressureClassStart;
    @ApiModelProperty("压力（Class）最大值")
    @TableField("pressure_class_end")
    @ExcelProperty("压力(CLASS)最大值")
    private String pressureClassEnd;
    @TableField(exist = false)
    @ExcelIgnore
    private String classRange;

    @ApiModelProperty("压力（PN）最小值")
    @TableField("pressure_pn_start")
    @ExcelProperty("压力(PN)最小值")
    private String pressurePnStart;
    @ApiModelProperty("压力（PN）最大值")
    @TableField("pressure_pn_end")
    @ExcelProperty("压力(PN)最大值")
    private String pressurePnEnd;
    @TableField(exist = false)
    @ExcelIgnore
    private String pnRange;


    @ApiModelProperty("阀门分类id")
    @ExcelIgnore
    @TableField("valve_classify_id")
    private String valveClassifyId;
    @ApiModelProperty("阀门分类")
    @TableField(exist = false)
    @ExcelProperty("阀门分类")
    private String valveClassifyName;

    @ApiModelProperty("试验项目id")
    @TableField("test_project_id")
    @ExcelIgnore
    private String testProjectId;
    @ApiModelProperty("试验项目")
    @TableField(exist = false)
    @ExcelProperty("试验项目")
    private String testProjectName;

    @ApiModelProperty("保压时长(s)")
    @TableField("holding_time")
    @ExcelProperty("保压时长(s)")
    private String holdingTime;

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
