package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 销售退货单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-11-29
 */
@Getter
@Setter
@TableName("psi_sale_return_order_material")
@ApiModel(value = "PsiSaleReturnOrderMaterial对象", description = "销售退货单物料明细")
public class PsiSaleReturnOrderMaterial extends BaseEntity {

    @ApiModelProperty("销售退货单ID")
    @TableField("order_id")
    private String orderId;

    @TableField(exist = false)
    private String orderCode;

    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("销售退货单")
    @TableField(exist = false)
    private PsiSaleReturnOrder order;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("客户物料编码ID")
    @TableField("customer_material_id")
    private String customerMaterialId;

    @ApiModelProperty("客户物料编码")
    @TableField("customer_material_code")
    private String customerMaterialCode;

    @ApiModelProperty("客户物料名称")
    @TableField("customer_material_name")
    private String customerMaterialName;

    @ApiModelProperty("物料编码ID")
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

    @ApiModelProperty("退货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("退货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("退货联系人ID")
    @TableField("order_customer_contact_user_id")
    private String orderCustomerContactUserId;

    @ApiModelProperty("订货联系人")
    @TableField("order_customer_contact_user")
    private String orderCustomerContactUser;

    @ApiModelProperty("订货联系电话")
    @TableField("order_customer_contact_phone_number")
    private String orderCustomerContactPhoneNumber;

    @ApiModelProperty("订货联系地址")
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

    @ApiModelProperty("交货地址")
    @TableField("delivery_address")
    private String deliveryAddress;

    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit_id")
    private String saleUnitId;

    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField("sale_unit_round_off_type")
    private Integer saleUnitRoundOffType;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("inventory_unit_round_off_type")
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("可申请数量")
    @TableField(exist = false)
    private BigDecimal availableQuantity;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    private LocalDateTime needDate;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationDate;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

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

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("折扣金额")
    @TableField("discount_amount")
    private BigDecimal discountAmount;

    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("应收数量")
    @TableField("receivable_quantity")
    private BigDecimal receivableQuantity;

    @ApiModelProperty("剩余应收数量")
    @TableField("remain_receivable_quantity")
    private BigDecimal remainReceivableQuantity;

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

    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单主数据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单物料明细ID")
    @TableField("source_material_id")
    private String sourceMaterialId;

    @ApiModelProperty("源单销售订单物料明细ID")
    @TableField("source_sale_order_material_id")
    private String sourceSaleOrderMaterialId;

    @ApiModelProperty("源单销售订单发货明细ID")
    @TableField("source_sale_order_delivery_id")
    private String sourceSaleOrderDeliveryId;

    @ApiModelProperty("源单物料明细行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

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

    @ApiModelProperty("仓储部门ID")
    @TableField("store_org_id")
    private String storeOrgId;

    @ApiModelProperty("仓储部门名称")
    @TableField("store_org_name")
    private String storeOrgName;

    @ApiModelProperty("仓储员ID")
    @TableField("store_user_id")
    private String storeUserId;

    @ApiModelProperty("仓储员名称")
    @TableField("store_user_name")
    private String storeUserName;

    @ApiModelProperty("结算方式ID")
    @TableField("settlement_method_id")
    private String settlementMethodId;

    @ApiModelProperty("结算方式名称")
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("收款条件ID")
    @TableField("payment_condition_id")
    private String paymentConditionId;

    @ApiModelProperty("收款条件名称")
    @TableField("payment_condition_name")
    private String paymentConditionName;

    /**
     * @EnumName ReturnStockInTypeEnum
     */
    @ApiModelProperty("入库类型")
    @TableField("stock_in_type")
    private String stockInType;

    @TableField(exist = false)
    private String stockInTypeName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("退货类型")
    @TableField("return_type")
    private String returnType;

    @ApiModelProperty("应收单数量")
    @TableField("ar_number")
    private BigDecimal arNumber;
    @TableField(exist = false)
    private BigDecimal oldArNumber;
    @ApiModelProperty("应收单占用数量")
    @TableField("ar_occupy_number")
    private BigDecimal arOccupyNumber;
    @TableField(exist = false)
    private BigDecimal oldArOccupyNumber;

    /**
     * 结算客户
     **/
    @TableField(exist = false)
    private String saleOrderSettlementCustomerId;
    @TableField(exist = false)
    private String saleOrderSettlementCustomerName;

    /**
     * 付款客户
     **/
    @TableField(exist = false)
    private String saleOrderPaymentCustomerId;
    @TableField(exist = false)
    private String saleOrderPaymentCustomerName;

    @TableField(exist = false)
    private LocalDateTime sourcePostingTime;

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
    @ApiModelProperty("作价模式")
    @TableField(exist = false)
    private String pricingMode;
    @ApiModelProperty("销退检验")
    @TableField(exist = false)
    private Integer returnCheck;

    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> characteristics;

    @ApiModelProperty("如果已经维护了检验单的单据类别的限定仓库，则仓库为只读，禁止修改[0:否;1:是]")
    @TableField("store_disabled")
    private Integer storeDisabled;

    @TableField(exist = false)
    private List<PsiSaleReturnOrderMaterial> children;
    @TableField("substitute_detail_id")
    private String substituteDetailId;
    @TableField("substituted_id")
    private String substitutedId;
    @TableField("is_substitution")
    private Integer isSubstitution;

    @TableField("material_specific")
    private String materialSpecific;

    @TableField(exist = false)
    private List<MaterialSpecific> materialSpecificList;

    @ApiModelProperty("计价单位")
    @TableField("pricing_unit_id")
    private String pricingUnitId;
    @ApiModelProperty("计价单位编码")
    @TableField("pricing_unit_code")
    private String pricingUnitCode;
    @ApiModelProperty("计价单位名称")
    @TableField("pricing_unit_name")
    private String pricingUnitName;
    @ApiModelProperty("计价单位精度")
    @TableField("pricing_unit_accuracy")
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("计价单位舍入类型")
    @TableField("pricing_unit_round_off_type")
    private Integer pricingUnitRoundOffType;
    @TableField("pricing_number")
    private BigDecimal pricingNumber;

    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;
}
