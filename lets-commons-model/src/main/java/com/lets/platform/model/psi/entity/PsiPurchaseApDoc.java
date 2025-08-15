package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.enums.EstablishAccWayEnum;
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
 * 采购应付单
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-20
 */
@Getter
@Setter
@TableName("psi_purchase_ap_doc")
@ApiModel(value = "PsiPurchaseApDoc对象", description = "采购应付单")
public class PsiPurchaseApDoc extends BaseEntity {

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

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型")
    @TableField("business_name")
    private String businessName;

    /**
     * @see EstablishAccWayEnum
     */
    @ApiModelProperty("立账方式 1：暂估应付 2：财务应付")
    @TableField("establishing_acc_way")
    private String establishingAccWay;
    @ApiModelProperty("立账方式 1：暂估应付 2：财务应付")
    @TableField(exist = false)
    private String establishingAccWayName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("订货供应商")
    @TableField("order_supplier_id")
    private String orderSupplierId;

    @ApiModelProperty("订货供应商")
    @TableField("order_supplier_name")
    private String orderSupplierName;

    @ApiModelProperty("订货供应商-联系人")
    @TableField("order_supplier_user")
    private String orderSupplierUser;

    @ApiModelProperty("订货供应商-联系人")
    @TableField("order_supplier_user_name")
    private String orderSupplierUserName;

    @ApiModelProperty("订货供应商-联系电话")
    @TableField("order_supplier_phone")
    private String orderSupplierPhone;

    @ApiModelProperty("订货供应商-联系地址")
    @TableField("order_supplier_address")
    private String orderSupplierAddress;

    @ApiModelProperty("供货供应商")
    @TableField("supply_supplier_id")
    private String supplySupplierId;
    @ApiModelProperty("供货供应商")
    @TableField("supply_supplier_name")
    private String supplySupplierName;

    @ApiModelProperty("供货供应商-联系人")
    @TableField("supply_supplier_user")
    private String supplySupplierUser;

    @ApiModelProperty("供货供应商-联系人名称")
    @TableField("supply_supplier_user_name")
    private String supplySupplierUserName;

    @ApiModelProperty("供货供应商-联系电话")
    @TableField("supply_supplier_phone")
    private String supplySupplierPhone;

    @ApiModelProperty("供货供应商-联系地址")
    @TableField("supply_supplier_address")
    private String supplySupplierAddress;

    @ApiModelProperty("结算供应商")
    @TableField("settlement_supplier_id")
    private String settlementSupplierId;

    @ApiModelProperty("结算供应商名称")
    @TableField("settlement_supplier_name")
    private String settlementSupplierName;

    @ApiModelProperty("收款供应商")
    @TableField("collection_supplier_id")
    private String collectionSupplierId;

    @ApiModelProperty("收款供应商名称")
    @TableField("collection_supplier_name")
    private String collectionSupplierName;

    @ApiModelProperty("付款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("默认付款条件")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_id")
    private String purchaseOrgId;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购员")
    @TableField("purchase_user_id")
    private String purchaseUserId;

    @ApiModelProperty("采购员")
    @TableField("purchase_user_name")
    private String purchaseUserName;

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

    @ApiModelProperty("结算币种符号")
    @TableField("basic_currency_symbol")
    private String basicCurrencySymbol;

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

    @ApiModelProperty("结算币种符号")
    @TableField("settlement_currency_symbol")
    private String settlementCurrencySymbol;

    @ApiModelProperty("汇率表主键")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    /**
     * @see com.lets.platform.model.psi.enums.InvoiceBlueOrRedEnum
     */
    @ApiModelProperty("蓝字或红字")
    @TableField("blue_or_red")
    private String blueOrRed;

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

    @ApiModelProperty("结算方式")
    @TableField("settlement_method")
    private String settlementMethod;

    @ApiModelProperty("结算方式")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
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

    @ApiModelProperty("红字应付单使用")
    @TableField(exist = false)
    private String sourceOrderCode;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<PsiPurchaseApDocDetail> details;
}
