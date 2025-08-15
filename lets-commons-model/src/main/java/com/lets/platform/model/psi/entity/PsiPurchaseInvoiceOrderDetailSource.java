package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 采购发票登记明细行关联源单信息
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-31
 */
@Getter
@Setter
@TableName("psi_purchase_invoice_order_detail_source")
@ApiModel(value = "PsiPurchaseInvoiceOrderDetailSource对象", description = "采购发票登记明细行关联源单信息")
public class PsiPurchaseInvoiceOrderDetailSource extends BaseEntity {

    @ApiModelProperty("单据id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("单据明细id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("本次开票数量")
    @TableField("number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal number;

    @ApiModelProperty("原始开票数量")
    @TableField("original_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal originalNumber;

    @ApiModelProperty("单价")
    @TableField("price")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    @ApiModelProperty("税种ID")
    @TableField("tax_id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String taxId;

    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String taxType;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String taxName;

    @ApiModelProperty("税率")
    @TableField("tax_rate")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String taxRate;

    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("关联单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;
}
