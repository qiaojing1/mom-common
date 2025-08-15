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
 * 物料分组属性配置-采购信息
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_purchase")
@ApiModel(value = "PsiGroupAttrConfigMaterialPurchase对象", description = "物料分组属性配置-采购信息")
public class PsiGroupAttrConfigMaterialPurchase extends BaseEntity {

    @ApiModelProperty("采购单位ID")
    @TableField("purchase_unit_id")
    private String purchaseUnitId;

    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;

    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;

    @ApiModelProperty("采购人员ID")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购人员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("采购组ID")
    @TableField("purchase_group_id")
    private String purchaseGroupId;

    @ApiModelProperty("采购组名称")
    @TableField("purchase_group_name")
    private String purchaseGroupName;

    @ApiModelProperty("采购部门ID")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("默认供应商ID")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("默认供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("最小采购量")
    @TableField("purchase_min_quantity")
    private BigDecimal purchaseMinQuantity;

    @ApiModelProperty("采购批量")
    @TableField("purchase_lot_quantity")
    private BigDecimal purchaseLotQuantity;

    @ApiModelProperty("采购批量控制方式")
    @TableField("purchase_lot_control_type")
    private String purchaseLotControlType;

    @ApiModelProperty("超收上限(%)")
    @TableField("purchase_over_limit")
    private BigDecimal purchaseOverLimit;

    @ApiModelProperty("超收下限(%)")
    @TableField("purchase_under_limit")
    private BigDecimal purchaseUnderLimit;

    @ApiModelProperty("采购耗损率(%)")
    @TableField("purchase_wastage_rate")
    private BigDecimal purchaseWastageRate;

    @ApiModelProperty("允许采购退料")
    @TableField("purchase_returnable")
    private Integer purchaseReturnable;

    @ApiModelProperty("允许采购替代")
    @TableField("purchase_substitutable")
    private Integer purchaseSubstitutable;

    @ApiModelProperty("强制请购")
    @TableField("purchase_mandatory")
    private Integer purchaseMandatory;

    @ApiModelProperty("启用供应商平台")
    @TableField("purchase_supplier_platform")
    private Integer purchaseSupplierPlatform;

    @ApiModelProperty("采购计价单位主键")
    @TableField("purchase_pricing_unit_id")
    private String purchasePricingUnitId;

    @ApiModelProperty("采购计价单位编码")
    @TableField("purchase_pricing_unit_code")
    private String purchasePricingUnitCode;

    @ApiModelProperty("采购计价单位名称")
    @TableField("purchase_pricing_unit_name")
    private String purchasePricingUnitName;

    @ApiModelProperty("采购计价单位精度")
    @TableField("purchase_pricing_unit_accuracy")
    private Integer purchasePricingUnitAccuracy;

    @ApiModelProperty("采购计价单位舍入方式")
    @TableField("purchase_pricing_unit_round_off_type")
    private Integer purchasePricingUnitRoundOffType;
}
