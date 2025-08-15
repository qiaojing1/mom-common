package com.lets.platform.model.mes.entity;

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
 * 程序档案刀具信息表
 * </p>
 *
 * @author FZY
 * @since 2024-02-22
 */
@Getter
@Setter
@TableName("mes_dnc_program_file_tool")
@ApiModel(value = "MesDncProgramFileTool对象", description = "程序档案刀具信息表")
public class MesDncProgramFileTool extends BaseEntity {

    @ApiModelProperty("行号")
    @TableField("line_number")
    @ExcelIgnore
    private Integer lineNumber;

    @ApiModelProperty("程序档案ID")
    @TableField("program_file_id")
    @ExcelIgnore
    private String programFileId;

    @ApiModelProperty("程序档案编码")
    @TableField(exist = false)
    @ExcelProperty(value = "程序档案编码", index = 0)
    private String programFileCode;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("刀具编码")
    @TableField("material_code")
    @ExcelProperty(value = "刀具编码", index = 1)
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    @ExcelIgnore
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelIgnore
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelIgnore
    private String materialSpecs;

    @ApiModelProperty("刀具号")
    @TableField("tool_number")
    @ExcelProperty(value = "刀具号", index = 2)
    private String toolNumber;

    @ApiModelProperty("刀具半径补号")
    @TableField("tool_radius_compensation_number")
    @ExcelProperty(value = "刀具半径补号", index = 3)
    private String toolRadiusCompensationNumber;

    @ApiModelProperty("刀具长度补号")
    @TableField("tool_length_compensation_number")
    @ExcelProperty(value = "刀具长度补号", index = 4)
    private String toolLengthCompensationNumber;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;
}
