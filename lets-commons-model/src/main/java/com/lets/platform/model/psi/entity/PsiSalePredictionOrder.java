package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 销售预测订单
 *
 * @author DING WEI
 * @since 2024-07-13
 */
@Getter
@Setter
@TableName("psi_sale_prediction_order")
@ApiModel(value = "PsiSalePredictionOrder对象", description = "销售预测订单")
public class PsiSalePredictionOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
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

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("订货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;
    @ApiModelProperty("订货客户分组ID")
    @TableField(exist = false)
    private String orderCustomerGroupId;
    @ApiModelProperty("订货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

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
    @ApiModelProperty("结算币种单价精度")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;
    @ApiModelProperty("结算货币舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;

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

    @ApiModelProperty("销售价目表ID")
    @TableField("sale_price_list_id")
    private String salePriceListId;
    @ApiModelProperty("销售价目表名称")
    @TableField("sale_price_list_name")
    private String salePriceListName;

    @Length(max = 200, message = "[备货原因]长度0~200，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("备货原因")
    @TableField("remark")
    private String remark;

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

    @ApiModelProperty("是否含税")
    @TableField("tax_included")
    private String taxIncluded;

    /**
     * @see com.lets.platform.model.psi.enums.PricingModeEnum
     */
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

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

    @ApiModelProperty("合同编号")
    @TableField("contract_order_code")
    private String contractOrderCode;

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
    @TableField("can_enable")
    private Integer canEnable;

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

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiSalePredictionOrderDetail> details;

    @ApiModelProperty("销售订单ID")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("客户物料编码ID")
    @TableField(exist = false)
    private String customerMaterialId;
    @ApiModelProperty("客户物料编码")
    @TableField(exist = false)
    private String customerMaterialCode;
    @ApiModelProperty("客户物料名称")
    @TableField(exist = false)
    private String customerMaterialName;

    @ApiModelProperty("物料ID")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("物料起订量")
    @TableField(exist = false)
    private BigDecimal materialSaleMinQuantity;

    @ApiModelProperty("特征属性名称")
    @TableField(exist = false)
    private String materialCharacteristicNames;

    @ApiModelProperty("销售单位ID")
    @TableField(exist = false)
    private String saleUnitId;
    @ApiModelProperty("销售单位名称")
    @TableField(exist = false)
    private String saleUnitName;
    @ApiModelProperty("销售单位精度")
    @TableField(exist = false)
    private Integer saleUnitAccuracy;
    @ApiModelProperty("销售单位舍入类型")
    @TableField(exist = false)
    private Integer saleUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数量")
    @TableField(exist = false)
    private BigDecimal quantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已执行数量")
    @TableField(exist = false)
    private BigDecimal alreadyQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用数量")
    @TableField(exist = false)
    private BigDecimal occupiedQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可执行数量")
    @TableField(exist = false)
    private BigDecimal canNumber;

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
    @ApiModelProperty("折扣率")
    @TableField(exist = false)
    private BigDecimal discountRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价折扣额")
    @TableField(exist = false)
    private BigDecimal priceDiscountAmount;
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
    private BigDecimal detailTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("折扣金额")
    @TableField(exist = false)
    private BigDecimal discountAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("要货日期")
    @TableField(exist = false)
    private LocalDateTime needDate;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;

    @ApiModelProperty("参考单位ID")
    @TableField(exist = false)
    private String referenceUnitId;

    @ApiModelProperty("参考单位名称")
    @TableField(exist = false)
    private String referenceUnitName;

    @ApiModelProperty("参考单位精度")
    @TableField(exist = false)
    private Integer referenceUnitAccuracy;

    @ApiModelProperty("参考单位舍入类型")
    @TableField(exist = false)
    private String referenceUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("参考单位与销售单位比例")
    @TableField(exist = false)
    private BigDecimal referenceUnitRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("参考数量")
    @TableField(exist = false)
    private BigDecimal referenceQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发上限(%)")
    @TableField(exist = false)
    private BigDecimal saleOverLimit;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发下限(%)")
    @TableField(exist = false)
    private BigDecimal saleUnderLimit;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发上限数量")
    @TableField(exist = false)
    private BigDecimal saleOverQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发下限数量")
    @TableField(exist = false)
    private BigDecimal saleUnderQuantity;

    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("源单类型ID")
    @TableField(exist = false)
    private String sourceCategoryId;

    @ApiModelProperty("源单类型名称")
    @TableField(exist = false)
    private String sourceCategoryName;

    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceCode;

    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Long sourceLineNumber;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;
    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;
    @TableField(exist = false)
    private Integer detailCanEnable;

    @ApiModelProperty("销售批量控制方式")
    @TableField(exist = false)
    private String saleLotControlType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("销售批量")
    @TableField(exist = false)
    private BigDecimal saleLotQuantity;

    @ApiModelProperty("子件拆解方式")
    @TableField(exist = false)
    private String saleSubDisassemblyType;

    @ApiModelProperty("MRP已计算")
    @TableField(exist = false)
    private Integer mrpCalculated;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("需补货数量")
    @TableField(exist = false)
    private BigDecimal replenishmentQuantity;

    @ApiModelProperty("源单明细ID")
    @TableField(exist = false)
    private String sourceDetailId;

    @ApiModelProperty("MRP计算状态")
    @TableField(exist = false)
    private String mrpCalculateStatus;

    @ApiModelProperty("MRP计算状态")
    @TableField(exist = false)
    private String mrpCalculateStatusName;

    @ApiModelProperty("MRP已计算数量")
    @TableField(exist = false)
    private BigDecimal mrpCalculatedQuantity;

    @TableField(exist = false)
    @ApiModelProperty("是否已计划运算(新计划运算)")
    private int calculated;
    @TableField(exist = false)
    @ApiModelProperty("是否已计划运算(新计划运算)")
    private String calculatedName;

    @TableField(exist = false)
    @ApiModelProperty("计算时间")
    private LocalDateTime calculateTime;

    public BigDecimal quantityNN() {
        if (Objects.isNull(quantity)) {
            return BigDecimal.ZERO;
        } else {
            return quantity;
        }
    }

    public BigDecimal alreadyQuantityNN() {
        if (Objects.isNull(alreadyQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyQuantity;
        }
    }

    public BigDecimal occupiedQuantityNN() {
        if (Objects.isNull(occupiedQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return occupiedQuantity;
        }
    }
}
