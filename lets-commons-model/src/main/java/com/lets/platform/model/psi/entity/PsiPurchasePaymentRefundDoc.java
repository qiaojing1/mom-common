package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 付款退款单
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-05-20
 */
@Getter
@Setter
@TableName("psi_purchase_payment_refund_doc")
@ApiModel(value = "PsiPurchasePaymentRefundDoc对象", description = "付款退款单")
public class PsiPurchasePaymentRefundDoc extends BaseEntity {

    @ApiModelProperty("单据编码")
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

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @ApiModelProperty("付款单位类型 1:供应商 2：客户 3：员工")
    @TableField("payment_unit_type")
    private String paymentUnitType;

    @ApiModelProperty("付款单位类型 1:供应商 2：客户 3：员工")
    @TableField(exist = false)
    private String paymentUnitTypeName;

    @ApiModelProperty("付款单位id")
    @TableField("payment_unit_id")
    private String paymentUnitId;

    @ApiModelProperty("付款单位名称")
    @TableField("payment_unit_name")
    private String paymentUnitName;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购员")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购员")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
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

    @ApiModelProperty("本位币币种符号")
    @TableField("basic_currency_symbol")
    private String basicCurrencySymbol;

    @ApiModelProperty("币种")
    @TableField("settlement_currency_id")
    private String settlementCurrencyId;

    @ApiModelProperty("币种名称")
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;

    @ApiModelProperty("币种单价精度")
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;

    @ApiModelProperty("币种金额精度")
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;

    @ApiModelProperty("币种舍入类型")
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;

    @ApiModelProperty("币种符号")
    @TableField("settlement_currency_symbol")
    private String settlementCurrencySymbol;

    @ApiModelProperty("汇率表主键")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("应退总金额")
    @TableField("total_amount_to_be_refunded")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalAmountToBeRefunded;

    @ApiModelProperty("应退总金额(本位币)")
    @TableField("basic_total_amount_to_be_refunded")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicTotalAmountToBeRefunded;

    @ApiModelProperty("实退总金额")
    @TableField("total_amount_of_actual_refund")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalAmountOfActualRefund;

    @ApiModelProperty("实退总金额(本位币)")
    @TableField("basic_total_amount_of_actual_refund")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicTotalAmountOfActualRefund;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;

    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    /**
     * 明细列表
     */
    @TableField(exist = false)
    private List<PsiPurchasePaymentRefundDocDetail> details;

    /** 明细相关字段  **/
    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Integer lineNumber;

    @ApiModelProperty("付款退款单id")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("结算方式Id")
    @TableField(exist = false)
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField(exist = false)
    private String settlementMethodName;

    @ApiModelProperty("结算方式类型")
    @TableField(exist = false)
    private String settlementMethodType;

    @ApiModelProperty("结算方式业务类型")
    @TableField(exist = false)
    private String settlementMethodBusinessType;

    @ApiModelProperty("结算方式是否支付手续费 Y是N否")
    @TableField(exist = false)
    private String settlementMethodPaymentHandlingFee;

    @ApiModelProperty("原付款用途 1:采购付款 2:预付款")
    @TableField(exist = false)
    private String originalPaymentPurpose;

    @ApiModelProperty("原付款用途 1:采购付款 2:预付款")
    @TableField(exist = false)
    private String originalPaymentPurposeName;

    @ApiModelProperty("应退金额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountToBeRefunded;

    @ApiModelProperty("应退金额(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicAmountToBeRefunded;

    @ApiModelProperty("实退金额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountOfActualRefund;

    @ApiModelProperty("实退金额(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicAmountOfActualRefund;

    @ApiModelProperty("已核销金额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountWrittenOff;

    @ApiModelProperty("已核销金额(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicAmountWrittenOff;

    @ApiModelProperty("未核销金额")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal unwrittenAmount;

    @ApiModelProperty("未核销金额(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicUnwrittenAmount;

    @ApiModelProperty("手续费")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal fees;

    @ApiModelProperty("手续费(本位币)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicFees;

    @ApiModelProperty("核销状态 1未核销 2已核销")
    @TableField(exist = false)
    private String writtenOffStatus;

    @ApiModelProperty("核销状态 1未核销 2已核销")
    @TableField(exist = false)
    private String writtenOffStatusName;

    @ApiModelProperty("付款状态 1未付款确认 2已付款确认")
    @TableField(exist = false)
    private String paymentStatus;

    @ApiModelProperty("付款状态 1未付款确认 2已付款确认")
    @TableField(exist = false)
    private String paymentStatusName;

    @ApiModelProperty("资金账户id")
    @TableField(exist = false)
    private String fundAccountId;

    @ApiModelProperty("资金账户简称")
    @TableField(exist = false)
    private String fundAccountAbbreviations;

    @ApiModelProperty("资金账户类型")
    @TableField(exist = false)
    private String fundAccountType;

    @ApiModelProperty("资金账户金融机构类型")
    @TableField(exist = false)
    private String fundAccountFinancialInstitutionsType;

    @ApiModelProperty("资金账户户名")
    @TableField(exist = false)
    private String fundAccountAccountName;

    @ApiModelProperty("资金账户账户号")
    @TableField(exist = false)
    private String fundAccountCode;

    @ApiModelProperty("资金账户银行类型")
    @TableField(exist = false)
    private String fundAccountBankType;

    @ApiModelProperty("资金账户开户行")
    @TableField(exist = false)
    private String fundAccountOpeningBank;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;

    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("源单id")
    @TableField(exist = false)
    private String sourceOrderId;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单明细id")
    @TableField(exist = false)
    private String sourceDetailId;

    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceOrderCode;

    @ApiModelProperty("采购订单单号")
    @TableField(exist = false)
    private String purchaseOrderCode;

    @ApiModelProperty("采购订单id")
    @TableField(exist = false)
    private String purchaseOrderId;

    @ApiModelProperty("采购订单明细id")
    @TableField(exist = false)
    private String purchaseOrderDetailId;

    @ApiModelProperty("采购订单明细行号")
    @TableField(exist = false)
    private String purchaseOrderDetailLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;

    public BigDecimal totalAmountToBeRefundedNN() {
        return Optional.ofNullable(totalAmountToBeRefunded).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicTotalAmountToBeRefundedNN() {
        return Optional.ofNullable(basicTotalAmountToBeRefunded).orElse(BigDecimal.ZERO);
    }

    public BigDecimal totalAmountOfActualRefundNN() {
        return Optional.ofNullable(totalAmountOfActualRefund).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicTotalAmountOfActualRefundNN() {
        return Optional.ofNullable(basicTotalAmountOfActualRefund).orElse(BigDecimal.ZERO);
    }

    public BigDecimal amountToBeRefundedNN() {
        return Optional.ofNullable(amountToBeRefunded).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicAmountToBeRefundedNN() {
        return Optional.ofNullable(basicAmountToBeRefunded).orElse(BigDecimal.ZERO);
    }

    public BigDecimal amountOfActualRefundNN() {
        return Optional.ofNullable(amountOfActualRefund).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicAmountOfActualRefundNN() {
        return Optional.ofNullable(basicAmountOfActualRefund).orElse(BigDecimal.ZERO);
    }

    public BigDecimal amountWrittenOffNN() {
        return Optional.ofNullable(amountWrittenOff).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicAmountWrittenOffNN() {
        return Optional.ofNullable(basicAmountWrittenOff).orElse(BigDecimal.ZERO);
    }

    public BigDecimal unwrittenAmountNN() {
        return Optional.ofNullable(unwrittenAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicUnwrittenAmountNN() {
        return Optional.ofNullable(basicUnwrittenAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal feesNN() {
        return Optional.ofNullable(fees).orElse(BigDecimal.ZERO);
    }

    public BigDecimal basicFeesNN() {
        return Optional.ofNullable(basicFees).orElse(BigDecimal.ZERO);
    }
}
