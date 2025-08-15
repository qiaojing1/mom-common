package com.lets.platform.model.psi.entity;

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
 * 盘点物料
 * </p>
 *
 * @author FZY
 * @since 2023-10-07
 */
@Getter
@Setter
@TableName("psi_inventory_check_scheme_material")
@ApiModel(value = "PsiInventoryCheckSchemeMaterial对象", description = "盘点物料")
public class PsiInventoryCheckSchemeMaterial extends BaseEntity {

    @ApiModelProperty("盘点方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料分组ID")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组ID")
    @TableField("material_group_code")
    private String materialGroupCode;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;
}
