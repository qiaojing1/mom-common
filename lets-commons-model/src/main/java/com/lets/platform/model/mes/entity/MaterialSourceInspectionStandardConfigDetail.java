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
 * 物料来源检验标准配置明细表
 * </p>
 *
 * @author FZY
 * @since 2024-01-12
 */
@Getter
@Setter
@TableName("material_source_inspection_standard_config_detail")
@ApiModel(value = "MaterialSourceInspectionStandardConfigDetail对象", description = "物料来源检验标准配置明细表")
public class MaterialSourceInspectionStandardConfigDetail extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ExcelProperty(value = "标准编码", index = 0)
    @TableField(exist = false)
    private String parentCode;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty(value = "物料编码", index = 1)
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    @ExcelIgnore
    private String materialType;

    @ApiModelProperty("物料规格")
    @TableField("material_specs")
    @ExcelIgnore
    private String materialSpecs;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelIgnore
    private String materialName;

    @ApiModelProperty("检验方案ID")
    @TableField("inspect_plan_id")
    @ExcelIgnore
    private String inspectPlanId;

    @TableField(exist = false)
    @ExcelProperty(value = "检验方案编码", index = 2)
    private String inspectPlanCode;

    @ApiModelProperty("检验方案名称")
    @TableField("inspect_plan_name")
    @ExcelIgnore
    private String inspectPlanName;

    @ApiModelProperty("抽样方案ID")
    @TableField("sampling_plan_id")
    @ExcelIgnore
    private String samplingPlanId;

    @TableField(exist = false)
    @ExcelProperty(value = "抽样方案编码", index = 3)
    private String samplingPlanCode;

    @ApiModelProperty("抽样方案名称")
    @TableField("sampling_plan_name")
    @ExcelIgnore
    private String samplingPlanName;

    @ApiModelProperty("检验水平")
    @TableField("inspection_level")
    @ExcelIgnore
    private String inspectionLevel;

    @ApiModelProperty("检验水平")
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionLevelName;

    @ApiModelProperty("AQL")
    @TableField("aql")
    @ExcelIgnore
    private String aql;
}
