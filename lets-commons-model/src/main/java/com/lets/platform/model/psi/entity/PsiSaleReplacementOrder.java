package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 销售换货申请单
 * </p>
 *
 * @author FZY
 * @since 2025-05-19
 */
@Getter
@Setter
@TableName("psi_sale_replacement_order")
@ApiModel(value = "PsiSaleReplacementOrder对象", description = "销售换货申请单")
public class PsiSaleReplacementOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[单据编号]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
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

    @ApiModelProperty("业务类型")
    @TableField("business_code")
    private String businessCode;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("订货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("订货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("订货客户分组ID")
    @TableField("order_customer_group_id")
    private String orderCustomerGroupId;

    @ApiModelProperty("订货客户税种ID")
    @TableField("order_customer_default_tax_id")
    private String orderCustomerDefaultTaxId;

    @ApiModelProperty("订货客户税种分类")
    @TableField("order_customer_default_tax_type")
    private String orderCustomerDefaultTaxType;

    @ApiModelProperty("订货客户税种名称")
    @TableField("order_customer_default_tax_name")
    private String orderCustomerDefaultTaxName;

    @ApiModelProperty("订货客户税种税率")
    @TableField("order_customer_default_tax_rate")
    private String orderCustomerDefaultTaxRate;

    @ApiModelProperty("订货客户税种精度")
    @TableField("order_customer_default_tax_accuracy")
    private Integer orderCustomerDefaultTaxAccuracy;

    @ApiModelProperty("销售部门ID")
    @TableField("sale_org_id")
    private String saleOrgId;

    @ApiModelProperty("销售部门名称")
    @TableField("sale_org_name")
    private String saleOrgName;

    @ApiModelProperty("销售人员ID")
    @TableField("sale_user_id")
    private String saleUserId;

    @ApiModelProperty("销售人员名称")
    @TableField("sale_user_name")
    private String saleUserName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("结算币种ID")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("币种编码")
    @TableField("currency_code")
    private String currencyCode;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("结算币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算货币舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;

    @ApiModelProperty("本位币ID")
    @TableField("base_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("本位币币种编码")
    @TableField("base_currency_code")
    private String baseCurrencyCode;

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

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;

    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("收款条件ID")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("结算方式ID")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("联系人ID")
    @TableField("order_customer_contact_user_id")
    private String orderCustomerContactUserId;

    @ApiModelProperty("联系人")
    @TableField("order_customer_contact_user")
    private String orderCustomerContactUser;

    @ApiModelProperty("联系电话")
    @TableField("order_customer_contact_phone_number")
    private String orderCustomerContactPhoneNumber;

    @ApiModelProperty("联系地址")
    @TableField("order_customer_contact_address")
    private String orderCustomerContactAddress;

    @ApiModelProperty("收货客户ID")
    @TableField("receive_customer_id")
    private String receiveCustomerId;

    @ApiModelProperty("收货客户名称")
    @TableField("receive_customer_name")
    private String receiveCustomerName;

    @ApiModelProperty("收货联系人ID")
    @TableField("receive_customer_contact_user_id")
    private String receiveCustomerContactUserId;

    @ApiModelProperty("收货联系人")
    @TableField("receive_customer_contact_user")
    private String receiveCustomerContactUser;

    @ApiModelProperty("收货联系电话")
    @TableField("receive_customer_contact_phone_number")
    private String receiveCustomerContactPhoneNumber;

    @ApiModelProperty("收货联系地址")
    @TableField("receive_customer_contact_address")
    private String receiveCustomerContactAddress;

    @ApiModelProperty("结算客户ID")
    @TableField("settlement_customer_id")
    private String settlementCustomerId;

    @ApiModelProperty("结算客户名称")
    @TableField("settlement_customer_name")
    private String settlementCustomerName;

    @ApiModelProperty("付款客户ID")
    @TableField("payment_customer_id")
    private String paymentCustomerId;

    @ApiModelProperty("付款客户名称")
    @TableField("payment_customer_name")
    private String paymentCustomerName;

    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty("税额")
    @TableField("total_tax_amount")
    private BigDecimal totalTaxAmount;

    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

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

    @ApiModelProperty("文件ID")
    @TableField(exist = false)
    private List<String> fileIds;

    @TableField(exist = false)
    private List<PsiSaleReplacementOrderDetail> detailList;
}
