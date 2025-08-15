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
import java.util.Objects;

/**
 * <p>
 * 销售退货申请单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("psi_sale_return_application_order_material")
@ApiModel(value = "PsiSaleReturnApplicationOrderMaterial对象", description = "销售退货申请单物料明细")
public class PsiSaleReturnApplicationOrderMaterial extends BaseEntity {

    @ApiModelProperty("销售退货申请单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("销售退货申请单")
    @TableField(exist = false)
    private PsiSaleReturnApplicationOrder order;

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

    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("退货类型")
    @TableField("return_type")
    private String returnType;

    @ApiModelProperty("退货类型")
    @TableField(exist = false)
    private String returnTypeName;

    @ApiModelProperty("退货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("退货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("退货联系人ID")
    @TableField("order_customer_contact_user_id")
    private String orderCustomerContactUserId;

    @ApiModelProperty("退货联系人")
    @TableField("order_customer_contact_user")
    private String orderCustomerContactUser;

    @ApiModelProperty("退货联系电话")
    @TableField("order_customer_contact_phone_number")
    private String orderCustomerContactPhoneNumber;

    @ApiModelProperty("退货联系地址")
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

    @ApiModelProperty("销售数量")
    @TableField(exist = false)
    private BigDecimal saleQuantity;

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

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    private LocalDateTime needDate;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

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

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @ApiModelProperty("本位币税额")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @ApiModelProperty("本位币金额")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("价税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @ApiModelProperty("本位币价税合计")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("折扣率")
    @TableField("discount_rate")
    private BigDecimal discountRate;

    @ApiModelProperty("单价折扣额")
    @TableField("price_discount_amount")
    private BigDecimal priceDiscountAmount;

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

    @ApiModelProperty("库管员ID")
    @TableField("store_user_id")
    private String storeUserId;

    @ApiModelProperty("库管员名称")
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

    @ApiModelProperty("源单物料明细ID")
    @TableField("source_sale_order_material_id")
    private String sourceSaleOrderMaterialId;

    @ApiModelProperty("源单销售订单发货明细ID")
    @TableField("source_sale_order_delivery_id")
    private String sourceSaleOrderDeliveryId;

    @ApiModelProperty("源单物料明细行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("源单关联的明细行关联的sourceId")
    @TableField("source_transfer_source_id")
    private String sourceTransferOrderSourceId;

    @ApiModelProperty("源单关联的明细行Id")
    @TableField(exist = false)
    private String sourceTransferOrderMaterialId;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("关闭状态")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("关闭状态")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("汇率表ID")
    @TableField(exist = false)
    private String exchangeRateId;

    @ApiModelProperty("汇率表名称")
    @TableField(exist = false)
    private String exchangeRateName;

    @ApiModelProperty("汇率")
    @TableField(exist = false)
    private String exchangeRate;

    @ApiModelProperty("结算客户id")
    @TableField(exist = false)
    private String settlementCustomerId;

    @ApiModelProperty("结算客户name")
    @TableField(exist = false)
    private String settlementCustomerName;

    @ApiModelProperty("付款客户id")
    @TableField(exist = false)
    private String paymentCustomerId;

    @ApiModelProperty("付款客户name")
    @TableField(exist = false)
    private String paymentCustomerName;

    @ApiModelProperty("可申请数量")
    @TableField(exist = false)
    private BigDecimal availableQuantity;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("退货检验")
    @TableField("return_check")
    private Integer returnCheck;

    @ApiModelProperty("已入库数量")
    @TableField("stock_in_quantity")
    private BigDecimal stockInQuantity;

    @ApiModelProperty("入库占用数量")
    @TableField("stock_in_occupied_quantity")
    private BigDecimal stockInOccupiedQuantity;

    @ApiModelProperty("已退货申请数量")
    @TableField(exist = false)
    private BigDecimal returnQuantity;

    @ApiModelProperty("退货申请占用数量")
    @TableField(exist = false)
    private BigDecimal returnOccupyQuantity;

    @ApiModelProperty("剩余可退货申请数量")
    @TableField(exist = false)
    private BigDecimal remainReturnQuantity;

    @ApiModelProperty("检验数量")
    @TableField("inspect_quantity")
    private BigDecimal inspectQuantity;

    @ApiModelProperty("检验占用数量")
    @TableField("inspect_occupy_quantity")
    private BigDecimal inspectOccupyQuantity;

    @ApiModelProperty("合格数量")
    @TableField("qualified_quantity")
    private BigDecimal qualifiedQuantity;

    @ApiModelProperty("不合格数量")
    @TableField("unqualified_quantity")
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("报废数量")
    @TableField("scrap_quantity")
    private BigDecimal scrapQuantity;

    @ApiModelProperty("可入库报废数量")
    @TableField("can_stock_in_scrap_quantity")
    private BigDecimal canStockInScrapQuantity;

    @ApiModelProperty("不良数量")
    @TableField("defect_quantity")
    private BigDecimal defectQuantity;

    @ApiModelProperty("返工数量")
    @TableField("rework_quantity")
    private BigDecimal reworkQuantity;

    @ApiModelProperty("报废入库占用数量")
    @TableField("stock_in_occupy_scrap_quantity")
    private BigDecimal stockInOccupyScrapQuantity;

    @ApiModelProperty("报废入库数量")
    @TableField("stock_in_scrap_quantity")
    private BigDecimal stockInScrapQuantity;

    @ApiModelProperty("不良占用数量")
    @TableField("stock_in_occupy_defect_quantity")
    private BigDecimal stockInOccupyDefectQuantity;

    @ApiModelProperty("不良入库数量")
    @TableField("stock_in_defect_quantity")
    private BigDecimal stockInDefectQuantity;

    @ApiModelProperty("返工占用数量")
    @TableField("stock_in_occupy_rework_quantity")
    private BigDecimal stockInOccupyReworkQuantity;

    @ApiModelProperty("返工入库数量")
    @TableField("stock_in_rework_quantity")
    private BigDecimal stockInReworkQuantity;

    @TableField(exist = false)
    private BigDecimal afterInspectQuantity;

    @TableField(exist = false)
    private BigDecimal afterInspectOccupyQuantity;

    @TableField(exist = false)
    private BigDecimal afterQualifiedQuantity;

    @TableField(exist = false)
    private BigDecimal afterUnqualifiedQuantity;

    @TableField(exist = false)
    private BigDecimal afterScrapQuantity;

    @TableField(exist = false)
    private BigDecimal afterCanStockInScrapQuantity;

    @TableField(exist = false)
    private BigDecimal afterDefectQuantity;

    @TableField(exist = false)
    private BigDecimal afterReworkQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInOccupiedQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInOccupyDefectQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInDefectQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInOccupyScrapQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInScrapQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInOccupyReworkQuantity;

    @TableField(exist = false)
    private BigDecimal afterStockInReworkQuantity;

    @ApiModelProperty("结算币种ID")
    @TableField(exist = false)
    private String currencyId;

    @ApiModelProperty("结算币种编码")
    @TableField(exist = false)
    private String currencyCode;

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

    @ApiModelProperty("本位币编码")
    @TableField(exist = false)
    private String baseCurrencyCode;

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

    @ApiModelProperty("序列号列表")
    @TableField(exist = false)
    private List<PsiSaleReturnApplicationSerial> serialList;

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

    @TableField(exist = false)
    private List<PsiSaleReturnApplicationOrderMaterialCharacteristic> materialCharacteristicList;

    @TableField(exist = false)
    private List<PsiSaleReturnApplicationOrderMaterial> children;
    @TableField("substitute_detail_id")
    private String substituteDetailId;
    @TableField("substituted_id")
    private String substitutedId;
    @TableField("is_substitution")
    private Integer isSubstitution;

    @ApiModelProperty("源单单据日期,快捷导入用到")
    @TableField(exist = false)
    private LocalDateTime sourceOrderTime;


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

    public BigDecimal stockInQuantityNN() {
        return Objects.isNull(stockInQuantity) ? BigDecimal.ZERO : stockInQuantity;
    }

    public BigDecimal stockInQuantityOccupyNN() {
        return Objects.isNull(stockInOccupiedQuantity) ? BigDecimal.ZERO : stockInOccupiedQuantity;
    }

}
