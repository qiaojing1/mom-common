package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 物料单位转换
 * </p>
 *
 * @author FZY
 * @since 2025-04-17
 */
@Getter
@Setter
@TableName("psi_material_unit_convert")
@ApiModel(value = "PsiMaterialUnitConvert对象", description = "物料单位转换")
public class PsiMaterialUnitConvert extends BaseEntity {

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @TableField(exist = false)
    private String materialCode;

    @TableField(exist = false)
    private String materialSpecs;

    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("当前单位ID")
    @TableField("source_unit_id")
    private String sourceUnitId;

    @ApiModelProperty("当前单位分组编码")
    @TableField(exist = false)
    private String sourceUnitParentCode;

    @TableField(exist = false)
    private String sourceUnitCode;

    @TableField(exist = false)
    private String sourceUnitName;

    @TableField(exist = false)
    private Integer sourceUnitAccuracy;

    @TableField(exist = false)
    private String sourceUnitRoundOffType;

    @ApiModelProperty("基本单位ID")
    @TableField(exist = false)
    private String targetUnitId;

    @ApiModelProperty("基本单位分组编码")
    @TableField(exist = false)
    private String targetUnitParentCode;

    @TableField(exist = false)
    private String targetUnitCode;

    @TableField(exist = false)
    private String targetUnitName;

    @TableField(exist = false)
    private Integer targetUnitAccuracy;

    @TableField(exist = false)
    private String targetUnitRoundOffType;

    @ApiModelProperty("当前单位系数")
    @TableField("source_factor")
    private BigDecimal sourceFactor;

    @ApiModelProperty("基本单位系数")
    @TableField("target_factor")
    private BigDecimal targetFactor;

    @ApiModelProperty("换算类型[1固定,2浮动]")
    @TableField("type")
    private String type;

    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;

    @TableField(exist = false)
    private String enableName;
}
