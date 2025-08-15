package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.base.SimpleDict;
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
 * 采购收货单-明细
 *
 * @author DING WEI
 * @since 2024-03-19
 */
@Getter
@Setter
@TableName("psi_purchase_delivery_order_detail")
@ApiModel(value = "PsiPurchaseDeliveryOrderDetail对象", description = "采购收货单-明细")
public class PsiPurchaseDeliveryOrderDetail extends BaseEntity {

    @ApiModelProperty("采购收货单明细主键")
    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("采购收货单")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private String orderStatus;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("可采购")
    @TableField("purchasable")
    private Integer purchasable;
    @ApiModelProperty("可存货")
    @TableField("storable")
    private Integer storable;
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("采购单位")
    @TableField("purchase_unit_id")
    private String purchaseUnitId;
    @ApiModelProperty("采购单位编码")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;
    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;
    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;
    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private Integer purchaseUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("采购数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("采购计价单位")
    @TableField("pricing_unit_id")
    private String pricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    @TableField("pricing_unit_code")
    private String pricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    @TableField("pricing_unit_name")
    private String pricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    @TableField("pricing_unit_accuracy")
    private Integer pricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入类型")
    @TableField("pricing_unit_round_off_type")
    private Integer pricingUnitRoundOffType;
    @ApiModelProperty("采购计价单位浮动类型")
    @TableField(exist = false)
    private String pricingUnitType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计价数量")
    @TableField("pricing_number")
    private BigDecimal pricingNumber;

    @TableField(exist = false)
    private BigDecimal canNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用数量[在采购入库单提交时回写该字段]")
    @TableField("occupy_number")
    private BigDecimal occupyNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已入库数量[在采购入库单过账之后回写该数据]")
    @TableField("already_stock_in_number")
    private BigDecimal alreadyStockInNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;
    @ApiModelProperty("拆分数量")
    @TableField(exist = false)
    private BigDecimal splitNumber;
    @ApiModelProperty("拆分批号")
    @TableField(exist = false)
    private String splitBatchNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("生产日期")
    @TableField("produce_time")
    private LocalDateTime produceTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("保质期到期日")
    @TableField("period_time")
    private LocalDateTime periodTime;

    @ApiModelProperty("仓库主键")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @TableField(exist = false)
    private boolean storeNullAble;

    @ApiModelProperty("是否进料检验[0:否;1:是]")
    @TableField("feed_inspect")
    private Integer feedInspect;
    @TableField(exist = false)
    private String feedInspectName;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ApiModelProperty("源单类型[1采购订单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @TableField(exist = false)
    private String sourceOrderCategoryId;
    @TableField(exist = false)
    private String sourceOrderCategoryName;
    @TableField(exist = false)
    private BigDecimal sourceQuantity;
    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;
    @ApiModelProperty("关联单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    private BigDecimal includingTaxPrice;
    @ApiModelProperty("税种")
    @TableField("tax_id")
    private String taxId;
    @TableField("tax_name")
    private String taxName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;
    @TableField("tax_accuracy")
    private Integer taxAccuracy;
    @TableField("tax_type")
    private String taxType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("折扣率")
    @TableField("discount_rate")
    private BigDecimal discountRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("单价折扣额")
    @TableField("price_discount_amount")
    private BigDecimal priceDiscountAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("折扣金额")
    @TableField("discount_amount")
    private BigDecimal discountAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField("qualified_number")
    private BigDecimal qualifiedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已开票数量")
    @TableField("invoiced_quantity")
    private BigDecimal invoicedQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("未开票数量")
    @TableField("unvoiced_quantity")
    private BigDecimal unvoicedQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("开票占用数量")
    @TableField("invoiced_occupy_quantity")
    private BigDecimal invoicedOccupyQuantity;
    @TableField(exist = false)
    private BigDecimal oldQualifiedNumber;
    @TableField(exist = false)
    private BigDecimal splitQualifiedNumber;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean emptyQualifiedNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步接收数量")
    @TableField("give_in_number")
    private BigDecimal giveInNumber;
    @TableField(exist = false)
    private BigDecimal oldGiveInNumber;
    @TableField(exist = false)
    private BigDecimal splitGiveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("判退数量")
    @TableField("decide_return_number")
    private BigDecimal decideReturnNumber;
    @TableField(exist = false)
    private BigDecimal oldDecideReturnNumber;
    @TableField(exist = false)
    private BigDecimal splitDecideReturnNumber;
    @ApiModelProperty("已检验数量")
    @TableField("already_inspect_number")
    private BigDecimal alreadyInspectNumber;
    @TableField(exist = false)
    private BigDecimal oldAlreadyInspectNumber;
    @ApiModelProperty("检验占用数量")
    @TableField("occupy_inspect_number")
    private BigDecimal occupyInspectNumber;
    @TableField(exist = false)
    private BigDecimal oldOccupyInspectNumber;
    @TableField(exist = false)
    private Integer expirationDateManaged;
    @TableField("generated_device_num")
    private Integer generatedDeviceNum;
    @TableField(exist = false)
    private String expirationDateControlType;
    @TableField(exist = false)
    private String expirationDateUnit;
    @TableField(exist = false)
    private Short expirationDate;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    
    @TableField("detect_order_code")
    private String detectOrderCode;
    @TableField("already_detect_number")
    private BigDecimal alreadyDetectNumber;
    @TableField(exist = false)
    private BigDecimal alreadyDetectNumberOld;


    @TableField(exist = false)
    private List<PsiPurchaseDeliveryOrderDetailCharacteristic> materialCharacteristics;
    @TableField(exist = false)
    private PsiPurchaseDeliveryOrder order;

    @ApiModelProperty("订货供应商")
    @TableField(exist = false)
    private String orderSupplierId;

    @ApiModelProperty("订货供应商名称")
    @TableField(exist = false)
    private String orderSupplierName;

    @ApiModelProperty("供货供应商")
    @TableField(exist = false)
    private String supplySupplierId;

    @ApiModelProperty("供货供应商名称")
    @TableField(exist = false)
    private String supplySupplierName;

    @ApiModelProperty("结算供应商")
    @TableField(exist = false)
    private String settlementSupplierId;

    @ApiModelProperty("结算供应商名称")
    @TableField(exist = false)
    private String settlementSupplierName;

    @ApiModelProperty("收款供应商")
    @TableField(exist = false)
    private String collectionSupplierId;

    @ApiModelProperty("收款供应商名称")
    @TableField(exist = false)
    private String collectionSupplierName;

    @TableField(exist = false)
    private List<SimpleDict<?>> extFieldList;

    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;

    @ApiModelProperty("拆分来源主键")
    @TableField("split_from_id")
    private String splitFromId;

    @ApiModelProperty("采购订单单据日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime purchaseOrderTime;

    @ApiModelProperty("协同送货单主键")
    @TableField("cooperate_deliver_order_id")
    private String cooperateDeliverOrderId;

    @ApiModelProperty("协同送货明细主键")
    @TableField("cooperate_deliver_detail_id")
    private String cooperateDeliverDetailId;

    @TableField(exist = false)
    private LocalDateTime auditTime;

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

    public BigDecimal alreadyInspectNumberNN() {
        if (Objects.isNull(alreadyInspectNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyInspectNumber;
        }
    }

    public BigDecimal occupyInspectNumberNN() {
        if (Objects.isNull(occupyInspectNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyInspectNumber;
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

    public BigDecimal unvoicedNumberNN() {
        if (Objects.isNull(unvoicedQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return unvoicedQuantity;
        }
    }
    public BigDecimal invoicedNumberNN() {
        if (Objects.isNull(invoicedQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return invoicedQuantity;
        }
    }
    public BigDecimal invoicedOccupyNumberNN() {
        if (Objects.isNull(invoicedOccupyQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return invoicedOccupyQuantity;
        }
    }
    public Integer generatedDeviceNumNN() {
        if (Objects.isNull(generatedDeviceNum)) {
            return 0;
        } else {
            return generatedDeviceNum;
        }
    }
}
