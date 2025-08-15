package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
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
import java.util.List;

/**
 * <p>
 * 销售发票登记明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_sale_invoice_registration_detail")
@ApiModel(value = "PsiSaleInvoiceRegistrationDetail对象", description = "销售发票登记明细")
public class PsiSaleInvoiceRegistrationDetail extends BaseEntity {
    /**以下为表头信息**/
    @ApiModelProperty("登记编号")
    @TableField(exist = false)
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField(exist = false)
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField(exist = false)
    private String orderCategoryName;

    /**
     * InvoiceTypeEnum.class
     */
    @ApiModelProperty("发票类型: 1增值税普通发票 2全国专票 3全国普票 4海外发票")
    @TableField(exist = false)
    private String invoiceType;
    @TableField(exist = false)
    private String invoiceTypeName;

    @ApiModelProperty("登记日期")
    @TableField(exist = false)
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeStr;

    @ApiModelProperty("开票客户ID")
    @TableField(exist = false)
    private String invoiceCustomerId;

    @ApiModelProperty("开票客户名称")
    @TableField(exist = false)
    private String invoiceCustomerName;

    @ApiModelProperty("发票号码")
    @TableField(exist = false)
    private String invoiceNo;

    @ApiModelProperty("币种ID")
    @TableField(exist = false)
    private String currencyId;

    @ApiModelProperty("币种名称")
    @TableField(exist = false)
    private String currencyName;

    @ApiModelProperty("币种金额精度")
    @TableField(exist = false)
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("币种单价精度")
    @TableField(exist = false)
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("币种货币舍入类型")
    @TableField(exist = false)
    private String currencyRoundOffType;

    @ApiModelProperty("开票日期")
    @TableField(exist = false)
    private LocalDateTime invoicingDate;

    @ApiModelProperty("开票日期")
    @TableField(exist = false)
    private String invoicingDateStr;

    @ApiModelProperty("含税合计(币种)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal currencyAmountIncludingTax;

    @ApiModelProperty("含税合计(币种)")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String currencyAmountIncludingTaxStr;

    @ApiModelProperty("红蓝字发票 1:红字 2:蓝字")
    @TableField(exist = false)
    private String blueOrRed;
    @TableField(exist = false)
    private String blueOrRedName;

    @ApiModelProperty("作价模式")
    @TableField(exist = false)
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("本位币名称")
    @TableField(exist = false)
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField(exist = false)
    private String baseCurrencyName;

    @ApiModelProperty("本位币金额精度")
    @TableField(exist = false)
    private Integer baseCurrencyAmountAccuracy;

    @ApiModelProperty("本位币单价精度")
    @TableField(exist = false)
    private Integer baseCurrencyPriceAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField(exist = false)
    private String baseCurrencyRoundOffType;

    @ApiModelProperty("文件id")
    @TableField(exist = false)
    private String enclosureIds;

    @ApiModelProperty("登记状态")
    @TableField(exist = false)
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("开启关闭状态")
    @TableField(exist = false)
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("审核时间")
    @TableField(exist = false)
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField(exist = false)
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField(exist = false)
    private String auditUserName;

    @ApiModelProperty("关闭时间")
    @TableField(exist = false)
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField(exist = false)
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField(exist = false)
    private String disableUserName;

    @ApiModelProperty("作废状态")
    @TableField(exist = false)
    private String cancelStatus;
    @TableField(exist = false)
    private String cancelStatusName;

    @ApiModelProperty("作废时间")
    @TableField(exist = false)
    private LocalDateTime cancelTime;

    @ApiModelProperty("作废人")
    @TableField(exist = false)
    private String cancelUser;

    @ApiModelProperty("作废人名称")
    @TableField(exist = false)
    private String cancelUserName;

    @ApiModelProperty("表头备注")
    @TableField(exist = false)
    private String remark;

    /**以上为表头信息**/

    @ApiModelProperty("发票单明细行id")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("表体编码")
    @TableField(exist = false)
    private String detailCode;

    @ApiModelProperty("发票单主表ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("计价单位ID（取基本单位）")
    @TableField("basic_unit_id")
    private String basicUnitId;

    @ApiModelProperty("计价单位名称")
    @TableField("basic_unit_name")
    private String basicUnitName;

    @ApiModelProperty("计价单位精度")
    @TableField("basic_unit_accuracy")
    private Integer basicUnitAccuracy;

    @ApiModelProperty("计价单位舍入类型")
    @TableField("basic_unit_round_off_type")
    private String basicUnitRoundOffType;

    @ApiModelProperty("计价数量")
    @TableField("pricing_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal pricingQuantity;

    @ApiModelProperty("可开票数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal unvoicedQuantity;

    @ApiModelProperty("单价")
    @TableField("price")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal priceIncludingTax;

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

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("金额")
    @TableField("amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("价税合计")
    @TableField("amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountIncludingTax;

    @TableField(exist = false)
    private String amountIncludingTaxStr;

    @ApiModelProperty("价税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal baseCurrencyAmountIncludingTax;
    @TableField(exist = false)
    private String baseCurrencyAmountIncludingTaxStr;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String rowRemark;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("蓝字发票单id")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("蓝字发票单明细行id")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("蓝字发票单明细行行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("蓝字发票单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("蓝字发票单单据类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ApiModelProperty("蓝字发票单单据类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("可红字数量")
    @TableField(exist = false)
    private BigDecimal canRedNumber;

    // source表里关联的数据id
    @TableField(exist = false)
    private String detailSourceId;

    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @TableField(exist = false)
    private String isMateialDemand;
    /**
     * 特征属性列表
     */
    @TableField(exist = false)
    @ExcelIgnore
    private List<PsiSaleInvoiceRegistrationDetailCharacteristic> characteristicList;

    /**
     * 当前明细行关联的源单信息
     */
    @TableField(exist = false)
    @ExcelIgnore
    private List<PsiSaleInvoiceRegistrationSource> sources;
}
