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
 * 限定物料分组表
 * </p>
 *
 * @author fzy
 * @since 2025-03-03
 */
@Getter
@Setter
@TableName("psi_order_category_material_group_limit")
@ApiModel(value = "PsiOrderCategoryMaterialGroupLimit对象", description = "限定物料分组表")
public class PsiOrderCategoryMaterialGroupLimit extends BaseEntity {

    @ApiModelProperty("单据类别ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料分组ID")
    @TableField("material_group_id")
    private String materialGroupId;
}
