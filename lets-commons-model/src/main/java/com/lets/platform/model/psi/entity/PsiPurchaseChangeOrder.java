package com.lets.platform.model.psi.entity;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.enums.OrderStatusEnum;
import com.lets.platform.model.psi.enums.EffectiveStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 采购变更单
 * </p>
 *
 * @author FZY
 * @since 2024-09-05
 */
@Getter
@Setter
@TableName("psi_purchase_change_order")
@ApiModel(value = "PsiPurchaseChangeOrder对象", description = "采购变更单")
public class PsiPurchaseChangeOrder extends BaseEntity {

    @ApiModelProperty("原单据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("原单据编码")
    @TableField(exist = false)
    private String sourceCode;

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("订货供应商")
    @TableField("order_supplier_id")
    private String orderSupplierId;

    @TableField("order_supplier_name")
    private String orderSupplierName;

    @ApiModelProperty("订货供应商-联系人")
    @TableField("order_supplier_user")
    private String orderSupplierUser;

    @ApiModelProperty("订货供应商-联系人")
    @TableField("order_supplier_user_name")
    private String orderSupplierUserName;

    @ApiModelProperty("订货供应商-联系电话")
    @TableField("order_supplier_phone")
    private String orderSupplierPhone;

    @ApiModelProperty("订货供应商-联系地址")
    @TableField("order_supplier_address")
    private String orderSupplierAddress;

    @ApiModelProperty("供货供应商")
    @TableField("supply_supplier_id")
    private String supplySupplierId;

    @TableField("supply_supplier_name")
    private String supplySupplierName;

    @ApiModelProperty("供货供应商-联系人")
    @TableField("supply_supplier_user")
    private String supplySupplierUser;

    @ApiModelProperty("供货供应商-联系人名称")
    @TableField("supply_supplier_user_name")
    private String supplySupplierUserName;

    @ApiModelProperty("供货供应商-联系电话")
    @TableField("supply_supplier_phone")
    private String supplySupplierPhone;

    @ApiModelProperty("供货供应商-联系地址")
    @TableField("supply_supplier_address")
    private String supplySupplierAddress;

    @ApiModelProperty("结算供应商")
    @TableField("settlement_supplier_id")
    private String settlementSupplierId;

    @TableField("settlement_supplier_name")
    private String settlementSupplierName;

    @ApiModelProperty("收款供应商")
    @TableField("collection_supplier_id")
    private String collectionSupplierId;

    @TableField("collection_supplier_name")
    private String collectionSupplierName;

    @ApiModelProperty("价目表ID")
    @TableField("price_list_id")
    private String priceListId;

    @TableField("price_list_name")
    private String priceListName;

    @ApiModelProperty("付款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("默认付款条件")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购员")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("本位币")
    @TableField("basic_currency_id")
    private String basicCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField("basic_currency_name")
    private String basicCurrencyName;

    @ApiModelProperty("本位币单价精度")
    @TableField("basic_currency_price_accuracy")
    private Integer basicCurrencyPriceAccuracy;

    @ApiModelProperty("本位币金额精度")
    @TableField("basic_currency_amount_accuracy")
    private Integer basicCurrencyAmountAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField("basic_currency_round_off_type")
    private Integer basicCurrencyRoundOffType;

    @ApiModelProperty("结算币种")
    @TableField("settlement_currency_id")
    private String settlementCurrencyId;

    @ApiModelProperty("结算币种名称")
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;

    @ApiModelProperty("结算币种单价精度")
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;

    @ApiModelProperty("结算币种金额精度")
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;

    @ApiModelProperty("结算币种舍入类型")
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;

    @ApiModelProperty("汇率表主键")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("单价是否含税[NY]")
    @TableField("price_included_tax")
    private String priceIncludedTax;

    @TableField(exist = false)
    private String priceIncludedTaxName;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;

    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("税额")
    @TableField("total_tax_amount")
    private BigDecimal totalTaxAmount;

    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

    @ApiModelProperty("结算方式")
    @TableField("settlement_method")
    private String settlementMethod;

    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("业务状态[0:未生效;1:已生效]")
    @TableField("business_status")
    private Integer businessStatus;

    @TableField(exist = false)
    private String businessStatusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("生效时间")
    @TableField("effect_time")
    private LocalDateTime effectTime;

    @ApiModelProperty("生效人")
    @TableField("effect_user")
    private String effectUser;

    @ApiModelProperty("生效人名称")
    @TableField("effect_user_name")
    private String effectUserName;

    @ApiModelProperty("变更前采购部门ID")
    @TableField("before_purchase_org_id")
    private String beforePurchaseOrgId;

    @ApiModelProperty("变更前采购部门名称")
    @TableField("before_purchase_org_name")
    private String beforePurchaseOrgName;

    @ApiModelProperty("变更前采购员ID")
    @TableField("before_purchase_user_id")
    private String beforePurchaseUserId;

    @ApiModelProperty("变更前采购员名称")
    @TableField("before_purchase_user_name")
    private String beforePurchaseUserName;

    @ApiModelProperty("变更前付款条件")
    @TableField("before_payment_condition_id")
    private String beforePaymentConditionId;

    @ApiModelProperty("变更前默认付款条件")
    @TableField("before_payment_condition_name")
    private String beforePaymentConditionName;

    @TableField(exist = false)
    private List<PsiPurchaseChangeOrderDetail> detailList;

    public PsiPurchaseChangeOrder() {}

    public PsiPurchaseChangeOrder(PsiPurchaseOrder purchaseOrder) {
        if (purchaseOrder == null) {
            return;
        }
        this.sourceId = purchaseOrder.getId();
        this.code = purchaseOrder.getCode();
        this.orderCategoryId = purchaseOrder.getOrderCategoryId();
        this.orderCategoryCode = purchaseOrder.getOrderCategoryName();
        this.orderCategoryName = purchaseOrder.getOrderCategoryName();
        this.orderTime = purchaseOrder.getOrderTime();
        this.orderSupplierId = purchaseOrder.getOrderSupplierId();
        this.orderSupplierName = purchaseOrder.getOrderSupplierName();
        this.orderSupplierUser = purchaseOrder.getOrderSupplierUser();
        this.orderSupplierUserName = purchaseOrder.getOrderSupplierUserName();
        this.orderSupplierPhone = purchaseOrder.getOrderSupplierPhone();
        this.orderSupplierAddress = purchaseOrder.getOrderSupplierAddress();
        this.supplySupplierId = purchaseOrder.getSupplySupplierId();
        this.supplySupplierName = purchaseOrder.getSupplySupplierName();
        this.supplySupplierUser = purchaseOrder.getSupplySupplierUser();
        this.supplySupplierUserName = purchaseOrder.getSupplySupplierUserName();
        this.supplySupplierPhone = purchaseOrder.getSupplySupplierPhone();
        this.supplySupplierAddress = purchaseOrder.getSupplySupplierAddress();
        this.settlementSupplierId = purchaseOrder.getSettlementSupplierId();
        this.settlementSupplierName = purchaseOrder.getSettlementSupplierName();
        this.collectionSupplierId = purchaseOrder.getCollectionSupplierId();
        this.collectionSupplierName = purchaseOrder.getCollectionSupplierName();
        this.priceListId = purchaseOrder.getPriceListId();
        this.priceListName = purchaseOrder.getPriceListName();
        this.paymentConditionId = purchaseOrder.getPaymentConditionId();
        this.paymentConditionName = purchaseOrder.getPaymentConditionName();
        this.purchaseOrgId = purchaseOrder.getPurchaseOrgId();
        this.purchaseOrgName = purchaseOrder.getPurchaseOrgName();
        this.purchaseUserId = purchaseOrder.getPurchaseUserId();
        this.purchaseUserName = purchaseOrder.getPurchaseUserName();
        this.status = OrderStatusEnum.CREATED.getValue();
        this.statusName = OrderStatusEnum.CREATED.getName();
        this.basicCurrencyId = purchaseOrder.getBaseCurrencyId();
        this.basicCurrencyName = purchaseOrder.getBaseCurrencyName();
        this.basicCurrencyPriceAccuracy = purchaseOrder.getBaseCurrencyPriceAccuracy();
        this.basicCurrencyAmountAccuracy = purchaseOrder.getBaseCurrencyAmountAccuracy();
        this.basicCurrencyRoundOffType = purchaseOrder.getBaseCurrencyRoundOffType();
        this.settlementCurrencyId = purchaseOrder.getSettlementCurrencyId();
        this.settlementCurrencyName = purchaseOrder.getSettlementCurrencyName();
        this.settlementCurrencyPriceAccuracy = purchaseOrder.getSettlementCurrencyPriceAccuracy();
        this.settlementCurrencyAmountAccuracy = purchaseOrder.getSettlementCurrencyAmountAccuracy();
        this.settlementCurrencyRoundOffType = purchaseOrder.getSettlementCurrencyRoundOffType();
        this.exchangeRateId = purchaseOrder.getExchangeRateId();
        this.exchangeRateName = purchaseOrder.getExchangeRateName();
        this.exchangeRate = purchaseOrder.getExchangeRate();
        this.priceIncludedTax = purchaseOrder.getPriceIncludedTax();
        this.priceIncludedTaxName = purchaseOrder.getPriceIncludedTaxName();
        this.pricingMode = purchaseOrder.getPricingMode();
        this.pricingModeName = purchaseOrder.getPricingModeName();
        this.totalTaxAmount = purchaseOrder.getTaxAmount();
        this.totalAmount = purchaseOrder.getTotalAmount();
        this.totalAmountIncludingTax = purchaseOrder.getTotalAmountIncludingTax();
        this.settlementMethod = purchaseOrder.getSettlementMethod();
        this.settlementMethodName = purchaseOrder.getSettlementMethodName();
        this.businessStatus = EffectiveStatusEnum.Ineffective.getValue();
        this.businessStatusName = EffectiveStatusEnum.Ineffective.getName();
        this.beforePurchaseOrgId = purchaseOrder.getPurchaseOrgId();
        this.beforePurchaseOrgName = purchaseOrder.getPurchaseOrgName();
        this.beforePurchaseUserId = purchaseOrder.getPurchaseUserId();
        this.beforePurchaseUserName = purchaseOrder.getPurchaseUserName();
        this.beforePaymentConditionId = purchaseOrder.getPaymentConditionId();
        this.beforePaymentConditionName = purchaseOrder.getPaymentConditionName();
        this.detailList = new ArrayList<>();

        List<PsiPurchaseOrderDetail> purchaseOrderDetailList = purchaseOrder.getMaterialList();
        if (CollUtil.isNotEmpty(purchaseOrderDetailList)) {
            for (PsiPurchaseOrderDetail purchaseOrderMaterial : purchaseOrderDetailList) {
                PsiPurchaseChangeOrderDetail detail = new PsiPurchaseChangeOrderDetail(purchaseOrderMaterial);
                this.detailList.add(detail);
            }
        }
    }
}
