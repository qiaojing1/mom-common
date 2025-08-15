package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 销售订单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("psi_sale_order_material")
@ApiModel(value = "PsiSaleOrderMaterial对象", description = "销售订单物料明细")
public class PsiSaleOrderMaterial extends BaseEntity {

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("销售订单CODE")
    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("销售订单单据类别ID")
    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("客户物料编码ID")
    @TableField("customer_material_id")
    private String customerMaterialId;

    @ApiModelProperty("客户物料编码编码")
    @TableField("customer_material_code")
    private String customerMaterialCode;

    @ApiModelProperty("客户物料编码名称")
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

    @ApiModelProperty("物料编码名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("物料起订量")
    @TableField("material_sale_min_quantity")
    private BigDecimal materialSaleMinQuantity;

    @ApiModelProperty("销售批量控制方式")
    @TableField("sale_lot_control_type")
    private String saleLotControlType;

    @ApiModelProperty("销售批量")
    @TableField("sale_lot_quantity")
    private BigDecimal saleLotQuantity;

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

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("MRP数量")
    @TableField(exist = false)
    private BigDecimal mrpQuantity;

    @TableField(exist = false)
    private String quantityFormat;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @TableField(exist = false)
    private String priceFormat;

    @ApiModelProperty("税种ID")
    @TableField("tax_id")
    private String taxId;

    @ApiModelProperty("税率精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;

    @ApiModelProperty("订货客户税种分类")
    @TableField("tax_type")
    private String taxType;

    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private String taxRate;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
    @TableField(exist = false)
    private String priceIncludingTaxFormat;

    @ApiModelProperty("折扣率")
    @TableField("discount_rate")
    private BigDecimal discountRate;
    @TableField(exist = false)
    private String discountRateFormat;

    @ApiModelProperty("单价折扣额")
    @TableField("price_discount_amount")
    private BigDecimal priceDiscountAmount;
    @TableField(exist = false)
    private String priceDiscountAmountFormat;

    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @TableField(exist = false)
    private String amountFormat;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;
    @TableField(exist = false)
    private String baseCurrencyAmountFormat;

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @TableField(exist = false)
    private String taxAmountFormat;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;
    @TableField(exist = false)
    private String baseCurrencyTaxAmountFormat;

    @ApiModelProperty("折扣金额")
    @TableField("discount_amount")
    private BigDecimal discountAmount;
    @TableField(exist = false)
    private String discountAmountFormat;

    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @TableField(exist = false)
    private String amountIncludingTaxFormat;

    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;
    @TableField(exist = false)
    private String baseCurrencyAmountIncludingTaxFormat;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime needDate;
    @TableField(exist = false)
    private String needDateFormat;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("参考单位ID")
    @TableField("reference_unit_id")
    private String referenceUnitId;

    @ApiModelProperty("参考单位名称")
    @TableField("reference_unit_name")
    private String referenceUnitName;

    @ApiModelProperty("参考单位精度")
    @TableField("reference_unit_accuracy")
    private Integer referenceUnitAccuracy;

    @ApiModelProperty("参考单位舍入类型")
    @TableField("reference_unit_round_off_type")
    private String referenceUnitRoundOffType;

    @ApiModelProperty("参考单位与销售单位比例")
    @TableField("reference_unit_rate")
    private BigDecimal referenceUnitRate;

    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;
    @TableField(exist = false)
    private String referenceQuantityFormat;

    @ApiModelProperty("超发上限(%)")
    @TableField("sale_over_limit")
    private BigDecimal saleOverLimit;

    @ApiModelProperty("超发下限(%)")
    @TableField("sale_under_limit")
    private BigDecimal saleUnderLimit;

    @ApiModelProperty("超发上限数量")
    @TableField("sale_over_quantity")
    private BigDecimal saleOverQuantity;
    @TableField(exist = false)
    private String saleOverQuantityFormat;

    @ApiModelProperty("超发下限数量")
    @TableField("sale_under_quantity")
    private BigDecimal saleUnderQuantity;
    @TableField(exist = false)
    private String saleUnderQuantityFormat;

    @ApiModelProperty("子件拆解方式")
    @TableField("sale_sub_disassembly_type")
    private String saleSubDisassemblyType;

    @ApiModelProperty("子件拆解方式名称")
    @TableField(exist = false)
    private String saleSubDisassemblyTypeName;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("源单类型ID")
    @TableField("source_category_id")
    private String sourceCategoryId;

    @ApiModelProperty("源单类型名称")
    @TableField("source_category_name")
    private String sourceCategoryName;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("来源单据明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    /**
     * @see com.lets.platform.model.psi.enums.SourceOrderTypeEnum
     */
    @ApiModelProperty("源单类型[saleQuotationOrder销售报价单，contractManage合同管理，salePredictionOrder销售预测单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ApiModelProperty("源单类型[saleQuotationOrder销售报价单，contractManage合同管理，salePredictionOrder销售预测单]")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("行状态名称")
    @TableField(exist = false)
    private String enableName;
    @TableField(exist = false)
    private String detailEnableName;

    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;

    @ApiModelProperty("已出货通知数量")
    @TableField(exist = false)
    private BigDecimal deliveryQuantity;
    @TableField(exist = false)
    private String deliveryQuantityFormat;

    @ApiModelProperty("已出库数量")
    @TableField(exist = false)
    private BigDecimal stockOutQuantity;
    @TableField(exist = false)
    private String stockOutQuantityFormat;

    @ApiModelProperty("剩余未出库数量")
    @TableField(exist = false)
    private BigDecimal remainStockOutQuantity;

    @ApiModelProperty("已退货数量")
    @TableField(exist = false)
    private BigDecimal returnQuantity;
    @TableField(exist = false)
    private String returnQuantityFormat;

    @ApiModelProperty("需补货数量")
    @TableField("replenishment_Quantity")
    private BigDecimal replenishmentQuantity;

    @TableField(exist = false)
    private BigDecimal afterReplenishmentQuantity;

    @TableField(exist = false)
    private String replenishmentQuantityFormat;

    @ApiModelProperty("剩余未退货数量")
    @TableField(exist = false)
    private BigDecimal remainReturnQuantity;

    @TableField(exist = false)
    private String remainReturnQuantityFormat;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiSaleOrderMaterialCharacteristic> materialCharacteristicList;

    @ApiModelProperty("订单需求")
    @TableField(exist = false)
    private PsiSaleOrderMaterialDemand materialDemand;

    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private List<PsiSaleOrderDetailSerial> serials;
    @ApiModelProperty("流水号编码规则id")
    @TableField("rule_id")
    private String ruleId;
    @ApiModelProperty("流水号类型的编码规则明细id")
    @TableField("rule_detail_id")
    private String ruleDetailId;
    @ApiModelProperty("流水号类型的编码规则明细流水id")
    @TableField("rule_detail_serial_id")
    private String ruleDetailSerialId;

    @ApiModelProperty("物料销售属性")
    @TableField(exist = false)
    private PsiMaterialSale materialSale;

    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;

    @ApiModelProperty("结算币种金额精度")
    @TableField(exist = false)
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("结算币种单价精度")
    @TableField(exist = false)
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("结算币种舍入类型")
    @TableField(exist = false)
    private Integer currencyRoundOffType;

    @ApiModelProperty("价格校验标志")
    @TableField(exist = false)
    private boolean priceCheckSign;

    @ApiModelProperty("历史最低价")
    @TableField(exist = false)
    private BigDecimal historyMinPrice;

    @ApiModelProperty("历史最高价")
    @TableField(exist = false)
    private BigDecimal historyMaxPrice;

    @ApiModelProperty("已转工单数量")
    @TableField("product_order_quantity")
    private BigDecimal productOrderQuantity;

    @ApiModelProperty("工单占用数量")
    @TableField("product_order_occupied_quantity")
    private BigDecimal productOrderOccupiedQuantity;

    @ApiModelProperty("可转工单数量")
    @TableField(exist = false)
    private BigDecimal availableProductOrderQuantity;

    @ApiModelProperty("可用库存量")
    @TableField(exist = false)
    private BigDecimal availableInventoryQuantity;

    @ApiModelProperty("已转采购数量")
    @TableField("purchase_order_quantity")
    private BigDecimal purchaseOrderQuantity;

    @ApiModelProperty("采购占用数量")
    @TableField("purchase_order_occupied_quantity")
    private BigDecimal purchaseOrderOccupiedQuantity;

    @ApiModelProperty("可转采购数量")
    @TableField(exist = false)
    private BigDecimal availablePurchaseOrderQuantity;

    @ApiModelProperty("是否有技术要求")
    @TableField("is_mateial_demand")
    private String isMateialDemand;

    @ApiModelProperty("交货期(天)")
    @TableField("delivery_day")
    private String deliveryDay;

    @ApiModelProperty("扩展字段1")
    @TableField("ext_field1")
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField("ext_field2")
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField("ext_field3")
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField("ext_field4")
    private String extField4;

    @ApiModelProperty("扩展字段1")
    @TableField("ext_field5")
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField("ext_field6")
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField("ext_field7")
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField("ext_field8")
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField("ext_field9")
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField("ext_field10")
    private String extField10;


    @ApiModelProperty("成本价")
    @TableField("cost_price")
    private BigDecimal costPrice;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注一")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注二")
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

    @TableField(exist = false)
    private PsiSaleOrder saleOrder;

    @ApiModelProperty("订货客户ID")
    @TableField(exist = false)
    private String orderCustomerId;

    @ApiModelProperty("订货客户名称")
    @TableField(exist = false)
    private String orderCustomerName;

    @TableField(exist = false)
    private Map<String, String> specificMap;

    @TableField("calculated")
    @ApiModelProperty("是否已计划运算(新计划运算)")
    private int calculated;

    @TableField("calculate_time")
    @ApiModelProperty("计算时间")
    private LocalDateTime calculateTime;

    @TableField(exist = false)
    private String materialGroupId;

    @TableField(exist = false)
    private String orderType;

    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("BOM状态")
    @TableField(exist = false)
    private String bomStatus;
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}
