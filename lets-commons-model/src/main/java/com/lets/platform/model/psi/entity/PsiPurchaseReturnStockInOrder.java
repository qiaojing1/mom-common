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

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 采购退货入库单
 *
 * @author DING WEI
 * @since 2023-09-19
 */
@Getter
@Setter
@TableName("psi_purchase_return_stock_in_order")
@ApiModel(value = "PsiPurchaseReturnStockInOrder对象", description = "采购退货入库单")
public class PsiPurchaseReturnStockInOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @NotBlank(message = "Order.orderCategoryId", groups = {Save.class, Update.class})
    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @TableField(exist = false)
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @TableField(exist = false)
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Order.orderTime", groups = {Save.class, Update.class})
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("过账日期")
    @TableField("posting_time")
    private LocalDateTime postingTime;

    @ApiModelProperty("订货供应商")
    @TableField("order_supplier_id")
    private String orderSupplierId;
    @TableField(exist = false)
    private String orderSupplierName;

    @ApiModelProperty("订货供应商-联系人")
    @TableField("order_supplier_user")
    private String orderSupplierUser;

    @ApiModelProperty("订货供应商-联系电话")
    @TableField("order_supplier_phone")
    private String orderSupplierPhone;

    @ApiModelProperty("订货供应商-联系地址")
    @TableField("order_supplier_address")
    private String orderSupplierAddress;

    @ApiModelProperty("供货供应商")
    @TableField("supply_supplier_id")
    private String supplySupplierId;
    @TableField(exist = false)
    private String supplySupplierName;

    @ApiModelProperty("供货供应商-联系人")
    @TableField("supply_supplier_user")
    private String supplySupplierUser;

    @ApiModelProperty("供货供应商-联系电话")
    @TableField("supply_supplier_phone")
    private String supplySupplierPhone;

    @ApiModelProperty("供货供应商-联系地址")
    @TableField("supply_supplier_address")
    private String supplySupplierAddress;

    @ApiModelProperty("结算供应商")
    @TableField("settlement_supplier_id")
    private String settlementSupplierId;
    @TableField(exist = false)
    private String settlementSupplierName;

    @ApiModelProperty("收款供应商")
    @TableField("collection_supplier_id")
    private String collectionSupplierId;
    @TableField(exist = false)
    private String collectionSupplierName;

    @ApiModelProperty("付款条件")
    @TableField("payment_condition_id")
    private String paymentConditionId;
    @TableField("payment_condition_name")
    private String paymentConditionName;
    @TableField(exist = false)
    private Integer paymentConditionPriority;

    @ApiModelProperty("入库部门")
    @TableField("stock_in_org_id")
    private String stockInOrgId;
    @TableField(exist = false)
    private String stockInOrgName;

    @ApiModelProperty("入库人员")
    @TableField("stock_in_user_id")
    private String stockInUserId;
    @TableField(exist = false)
    private String stockInUserName;

    @ApiModelProperty("采购部门")
    @TableField("purchase_org_id")
    private String purchaseOrgId;
    @TableField("purchase_org_name")
    private String purchaseOrgName;

    @ApiModelProperty("采购人员")
    @TableField("purchase_user_id")
    private String purchaseUserId;
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核,4:已过账]")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
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

    @ApiModelProperty("汇率表主键")
    @TableField("exchange_rate_id")
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField("exchange_rate_name")
    private String exchangeRateName;

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

    @ApiModelProperty("付款方式[1赊账2现购]")
    @TableField("payment_method")
    private String paymentMethod;
    @TableField(exist = false)
    private String paymentMethodName;

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

    @ApiModelProperty("真实过账时间")
    @TableField("real_posting_time")
    private LocalDateTime realPostingTime;

    @ApiModelProperty("过账人")
    @TableField("real_posting_user")
    private String realPostingUser;

    @ApiModelProperty("过账人名称")
    @TableField("real_posting_user_name")
    private String realPostingUserName;

    @ApiModelProperty("乐观锁版本号")
    @TableField("version")
    private Integer version;

    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;

    @Valid
    @TableField(exist = false)
    @Size(max = 500, message = "OrderDetail.Size", groups = {Save.class, Update.class})
    private List<PsiPurchaseReturnStockInOrderDetail> details;

    /**
     * 明细字段
     */
    @TableField(exist = false)
    private String detailId;
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
    private String materialSpecific;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField(exist = false)
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField(exist = false)
    private String lotNoScope;

    @ApiModelProperty("库存单位")
    @TableField(exist = false)
    private String storeUnitId;
    @ApiModelProperty("库存单位编码")
    @TableField(exist = false)
    private String storeUnitCode;
    @ApiModelProperty("库存单位名称")
    @TableField(exist = false)
    private String storeUnitName;
    @ApiModelProperty("库存单位精度")
    @TableField(exist = false)
    private Integer storeUnitAccuracy;
    @ApiModelProperty("库存单位舍入类型")
    @TableField(exist = false)
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("数量")
    @TableField(exist = false)
    private BigDecimal number;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("生产日期")
    @TableField(exist = false)
    private LocalDateTime produceDate;
    @ApiModelProperty("有效期至")
    @TableField(exist = false)
    private LocalDateTime periodDate;
    @ApiModelProperty("收货日期")
    @TableField(exist = false)
    private LocalDateTime deliveryDate;

    @ApiModelProperty("仓库")
    @TableField(exist = false)
    private String storeId;
    @TableField(exist = false)
    private String storeName;
    @ApiModelProperty("库区")
    @TableField(exist = false)
    private String areaId;
    @TableField(exist = false)
    private String areaName;
    @ApiModelProperty("库位")
    @TableField(exist = false)
    private String positionId;
    @TableField(exist = false)
    private String positionName;

    @ApiModelProperty("单价")
    @TableField(exist = false)
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField(exist = false)
    private BigDecimal includingTaxPrice;

    @ApiModelProperty("税种")
    @TableField(exist = false)
    private String taxId;

    @ApiModelProperty("税种名称")
    @TableField(exist = false)
    private String taxName;

    @ApiModelProperty("税率")
    @TableField(exist = false)
    private BigDecimal taxRate;

    @ApiModelProperty("税种精度")
    @TableField(exist = false)
    private Integer taxAccuracy;

    @ApiModelProperty("税种分类[ratio、number]")
    @TableField(exist = false)
    private String taxType;

    @ApiModelProperty("折扣率")
    @TableField(exist = false)
    private BigDecimal discountRate;

    @ApiModelProperty("单价折扣额")
    @TableField(exist = false)
    private BigDecimal priceDiscountAmount;

    @ApiModelProperty("金额")
    @TableField(exist = false)
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("税额")
    @TableField(exist = false)
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("折扣金额")
    @TableField(exist = false)
    private BigDecimal discountAmount;

    @ApiModelProperty("含税合计")
    @TableField(exist = false)
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("源单主键")
    @TableField(exist = false)
    private String sourceOrderId;

    @ApiModelProperty("源单单号")
    @TableField(exist = false)
    private String sourceOrderCode;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String orderType;
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

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private String isPurchaseMaterialDemand;

    @ApiModelProperty("补货数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal replenishmentQuantity;

    @ApiModelProperty("扣款数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal deductionQuantity;

    @ApiModelProperty("已应付数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal alreadyApNumber;

    @ApiModelProperty("应付占用数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal occupyApNumber;

    @ApiModelProperty("可应付数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal canApNumber;

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

    @TableField(exist = false)
    private Boolean reservationCheck;

    public boolean isReservationCheck() {
        if (Objects.isNull(reservationCheck)) {
            reservationCheck = true;
        }
        return reservationCheck;
    }
}
