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
import java.util.List;
import java.util.Objects;

/**
 * 采购发票登记-物料明细(最新版)
 * @author DING WEI
 * @since 2024-04-03
 */
@Getter
@Setter
@TableName("psi_purchase_invoice_order_detail")
@ApiModel(value = "PsiPurchaseInvoiceOrderDetail对象", description = "采购发票登记-物料明细(最新版)")
public class PsiPurchaseInvoiceOrderDetail extends BaseEntity {

    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("采购发票登记订单")
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
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("计价单位")
    @TableField("pricing_unit_id")
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField("pricing_unit_code")
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField("pricing_unit_name")
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField("pricing_unit_accuracy")
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField("pricing_unit_round_off_type")
    private Integer pricingUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计价数量")
    @TableField("pricing_number")
    private BigDecimal pricingNumber;
    @ApiModelProperty(value = "计价数量(单位转换后)", hidden = true)
    @TableField(exist = false)
    private BigDecimal pricingNumberConvert;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已开票数量(红字)")
    @TableField("already_red_number")
    private BigDecimal alreadyRedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("开票占用数量(红字)")
    @TableField("occupy_red_number")
    private BigDecimal occupyRedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @ApiModelProperty("可开票数量")
    @TableField(exist = false)
    private BigDecimal canInvoiceNumber;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("提货金额")
    @TableField("pick_up_amount")
    private BigDecimal pickUpAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("提货金额(本位币)")
    @TableField("base_currency_pick_up_amount")
    private BigDecimal baseCurrencyPickUpAmount;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;
    @ApiModelProperty("关联单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @TableField(exist = false)
    @ApiModelProperty("采购发票明细行关联的源单")
    private List<PsiPurchaseInvoiceOrderDetailSource> sourceList;

    public BigDecimal alreadyRedNumberNotNull() {
        if (Objects.isNull(alreadyRedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyRedNumber;
        }
    }

    public BigDecimal occupyRedNumberNotNull() {
        if (Objects.isNull(occupyRedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyRedNumber;
        }
    }

}
