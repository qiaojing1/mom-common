package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 限定单据类别表
 * </p>
 *
 * @author FZY
 * @since 2024-06-20
 */
@Getter
@Setter
@TableName("psi_order_category_limit")
@ApiModel(value = "PsiOrderCategoryLimit对象", description = "限定单据类别表")
public class PsiOrderCategoryLimit extends BaseEntity {

    @ApiModelProperty("单据类别ID")
    @TableField("parent_id")
    private String parentId;

    @TableField("menu_code")
    private String menuCode;

    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("限定单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("限定单据类别名称")
    @TableField(exist = false)
    private String orderCategoryName;

    @ApiModelProperty("是否默认")
    @TableField("is_default")
    private Integer isDefault;
}
