package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.vo.SupplyEnclosureVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 采购收货单
 *
 * @author DING WEI
 * @since 2024-03-19
 */
@Getter
@Setter
@TableName("psi_purchase_delivery_order")
@ApiModel(value = "PsiPurchaseDeliveryOrder对象", description = "采购收货单")
public class PsiPurchaseDeliveryOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @NotBlank(message = "Order.orderCategoryId", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @NotBlank(message = "Order.category.code.notBlank", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @NotBlank(message = "Order.category.name.notBlank", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;
    @ApiModelProperty("业务编码")
    @TableField(exist = false)
    private String businessCode;
    @ApiModelProperty("业务名称")
    @TableField(exist = false)
    private String businessName;
    @ApiModelProperty("是否允许手工录入")
    @TableField(exist = false)
    private String allowManInput;

    @NotNull(message = "Order.orderTime", groups = {Save.class, Update.class})
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @NotBlank(message = "PsiPurchaseOrder.orderSupplierId", groups = {Save.class, Update.class})
    @ApiModelProperty("订货供应商")
    @TableField("order_supplier_id")
    private String orderSupplierId;
    @ApiModelProperty("订货供应商名称")
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
    @ApiModelProperty("供货供应商名称")
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

    @ApiModelProperty("采购部门主键")
    @TableField("purchase_org_id")
    private String purchaseOrgId;
    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;
    @ApiModelProperty("采购员主键")
    @TableField("purchase_user_id")
    private String purchaseUserId;
    @ApiModelProperty("采购员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("收货部门主键")
    @TableField("delivery_org_id")
    private String deliveryOrgId;
    @ApiModelProperty("收货部门名称")
    @TableField("delivery_org_name")
    private String deliveryOrgName;
    @ApiModelProperty("收货员主键")
    @TableField("delivery_user_id")
    private String deliveryUserId;
    @ApiModelProperty("收货员名称")
    @TableField("delivery_user_name")
    private String deliveryUserName;

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

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

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

    @ApiModelProperty("PDA生成")
    @TableField("is_pda_generated")
    private Integer isPdaGenerated;

    @NotBlank(message = "PsiPurchaseOrder.baseCurrencyId", groups = {Save.class, Update.class})
    @ApiModelProperty("本位币")
    @TableField("basic_currency_id")
    private String basicCurrencyId;
    @NotBlank(message = "PsiPurchaseOrder.baseCurrencyName", groups = {Save.class, Update.class})
    @ApiModelProperty("本位币名称")
    @TableField("basic_currency_name")
    private String basicCurrencyName;
    @NotNull(message = "PsiPurchaseOrder.baseCurrencyPriceAccuracy", groups = {Save.class, Update.class})
    @TableField("basic_currency_price_accuracy")
    private Integer basicCurrencyPriceAccuracy;
    @NotNull(message = "PsiPurchaseOrder.baseCurrencyAmountAccuracy", groups = {Save.class, Update.class})
    @TableField("basic_currency_amount_accuracy")
    private Integer basicCurrencyAmountAccuracy;
    @TableField("basic_currency_round_off_type")
    private Integer basicCurrencyRoundOffType;

    @NotBlank(message = "PsiPurchaseOrder.settlementCurrencyId", groups = {Save.class, Update.class})
    @ApiModelProperty("结算币种")
    @TableField("settlement_currency_id")
    private String settlementCurrencyId;
    @NotBlank(message = "PsiPurchaseOrder.settlementCurrencyName", groups = {Save.class, Update.class})
    @TableField("settlement_currency_name")
    private String settlementCurrencyName;
    @NotNull(message = "PsiPurchaseOrder.settlementCurrencyPriceAccuracy", groups = {Save.class, Update.class})
    @TableField("settlement_currency_price_accuracy")
    private Integer settlementCurrencyPriceAccuracy;
    @NotNull(message = "PsiPurchaseOrder.settlementCurrencyAmountAccuracy", groups = {Save.class, Update.class})
    @TableField("settlement_currency_amount_accuracy")
    private Integer settlementCurrencyAmountAccuracy;
    @TableField("settlement_currency_round_off_type")
    private Integer settlementCurrencyRoundOffType;
    @ValidBigDecimal(message = "PsiPurchaseOrder.exchangeRate", min = "0.0000000001", max = "9999999999999.9999999999", includeMax = true, groups = {Save.class, Update.class})
    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("表头总税额")
    @TableField("total_tax_amount")
    private BigDecimal totalTaxAmount;
    @TableField(exist = false)
    private String totalTaxAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;
    @TableField(exist = false)
    private String totalAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("total_amount_including_tax")
    private BigDecimal totalAmountIncludingTax;
    @TableField(exist = false)
    private String totalAmountIncludingTaxFormat;

    @ApiModelProperty("结算方式")
    @TableField("settlement_method")
    private String settlementMethod;
    @TableField("settlement_method_name")
    private String settlementMethodName;

    @ApiModelProperty("付款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;
    @TableField("payment_condition_name")
    private String paymentConditionName;
    @TableField(exist = false)
    private Integer paymentConditionPriority;
    @TableField(exist = false)
    private String dictDefaultPaymentConditionId;
    @TableField(exist = false)
    private String dictDefaultPaymentConditionName;
    @TableField(exist = false)
    private String supplierPaymentConditionId;
    @TableField(exist = false)
    private String supplierPaymentConditionName;
    @TableField(exist = false)
    private String sourcePaymentConditionId;
    @TableField(exist = false)
    private String sourcePaymentConditionName;
    @TableField(exist = false)
    private String categoryPaymentConditionId;
    @TableField(exist = false)
    private String categoryPaymentConditionName;

    @ApiModelProperty("供货资料")
    @TableField(exist = false)
    private List<SupplyEnclosureVo> supplyEnclosures;

    @NotEmpty(message = "OrderDetail.NotEmpty", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<PsiPurchaseDeliveryOrderDetail> details;

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++明细字段+++++++++++++++++++++++++++++++++++++++++++++++
     */
    @ApiModelProperty("采购收货单明细主键")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("采购收货单")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("物料特征属性名称")
    @TableField(exist = false)
    private String materialCharacteristicNames;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @ApiModelProperty("可采购")
    @TableField(exist = false)
    private Integer purchasable;
    @ApiModelProperty("可存货")
    @TableField(exist = false)
    private Integer storable;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField(exist = false)
    private String lotNoScope;

    @ApiModelProperty("采购单位")
    @TableField(exist = false)
    private String purchaseUnitId;
    @ApiModelProperty("采购单位编码")
    @TableField(exist = false)
    private String purchaseUnitCode;
    @ApiModelProperty("采购单位名称")
    @TableField(exist = false)
    private String purchaseUnitName;
    @ApiModelProperty("采购单位精度")
    @TableField(exist = false)
    private Integer purchaseUnitAccuracy;
    @ApiModelProperty("采购单位舍入类型")
    @TableField(exist = false)
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购数量")
    @TableField(exist = false)
    private BigDecimal number;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用数量[在采购入库单提交时回写该字段]")
    @TableField(exist = false)
    private BigDecimal occupyNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已入库数量[在采购入库单过账之后回写该数据]")
    @TableField(exist = false)
    private BigDecimal alreadyStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("未入库数量[数量 - 已入库数量]")
    @TableField(exist = false)
    private BigDecimal notStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可入库数量")
    @TableField(exist = false)
    private BigDecimal canStockInNumber;
    @TableField(exist = false)
    private BigDecimal canStockInNumberConvert;

    @ApiModelProperty("采购计价单位")
    @TableField(exist = false)
    private String pricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    @TableField(exist = false)
    private String pricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    @TableField(exist = false)
    private String pricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    @TableField(exist = false)
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入类型")
    @TableField(exist = false)
    private Integer pricingUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计价数量")
    @TableField(exist = false)
    private BigDecimal pricingNumber;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("生产日期")
    @TableField(exist = false)
    private LocalDateTime produceTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("保质期到期日")
    @TableField(exist = false)
    private LocalDateTime periodTime;

    @ApiModelProperty("仓库主键")
    @TableField(exist = false)
    private String storeId;
    @ApiModelProperty("仓库名称")
    @TableField(exist = false)
    private String storeName;

    @ApiModelProperty("是否进料检验[0:否;1:是]")
    @TableField(exist = false)
    private Integer feedInspect;
    @TableField(exist = false)
    private String feedInspectName;

    @ApiModelProperty("源单主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceOrderCode;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ApiModelProperty("源单类型[1采购订单]")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("源单行号")
    @TableField(exist = false)
    private Long sourceLineNumber;
    @ApiModelProperty("关联单据明细主键")
    @TableField(exist = false)
    private String sourceDetailId;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal includingTaxPrice;
    @ApiModelProperty("税种")
    @TableField(exist = false)
    private String taxId;
    @TableField(exist = false)
    private String taxName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税率")
    @TableField(exist = false)
    private BigDecimal taxRate;
    @TableField(exist = false)
    private Integer taxAccuracy;
    @TableField(exist = false)
    private String taxType;

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
    private BigDecimal taxAmount;
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
    @ApiModelProperty("参考数量")
    @TableField(exist = false)
    private String referenceUnitNumber4StockInOrder;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal qualifiedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步接收数量")
    @TableField(exist = false)
    private BigDecimal giveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("判退数量")
    @TableField(exist = false)
    private BigDecimal decideReturnNumber;
    @ApiModelProperty("已检验数量")
    @TableField(exist = false)
    private BigDecimal alreadyInspectNumber;
    @ApiModelProperty("检验占用数量")
    @TableField(exist = false)
    private BigDecimal occupyInspectNumber;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private String isPurchaseMaterialDemand;
    @TableField(exist = false)
    private String splitFromId;

    /**
     * 物料扩展属性
     */
    @TableField(exist = false)
    @ApiModelProperty("扩展规格备注一")
    private String remark1;
    @ApiModelProperty("扩展规格备注二")
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

    @ApiModelProperty("目标状态")
    @TableField(exist = false)
    private Integer toStatus;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal alreadyStockInNumberNotNull() {
        if (Objects.isNull(alreadyStockInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyStockInNumber;
        }
    }

    public BigDecimal occupyNumberNotNull() {
        if (Objects.isNull(occupyNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyNumber;
        }
    }

    public BigDecimal numberNotNull() {
        if (Objects.isNull(number)) {
            return BigDecimal.ZERO;
        } else {
            return number;
        }
    }

    public BigDecimal qualifiedNumberNN() {
        if (Objects.isNull(qualifiedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return qualifiedNumber;
        }
    }
    public BigDecimal giveInNumberNN() {
        if (Objects.isNull(giveInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return giveInNumber;
        }
    }
}
