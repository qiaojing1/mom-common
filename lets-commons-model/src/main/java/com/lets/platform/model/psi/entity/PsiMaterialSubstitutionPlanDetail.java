package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 物料替代方案明细
 * </p>
 *
 * @author FZY
 * @since 2025-04-27
 */
@Getter
@Setter
@TableName("psi_material_substitution_plan_detail")
@ApiModel(value = "PsiMaterialSubstitutionPlanDetail对象", description = "物料替代方案明细")
public class PsiMaterialSubstitutionPlanDetail extends BaseEntity {

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("物料分组ID")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_specific_name")
    private String materialSpecificName;

    @ApiModelProperty("单位")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("优先级")
    @TableField("priority")
    private Integer priority;

    @ApiModelProperty("分子")
    @TableField("source_factor")
    private BigDecimal sourceFactor;

    @ApiModelProperty("分母")
    @TableField("target_factor")
    private BigDecimal targetFactor;

    @ApiModelProperty("替代类型[1:订单替代]")
    @TableField(exist = false)
    private String substitutionType;

    @ApiModelProperty("替代类型[1:订单替代]")
    @TableField(exist = false)
    private String substitutionTypeName;

    @ApiModelProperty("替代方式[1:组合替代;2:单一替代]")
    @TableField(exist = false)
    private String substitutionMethod;

    @ApiModelProperty("替代方式[1:组合替代;2:单一替代]")
    @TableField(exist = false)
    private String substitutionMethodName;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<MaterialSpecific> materialSpecificList;

}
