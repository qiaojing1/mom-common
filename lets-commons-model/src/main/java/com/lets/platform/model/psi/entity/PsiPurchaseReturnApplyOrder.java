package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 采购退货申请
 * </p>
 *
 * @author csy
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("psi_purchase_return_apply_order")
@ApiModel(value = "PsiPurchaseReturnApplyOrder对象", description = "采购退货申请")
public class PsiPurchaseReturnApplyOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[单据编号]长度 1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("采购部门ID")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购员ID")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("订货供应商Id")
    @TableField("order_supplier_id")
    private String orderSupplierId;

    @ApiModelProperty("订货供应商名称")
    @TableField("order_supplier_name")
    private String orderSupplierName;

    @ApiModelProperty("供货供应商id")
    @TableField("supply_supplier_id")
    private String supplySupplierId;

    @ApiModelProperty("供货供应商名称")
    @TableField("supply_supplier_name")
    private String supplySupplierName;

    @ApiModelProperty("结算供应商Id")
    @TableField("settlement_supplier_id")
    private String settlementSupplierId;

    @ApiModelProperty("结算供应商名称")
    @TableField("settlement_supplier_name")
    private String settlementSupplierName;

    @ApiModelProperty("收款供应商ID")
    @TableField("collection_supplier_id")
    private String collectionSupplierId;

    @ApiModelProperty("收款供应商名称")
    @TableField("collection_supplier_name")
    private String collectionSupplierName;

    @ApiModelProperty("订货供应商联系人id")
    @TableField("order_supplier_user")
    private String orderSupplierUser;

    @ApiModelProperty("订货供应商联系人")
    @TableField("order_supplier_user_name")
    private String orderSupplierUserName;

    @ApiModelProperty("订货供应商联系地址")
    @TableField("order_supplier_address")
    private String orderSupplierAddress;

    @ApiModelProperty("订货供应商联系电话")
    @TableField("order_supplier_phone")
    private String orderSupplierPhone;

    @ApiModelProperty("供货供应商联系人id")
    @TableField("supply_supplier_user")
    private String supplySupplierUser;

    @ApiModelProperty("供货供应商联系人")
    @TableField("supply_supplier_user_name")
    private String supplySupplierUserName;

    @ApiModelProperty("供货供应商联系地址")
    @TableField("supply_supplier_address")
    private String supplySupplierAddress;

    @ApiModelProperty("供货供应商联系电话")
    @TableField("supply_supplier_phone")
    private String supplySupplierPhone;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态")
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

    @TableField("settlement_currency_id")
    private String settlementCurrencyId;
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;
    @TableField("settlement_method")
    private String settlementMethod;
    @TableField("settlement_method_name")
    private String settlementMethodName;
    @TableField("payment_condition_id")
    private String paymentConditionId;
    @TableField("payment_condition_name")
    private String paymentConditionName;
    @TableField(exist = false)
    private Integer paymentConditionPriority;

    @TableField(exist = false)
    private List<String> fileIds;


    @TableField(exist = false)
    private List<PsiPurchaseReturnApplyOrderMaterial> details;

    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @TableField("exchange_rate_name")
    private String exchangeRateName;

    @TableField("exchange_rate")
    private BigDecimal exchangeRate;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;

    @TableField(exist = false)
    private String pricingModeName;

    @ApiModelProperty("本位币")
    @TableField("basic_currency_id")
    private String baseCurrencyId;

    @ApiModelProperty("本位币名称")
    @TableField("basic_currency_name")
    private String baseCurrencyName;

    @TableField("basic_currency_price_accuracy")
    private Integer baseCurrencyPriceAccuracy;

    @TableField("basic_currency_amount_accuracy")
    private Integer baseCurrencyAmountAccuracy;

    @TableField("basic_currency_round_off_type")
    private Integer baseCurrencyRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("total_tax_amount")
    private BigDecimal totalTaxAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;

}
