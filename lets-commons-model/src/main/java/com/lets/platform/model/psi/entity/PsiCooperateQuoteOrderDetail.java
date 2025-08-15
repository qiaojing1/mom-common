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
import java.time.LocalDate;
import java.util.List;

/**
 * 协同报价单-明细
 * @author DING WEI
 * @since 2025-03-27
 */
@Getter
@Setter
@TableName("psi_cooperate_quote_order_detail")
@ApiModel(value = "PsiCooperateQuoteOrderDetail对象", description = "协同报价单-明细")
public class PsiCooperateQuoteOrderDetail extends BaseEntity {

    @ApiModelProperty("采购订单")
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
    @ApiModelProperty("物料特征属性名称")
    @TableField("material_specific")
    private String materialSpecific;
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("采购单位")
    @TableField("purchase_unit_id")
    private String purchaseUnitId;
    @ApiModelProperty("采购单位编码")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;
    @ApiModelProperty("采购单位编码")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;
    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;
    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("需求日期")
    @TableField("demand_date")
    private LocalDate demandDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("交货日期")
    @TableField("delivery_date")
    private LocalDate deliveryDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("询价数量")
    @TableField("price_inquiry_number")
    private BigDecimal priceInquiryNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采纳数量")
    @TableField("adopt_number")
    private BigDecimal adoptNumber;

    @ApiModelProperty("税种")
    @TableField("tax_id")
    private String taxId;
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;
    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;
    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    private String taxType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    private BigDecimal includingTaxPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("价税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("价税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;

    /**
     * @see com.lets.platform.model.psi.enums.QuoteAdoptStatusEnum
     */
    @ApiModelProperty("报价采纳状态[0:未采纳,1:已采纳]")
    @TableField("quote_adopt_status")
    private Integer quoteAdoptStatus;
    @TableField(exist = false)
    private String quoteAdoptStatusName;

    @ApiModelProperty("源单id")
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
    @ApiModelProperty("源单明细id")
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField("source_detail_line_number")
    private Long sourceDetailLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private List<PsiCooperateQuoteOrderDetailSpecific> detailSpecifics;
    @ApiModelProperty("交货计划")
    @TableField(exist = false)
    private List<PsiCooperateQuoteOrderDetailDeliveryPlan> detailDeliveryPlans;
}
