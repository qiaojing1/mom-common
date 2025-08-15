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
 * 销售-客户可销控制-可销售范围
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-06-27
 */
@Getter
@Setter
@TableName("psi_sale_customer_market_range")
@ApiModel(value = "PsiSaleCustomerMarketRange对象", description = "销售-客户可销控制-可销售范围")
public class PsiSaleCustomerMarketRange extends BaseEntity {

    @ApiModelProperty("表头id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("目标id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("可销范围 0:销售部门 1: 销售人员")
    @TableField("target_type")
    private String targetType;
    @TableField(exist = false)
    private String targetTypeName;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("员工编号")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("销售部门id")
    @TableField("target_org_id")
    private String targetOrgId;

    @ApiModelProperty("销售部门名称")
    @TableField("target_org_name")
    private String targetOrgName;

    @TableField(exist = false)
    private Integer rowIndex;
}
