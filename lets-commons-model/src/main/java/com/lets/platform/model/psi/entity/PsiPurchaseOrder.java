package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.enums.CloseStatusEnum;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.enums.ArrivalStatusEnum;
import com.lets.platform.model.psi.enums.ConfirmStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 采购订单
 * @author DING WEI
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("psi_purchase_order")
@ApiModel(value = "PsiPurchaseOrder对象", description = "采购订单")
public class PsiPurchaseOrder extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String sheetName;

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @TableField(exist = false)
    private String detailCode;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String excelCode;

    @NotBlank(message = "Order.orderCategoryId", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;

    @TableField("order_category_code")
    private String orderCategoryCode;

    @TableField("order_category_name")
    private String orderCategoryName;

    @TableField(exist = false)
    private String isOsqc;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiOrderCategory category;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Order.orderTime", groups = {Save.class, Update.class})
    @ApiModelProperty("订单日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @TableField(exist = false)
    private String orderTimeFormat;

    @ApiModelProperty("订货供应商")
    @TableField("order_supplier_id")
    private String orderSupplierId;
    @TableField(exist = false)
    private String orderSupplierCode;
    @TableField(exist = false)
    private String orderSupplierName;
    @ApiModelProperty("订货供应商-联系人")
    @TableField("order_supplier_user")
    private String orderSupplierUser;
    @ApiModelProperty("订货供应商-联系人名称")
    @TableField("order_supplier_user_name")
    private String orderSupplierUserName;
    @ApiModelProperty("订货供应商-联系电话")
    @TableField("order_supplier_phone")
    private String orderSupplierPhone;
    @ApiModelProperty("订货供应商-联系地址")
    @TableField("order_supplier_address")
    private String orderSupplierAddress;
    @ApiModelProperty("订货供应商-法人代表")
    @TableField(exist = false)
    private String legalPersonOfOrderSupplier;
    @ApiModelProperty("订货供应商-开户银行")
    @TableField(exist = false)
    private String bankOfDepositOrderSupplier;
    @ApiModelProperty("订货供应商-账号")
    @TableField(exist = false)
    private String bankAccountOrderSupplier;
    @ApiModelProperty("订货供应商-纳税号")
    @TableField(exist = false)
    private String taxIdOrderSupplier;
    @ApiModelProperty("订货供应商-供应商电话")
    @TableField(exist = false)
    private String supplierPhoneOrderSupplier;
    @ApiModelProperty("订货供应商-送货地址")
    @TableField(exist = false)
    private String addressOrderSupplier;
    @ApiModelProperty("订货供应商-经营范围")
    @TableField(exist = false)
    private String scopeOfBusinessOrderSupplier;

    @ApiModelProperty("供货供应商")
    @TableField("supply_supplier_id")
    private String supplySupplierId;
    @TableField(exist = false)
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
    @ApiModelProperty("供货供应商-法人代表")
    @TableField(exist = false)
    private String legalPersonOfSupplySupplier;
    @ApiModelProperty("供货供应商-开户银行")
    @TableField(exist = false)
    private String bankOfDepositSupplySupplier;
    @ApiModelProperty("供货供应商-账号")
    @TableField(exist = false)
    private String bankAccountSupplySupplier;
    @ApiModelProperty("供货供应商-纳税号")
    @TableField(exist = false)
    private String taxIdSupplySupplier;
    @ApiModelProperty("供货供应商-供应商电话")
    @TableField(exist = false)
    private String supplierPhoneSupplySupplier;
    @ApiModelProperty("供货供应商-送货地址")
    @TableField(exist = false)
    private String addressSupplySupplier;
    @ApiModelProperty("供货供应商-经营范围")
    @TableField(exist = false)
    private String scopeOfBusinessSupplySupplier;

    @ApiModelProperty("结算供应商")
    @TableField("settlement_supplier_id")
    private String settlementSupplierId;
    @TableField(exist = false)
    private String settlementSupplierName;
    @ApiModelProperty("结算供应商-法人代表")
    @TableField(exist = false)
    private String legalPersonOfSettlementSupplier;
    @ApiModelProperty("结算供应商-开户银行")
    @TableField(exist = false)
    private String bankOfDepositSettlementSupplier;
    @ApiModelProperty("结算供应商-账号")
    @TableField(exist = false)
    private String bankAccountSettlementSupplier;
    @ApiModelProperty("结算供应商-纳税号")
    @TableField(exist = false)
    private String taxIdSettlementSupplier;
    @ApiModelProperty("结算供应商-供应商电话")
    @TableField(exist = false)
    private String supplierPhoneSettlementSupplier;
    @ApiModelProperty("结算供应商-送货地址")
    @TableField(exist = false)
    private String addressSettlementSupplier;
    @ApiModelProperty("结算供应商-经营范围")
    @TableField(exist = false)
    private String scopeOfBusinessSettlementSupplier;

    @ApiModelProperty("收款供应商")
    @TableField("collection_supplier_id")
    private String collectionSupplierId;
    @TableField(exist = false)
    private String collectionSupplierName;
    @ApiModelProperty("收款供应商-法人代表")
    @TableField(exist = false)
    private String legalPersonOfCollectionSupplier;
    @ApiModelProperty("收款供应商-开户银行")
    @TableField(exist = false)
    private String bankOfDepositCollectionSupplier;
    @ApiModelProperty("收款供应商-账号")
    @TableField(exist = false)
    private String bankAccountCollectionSupplier;
    @ApiModelProperty("收款供应商-纳税号")
    @TableField(exist = false)
    private String taxIdCollectionSupplier;
    @ApiModelProperty("收款供应商-供应商电话")
    @TableField(exist = false)
    private String supplierPhoneCollectionSupplier;
    @ApiModelProperty("收款供应商-送货地址")
    @TableField(exist = false)
    private String addressCollectionSupplier;
    @ApiModelProperty("收款供应商-经营范围")
    @TableField(exist = false)
    private String scopeOfBusinessCollectionSupplier;

    @ApiModelProperty("价目表ID")
    @TableField("price_list_id")
    private String priceListId;
    @TableField(exist = false)
    private String priceListName;

    @ApiModelProperty("付款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;
    @TableField("payment_condition_name")
    private String paymentConditionName;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_id")
    private String purchaseOrgId;
    @TableField(exist = false)
    private String purchaseOrgName;

    @ApiModelProperty("采购员")
    @TableField("purchase_user_id")
    private String purchaseUserId;
    @TableField(exist = false)
    private String purchaseUserName;
    @TableField(exist = false)
    private String purchaseUserMobile;

    /**
     * @see com.lets.platform.model.base.enums.OrderStatusEnum
     */
    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    /**
     * @see com.lets.platform.model.base.enums.CloseStatusEnum
     */
    @ValidatedEnum(enumClass = CloseStatusEnum.class, message = "PsiPurchaseOrder.enable", groups = {Save.class, Update.class})
    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @Length(max = 1000, message = "[备注]长度0~1000，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @NotBlank(message = "PsiPurchaseOrder.baseCurrencyId", groups = {Save.class, Update.class})
    @ApiModelProperty("本位币")
    @TableField("basic_currency_id")
    private String baseCurrencyId;
    @NotBlank(message = "PsiPurchaseOrder.baseCurrencyName", groups = {Save.class, Update.class})
    @ApiModelProperty("本位币名称")
    @TableField("basic_currency_name")
    private String baseCurrencyName;
    @NotNull(message = "PsiPurchaseOrder.baseCurrencyPriceAccuracy", groups = {Save.class, Update.class})
    @TableField("basic_currency_price_accuracy")
    private Integer baseCurrencyPriceAccuracy;
    @NotNull(message = "PsiPurchaseOrder.baseCurrencyAmountAccuracy", groups = {Save.class, Update.class})
    @TableField("basic_currency_amount_accuracy")
    private Integer baseCurrencyAmountAccuracy;
    @TableField("basic_currency_round_off_type")
    private Integer baseCurrencyRoundOffType;

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

    @ApiModelProperty("汇率表主键")
    @TableField("exchange_rate_id")
    private String exchangeRateId;
    @TableField(exist = false)
    private String exchangeRateName;
    @ValidBigDecimal(message = "PsiPurchaseOrder.exchangeRate", min = "0.0000000001", max = "9999999999999.9999999999", includeMax = true, groups = {Save.class, Update.class})
    @ApiModelProperty("汇率")
    @TableField("exchange_rate")
    private String exchangeRate;

    @ApiModelProperty("单价是否含税[NY]")
    @TableField("price_included_tax")
    private String priceIncludedTax;
    @TableField(exist = false)
    private String priceIncludedTaxName;

    @ApiModelProperty("作价模式")
    @TableField("pricing_mode")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @TableField(exist = false)
    private String taxAmountFormat;

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

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<String> fileIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @ApiModelProperty("文件列表")
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;
    @TableField(exist = false)
    private String disableTimeFormat;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @TableField(exist = false)
    private String auditTimeFormat;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty(value = "乐观锁版本", hidden = true)
    @TableField("version")
    private Integer version;

    @ApiModelProperty(value = "供货资料类型id")
    @TableField("user_dict_id")
    private String userDictId;

    @ApiModelProperty(value = "供货资料类型code")
    @TableField("user_dict_code")
    private String userDictCode;

    @ApiModelProperty(value = "供货资料类型名称")
    @TableField("user_dict_name")
    private String userDictName;

    @Valid
    @Size(max = 500, message = "OrderDetail.Size", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<PsiPurchaseOrderDetail> materialList;

    /** =============================明细字段============================= */
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("采购订单")
    @TableField(exist = false)
    private String orderId;
    @TableField(exist = false)
    private String orderCode;

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
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @ApiModelProperty("可采购")
    @TableField(exist = false)
    private Integer purchasable;
    @ApiModelProperty("可存货")
    @TableField(exist = false)
    private Integer storable;

    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialCharacteristicNames;
    @TableField(exist = false)
    private String materialSpecific;
    @TableField(exist = false)
    private List<PsiPurchaseOrderDetailSpecific> detailSpecifics;
    @ApiModelProperty("物料批号控制方式")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("物料批号应用范围")
    @TableField(exist = false)
    private String lotNoScope;
    @ApiModelProperty("物料最小采购数量")
    @TableField(exist = false)
    private BigDecimal materialPurchaseMinQuantity;
    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;
    @ApiModelProperty("质量属性")
    @TableField(exist = false)
    private PsiMaterialQuality materialQuality;

    @ApiModelProperty("采购单位")
    @TableField(exist = false)
    private String purchaseUnitId;
    @TableField(exist = false)
    private String purchaseUnitCode;
    @TableField(exist = false)
    private String purchaseUnitName;
    @TableField(exist = false)
    private Integer purchaseUnitAccuracy;
    @TableField(exist = false)
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购数量")
    @TableField(exist = false)
    private BigDecimal number;
    @TableField(exist = false)
    private String numberFormat;

    @Deprecated
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购数量(采购单位->库存单位)")
    @TableField(exist = false)
    private BigDecimal convertNumber;
    @Deprecated
    @TableField(exist = false)
    private String convertNumberFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可入库数量(采购订单数量-已入库数量-占用数量)")
    @TableField(exist = false)
    private BigDecimal canStockInNumber;
    @TableField(exist = false)
    private String canStockInNumberFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("未入库数量(采购订单数量-已入库数量)")
    @TableField(exist = false)
    private BigDecimal notStockInNumber;

    @ApiModelProperty("已收货数量[在采购收货单审核通过之后回写该数据]")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal alreadyDeliveryNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可收货数量[采购订单数量-已收货数量-占用数量]")
    @TableField(exist = false)
    private BigDecimal canDeliveryNumber;

    @ApiModelProperty("剩余收货数量[订单明细数量-关联已审核的采购收货单数量汇总；（支持负数）]")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal remainDeliveryNumber;

    @ApiModelProperty("剩余入库数量[订单明细数量-关联已审核的采购入库单数量汇总；（支持负数）]")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal remainStockInNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用数量[在采购入库单提交审核时回写该字段]")
    @TableField(exist = false)
    private BigDecimal occupyNumber;
    @TableField(exist = false)
    private String occupyNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已入库数量[在采购入库单过账之后回写该数据]")
    @TableField(exist = false)
    private BigDecimal alreadyStockInNumber;
    @TableField(exist = false)
    private String alreadyStockInNumberFormat;
    @ApiModelProperty("已退货数量")
    @TableField(exist = false)
    private BigDecimal alreadyReturnNumber;
    @TableField(exist = false)
    private BigDecimal canReturnNumber;
    @ApiModelProperty("已下发数量")
    @TableField(exist = false)
    private BigDecimal issuedNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;
    @TableField(exist = false)
    private String priceFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal includingTaxPrice;
    @TableField(exist = false)
    private String includingTaxPriceFormat;

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
    private String taxRateFormat;
    @TableField(exist = false)
    private Integer taxAccuracy;
    @TableField(exist = false)
    private String taxType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("折扣率")
    @TableField(exist = false)
    private BigDecimal discountRate;
    @TableField(exist = false)
    private String discountRateFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价折扣额")
    @TableField(exist = false)
    private BigDecimal priceDiscountAmount;
    @TableField(exist = false)
    private String priceDiscountAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField(exist = false)
    private BigDecimal amount;
    @TableField(exist = false)
    private String amountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmount;
    @TableField(exist = false)
    private String baseCurrencyAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField(exist = false)
    private BigDecimal detailTaxAmount;
    @TableField(exist = false)
    private String detailTaxAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyTaxAmount;
    @TableField(exist = false)
    private String baseCurrencyTaxAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("折扣金额")
    @TableField(exist = false)
    private BigDecimal discountAmount;
    @TableField(exist = false)
    private String discountAmountFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;
    @TableField(exist = false)
    private String amountIncludingTaxFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmountIncludingTax;
    @TableField(exist = false)
    private String baseCurrencyAmountIncludingTaxFormat;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("承诺日期")
    @TableField(exist = false)
    private LocalDateTime promiseDate;
    @TableField(exist = false)
    private String promiseDateFormat;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("交货日期")
    @TableField("delivery_date")
    private LocalDateTime deliveryDate;
    @TableField(exist = false)
    private String deliveryDateFormat;
    @TableField(exist = false)
    private LocalDateTime mainDeliveryDate;

    @ApiModelProperty("交货地址")
    @TableField(exist = false)
    private String deliveryAddress;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("收货欠收比率（%）")
    @TableField(exist = false)
    private BigDecimal poorCropLimit;
    @TableField(exist = false)
    private String poorCropLimitFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("收货超收比率（%）")
    @TableField(exist = false)
    private BigDecimal richCropLimit;
    @TableField(exist = false)
    private String richCropLimitFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("收货下限数量")
    @TableField(exist = false)
    private BigDecimal deliveryLowerNumber;
    @TableField(exist = false)
    private String deliveryLowerNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(采购单位->基本单位->库存单位)收货下限数量")
    @TableField(exist = false)
    private BigDecimal deliveryLowerConvertNumber;
    @TableField(exist = false)
    private String deliveryLowerConvertNumberFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("收货上限数量")
    @TableField(exist = false)
    private BigDecimal deliveryUpperNumber;
    @TableField(exist = false)
    private String deliveryUpperNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("(采购单位->基本单位->库存单位)收货上限数量")
    @TableField(exist = false)
    private BigDecimal deliveryUpperConvertNumber;
    @TableField(exist = false)
    private String deliveryUpperConvertNumberFormat;

    @TableField(exist = false)
    private BigDecimal replenishmentNumber;

    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;
    @ApiModelProperty("源单id")
    @TableField(exist = false)
    private String sourceOrderId;
    @TableField(exist = false)
    @ApiModelProperty("源单单号")
    private String sourceOrderCode;
    @TableField(exist = false)
    @ApiModelProperty("源单类型")
    private String sourceOrderType;
    @TableField(exist = false)
    @ApiModelProperty("源单类型")
    private String sourceOrderTypeName;
    @TableField(exist = false)
    @ApiModelProperty("源单明细id")
    private String sourceDetailId;
    @TableField(exist = false)
    @ApiModelProperty("源单行号")
    private Long sourceDetailLineNumber;
    @TableField(exist = false)
    private String isOverdue;

    @TableField(exist = false)
    private String referenceUnitNumber4StockInOrder;

    @ApiModelProperty("超需求数量=源单据已审核数量-源申请数量")
    @TableField(exist = false)
    private BigDecimal overDemandNumber;
    @ApiModelProperty("超需求未税金额=超订单入库数量*单价")
    @TableField(exist = false)
    private BigDecimal overDemandNotTaxAmount;
    @ApiModelProperty("超需求含税金额=超订单入库数量*含税单价")
    @TableField(exist = false)
    private BigDecimal overDemandIncludingTaxAmount;
    @ApiModelProperty("超订单入库数量=源单据已入库数量-源订单数量")
    @TableField(exist = false)
    private BigDecimal overStockInNumber;
    @ApiModelProperty("超订单入库未税金额=超订单入库数量*单价")
    @TableField(exist = false)
    private BigDecimal overStockInNotTaxAmount;
    @ApiModelProperty("超订单入库含税金额=超订单入库数量*含税单价")
    @TableField(exist = false)
    private BigDecimal overStockInIncludingTaxAmount;

    @ApiModelProperty("允许超订单收货及入库")
    @TableField(exist = false)
    private Boolean allowOverDeliveryAndStockIn;
    @ApiModelProperty("采购入库按比例控制")
    @TableField(exist = false)
    private Boolean purStockInInProportion;

    @ApiModelProperty("库存单位单价")
    @TableField(exist = false)
    private String storePrice;
    @ApiModelProperty("库存单位含税单价")
    @TableField(exist = false)
    private String storeIncludingTaxPrice;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @ApiModelProperty("销售订单含税单价")
    @TableField(exist = false)
    private BigDecimal salePriceIncludingTax;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private String isPurchaseMaterialDemand;
    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;
    /**
     * @see ArrivalStatusEnum
     */
    @TableField(exist = false)
    @ApiModelProperty("到货状态 [1未收货, 2已到货, 3检验中, 4已入库]")
    private String arrivalStatus;
    @TableField(exist = false)
    @ApiModelProperty("到货状态")
    private String arrivalStatusName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("明细关闭日期")
    @TableField(exist = false)
    private LocalDateTime closeTime;

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

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购进度")
    @TableField(exist = false)
    private BigDecimal purchaseProcessRate;

    /**
     * @see ConfirmStatusEnum
     */
    @ApiModelProperty("确认交货状态")
    @TableField(exist = false)
    private String confirmDeliveryStatus;
    @TableField(exist = false)
    private String confirmDeliveryStatusName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("确认交货数量")
    @TableField(exist = false)
    private BigDecimal confirmDeliveryNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("确认交货日期")
    @TableField(exist = false)
    private LocalDateTime confirmDeliveryDate;
    @ApiModelProperty("确认交货备注")
    @TableField(exist = false)
    private String confirmDeliveryRemark;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    public BigDecimal occupyNumberNotNull() {
        if (Objects.isNull(occupyNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyNumber;
        }
    }

    public BigDecimal alreadyStockInNumberNotNull() {
        if (Objects.isNull(alreadyStockInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyStockInNumber;
        }
    }

    public BigDecimal alreadyDeliveryNumberNotNull() {
        if (Objects.isNull(alreadyDeliveryNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyDeliveryNumber;
        }
    }

    public BigDecimal deliveryLowerNumberNotNull() {
        if (Objects.isNull(deliveryLowerNumber)) {
            return BigDecimal.ZERO;
        } else {
            return deliveryLowerNumber;
        }
    }
    public BigDecimal deliveryUpperNumberNotNull() {
        if (Objects.isNull(deliveryUpperNumber)) {
            return BigDecimal.ZERO;
        } else {
            return deliveryUpperNumber;
        }
    }
    public BigDecimal issuedNumberNN() {
        if (Objects.isNull(issuedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return issuedNumber;
        }
    }
}
