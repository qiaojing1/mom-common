package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 合同台帐物料明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-04-29
 */
@Getter
@Setter
@TableName("psi_contract_order_material")
@ApiModel(value = "PsiContractOrderMaterial对象", description = "合同台帐物料明细")
public class PsiContractOrderMaterial extends BaseEntity {

    @ApiModelProperty("合同ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("客户物料编码ID")
    @TableField("customer_material_id")
    private String customerMaterialId;

    @ApiModelProperty("客户物料编码编码")
    @TableField("customer_material_code")
    private String customerMaterialCode;

    @ApiModelProperty("客户物料编码名称")
    @TableField("customer_material_name")
    private String customerMaterialName;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("特征属性")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit_id")
    private String saleUnitId;

    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField("sale_unit_round_off_type")
    private String saleUnitRoundOffType;

    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("税种ID")
    @TableField("tax_id")
    private String taxId;

    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    private String taxType;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;

    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private String taxRate;

    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("价税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("价税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("需要转售数量")
    @TableField("needed_turn_to_sale_quantity")
    private BigDecimal neededTurnToSaleQuantity;

    @ApiModelProperty("已经转售数量")
    @TableField("already_turn_to_sale_quantity")
    private BigDecimal alreadyTurnToSaleQuantity;

    @ApiModelProperty("占用转售数量")
    @TableField("locked_turn_to_sale_quantity")
    private BigDecimal lockedTurnToSaleQuantity;

    @ApiModelProperty("可转售数量")
    @TableField(exist = false)
    private BigDecimal saleableQuantity;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    private LocalDateTime needDate;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("销售价目表")
    @TableField("price_list_id")
    private String priceListId;
    @ApiModelProperty("销售价目表")
    @TableField("price_list_code")
    private String priceListCode;
    @ApiModelProperty("销售价目表")
    @TableField("price_list_name")
    private String priceListName;
    @ApiModelProperty("销售价目表")
    @TableField("price_list_line_number")
    private String priceListLineNumber;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("交货期(天)")
    @TableField("delivery_day")
    private String deliveryDay;

    @ApiModelProperty("历史最低价")
    @TableField(exist = false)
    private BigDecimal historyMinPrice;

    @ApiModelProperty("历史最高价")
    @TableField(exist = false)
    private BigDecimal historyMaxPrice;

    @TableField(exist = false)
    private List<PsiContractOrderMaterialCharacteristic> materialCharacteristicList = new ArrayList<>();

    public BigDecimal getNeededTurnToSaleQuantity() {
        return Objects.nonNull(neededTurnToSaleQuantity) ? neededTurnToSaleQuantity : quantity;
    }

    public BigDecimal getAlreadyTurnToSaleQuantity() {
        return Objects.nonNull(alreadyTurnToSaleQuantity) ? alreadyTurnToSaleQuantity : BigDecimal.ZERO;
    }

    public BigDecimal getLockedTurnToSaleQuantity() {
        return Objects.nonNull(lockedTurnToSaleQuantity) ? lockedTurnToSaleQuantity : BigDecimal.ZERO;
    }
}
