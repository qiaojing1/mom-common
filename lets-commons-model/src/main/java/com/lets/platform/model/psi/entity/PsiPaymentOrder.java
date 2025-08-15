package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 付款单
 * </p>
 *
 * @author csy
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("psi_payment_order")
@ApiModel(value = "PsiPaymentOrder对象", description = "付款单")
public class PsiPaymentOrder extends BaseEntity {

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

    @ApiModelProperty("收款单位类型")
    @TableField("payment_type")
    private String paymentType;
    @TableField(exist = false)
    private String paymentTypeName;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("采购部门主键")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购员主键")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("币种")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("币种")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("币种价格精度")
    @TableField("currency_price_accuracy")
    private String currencyPriceAccuracy;

    @ApiModelProperty("币种金额精度")
    @TableField("currency_amount_accuracy")
    private String currencyAmountAccuracy;

    @ApiModelProperty("币种舍入类型")
    @TableField("currency_round_off_type")
    private String currencyRoundOffType;

    @ApiModelProperty("币种符号")
    @TableField("currency_symbol")
    private String currencySymbol;

    @ApiModelProperty("本位币")
    @TableField("basic_currency_id")
    private String basicCurrencyId;

    @ApiModelProperty("本位币")
    @TableField("basic_currency_name")
    private String basicCurrencyName;

    @ApiModelProperty("本位币价格精度")
    @TableField("basic_currency_price_accuracy")
    private String basicCurrencyPriceAccuracy;

    @ApiModelProperty("本位币金额精度")
    @TableField("basic_currency_amount_accuracy")
    private String basicCurrencyAmountAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField("basic_currency_round_off_type")
    private String basicCurrencyRoundOffType;

    @ApiModelProperty("币种符号")
    @TableField("basic_currency_symbol")
    private String basicCurrencySymbol;

    @ApiModelProperty("应付总金额")
    @TableField("total_should_amount")
    private BigDecimal totalShouldAmount;

    @ApiModelProperty("应付总金额(本位币)")
    @TableField("basic_total_should_amount")
    private BigDecimal basicTotalShouldAmount;

    @ApiModelProperty("实付总金额")
    @TableField("total_real_amount")
    private BigDecimal totalRealAmount;

    @ApiModelProperty("实付总金额(总金额)")
    @TableField("basic_total_real_amount")
    private BigDecimal basicTotalRealAmount;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;


    @TableField("exchange_rate")
    private BigDecimal exchangeRate;

    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @TableField(exist = false)
    private List<PsiPaymentOrderDetail> details;

    @ApiModelProperty("采购应收订单id")
    @TableField(exist = false)
    private String orderId;

    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

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

    @ApiModelProperty("结算方式")
    @TableField(exist = false)
    private String paymentMethodId;

    @ApiModelProperty("结算方式")
    @TableField(exist = false)
    private String paymentMethodName;

    @ApiModelProperty("结算方式业务类型")
    @TableField(exist = false)
    private String paymentMethodBusinessType;

    @ApiModelProperty("付款用途")
    @TableField(exist = false)
    private String usage;
    @TableField(exist = false)
    private String userName;

    @ApiModelProperty("应付总金额")
    @TableField(exist = false)
    private BigDecimal shouldAmount;

    @ApiModelProperty("应付总金额")
    @TableField(exist = false)
    private BigDecimal basicShouldAmount;

    @ApiModelProperty("实付总金额")
    @TableField(exist = false)
    private BigDecimal realAmount;

    @ApiModelProperty("实付总金额")
    @TableField(exist = false)
    private BigDecimal basicRealAmount;

    @ApiModelProperty("手续费")
    @TableField(exist = false)
    private BigDecimal fees;

    @ApiModelProperty("手续费")
    @TableField(exist = false)
    private BigDecimal basicFees;

    @ApiModelProperty("资金帐户")
    @TableField(exist = false)
    private String accountId;

    @ApiModelProperty("资金帐户")
    @TableField(exist = false)
    private String accountName;

    @ApiModelProperty("源单主键")
    @TableField(exist = false)
    private String purchaseOrderId;

    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String purchaseOrderCode;

    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Long purchaseLineNumber;

    @ApiModelProperty("采购订单明细id")
    @TableField(exist = false)
    private String purchaseDetailId;

    @ApiModelProperty("付款状态")
    @TableField(exist = false)
    private String paymentStatus;
    @TableField(exist = false)
    private String paymentStatusName;

    @ApiModelProperty("付款状态")
    @TableField(exist = false)
    private String applyStatus;
    @TableField(exist = false)
    private String applyStatusName;

    @ApiModelProperty("已核销")
    @TableField(exist = false)
    private BigDecimal appliedAmount;
    @TableField(exist = false)
    private BigDecimal basicAppliedAmount;

    @ApiModelProperty("未核销")
    @TableField(exist = false)
    private BigDecimal unapplyAmount;
    @TableField(exist = false)
    private BigDecimal basicUnapplyAmount;

    @TableField(exist = false)
    private String trackNo;

    public BigDecimal getAppliedAmount() {
        if (appliedAmount == null) {
            appliedAmount = BigDecimal.ZERO;
        }
        return appliedAmount;
    }
}
