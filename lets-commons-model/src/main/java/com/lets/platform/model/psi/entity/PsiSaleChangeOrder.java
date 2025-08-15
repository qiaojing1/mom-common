package com.lets.platform.model.psi.entity;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.enums.CloseStatusEnum;
import com.lets.platform.model.base.enums.OrderStatusEnum;
import com.lets.platform.model.psi.enums.ChangeTypeEnum;
import com.lets.platform.model.psi.enums.EffectiveStatusEnum;
import com.lets.platform.model.psi.enums.PricingModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <p>
 * 销售变更单
 * </p>
 *
 * @author FZY
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_sale_change_order")
@ApiModel(value = "PsiSaleChangeOrder对象", description = "销售变更单")
public class PsiSaleChangeOrder extends BaseEntity {

    @ApiModelProperty("原单据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("原单据编码")
    @TableField(exist = false)
    private String sourceCode;

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别ID")
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

    @ApiModelProperty("订货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("订货客户分组ID")
    @TableField(exist = false)
    @ExcelIgnore
    private String orderCustomerGroupId;

    @ApiModelProperty("订货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("订货客户税种ID")
    @TableField("order_customer_default_tax_id")
    private String orderCustomerDefaultTaxId;

    @ApiModelProperty("订货客户税种分类")
    @TableField("order_customer_default_tax_type")
    private String orderCustomerDefaultTaxType;

    @ApiModelProperty("订货客户税种名称")
    @TableField("order_customer_default_tax_name")
    private String orderCustomerDefaultTaxName;

    @ApiModelProperty("订货客户税种税率")
    @TableField("order_customer_default_tax_rate")
    private String orderCustomerDefaultTaxRate;

    @ApiModelProperty("订货客户税种精度")
    @TableField("order_customer_default_tax_accuracy")
    private Integer orderCustomerDefaultTaxAccuracy;

    @ApiModelProperty("结算币种ID")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("结算币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算货币舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;

    @ApiModelProperty("销售部门ID")
    @TableField("sale_org_id")
    private String saleOrgId;

    @ApiModelProperty("销售部门名称")
    @TableField("sale_org_name")
    private String saleOrgName;

    @ApiModelProperty("销售员ID")
    @TableField("sale_user_id")
    private String saleUserId;

    @ApiModelProperty("销售员名称")
    @TableField("sale_user_name")
    private String saleUserName;

    @ApiModelProperty("销售分组ID")
    @TableField("sale_group_id")
    private String saleGroupId;

    @ApiModelProperty("销售分组名称")
    @TableField("sale_group_name")
    private String saleGroupName;

    @ApiModelProperty("销售价目表ID")
    @TableField("sale_price_list_id")
    private String salePriceListId;

    @ApiModelProperty("销售价目表名称")
    @TableField("sale_price_list_name")
    private String salePriceListName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("本位币ID")
    @TableField("base_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField("base_currency_name")
    private String baseCurrencyName;

    @ApiModelProperty("本位币金额精度")
    @TableField("base_currency_amount_accuracy")
    private Integer baseCurrencyAmountAccuracy;

    @ApiModelProperty("本位币单价精度")
    @TableField("base_currency_price_accuracy")
    private Integer baseCurrencyPriceAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField("base_currency_round_off_type")
    private Integer baseCurrencyRoundOffType;

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("是否含税")
    @TableField("tax_included")
    private String taxIncluded;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("收款条件ID")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("结算方式ID")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("变更前金额")
    @TableField("before_total_amount")
    private BigDecimal beforeTotalAmount;

    @ApiModelProperty("变更前税额")
    @TableField("before_total_tax_amount")
    private BigDecimal beforeTotalTaxAmount;

    @ApiModelProperty("变更前含税合计")
    @TableField("before_total_amount_including_tax")
    private BigDecimal beforeTotalAmountIncludingTax;

    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty("税额")
    @TableField("total_tax_amount")
    private BigDecimal totalTaxAmount;

    @ApiModelProperty("价税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

    @ApiModelProperty("联系人ID")
    @TableField("order_customer_contact_user_id")
    private String orderCustomerContactUserId;

    @ApiModelProperty("联系人")
    @TableField("order_customer_contact_user")
    private String orderCustomerContactUser;

    @ApiModelProperty("联系电话")
    @TableField("order_customer_contact_phone_number")
    private String orderCustomerContactPhoneNumber;

    @ApiModelProperty("联系地址")
    @TableField("order_customer_contact_address")
    private String orderCustomerContactAddress;

    @ApiModelProperty("收货客户ID")
    @TableField("receive_customer_id")
    private String receiveCustomerId;

    @ApiModelProperty("收货客户名称")
    @TableField("receive_customer_name")
    private String receiveCustomerName;

    @ApiModelProperty("收货联系人ID")
    @TableField("receive_customer_contact_user_id")
    private String receiveCustomerContactUserId;

    @ApiModelProperty("收货联系人")
    @TableField("receive_customer_contact_user")
    private String receiveCustomerContactUser;

    @ApiModelProperty("收货联系电话")
    @TableField("receive_customer_contact_phone_number")
    private String receiveCustomerContactPhoneNumber;

    @ApiModelProperty("收货联系地址")
    @TableField("receive_customer_contact_address")
    private String receiveCustomerContactAddress;

    @ApiModelProperty("结算客户ID")
    @TableField("settlement_customer_id")
    private String settlementCustomerId;

    @ApiModelProperty("结算客户名称")
    @TableField("settlement_customer_name")
    private String settlementCustomerName;

    @ApiModelProperty("付款客户ID")
    @TableField("payment_customer_id")
    private String paymentCustomerId;

    @ApiModelProperty("付款客户名称")
    @TableField("payment_customer_name")
    private String paymentCustomerName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态名称")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("业务状态")
    @TableField("business_status")
    private Integer businessStatus;

    @ApiModelProperty("业务状态名称")
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

    @ApiModelProperty("合同编号")
    @TableField("contract_order_code")
    private String contractOrderCode;

    @ApiModelProperty("变更前合同编号")
    @TableField("before_contract_order_code")
    private String beforeContractOrderCode;

    @ApiModelProperty("文件ID")
    @TableField(exist = false)
    private List<String> fileIds;

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiSaleChangeOrderMaterial> saleChangeOrderMaterialList;

    public PsiSaleChangeOrder() {
    }

    public PsiSaleChangeOrder(PsiSaleOrder saleOrder) {
        if (saleOrder == null) {
            return;
        }
        this.sourceId = saleOrder.getId();
        this.sourceCode = saleOrder.getCode();
        this.orderCategoryId = saleOrder.getOrderCategoryId();
        this.orderCategoryName = saleOrder.getOrderCategoryName();
        this.orderTime = saleOrder.getOrderTime();
        this.orderCustomerId = saleOrder.getOrderCustomerId();
        this.orderCustomerName = saleOrder.getOrderCustomerName();
        this.orderCustomerDefaultTaxId = saleOrder.getOrderCustomerDefaultTaxId();
        this.orderCustomerDefaultTaxType = saleOrder.getOrderCustomerDefaultTaxType();
        this.orderCustomerDefaultTaxName = saleOrder.getOrderCustomerDefaultTaxName();
        this.orderCustomerDefaultTaxRate = saleOrder.getOrderCustomerDefaultTaxRate();
        this.orderCustomerDefaultTaxAccuracy = saleOrder.getOrderCustomerDefaultTaxAccuracy();
        this.currencyId = saleOrder.getCurrencyId();
        this.currencyName = saleOrder.getCurrencyName();
        this.currencyAmountAccuracy = saleOrder.getCurrencyAmountAccuracy();
        this.currencyPriceAccuracy = saleOrder.getCurrencyPriceAccuracy();
        this.currencyRoundOffType = saleOrder.getCurrencyRoundOffType();
        this.saleOrgId = saleOrder.getSaleOrgId();
        this.saleOrgName = saleOrder.getSaleOrgName();
        this.saleUserId = saleOrder.getSaleUserId();
        this.saleUserName = saleOrder.getSaleUserName();
        this.saleGroupId = saleOrder.getSaleGroupId();
        this.saleGroupName = saleOrder.getSaleGroupName();
        this.salePriceListId = saleOrder.getSalePriceListId();
        this.salePriceListName = saleOrder.getSalePriceListName();
        this.baseCurrencyId = saleOrder.getBaseCurrencyId();
        this.baseCurrencyName = saleOrder.getBaseCurrencyName();
        this.baseCurrencyAmountAccuracy = saleOrder.getBaseCurrencyAmountAccuracy();
        this.baseCurrencyPriceAccuracy = saleOrder.getBaseCurrencyPriceAccuracy();
        this.baseCurrencyRoundOffType = saleOrder.getBaseCurrencyRoundOffType();
        this.exchangeRateId = saleOrder.getExchangeRateId();
        this.exchangeRateName = saleOrder.getExchangeRateName();
        this.exchangeRate = saleOrder.getExchangeRate();
        this.taxIncluded = saleOrder.getTaxIncluded();
        this.paymentConditionId = saleOrder.getPaymentConditionId();
        this.paymentConditionName = saleOrder.getPaymentConditionName();
        this.settlementMethodId = saleOrder.getSettlementMethodId();
        this.settlementMethodName = saleOrder.getSettlementMethodName();
        this.beforeTotalAmount = saleOrder.getTotalAmount();
        this.beforeTotalTaxAmount = saleOrder.getTaxAmount();
        this.beforeTotalAmountIncludingTax = saleOrder.getTotalAmountIncludingTax();
        this.totalAmount = saleOrder.getTotalAmount();
        this.totalTaxAmount = saleOrder.getTaxAmount();
        this.totalAmountIncludingTax = saleOrder.getTotalAmountIncludingTax();
        this.orderCustomerContactUserId = saleOrder.getOrderCustomerContactUserId();
        this.orderCustomerContactUser = saleOrder.getOrderCustomerContactUser();
        this.orderCustomerContactPhoneNumber = saleOrder.getOrderCustomerContactPhoneNumber();
        this.orderCustomerContactAddress = saleOrder.getOrderCustomerContactAddress();
        this.receiveCustomerId = saleOrder.getReceiveCustomerId();
        this.receiveCustomerName = saleOrder.getReceiveCustomerName();
        this.receiveCustomerContactUserId = saleOrder.getReceiveCustomerContactUserId();
        this.receiveCustomerContactUser = saleOrder.getReceiveCustomerContactUser();
        this.receiveCustomerContactPhoneNumber = saleOrder.getReceiveCustomerContactPhoneNumber();
        this.receiveCustomerContactAddress = saleOrder.getReceiveCustomerContactAddress();
        this.settlementCustomerId = saleOrder.getSettlementCustomerId();
        this.settlementCustomerName = saleOrder.getSettlementCustomerName();
        this.pricingMode = saleOrder.getPricingMode();
        this.pricingModeName = PricingModeEnum.getName(this.getPricingMode());
        this.paymentCustomerId = saleOrder.getPaymentCustomerId();
        this.paymentCustomerName = saleOrder.getPaymentCustomerName();
        this.status = OrderStatusEnum.CREATED.getValue();
        this.contractOrderCode = saleOrder.getContractOrderCode();
        this.beforeContractOrderCode = saleOrder.getContractOrderCode();
        this.businessStatus = EffectiveStatusEnum.Ineffective.getValue();
        this.businessStatusName = EffectiveStatusEnum.Ineffective.getName();
        this.saleChangeOrderMaterialList = new ArrayList<>();

        List<PsiSaleOrderMaterial> saleOrderMaterialList = saleOrder.getMaterialList();
        List<PsiSaleOrderDelivery> saleOrderDeliveryList = saleOrder.getDeliveryList();
        if (CollUtil.isNotEmpty(saleOrderMaterialList) && CollUtil.isNotEmpty(saleOrderDeliveryList)) {
            for (PsiSaleOrderMaterial saleOrderMaterial : saleOrderMaterialList) {
                PsiSaleChangeOrderMaterial saleChangeOrderMaterial = new PsiSaleChangeOrderMaterial(saleOrderMaterial);
                List<PsiSaleOrderDelivery> subSaleOrderDeliveryList = saleOrderDeliveryList.stream().filter(item -> item.getMaterialLineNumber().equals(saleOrderMaterial.getLineNumber()))
                                                                                           .collect(Collectors.toList());
                BigDecimal deliveryQuantity = subSaleOrderDeliveryList.stream().map(PsiSaleOrderDelivery::getDeliveryQuantity).filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
                BigDecimal deliveryOccupiedQuantity = subSaleOrderDeliveryList.stream().map(PsiSaleOrderDelivery::getDeliveryOccupiedQuantity).filter(Objects::nonNull)
                                                                              .reduce(BigDecimal.ZERO, BigDecimal::add);
                BigDecimal stockOutQuantity = subSaleOrderDeliveryList.stream().map(PsiSaleOrderDelivery::getStockOutQuantity).filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
                BigDecimal returnQuantity = subSaleOrderDeliveryList.stream().map(PsiSaleOrderDelivery::getReturnQuantity).filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
                BigDecimal remainReturnQuantity = stockOutQuantity.subtract(returnQuantity);
                saleChangeOrderMaterial.setDeliveryQuantity(deliveryQuantity);
                saleChangeOrderMaterial.setDeliveryOccupiedQuantity(deliveryOccupiedQuantity);
                saleChangeOrderMaterial.setStockOutQuantity(stockOutQuantity);
                saleChangeOrderMaterial.setReturnQuantity(returnQuantity);
                saleChangeOrderMaterial.setRemainReturnQuantity(remainReturnQuantity);
                saleChangeOrderMaterial.setTrackNo(saleOrderMaterial.getTrackNo());
                List<PsiSaleChangeOrderDelivery> saleChangeOrderDeliveryList = new ArrayList<>();
                for (PsiSaleOrderDelivery saleOrderDelivery : subSaleOrderDeliveryList) {
                    PsiSaleChangeOrderDelivery saleChangeOrderDelivery = new PsiSaleChangeOrderDelivery(saleOrderDelivery);
                    saleChangeOrderDelivery.setMaterialCharacteristicNames(saleChangeOrderMaterial.getMaterialCharacteristicNames());
                    if (CloseStatusEnum.CLOSE.equals(saleOrderMaterial.getEnable())) {
                        saleChangeOrderDelivery.setChangeType(ChangeTypeEnum.NOT_EDIT.getValue());
                        saleChangeOrderDelivery.setChangeTypeName(ChangeTypeEnum.NOT_EDIT.getName());
                    }
                    saleChangeOrderDeliveryList.add(saleChangeOrderDelivery);
                }
                saleChangeOrderMaterial.setSaleChangeOrderDeliveryList(saleChangeOrderDeliveryList);
                this.saleChangeOrderMaterialList.add(saleChangeOrderMaterial);
            }
        }
    }

    public void toUpdateEntity() {
        super.toUpdateEntity();
        this.status = null;
    }

    public void toSaveEntity() {
        super.toSaveEntity();
        this.status = null;
    }
}
