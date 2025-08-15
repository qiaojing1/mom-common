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
 * 工作压力
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-01-17
 */
@Getter
@Setter
@TableName("coll_working_pressure")
@ApiModel(value = "CollWorkingPressure对象", description = "工作压力")
public class CollWorkingPressure extends BaseEntity {

    @ApiModelProperty("标准id")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;
    @ApiModelProperty("标准名称")
    @TableField(exist = false)
    @ExcelProperty("标准")
    private String standardName;

    @ApiModelProperty("材质分组id")
    @TableField("quality_id")
    @ExcelIgnore
    private String qualityId;
    @ApiModelProperty("材质分组名称")
    @TableField(exist = false)
    @ExcelProperty("材质分组")
    private String qualityName;

    @ApiModelProperty("压力CLASSid")
    @TableField("class_id")
    @ExcelIgnore
    private String classId;
    @ApiModelProperty("压力(CLASS)")
    @TableField(exist = false)
    @ExcelProperty("压力(CLASS)")
    private String className;

    @ApiModelProperty("压力PNid")
    @TableField("pn_id")
    @ExcelIgnore
    private String pnId;
    @ApiModelProperty("压力(PN)")
    @TableField(exist = false)
    @ExcelProperty("压力(PN)")
    private String pnName;

    @ApiModelProperty("工作压力")
    @TableField("working_pressure")
    @ExcelProperty("工作压力(MPa)")
    private String workingPressure;

    @ApiModelProperty("编码")
    @ExcelIgnore
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private int excelIndex;
}
