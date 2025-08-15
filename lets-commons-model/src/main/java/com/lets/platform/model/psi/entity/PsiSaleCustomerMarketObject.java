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
 * 销售-客户可销控制-可销售对象
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-06-27
 */
@Getter
@Setter
@TableName("psi_sale_customer_market_object")
@ApiModel(value = "PsiSaleCustomerMarketObject对象", description = "销售-客户可销控制-可销售对象")
public class PsiSaleCustomerMarketObject extends BaseEntity {

    @ApiModelProperty("表头id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("目标id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("可销范围 0:客户 1: 客户分组")
    @TableField("target_type")
    private String targetType;
    @TableField(exist = false)
    private String targetTypeName;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("客户编号")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("客户分组id")
    @TableField("target_group_id")
    private String targetGroupId;

    @ApiModelProperty("客户分组名称")
    @TableField("target_group_name")
    private String targetGroupName;

    @TableField(exist = false)
    private Integer rowIndex;
}
