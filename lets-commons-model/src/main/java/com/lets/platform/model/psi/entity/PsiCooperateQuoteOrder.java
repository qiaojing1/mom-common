package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.PricingModeEnum;
import com.lets.platform.model.psi.enums.QuoteAdoptStatusEnum;
import com.lets.platform.model.psi.enums.SupplierRecommendPlanEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 协同报价单
 *
 * @author DING WEI
 * @since 2025-03-27
 */
@Getter
@Setter
@TableName("psi_cooperate_quote_order")
@ApiModel(value = "PsiCooperateQuoteOrder对象", description = "协同报价单")
public class PsiCooperateQuoteOrder extends BaseEntity {

    @TableField(exist = false)
    private Integer index;

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
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiOrderCategory orderCategory;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型")
    @TableField("business_name")
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    /**
     * @see PricingModeEnum
     */
    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("报价人员")
    @TableField("quote_user_id")
    private String quoteUserId;
    @ApiModelProperty("报价人员名称")
    @TableField("quote_user_name")
    private String quoteUserName;

    @ApiModelProperty("供应商用户")
    @TableField("supplier_user_id")
    private String supplierUserId;
    @ApiModelProperty("供应商用户名称")
    @TableField("supplier_user_name")
    private String supplierUserName;

    @ApiModelProperty("结算币种")
    @TableField("settlement_currency_id")
    private String settlementCurrencyId;
    @ApiModelProperty("结算币种名称")
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;
    @ApiModelProperty("结算币种单价精度")
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;
    @ApiModelProperty("结算币种金额精度")
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;
    @ApiModelProperty("结算币种舍入类型")
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;

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

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("生效日期")
    @TableField("effective_date")
    private LocalDate effectiveDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("失效日期")
    @TableField("expiring_date")
    private LocalDate expiringDate;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;
    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;
    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;
    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;
    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("报价明细")
    @TableField(exist = false)
    private List<PsiCooperateQuoteOrderDetail> details;

    @ApiModelProperty("采购订单")
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
    @ApiModelProperty("物料特征属性名称")
    @TableField(exist = false)
    private String materialSpecific;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @TableField(exist = false)
    private String basicUnitId;

    @ApiModelProperty("采购单位")
    @TableField(exist = false)
    private String purchaseUnitId;
    @ApiModelProperty("采购单位编码")
    @TableField(exist = false)
    private String purchaseUnitCode;
    @ApiModelProperty("采购单位编码")
    @TableField(exist = false)
    private String purchaseUnitName;
    @ApiModelProperty("采购单位精度")
    @TableField(exist = false)
    private Integer purchaseUnitAccuracy;
    @ApiModelProperty("采购单位舍入类型")
    @TableField(exist = false)
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("需求日期")
    @TableField(exist = false)
    private LocalDate demandDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("交货日期")
    @TableField(exist = false)
    private LocalDate deliveryDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("询价数量")
    @TableField(exist = false)
    private BigDecimal priceInquiryNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采纳数量")
    @TableField(exist = false)
    private BigDecimal adoptNumber;
    @ApiModelProperty("剩余采纳数量")
    @TableField(exist = false)
    private BigDecimal surplusAdoptNumber;

    @ApiModelProperty("税种")
    @TableField(exist = false)
    private String taxId;
    @ApiModelProperty("税种名称")
    @TableField(exist = false)
    private String taxName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税率")
    @TableField(exist = false)
    private BigDecimal taxRate;
    @ApiModelProperty("税种精度")
    @TableField(exist = false)
    private Integer taxAccuracy;
    @ApiModelProperty("税种分类")
    @TableField(exist = false)
    private String taxType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal includingTaxPrice;
    @TableField(exist = false)
    private BigDecimal baseCurrencyIncludingTaxPrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField(exist = false)
    private BigDecimal amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("价税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("价税合计(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField(exist = false)
    private BigDecimal taxAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;

    /**
     * @see QuoteAdoptStatusEnum
     */
    @ApiModelProperty("报价采纳状态[0:未采纳,1:已采纳]")
    @TableField(exist = false)
    private Integer quoteAdoptStatus;
    @TableField(exist = false)
    private String quoteAdoptStatusName;

    @ApiModelProperty("源单id")
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
    @ApiModelProperty("源单明细id")
    @TableField(exist = false)
    private String sourceDetailId;
    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Long sourceDetailLineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @ApiModelProperty("综合评分")
    @TableField(exist = false)
    private BigDecimal totalScore;
    @ApiModelProperty("到货及时率")
    @TableField(exist = false)
    private BigDecimal deliveryAnalysisRate;
    @ApiModelProperty("合格率")
    @TableField(exist = false)
    private BigDecimal qualifiedRate;

    @TableField(exist = false)
    private SupplierRecommendPlanEnum supplierRecommendPlanEnum;

    @TableField(exist = false)
    private String supplierIdAndMaterialId;
}
