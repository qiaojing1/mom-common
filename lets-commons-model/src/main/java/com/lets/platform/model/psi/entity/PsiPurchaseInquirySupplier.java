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
import java.time.LocalDateTime;

/**
 * <p>
 * 采购询价单供应商明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-10-23
 */
@Getter
@Setter
@TableName("psi_purchase_inquiry_supplier")
@ApiModel(value = "PsiPurchaseInquirySupplier对象", description = "采购询价单供应商明细")
public class PsiPurchaseInquirySupplier extends BaseEntity {

    @ApiModelProperty("采购询价单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("采购申请单ID")
    @TableField(exist = false)
    private String applyOrderDetailId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("供应商id")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("供应商编码")
    @TableField("supplier_code")
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("交货日期")
    @TableField("delivery_date")
    private LocalDateTime deliveryDate;

    @ApiModelProperty("单价")
    @TableField("price")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal includingTaxPrice;

    @ApiModelProperty("税种")
    @TableField("tax_id")
    private String taxId;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;

    @ApiModelProperty("税率")
    @TableField("tax_rate")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal taxRate;

    @ApiModelProperty("税种类型")
    @TableField("tax_type")
    private String taxType;

    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

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

    @ApiModelProperty("价税合计")
    @TableField("amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("价税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("业务状态[0未处理1已处理]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭用户")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭用户名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("总评分")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalScore;

    @ApiModelProperty("到货及时率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal deliveryAnalysisRate;

    @ApiModelProperty("合格率")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualifiedRate;

    @ApiModelProperty("历史最高价")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal historyMaxPrice;

    @ApiModelProperty("历史最低价")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal historyMinPrice;

    @ApiModelProperty("历史平均价")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal historyAvgPrice;
}
