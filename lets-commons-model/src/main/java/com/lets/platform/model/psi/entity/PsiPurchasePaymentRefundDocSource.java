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
 * 付款退款单源单信息
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-05-20
 */
@Getter
@Setter
@TableName("psi_purchase_payment_refund_doc_source")
@ApiModel(value = "PsiPurchasePaymentRefundDocSource对象", description = "付款退款单源单信息")
public class PsiPurchasePaymentRefundDocSource extends BaseEntity {

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("付款退款单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("付款退款单明细id")
    @TableField("parent_id")
    private String parentId;

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

    @ApiModelProperty("源单id")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单明细id")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单明细行号")
    @TableField("source_line_number")
    private Integer sourceLineNumber;

    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

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

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("应退金额")
    @TableField("amount_to_be_refunded")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountToBeRefunded;

    @ApiModelProperty("应退金额(本位币)")
    @TableField("basic_amount_to_be_refunded")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal basicAmountToBeRefunded;

    @ApiModelProperty("本次退款金额")
    @TableField("current_amount_refunded")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal currentAmountRefunded;

    @ApiModelProperty("本次退款金额(本位币)")
    @TableField("current_basic_amount_refunded")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal currentBasicAmountRefunded;

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

    @ApiModelProperty("单价")
    @TableField("price")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

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
}
