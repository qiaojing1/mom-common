package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * <p>
 * 物料采购信息
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_purchase")
@ApiModel(value = "PsiMaterialPurchase对象", description = "物料采购信息")
public class PsiMaterialPurchase extends MaterialBaseEntity {

    @ApiModelProperty("采购单位ID")
    @TableField("purchase_unit_id")
    @NotBlank(message = "[采购单位]不能为空")
    private String purchaseUnitId;

    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;

    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;

    @ApiModelProperty("采购单位舍入类型")
    @TableField(exist = false)
    private String purchaseUnitRoundOffType;

    @ApiModelProperty("采购人员ID")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购人员名称")
    @TableField(exist = false)
    private String purchaseUserName;

    @ApiModelProperty("采购组ID")
    @TableField("purchase_group_id")
    private String purchaseGroupId;

    @ApiModelProperty("采购组名称")
    @TableField(exist = false)
    private String purchaseGroupName;

    @ApiModelProperty("采购部门ID")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @ApiModelProperty("采购部门名称")
    @TableField(exist = false)
    private String purchaseOrgName;

    @ApiModelProperty("默认供应商ID")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("默认供应商名称")
    @TableField(exist = false)
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

    @ApiModelProperty("采购批量控制方式名称")
    @TableField(exist = false)
    private String purchaseLotControlTypeName;

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
    @ApiModelProperty("采购计价单位浮动方式")
    @TableField(exist = false)
    private String purchasePricingUnitType;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String groupId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal price;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String materialName;
}
