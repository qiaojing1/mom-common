package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * 销售变更单
 * </p>
 *
 * @author FZY
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("psi_sale_return_application_order")
@ApiModel(value = "PsiSaleReturnApplicationOrder对象", description = "销售变更单")
public class PsiSaleReturnApplicationOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("单据类别code")
    @TableField(exist = false)
    private String orderCategoryCode;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

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

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("退货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("退货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("收货客户ID")
    @TableField("receive_customer_id")
    private String receiveCustomerId;

    @ApiModelProperty("收货客户名称")
    @TableField("receive_customer_name")
    private String receiveCustomerName;

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
    private Integer currencyRoundOffType;

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


    @ApiModelProperty("收款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("收款条件")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("结算方式")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @ApiModelProperty("价税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("关闭状态")
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

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @ApiModelProperty("作价模式")
    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("销售部门ID")
    @TableField("sale_org_id")
    private String saleOrgId;

    @ApiModelProperty("销售部门名称")
    @TableField("sale_org_name")
    private String saleOrgName;

    @ApiModelProperty("销售员ID")
    @TableField("sale_user_id")
    private String saleUserId;

    @ApiModelProperty("销售员名称")
    @TableField("sale_user_name")
    private String saleUserName;

    @ApiModelProperty("销售分组ID")
    @TableField("sale_group_id")
    private String saleGroupId;

    @ApiModelProperty("销售分组名称")
    @TableField("sale_group_name")
    private String saleGroupName;

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiSaleReturnApplicationOrderMaterial> saleReturnApplicationOrderMaterialList;

    public void toUpdateEntity() {
        super.toUpdateEntity();
        this.enable = null;
        this.status = null;
    }

    public void toSaveEntity() {
        super.toSaveEntity();
        this.enable = null;
        this.status = null;
    }
}
