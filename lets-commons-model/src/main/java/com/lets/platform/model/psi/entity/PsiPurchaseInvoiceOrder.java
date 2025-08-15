package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.enums.InvoiceBlueOrRedEnum;
import com.lets.platform.model.psi.enums.InvoiceTypeEnum;
import com.lets.platform.model.psi.enums.PricingModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 采购发票登记(最新版)
 * @author DING WEI
 * @since 2024-04-03
 */
@Getter
@Setter
@TableName("psi_purchase_invoice_order")
@ApiModel(value = "PsiPurchaseInvoiceOrder对象", description = "采购发票登记(最新版)")
public class PsiPurchaseInvoiceOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @NotBlank(message = "Order.orderCategoryId", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    /**
     * @see com.lets.platform.model.psi.enums.InvoiceTypeEnum
     */
    @ValidatedEnum(enumClass = InvoiceTypeEnum.class, required = true, message = "invoiceType", groups = {Save.class, Update.class})
    @ApiModelProperty("发票类型[VALUE_ADDED_TAX:增值税普通发票;NATIONAL_SPECIAL:全国专票;NATIONAL_ORDINARY:全国普票;OVERSEAS:海外发票]")
    @TableField("invoice_type")
    private String invoiceType;
    @TableField(exist = false)
    private String invoiceTypeName;

    @NotNull(message = "InvoiceOrder.orderTime", groups = {Save.class, Update.class})
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("登记日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @NotBlank(message = "invoiceSupplierId", groups = {Save.class, Update.class})
    @ApiModelProperty("开票供应商")
    @TableField("invoice_supplier_id")
    private String invoiceSupplierId;
    @ApiModelProperty("开票供应商名称")
    @TableField("invoice_supplier_name")
    private String invoiceSupplierName;

    @NotBlank(message = "invoiceNo", groups = {Save.class, Update.class})
    @Pattern(regexp = GlobalConstant.NUMBER_LETTER_1_100, message = "invoiceNo", groups = {Save.class, Update.class})
    @ApiModelProperty("发票号码")
    @TableField("invoice_no")
    private String invoiceNo;

    @NotBlank(message = "Order.currencyId", groups = {Save.class, Update.class})
    @ApiModelProperty("币种主键")
    @TableField("currency_id")
    private String currencyId;
    @ApiModelProperty("币种名称")
    @TableField("currency_name")
    private String currencyName;
    @ApiModelProperty("币种单价精度")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;
    @ApiModelProperty("币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;
    @ApiModelProperty("币种舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;
    @ApiModelProperty("币种符号")
    @TableField("currency_symbol")
    private String currencySymbol;

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
    @ApiModelProperty("本位币符号")
    @TableField("basic_currency_symbol")
    private String basicCurrencySymbol;

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;
    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;
    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("开票日期")
    @TableField("invoice_time")
    private LocalDateTime invoiceTime;
    @NotNull(message = "InvoiceOrder.totalPriceAndTax", groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("价税合计")
    @TableField("total_price_and_tax")
    private BigDecimal totalPriceAndTax;

    /**
     * @see com.lets.platform.model.psi.enums.InvoiceBlueOrRedEnum
     */
    @ValidatedEnum(enumClass = InvoiceBlueOrRedEnum.class, required = true, message = "blueOrRed", groups = {Save.class, Update.class})
    @ApiModelProperty("红蓝字[1:红字;2:蓝字;]")
    @TableField("blue_or_red")
    private String blueOrRed;
    @TableField(exist = false)
    private String blueOrRedName;

    /**
     * @see com.lets.platform.model.psi.enums.PricingModeEnum
     */
    @ValidatedEnum(enumClass = PricingModeEnum.class, message = "pricingMode", groups = {Save.class, Update.class})
    @ApiModelProperty("作价模式[1:按含税单价录入;2:按单价录入;3:按价税合计录入;4:按未税金额录入]")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核,4:已过账]")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    /**
     * @see com.lets.platform.model.psi.enums.IsOrNotEnum
     */
    @ApiModelProperty("作废状态[0:否;1:是]")
    @TableField("cancel")
    private Integer cancel;
    @TableField(exist = false)
    private String cancelName;

    @Length(max = 200, message = "InvoiceOrder.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("作废时间")
    @TableField("cancel_time")
    private LocalDateTime cancelTime;
    @ApiModelProperty("作废人")
    @TableField("cancel_user")
    private String cancelUser;
    @ApiModelProperty("作废人名称")
    @TableField("cancel_user_name")
    private String cancelUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @NotEmpty(message = "OrderDetail.NotEmpty", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<PsiPurchaseInvoiceOrderDetail> details;

    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("采购发票登记订单")
    @TableField(exist = false)
    private String orderId;

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
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("计价单位")
    @TableField(exist = false)
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField(exist = false)
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField(exist = false)
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField(exist = false)
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField(exist = false)
    private Integer pricingUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计价数量")
    @TableField(exist = false)
    private BigDecimal pricingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已开票数量(红字)")
    @TableField(exist = false)
    private BigDecimal alreadyRedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("开票占用数量(红字)")
    @TableField(exist = false)
    private BigDecimal occupyRedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;

    @ApiModelProperty("税种ID")
    @TableField(exist = false)
    private String taxId;
    @ApiModelProperty("税种分类")
    @TableField(exist = false)
    private String taxType;
    @ApiModelProperty("税种名称")
    @TableField(exist = false)
    private String taxName;
    @ApiModelProperty("税率")
    @TableField(exist = false)
    private String taxRate;
    @ApiModelProperty("税种精度")
    @TableField(exist = false)
    private Integer taxAccuracy;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal priceIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField(exist = false)
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField(exist = false)
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("提货金额")
    @TableField(exist = false)
    private BigDecimal pickUpAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("提货金额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyPickUpAmount;

    @ApiModelProperty("源单主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Long sourceLineNumber;
    @ApiModelProperty("关联单据明细主键")
    @TableField(exist = false)
    private String sourceDetailId;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private String isPurchaseMaterialDemand;
}
