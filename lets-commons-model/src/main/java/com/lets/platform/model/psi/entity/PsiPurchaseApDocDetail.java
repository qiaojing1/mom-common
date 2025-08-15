package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购应付单物料明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-20
 */
@Getter
@Setter
@TableName("psi_purchase_ap_doc_detail")
@ApiModel(value = "PsiPurchaseApDocDetail对象", description = "采购应付单物料明细")
public class PsiPurchaseApDocDetail extends BaseEntity {

    @ApiModelProperty("采购应收订单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

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

    @ApiModelProperty("计价单位")
    @TableField("purchase_unit_id")
    private String purchaseUnitId;

    @ApiModelProperty("计价单位编码")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;

    @ApiModelProperty("计价单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;

    @ApiModelProperty("计价单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;

    @ApiModelProperty("计价单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private Integer purchaseUnitRoundOffType;

    @ApiModelProperty("计价数量")
    @TableField("number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal number;

    @ApiModelProperty("源单可转应付数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal canApNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("生产日期")
    @TableField("produce_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime produceTime;

    @ApiModelProperty("有效期至")
    @TableField("period_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime periodTime;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("关联单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源采购发票登记明细id(红字应付单&财务应付单适用)")
    @TableField("source_invoice_detail_id")
    private String sourceInvoiceDetailId;

    @ApiModelProperty("源采购发票登记id(红字应付单&财务应付单适用)")
    @TableField("source_invoice_order_id")
    private String sourceInvoiceOrderId;

    @ApiModelProperty("采购订单明细id")
    @TableField("purchase_detail_id")
    private String purchaseDetailId;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField(exist = false)
    private String lotNoControlTypeName;

    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField(exist = false)
    private String lotNoScopeName;

    @ApiModelProperty("单价")
    @TableField("price")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("金额")
    @TableField("amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("已开票数量")
    @TableField("already_invoice_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal alreadyInvoiceNumber;

    @ApiModelProperty("开票占用数量")
    @TableField("occupy_invoice_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal occupyInvoiceNumber;

    @ApiModelProperty("开票未税金额=已开票数量*单价")
    @TableField("invoice_not_tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal invoiceNotTaxAmount;

    @ApiModelProperty("开票含税金额=已开票数量*含税单价")
    @TableField("invoice_including_tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal invoiceIncludingTaxAmount;

    @ApiModelProperty("未开票数量")
    @TableField("not_invoice_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal notInvoiceNumber;

    @ApiModelProperty("开票占用数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal canInvoiceNumber;

    @ApiModelProperty("未开票未税金额=未开票数量*未税单价")
    @TableField("not_invoice_not_tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal notInvoiceNotTaxAmount;

    @ApiModelProperty("未开票含税金额=未开票数量*含税单价")
    @TableField("not_invoice_including_tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal notInvoiceIncludingTaxAmount;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("付款单占用付款金额")
    @TableField("occupy_amount")
    private BigDecimal occupyAmount;
    @TableField(exist = false)
    private BigDecimal oldOccupyAmount;
    @ApiModelProperty("已付款金额")
    @TableField("applied_amount")
    private BigDecimal appliedAmount;
    @TableField(exist = false)
    private BigDecimal oldAppliedAmount;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("付款退款单占用退款金额")
    @TableField("occupy_refund_amount")
    private BigDecimal occupyRefundAmount;
    @ApiModelProperty("付款退款单占用退款金额")
    @TableField(exist = false)
    private BigDecimal oldOccupyRefundAmount;
    @ApiModelProperty("付款退款单已退款金额")
    @TableField("refunded_amount")
    private BigDecimal refundedAmount;
    @ApiModelProperty("付款退款单已退款金额")
    @TableField(exist = false)
    private BigDecimal oldRefundedAmount;

    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    public BigDecimal numberNN() {
        return Optional.ofNullable(number).orElse(BigDecimal.ZERO);
    }

    public BigDecimal priceNN() {
        return Optional.ofNullable(price).orElse(BigDecimal.ZERO);
    }

    public BigDecimal priceIncludingTaxNN() {
        return Optional.ofNullable(priceIncludingTax).orElse(BigDecimal.ZERO);
    }

    public BigDecimal amountNN() {
        return Optional.ofNullable(amount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal baseCurrencyAmountNN() {
        return Optional.ofNullable(baseCurrencyAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal taxAmountNN() {
        return Optional.ofNullable(taxAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal occupyAmountNN() {
        return Optional.ofNullable(occupyAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal appliedAmountNN() {
        return Optional.ofNullable(appliedAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal baseCurrencyTaxAmountNN() {
        return Optional.ofNullable(baseCurrencyTaxAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal amountIncludingTaxNN() {
        return Optional.ofNullable(amountIncludingTax).orElse(BigDecimal.ZERO);
    }

    public BigDecimal baseCurrencyAmountIncludingTaxNN() {
        return Optional.ofNullable(baseCurrencyAmountIncludingTax).orElse(BigDecimal.ZERO);
    }

    public BigDecimal alreadyInvoiceNumberNN() {
        return Optional.ofNullable(alreadyInvoiceNumber).orElse(BigDecimal.ZERO);
    }

    public BigDecimal occupyInvoiceNumberNN() {
        return Optional.ofNullable(occupyInvoiceNumber).orElse(BigDecimal.ZERO);
    }

    public BigDecimal invoiceNotTaxAmountNN() {
        return Optional.ofNullable(invoiceNotTaxAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal invoiceIncludingTaxAmountNN() {
        return Optional.ofNullable(invoiceIncludingTaxAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal notInvoiceNumberNN() {
        return Optional.ofNullable(notInvoiceNumber).orElse(numberNN());
    }

    public BigDecimal notInvoiceNotTaxAmountNN() {
        return Optional.ofNullable(notInvoiceNotTaxAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal notInvoiceIncludingTaxAmountNN() {
        return Optional.ofNullable(notInvoiceIncludingTaxAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal occupyRefundAmountNN() {
        return Optional.ofNullable(occupyRefundAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal oldOccupyRefundAmountNN() {
        return Optional.ofNullable(oldOccupyRefundAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal refundedAmountNN() {
        return Optional.ofNullable(refundedAmount).orElse(BigDecimal.ZERO);
    }

    public BigDecimal oldRefundedAmountNN() {
        return Optional.ofNullable(oldRefundedAmount).orElse(BigDecimal.ZERO);
    }
}
