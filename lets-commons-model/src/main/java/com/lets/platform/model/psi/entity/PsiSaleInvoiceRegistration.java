package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 销售发票登记表头
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_sale_invoice_registration")
@ApiModel(value = "PsiSaleInvoiceRegistration对象", description = "销售发票登记表头")
public class PsiSaleInvoiceRegistration extends BaseEntity {

    @ApiModelProperty("登记编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("单据类型")
    @TableField("order_type")
    private String orderType;

    @ApiModelProperty("单据类型名称")
    @TableField("order_type_name")
    private String orderTypeName;

    @ApiModelProperty("发票类型: 1增值税普通发票 2全国专票 3全国普票 4海外发票")
    @TableField("invoice_type")
    private String invoiceType;
    @TableField(exist = false)
    private String invoiceTypeName;

    @ApiModelProperty("登记日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("开票客户ID")
    @TableField("invoice_customer_id")
    private String invoiceCustomerId;

    @ApiModelProperty("开票客户名称")
    @TableField("invoice_customer_name")
    private String invoiceCustomerName;

    @ApiModelProperty("发票号码")
    @TableField("invoice_no")
    private String invoiceNo;

    @ApiModelProperty("币种ID")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("币种名称")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("币种名称")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("币种货币舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;

    @ApiModelProperty("币种货币符号")
    @TableField("currency_symbol")
    private String currencySymbol;

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("开票日期")
    @TableField("invoicing_date")
    private LocalDateTime invoicingDate;

    @ApiModelProperty("含税合计(币种)")
    @TableField("currency_amount_including_tax")
    private BigDecimal currencyAmountIncludingTax;

    @ApiModelProperty("红蓝字发票 1:红字 2:蓝字")
    @TableField("blue_or_red")
    private String blueOrRed;
    @TableField(exist = false)
    private String blueOrRedName;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("本位币id")
    @TableField("base_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField("base_currency_name")
    private String baseCurrencyName;

    @ApiModelProperty("本位币金额精度")
    @TableField("base_currency_amount_accuracy")
    private Integer baseCurrencyAmountAccuracy;

    @ApiModelProperty("本位币单价精度")
    @TableField("base_currency_price_accuracy")
    private Integer baseCurrencyPriceAccuracy;

    @ApiModelProperty("本位币舍入类型")
    @TableField("base_currency_round_off_type")
    private Integer baseCurrencyRoundOffType;

    @ApiModelProperty("本位币符号")
    @TableField(exist = false)
    private String baseCurrencySymbol;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("文件id")
    @TableField("enclosureIds")
    private String enclosureIds;

    @TableField(exist = false)
    private Collection<CommonFile> enclosureFileList;

    @ApiModelProperty("登记状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("作废状态")
    @TableField("cancel_status")
    private String cancelStatus;
    @TableField(exist = false)
    private String cancelStatusName;

    @ApiModelProperty("开启关闭状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("作废时间")
    @TableField("cancel_time")
    private LocalDateTime cancelTime;

    @ApiModelProperty("作废人")
    @TableField("cancel_user")
    private String cancelUser;

    @ApiModelProperty("作废人名称")
    @TableField("cancel_user_name")
    private String cancelUserName;

    @ApiModelProperty("表体明细列表")
    @TableField(exist = false)
    private List<PsiSaleInvoiceRegistrationDetail> details;
}
