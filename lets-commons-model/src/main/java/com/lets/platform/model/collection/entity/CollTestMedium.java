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
 * 试验介质
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-01-16
 */
@Getter
@Setter
@TableName("coll_test_medium")
@ApiModel(value = "CollTestMedium对象", description = "试验介质")
public class CollTestMedium extends BaseEntity {

    @ApiModelProperty("标准id")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;
    @ApiModelProperty("标准名称")
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ApiModelProperty("工况id")
    @TableField("condition_id")
    @ExcelIgnore
    private String conditionId;
    @ApiModelProperty("工况名称")
    @TableField(exist = false)
    @ExcelProperty("工况")
    private String conditionName;

    @ApiModelProperty("试验项目id")
    @TableField("project_id")
    @ExcelIgnore
    private String projectId;
    @ApiModelProperty("试验项目名称")
    @TableField(exist = false)
    @ExcelProperty("试验项目")
    private String projectName;

    @ApiModelProperty("介质id")
    @TableField("media_id")
    @ExcelIgnore
    private String mediaId;
    @ApiModelProperty("介质名称")
    @TableField(exist = false)
    @ExcelProperty("介质")
    private String mediaName;

    @ApiModelProperty("介质类型")
    @TableField("media_type")
    @ExcelIgnore
    private String mediaType;
    @ApiModelProperty("介质类型名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String mediaTypeName;

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelIgnore
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    private String leakageUnitId;

    @TableField(exist = false)
    @ExcelIgnore
    private String leakageUnit;

    @TableField(exist = false)
    @ExcelIgnore
    private int excelIndex;
}
