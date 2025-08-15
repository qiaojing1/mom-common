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
 * 物料分组属性配置-销售信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_sale")
@ApiModel(value = "PsiGroupAttrConfigMaterialSale对象", description = "物料分组属性配置-销售信息")
public class PsiGroupAttrConfigMaterialSale extends BaseEntity {

    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit_id")
    private String saleUnitId;

    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ApiModelProperty("计价单位")
    @TableField("pricing_unit_id")
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField("pricing_unit_code")
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField("pricing_unit_name")
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField("pricing_unit_accuracy")
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField("pricing_unit_round_off_type")
    private Integer pricingUnitRoundOffType;

    @ApiModelProperty("起订量")
    @TableField("sale_min_quantity")
    private BigDecimal saleMinQuantity;

    @ApiModelProperty("销售批量")
    @TableField("sale_lot_quantity")
    private BigDecimal saleLotQuantity;

    @ApiModelProperty("销售批量控制方式")
    @TableField("sale_lot_control_type")
    private String saleLotControlType;

    @ApiModelProperty("超发上限(%)")
    @TableField("sale_over_limit")
    private BigDecimal saleOverLimit;

    @ApiModelProperty("超发下限(%)")
    @TableField("sale_under_limit")
    private BigDecimal saleUnderLimit;

    @ApiModelProperty("子件拆解方式")
    @TableField("sale_sub_disassembly_type")
    private String saleSubDisassemblyType;

    @ApiModelProperty("允许退货")
    @TableField("sale_returnable")
    private Byte saleReturnable;

    @ApiModelProperty("允许出货替代")
    @TableField("sale_substitutable")
    private Byte saleSubstitutable;

    @ApiModelProperty("限制客户分组ID")
    @TableField("sale_customer_group_limit_id")
    private String saleCustomerGroupLimitId;

    @ApiModelProperty("限制客户分组名称")
    @TableField("sale_customer_group_limit_name")
    private String saleCustomerGroupLimitName;

    @ApiModelProperty("限制销售部门ID")
    @TableField("sale_org_limit_id")
    private String saleOrgLimitId;

    @ApiModelProperty("限制销售部门名称")
    @TableField("sale_org_limit_name")
    private String saleOrgLimitName;

    @ApiModelProperty("销售备货提前天数")
    @TableField("sale_advance_day")
    private Short saleAdvanceDay;

    @ApiModelProperty("是否启用动态要货期[01]")
    @TableField("dynamics_delivery")
    private Integer dynamicsDelivery;
}
