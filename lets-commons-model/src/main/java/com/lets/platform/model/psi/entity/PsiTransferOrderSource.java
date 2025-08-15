package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 调拨单源单相关数据
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-05
 */
@Getter
@Setter
@TableName("psi_transfer_order_source")
@ApiModel(value = "PsiTransferOrderSource对象", description = "调拨单源单相关数据")
public class PsiTransferOrderSource extends BaseEntity {

    @ApiModelProperty("调拨单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("调拨单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("源单物料明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单发货明细id")
    @TableField("source_delivery_id")
    private String sourceDeliveryId;

    @ApiModelProperty("参考单位ID")
    @TableField("reference_unit_id")
    private String referenceUnitId;

    @ApiModelProperty("参考单位名称")
    @TableField("reference_unit_name")
    private String referenceUnitName;

    @ApiModelProperty("参考单位精度")
    @TableField("reference_unit_accuracy")
    private Integer referenceUnitAccuracy;

    @ApiModelProperty("参考单位舍入方式")
    @TableField("reference_unit_round_off_type")
    private String referenceUnitRoundOffType;

    @ApiModelProperty("参考单位与库存单位比例")
    @TableField("reference_unit_rate")
    private BigDecimal referenceUnitRate;

    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;

    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit_id")
    private String saleUnitId;

    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField("sale_unit_round_off_type")
    private Integer saleUnitRoundOffType;

    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ApiModelProperty("销售数量")
    @TableField("sale_quantity")
    private BigDecimal saleQuantity;

    @ApiModelProperty("已开票数量")
    @TableField("invoiced_quantity")
    private BigDecimal invoicedQuantity;

    @ApiModelProperty("未开票数量")
    @TableField("unvoiced_quantity")
    private BigDecimal unvoicedQuantity;

    @ApiModelProperty("开票占用数量")
    @TableField("invoiced_occupy_quantity")
    private BigDecimal invoicedOccupyQuantity;

    @ApiModelProperty("已退货申请数量")
    @TableField("return_quantity")
    private BigDecimal returnQuantity;

    @ApiModelProperty("退货申请占用数量")
    @TableField("return_occupy_quantity")
    private BigDecimal returnOccupyQuantity;

    @ApiModelProperty("剩余可退货申请数量")
    @TableField("remain_return_quantity")
    private BigDecimal remainReturnQuantity;

    @ApiModelProperty("开票未税金额")
    @TableField("invoiced_unpaid_tax_amount")
    private BigDecimal invoicedUnpaidTaxAmount;

    @ApiModelProperty("未开票未税金额")
    @TableField("unvoiced_unpaid_tax_amount")
    private BigDecimal unvoicedUnpaidTaxAmount;
    @TableField("amount")
    @ApiModelProperty("金额")
    private BigDecimal amount;
    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ApiModelProperty("源单类型名称")
    @TableField("source_order_type_name")
    private String sourceOrderTypeName;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别编码")
    @TableField("source_order_category_code")
    private String sourceOrderCategoryCode;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_notify_detail_id")
    private String sourceNotifyDetailId;

    @ApiModelProperty("源单主数据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单物料明细单号")
    @TableField("source_detail_code")
    private String sourceDetailCode;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
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
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("折扣率")
    @TableField(exist = false)
    private BigDecimal discountRate;
    @TableField(exist = false)
    private String discountRateFormat;

    @ApiModelProperty("单价折扣额")
    @TableField(exist = false)
    private BigDecimal priceDiscountAmount;
    @TableField(exist = false)
    private String priceDiscountAmountFormat;

    @ApiModelProperty("折扣金额")
    @TableField(exist = false)
    private BigDecimal discountAmount;
    @TableField(exist = false)
    private String discountAmountFormat;

    /**订货客户**/
    @TableField(exist = false)
    private String saleOrderCustomerId;
    @TableField(exist = false)
    private String saleOrderCustomerName;

    /**销售部门**/
    @TableField(exist = false)
    private String saleOrderOrgId;
    @TableField(exist = false)
    private String saleOrderOrgName;

    /**销售员**/
    @TableField(exist = false)
    private String saleOrderUserId;
    @TableField(exist = false)
    private String saleOrderUserName;

    /**收货客户**/
    @TableField(exist = false)
    private String saleOrderReceiveCustomerId;
    @TableField(exist = false)
    private String saleOrderReceiveCustomerName;

    /**结算客户**/
    @TableField(exist = false)
    private String saleOrderSettlementCustomerId;
    @TableField(exist = false)
    private String saleOrderSettlementCustomerName;

    /**付款客户**/
    @TableField(exist = false)
    private String saleOrderPaymentCustomerId;
    @TableField(exist = false)
    private String saleOrderPaymentCustomerName;

    @ApiModelProperty("结算币种ID")
    @TableField(exist = false)
    private String currencyId;

    @ApiModelProperty("结算币种名称")
    @TableField(exist = false)
    private String currencyName;

    @ApiModelProperty("结算币种金额精度")
    @TableField(exist = false)
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种单价精度")
    @TableField(exist = false)
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算币种舍入类型")
    @TableField(exist = false)
    private Integer currencyRoundOffType;

    @ApiModelProperty("本位币ID")
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
    private Integer baseCurrencyRoundOffType;

    @ApiModelProperty("汇率表ID")
    @TableField(exist = false)
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField(exist = false)
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField(exist = false)
    private String exchangeRate;

    @ApiModelProperty("收款条件ID")
    @TableField(exist = false)
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField(exist = false)
    private String paymentConditionName;

    @ApiModelProperty("结算方式ID")
    @TableField(exist = false)
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField(exist = false)
    private String settlementMethodName;

    @ApiModelProperty("收货联系人ID")
    @TableField(exist = false)
    private String receiveCustomerContactUserId;

    @ApiModelProperty("收货联系人")
    @TableField(exist = false)
    private String receiveCustomerContactUser;

    @ApiModelProperty("收货联系电话")
    @TableField(exist = false)
    private String receiveCustomerContactPhoneNumber;

    @ApiModelProperty("收货联系地址")
    @TableField(exist = false)
    private String receiveCustomerContactAddress;

    @ApiModelProperty("联系人")
    @TableField(exist = false)
    private String orderCustomerContactUserId;

    @ApiModelProperty("联系人")
    @TableField(exist = false)
    private String orderCustomerContactUser;

    @ApiModelProperty("联系电话")
    @TableField(exist = false)
    private String orderCustomerContactPhoneNumber;

    @ApiModelProperty("联系地址")
    @TableField(exist = false)
    private String orderCustomerContactAddress;

    @ApiModelProperty("订单表头收货联系人ID")
    @TableField(exist = false)
    private String orderReceiveCustomerContactUserId;

    @ApiModelProperty("订单表头收货联系人")
    @TableField(exist = false)
    private String orderReceiveCustomerContactUser;

    @ApiModelProperty("订单表头收货联系电话")
    @TableField(exist = false)
    private String orderReceiveCustomerContactPhoneNumber;

    @ApiModelProperty("订单表头收货联系地址")
    @TableField(exist = false)
    private String orderReceiveCustomerContactAddress;

    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField(exist = false)
    private String contractCode;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private PsiTransferOrder order;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private PsiTransferOrderMaterial detail;
}
