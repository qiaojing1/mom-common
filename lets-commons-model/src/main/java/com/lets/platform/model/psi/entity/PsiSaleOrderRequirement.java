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
 * 销售订单物料明细
 * </p>
 *
 * @author FZY
 * @since 2025-07-28
 */
@Getter
@Setter
@TableName("psi_sale_order_requirement")
@ApiModel(value = "PsiSaleOrderRequirement对象", description = "销售订单物料明细")
public class PsiSaleOrderRequirement extends BaseEntity {

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("订单要求-分组编码")
    @TableField("parent_code")
    private String parentCode;

    @ApiModelProperty("订单要求-字典项ID")
    @TableField("value")
    private String value;

    @ApiModelProperty("订单要求-字典项名称")
    @TableField("name")
    private String name;
}
