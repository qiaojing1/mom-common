package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
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

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 采购入库订单物料明细
 * </p>
 *
 * @author DING WEI
 * @since 2023-08-16
 */
@Getter
@Setter
@TableName("psi_purchase_stock_in_order_detail")
@ApiModel(value = "PsiPurchaseStockInOrderDetail对象", description = "采购入库订单物料明细")
public class PsiPurchaseStockInOrderDetail extends BaseEntity {


    @ExcelIgnore
    @ApiModelProperty("采购入库单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("采购入库单")
    @TableField(exist = false)
    @ExcelIgnore
    private PsiPurchaseStockInOrder order;

    @ColumnWidth(30)
    @ExcelProperty("采购入库单号")
    @TableField(exist = false)
    private String orderCode;
    @TableField(exist = false)
    private String orderStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private LocalDateTime orderTime;
    @ExcelIgnore
    @TableField(exist = false)
    private LocalDateTime postingTime;

    @ColumnWidth(10)
    @ExcelProperty("行号")
    @NotNull(message = "OrderDetail.lineNumber", groups = {Save.class, Update.class})
    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ExcelIgnore
    @NotBlank(message = "OrderDetail.materialId", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ColumnWidth(20)
    @ExcelProperty("物料编码")
    @NotBlank(message = "OrderDetail.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ColumnWidth(20)
    @ExcelProperty("物料名称")
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ColumnWidth(20)
    @ExcelProperty("规格型号")
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @ApiModelProperty("物料-允许采购退料")
    @TableField("material_purchase_returnable")
    private Integer materialPurchaseReturnable;
    @ColumnWidth(20)
    @ExcelProperty("特征属性")
    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类一")
    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl1")
    private String extFl1;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类二")
    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl2")
    private String extFl2;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类三")
    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl3")
    private String extFl3;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类四")
    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl4")
    private String extFl4;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类五")
    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl5")
    private String extFl5;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类六")
    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl6")
    private String extFl6;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类七")
    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl7")
    private String extFl7;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类八")
    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl8")
    private String extFl8;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类九")
    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl9")
    private String extFl9;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类十")
    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl10")
    private String extFl10;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类十一")
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl11")
    private String extFl11;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格属性分类十二")
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl12")
    private String extFl12;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格备注一")
    @ApiModelProperty("扩展规格备注一")
    @TableField("remark1")
    private String remark1;
    @ColumnWidth(50)
    @ExcelProperty("扩展规格备注二")
    @ApiModelProperty("扩展规格备注二")
    @TableField("remark2")
    private String remark2;
    @ExcelIgnore
    @ApiModelProperty("批号控制方式")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ExcelIgnore
    @ApiModelProperty("批号应用范围")
    @TableField("lot_no_scope")
    private String lotNoScope;
    @ExcelIgnore
    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;

    @ExcelIgnore
    @ApiModelProperty("库存单位")
    @NotBlank(message = "OrderDetail.storeUnitId", groups = {Save.class, Update.class})
    @TableField("store_unit_id")
    private String storeUnitId;
    @ExcelIgnore
    @NotBlank(message = "OrderDetail.storeUnitCode", groups = {Save.class, Update.class})
    @TableField("store_unit_code")
    private String storeUnitCode;
    @ColumnWidth(20)
    @ExcelProperty("库存单位")
    @NotBlank(message = "OrderDetail.storeUnitName", groups = {Save.class, Update.class})
    @TableField("store_unit_name")
    private String storeUnitName;
    @ExcelIgnore
    @NotNull(message = "OrderDetail.storeUnitAccuracy", groups = {Save.class, Update.class})
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @ExcelIgnore
    @NotNull(message = "OrderDetail.storeUnitRoundOffType", groups = {Save.class, Update.class})
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ExcelIgnore
    @DecimalMax(value = "9999999999.99", message = "OrderDetail.number", groups = {Save.class, Update.class})
    @ApiModelProperty("数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("reality_stock_in_number")
    private BigDecimal realityStockInNumber;
    @ColumnWidth(20)
    @ExcelProperty("数量")
    @TableField(exist = false)
    private String realityStockInNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "数量(基本单位)", hidden = true)
    @TableField(exist = false)
    private BigDecimal realityStockInBasicNumber;

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

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @DecimalMax(value = "9999999999.99", message = "OrderDetail.shouldStockInNumber", groups = {Save.class, Update.class})
    @ApiModelProperty("应入库数量")
    @TableField("should_stock_in_number")
    private BigDecimal shouldStockInNumber;
    @ColumnWidth(20)
    @ExcelProperty("应入库数量")
    @TableField(exist = false)
    private String shouldStockInNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("occupy_number")
    private BigDecimal occupyNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("already_return_number")
    private BigDecimal alreadyReturnNumber;

    @ColumnWidth(20)
    @ExcelProperty("批号")
    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ColumnWidth(25)
    @ExcelProperty("生产日期")
    @ApiModelProperty("生产日期")
    @TableField("produce_time")
    private LocalDateTime produceTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ColumnWidth(25)
    @ExcelProperty("有效期至")
    @ApiModelProperty("有效期至")
    @TableField("period_time")
    private LocalDateTime periodTime;

    @ExcelIgnore
    @NotBlank(message = "OrderDetail.storeId", groups = {Save.class, Update.class})
    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty("仓库")
    private String storeName;

    @ExcelIgnore
    @ApiModelProperty("库区")
    @TableField("area_id")
    private String areaId;
    @ColumnWidth(20)
    @ExcelProperty("库区")
    @TableField(exist = false)
    private String areaName;

    @ExcelIgnore
    @ApiModelProperty("库位")
    @TableField("position_id")
    private String positionId;
    @ColumnWidth(20)
    @ExcelProperty("库位")
    @TableField(exist = false)
    private String positionName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("price")
    private BigDecimal price;
    @ExcelIgnore
    @TableField("tax_id")
    private String taxId;
    @ExcelIgnore
    @TableField("tax_type")
    private String taxType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("tax_rate")
    private BigDecimal taxRate;
    @ExcelIgnore
    @TableField("tax_name")
    private String taxName;
    @ExcelIgnore
    @TableField("tax_accuracy")
    private Integer taxAccuracy;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("amount")
    private BigDecimal amount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("already_invoice_number")
    private BigDecimal alreadyInvoiceNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("occupy_invoice_number")
    private BigDecimal occupyInvoiceNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("invoice_not_tax_amount")
    private BigDecimal invoiceNotTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("invoice_including_tax_amount")
    private BigDecimal invoiceIncludingTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("not_invoice_number")
    private BigDecimal notInvoiceNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("not_invoice_not_tax_amount")
    private BigDecimal notInvoiceNotTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("not_invoice_including_tax_amount")
    private BigDecimal notInvoiceIncludingTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("over_order_stock_in_number")
    private BigDecimal overOrderStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("over_order_stock_in_not_tax_amount")
    private BigDecimal overOrderStockInNotTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("over_order_stock_in_including_tax_amount")
    private BigDecimal overOrderStockInIncludingTaxAmount;

    @ExcelIgnore
    @ApiModelProperty("参考单位")
    @TableField("inventory_reference_unit_id")
    private String inventoryReferenceUnitId;
    @ExcelIgnore
    @TableField("inventory_reference_unit_name")
    private String inventoryReferenceUnitName;
    @ExcelIgnore
    @TableField("inventory_reference_unit_accuracy")
    private Integer inventoryReferenceUnitAccuracy;
    @ExcelIgnore
    @TableField("inventory_reference_unit_round_off_type")
    private Integer inventoryReferenceUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @ApiModelProperty("参考数量")
    @TableField("inventory_reference_number")
    private BigDecimal inventoryReferenceNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String inventoryReferenceNumberFormat;

    @ExcelIgnore
    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ColumnWidth(20)
    @ExcelProperty("源单单号")
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ExcelIgnore
    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ColumnWidth(20)
    @ExcelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ColumnWidth(20)
    @ExcelProperty("源单行号")
    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;
    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ColumnWidth(20)
    @ExcelProperty("备注")
    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ExcelIgnore
    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer detailEnable;
    @ColumnWidth(20)
    @ExcelProperty("行状态")
    @TableField(exist = false)
    private String detailEnableName;

    @ExcelIgnore
    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ExcelIgnore
    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ExcelIgnore
    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String status;

    @ExcelIgnore
    @ApiModelProperty(value = "乐观锁版本", hidden = true)
    @TableField("version")
    private Integer version;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @ApiModelProperty("可入库数量")
    @TableField(exist = false)
    private BigDecimal canStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @ApiModelProperty("(采购单位->基本单位->库存单位)收货上限数量")
    @TableField(exist = false)
    private BigDecimal deliveryUpperConvertNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String deliveryUpperConvertNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @ApiModelProperty("(采购单位->基本单位->库存单位)收货下限数量")
    @TableField(exist = false)
    private BigDecimal deliveryLowerConvertNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String deliveryLowerConvertNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal canNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private Boolean sameUnit;
    @ExcelIgnore
    @TableField(exist = false)
    private String returnOrderId;
    @ExcelIgnore
    @TableField(exist = false)
    private String purchaseUnitId;
    @ExcelIgnore
    @TableField(exist = false)
    private String purchaseUnitCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String orderSupplierId;
    @ExcelIgnore
    @TableField(exist = false)
    private String orderSupplierName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("source_already_stock_in_number")
    private BigDecimal sourceAlreadyStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField("source_order_number")
    private BigDecimal sourceOrderNumber;
    @ExcelIgnore
    @TableField("already_ap_number")
    private BigDecimal alreadyApNumber;
    @ExcelIgnore
    @TableField("occupy_ap_number")
    private BigDecimal occupyApNumber;

    @ApiModelProperty("采购订单明细主键")
    @TableField("purchase_detail_id")
    private String purchaseDetailId;
    @ExcelIgnore
    @TableField(exist = false)
    private List<String> barcodeIdList;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @TableField(exist = false)
    private String orderCategoryCode;
    @TableField(exist = false)
    private String orderSupplierCode;

    @TableField(exist = false)
    private Integer expirationDateManaged;
    @TableField(exist = false)
    private String expirationDateControlType;
    @TableField(exist = false)
    private String expirationDateUnit;
    @TableField(exist = false)
    private Short expirationDate;

    @TableField(exist = false)
    private String basicUnitId;

    @TableField(exist = false)
    private String basicUnitCode;

    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    @TableField(exist = false)
    private String productionOrderDetailId;

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
    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
    @TableField(exist = false)
    private List<PsiPurchaseStockInOrderDetailCharacteristic> materialCharacteristics;


    public BigDecimal realityStockInNumberNotNull() {
        if (Objects.isNull(realityStockInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return realityStockInNumber;
        }
    }
    public BigDecimal occupyNumberNotNull() {
        if (Objects.isNull(occupyNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyNumber;
        }
    }
    public BigDecimal alreadyReturnNumberNotNull() {
        if (Objects.isNull(alreadyReturnNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyReturnNumber;
        }
    }
    public BigDecimal priceIncludingTaxNotNull() {
        if (Objects.isNull(priceIncludingTax)) {
            return BigDecimal.ZERO;
        } else {
            return priceIncludingTax;
        }
    }

    public BigDecimal alreadyInvoiceNumberNotNull() {
        if (Objects.isNull(alreadyInvoiceNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyInvoiceNumber;
        }
    }
    public BigDecimal occupyInvoiceNumberNotNull() {
        if (Objects.isNull(occupyInvoiceNumber)) {
            return BigDecimal.ZERO;
        } else {
            return occupyInvoiceNumber;
        }
    }

    public BigDecimal sourceAlreadyStockInNumberNotNull() {
        if (Objects.isNull(sourceAlreadyStockInNumber)) {
            return BigDecimal.ZERO;
        } else {
            return sourceAlreadyStockInNumber;
        }
    }

    public BigDecimal sourceOrderNumberNotNull() {
        if (Objects.isNull(sourceOrderNumber)) {
            return BigDecimal.ZERO;
        } else {
            return sourceOrderNumber;
        }
    }
}
