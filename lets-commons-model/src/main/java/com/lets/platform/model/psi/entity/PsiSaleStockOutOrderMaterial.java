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
 * 销售出库单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-09-05
 */
@Getter
@Setter
@TableName("psi_sale_stock_out_order_material")
@ApiModel(value = "PsiSaleStockOutOrderMaterial对象", description = "销售出库单物料明细")
public class PsiSaleStockOutOrderMaterial extends BaseEntity {

    @ApiModelProperty("销售出库单ID")
    @TableField("order_id")
    private String orderId;

    @TableField(exist = false)
    private String orderCategoryId;

    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("销售出库单")
    @TableField(exist = false)
    private PsiSaleStockOutOrder order;

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
    @ApiModelProperty(hidden = true)
    @TableField("material_specific")
    private String materialSpecific;
    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;
    /**
     * @see com.lets.platform.model.psi.enums.PickStrategyEnum
     */
    @ApiModelProperty("拣货策略")
    @TableField(exist = false)
    private String pickStrategy;

    @ApiModelProperty("超发上限(%)")
    @TableField("over_limit")
    private BigDecimal overLimit;

    @ApiModelProperty("超发下限(%)")
    @TableField("under_limit")
    private BigDecimal underLimit;

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

    @ApiModelProperty("可用库存数量")
    @TableField(exist = false)
    private BigDecimal availableInventoryQuantity;

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

    @ApiModelProperty("批号ID")
    @TableField("batch_number_id")
    private String batchNumberId;

    @ApiModelProperty("批号名称")
    @TableField("batch_number_name")
    private String batchNumberName;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
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

    @ApiModelProperty("折扣率")
    @TableField("discount_rate")
    private BigDecimal discountRate;

    @ApiModelProperty("单价折扣额")
    @TableField("price_discount_amount")
    private BigDecimal priceDiscountAmount;

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

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型名称")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单主数据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源销售订单ID")
    @TableField("source_sale_order_id")
    private String sourceSaleOrderId;

    @ApiModelProperty("源销售订单单号")
    @TableField("source_sale_order_code")
    private String sourceSaleOrderCode;

    @ApiModelProperty("源销售订单物料明细ID")
    @TableField("source_material_id")
    private String sourceMaterialId;

    @ApiModelProperty("源销售订单发货明细ID")
    @TableField("source_delivery_id")
    private String sourceDeliveryId;

    @ApiModelProperty("源单发货通知明细ID(源单如果是销售订单则是销售订单明细ID)")
    @TableField("source_notify_id")
    private String sourceNotifyId;

    @ApiModelProperty("源单发货明细行号(源单如果是销售订单则是销售订单明细行号)")
    @TableField("source_notify_line_number")
    private Long sourceNotifyLineNumber;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

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

    @ApiModelProperty("应收数量")
    @TableField("receivable_quantity")
    private BigDecimal receivableQuantity;

    @ApiModelProperty("应收数量")
    @TableField("occupy_receivable_quantity")
    private BigDecimal occupyReceivableQuantity;

    @ApiModelProperty("剩余应收数量")
    @TableField("remain_receivable_quantity")
    private BigDecimal remainReceivableQuantity;

    @ApiModelProperty("退货数量")
    @TableField("return_quantity")
    private BigDecimal returnQuantity;

    @ApiModelProperty("退货占用数量")
    @TableField("return_occupied_quantity")
    private BigDecimal returnOccupiedQuantity;

    @ApiModelProperty("剩余退货数量")
    @TableField("remain_return_quantity")
    private BigDecimal remainReturnQuantity;

    @ApiModelProperty("出货通知单库存单位")
    @TableField(exist = false)
    private PsiUnit lastInventoryUnit;

    @ApiModelProperty("销售订单销售单位")
    @TableField(exist = false)
    private PsiUnit saleOrderSaleUnit;

    @ApiModelProperty("已开票金额")
    @TableField("invoice_amount")
    private BigDecimal invoiceAmount;

    @ApiModelProperty("开票占用金额")
    @TableField("invoice_occupied_amount")
    private BigDecimal invoiceOccupiedAmount;

    @ApiModelProperty("剩余开票金额")
    @TableField("remain_invoice_amount")
    private BigDecimal remainInvoiceAmount;

    @ApiModelProperty("已开票数量")
    @TableField("invoice_quantity")
    private BigDecimal invoiceQuantity;

    @ApiModelProperty("开票占用数量")
    @TableField("invoice_occupy_quantity")
    private BigDecimal invoiceOccupyQuantity;

    @ApiModelProperty("剩余未开票数量")
    @TableField("remain_invoice_quantity")
    private BigDecimal remainInvoiceQuantity;

    @ApiModelProperty("销售发票表头id")
    @TableField("sale_invoice_id")
    private String saleInvoiceId;

    @ApiModelProperty("销售发票表体ID")
    @TableField("sale_invoice_detail_id")
    private String saleInvoiceDetailId;

    @ApiModelProperty("扩展字段1")
    @TableField("ext_field1")
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField("ext_field2")
    private String extField2;

    /**
     * 订货客户
     **/
    @TableField(exist = false)
    private String saleOrderCustomerId;
    @TableField(exist = false)
    private String saleOrderCustomerName;

    /**
     * 销售部门
     **/
    @TableField(exist = false)
    private String saleOrderOrgId;
    @TableField(exist = false)
    private String saleOrderOrgName;

    /**
     * 销售员
     **/
    @TableField(exist = false)
    private String saleOrderUserId;
    @TableField(exist = false)
    private String saleOrderUserName;

    /**
     * 收货客户
     **/
    @TableField(exist = false)
    private String saleOrderReceiveCustomerId;
    @TableField(exist = false)
    private String saleOrderReceiveCustomerName;

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

    @ApiModelProperty("源单过账日期")
    @TableField(exist = false)
    private LocalDateTime sourcePostingTime;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

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

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiSaleStockOutOrderMaterialCharacteristic> materialCharacteristicList;

    /**
     * 销售发票登记转销售出库单时，记录物料明细特征属性准备出库
     */
    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> characteristics;

    @TableField(exist = false)
    private String serialNumber;

    @TableField(exist = false)
    private List<PsiSaleStockOutSerial> serialList;

    @TableField(exist = false)
    private String basicUnitId;
    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specifics;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注2")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;

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

    @TableField(exist = false)
    private List<PsiSaleStockOutOrderMaterial> children;
    @TableField("substitute_detail_id")
    private String substituteDetailId;
    @TableField("substituted_id")
    private String substitutedId;
    @TableField("is_substitution")
    private Integer isSubstitution;

    @ApiModelProperty("自定义字段1")
    @TableField("custom_field1")
    private String customField1;

    @ApiModelProperty("自定义字段2")
    @TableField("custom_field2")
    private String customField2;

    @ApiModelProperty("自定义字段3")
    @TableField("custom_field3")
    private String customField3;

    @ApiModelProperty("自定义字段4")
    @TableField("custom_field4")
    private String customField4;


    @ApiModelProperty("自定义字段5")
    @TableField("custom_field5")
    private String customField5;

    @ApiModelProperty("自定义字段")
    @TableField("custom_field6")
    private String customField6;

    @ApiModelProperty("自定义字段7")
    @TableField("custom_field7")
    private String customField7;

    @ApiModelProperty("自定义字段8")
    @TableField("custom_field8")
    private String customField8;

    @ApiModelProperty("自定义字段9")
    @TableField("custom_field9")
    private String customField9;

    @ApiModelProperty("自定义字段10")
    @TableField("custom_field10")
    private String customField10;


    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}
