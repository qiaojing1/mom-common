package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.lets.platform.model.psi.enums.ApplyTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 付款退款单明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-05-20
 */
@Getter
@Setter
@TableName("psi_purchase_payment_refund_doc_detail")
@ApiModel(value = "PsiPurchasePaymentRefundDocDetail对象", description = "付款退款单明细")
public class PsiPurchasePaymentRefundDocDetail extends BaseEntity {

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("付款退款单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("结算方式Id")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("结算方式类型")
    @TableField("settlement_method_type")
    private String settlementMethodType;

    @ApiModelProperty("结算方式业务类型")
    @TableField("settlement_method_business_type")
    private String settlementMethodBusinessType;

    @ApiModelProperty("结算方式是否支付手续费 Y是N否")
    @TableField("settlement_method_payment_handling_fee")
    private String settlementMethodPaymentHandlingFee;

    @ApiModelProperty("原付款用途 1:采购付款 2:预付款")
    @TableField("original_payment_purpose")
    private String originalPaymentPurpose;

    @ApiModelProperty("应退金额")
    @TableField("amount_to_be_refunded")
    private BigDecimal amountToBeRefunded;

    @ApiModelProperty("应退金额(本位币)")
    @TableField("basic_amount_to_be_refunded")
    private BigDecimal basicAmountToBeRefunded;

    @ApiModelProperty("实退金额")
    @TableField("amount_of_actual_refund")
    private BigDecimal amountOfActualRefund;

    @ApiModelProperty("实退金额(本位币)")
    @TableField("basic_amount_of_actual_refund")
    private BigDecimal basicAmountOfActualRefund;

    @ApiModelProperty("已核销金额")
    @TableField("amount_written_off")
    private BigDecimal amountWrittenOff;

    @ApiModelProperty("已核销金额(本位币)")
    @TableField("basic_amount_written_off")
    private BigDecimal basicAmountWrittenOff;

    @ApiModelProperty("未核销金额")
    @TableField("unwritten_amount")
    private BigDecimal unwrittenAmount;

    @ApiModelProperty("未核销金额(本位币)")
    @TableField("basic_unwritten_amount")
    private BigDecimal basicUnwrittenAmount;

    @ApiModelProperty("手续费")
    @TableField("fees")
    private BigDecimal fees;

    @ApiModelProperty("手续费(本位币)")
    @TableField("basic_fees")
    private BigDecimal basicFees;

    /**
     * @see ApplyTypeEnum
     */
    @ApiModelProperty("核销状态 0未核销 1已核销")
    @TableField("written_off_status")
    private String writtenOffStatus;

    @ApiModelProperty("核销状态 0未核销 1已核销")
    @TableField(exist = false)
    private String writtenOffStatusName;

    /**
     * @see com.lets.platform.model.psi.enums.PayConfirmTypeEnum
     */
    @ApiModelProperty("付款状态 0未付款确认 1已付款确认")
    @TableField("payment_status")
    private String paymentStatus;

    @ApiModelProperty("付款状态 0未付款确认 1已付款确认")
    @TableField(exist = false)
    private String paymentStatusName;

    @ApiModelProperty("资金账户id")
    @TableField("fund_account_id")
    private String fundAccountId;

    @ApiModelProperty("资金账户简称")
    @TableField("fund_account_abbreviations")
    private String fundAccountAbbreviations;

    @ApiModelProperty("资金账户类型")
    @TableField("fund_account_type")
    private String fundAccountType;

    @ApiModelProperty("资金账户金融机构类型")
    @TableField("fund_account_financial_institutions_type")
    private String fundAccountFinancialInstitutionsType;

    @ApiModelProperty("资金账户户名")
    @TableField("fund_account_account_name")
    private String fundAccountAccountName;

    @ApiModelProperty("资金账户账户号")
    @TableField("fund_account_code")
    private String fundAccountCode;

    @ApiModelProperty("资金账户银行类型")
    @TableField("fund_account_bank_type")
    private String fundAccountBankType;

    @ApiModelProperty("资金账户开户行")
    @TableField("fund_account_opening_bank")
    private String fundAccountOpeningBank;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("采购订单单号")
    @TableField("purchase_order_code")
    private String purchaseOrderCode;

    @ApiModelProperty("采购订单id")
    @TableField("purchase_order_id")
    private String purchaseOrderId;

    @ApiModelProperty("采购订单明细id")
    @TableField("purchase_order_detail_id")
    private String purchaseOrderDetailId;

    @ApiModelProperty("采购订单明细行号")
    @TableField("purchase_order_detail_line_number")
    private String purchaseOrderDetailLineNumber;

    @TableField(exist = false)
    private List<PsiPurchasePaymentRefundDocSource> sources;

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
