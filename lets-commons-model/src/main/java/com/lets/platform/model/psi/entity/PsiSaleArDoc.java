package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.vo.SaleArDocDetailExcelVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 销售应收单
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("psi_sale_ar_doc")
@ApiModel(value = "PsiSaleArDoc对象", description = "销售应收单")
public class PsiSaleArDoc extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("单据编码")
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

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("蓝字或红字")
    @TableField("blue_or_red")
    private String blueOrRed;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderTime;

    @ApiModelProperty("订货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("订货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

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

    @ApiModelProperty("结算币种ID")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("结算币种名称")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("结算币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种单价精度")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算币种舍入类型")
    @TableField("currency_round_off_type")
    private String currencyRoundOffType;

    @ApiModelProperty("结算币种符号")
    @TableField("currency_symbol")
    private String currencySymbol;

    @ApiModelProperty("本位币ID")
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
    private String baseCurrencyRoundOffType;

    @ApiModelProperty("本位币符号")
    @TableField("base_currency_symbol")
    private String baseCurrencySymbol;

    @ApiModelProperty("汇率表ID")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    /**
     * @see com.lets.platform.model.psi.enums.SaleEstablishAccWayEnum
     */
    @ApiModelProperty("立账方式")
    @TableField("establishing_acc_way")
    private String establishingAccWay;
    @ApiModelProperty("立账方式")
    @TableField(exist = false)
    private String establishingAccWayName;

    @ApiModelProperty("收款条件ID")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @TableField(exist = false)
    private Integer paymentConditionPriority;

    @ApiModelProperty("结算方式ID")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("仓库部门ID")
    @TableField("store_org_id")
    private String storeOrgId;

    @ApiModelProperty("仓库部门名称")
    @TableField("store_org_name")
    private String storeOrgName;

    @ApiModelProperty("库管员ID")
    @TableField("store_user_id")
    private String storeUserId;

    @ApiModelProperty("库管员名称")
    @TableField("store_user_name")
    private String storeUserName;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;

    @ApiModelProperty("作价模式")
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal taxAmount;

    @ApiModelProperty("金额")
    @TableField("total_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalAmount;

    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalAmountIncludingTax;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "[附件]不能超过20个", groups = {Save.class, Update.class})
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("乐观锁版本")
    @TableField("version")
    private Integer version;

    @ApiModelProperty("明细列表")
    @TableField(exist = false)
    private List<PsiSaleArDocDetail> details;

    @ApiModelProperty("红字应收单自动编码使用")
    @TableField(exist = false)
    private String sourceOrderCode;
}
