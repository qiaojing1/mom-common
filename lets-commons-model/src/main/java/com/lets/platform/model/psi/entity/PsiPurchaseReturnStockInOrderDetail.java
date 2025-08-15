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
 * 采购退货入库物料明细
 * @author DING WEI
 * @since 2023-09-19
 */
@Getter
@Setter
@TableName("psi_purchase_return_stock_in_order_detail")
@ApiModel(value = "PsiPurchaseReturnStockInOrderDetail对象", description = "采购退货入库物料明细")
public class PsiPurchaseReturnStockInOrderDetail extends BaseEntity {

    @ExcelIgnore
    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;

    @ExcelIgnore
    @ExcelProperty("采购退货单")
    @TableField(exist = false)
    private PsiPurchaseReturnStockInOrder order;

    @ColumnWidth(30)
    @ExcelProperty("采购退货单号")
    @TableField(exist = false)
    private String orderCode;
    @ExcelIgnore
    @TableField(exist = false)
    private LocalDateTime orderTime;

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
    @ColumnWidth(30)
    @ExcelProperty("物料编码")
    @NotBlank(message = "OrderDetail.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ColumnWidth(30)
    @ExcelProperty("物料名称")
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ColumnWidth(30)
    @ExcelProperty("规格型号")
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ExcelIgnore
    @ApiModelProperty("物料属性")
    @TableField("material_type")
    private String materialType;

    @ExcelIgnore
    @ApiModelProperty("是否手动录入")
    @TableField("is_manual")
    private Integer isManual;

    @ExcelIgnore
    @ApiModelProperty("是否手动录入")
    @TableField("replenishment_occupy_quantity")
    private BigDecimal replenishmentOccupyQuantity;

    @ExcelIgnore
    @ApiModelProperty("是否手动录入")
    @TableField("already_replenishment_quantity")
    private BigDecimal alreadyReplenishmentQuantity;

    @ColumnWidth(30)
    @ExcelProperty("特征属性")
    @ApiModelProperty("物料特征属性名称")
    @TableField("material_specific")
    private String materialSpecific;
    @ExcelIgnore
    @TableField(exist = false)
    private String showMaterialSpecific;
    @ExcelIgnore
    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;
    @ExcelIgnore
    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ExcelIgnore
    @ApiModelProperty("库存单位")
    @NotBlank(message = "OrderDetail.storeUnitId", groups = {Save.class, Update.class})
    @TableField("store_unit_id")
    private String storeUnitId;
    @ExcelIgnore
    @NotBlank(message = "OrderDetail.storeUnitCode", groups = {Save.class, Update.class})
    @ApiModelProperty("库存单位编码")
    @TableField("store_unit_code")
    private String storeUnitCode;
    @ColumnWidth(30)
    @ExcelProperty("库存单位")
    @NotBlank(message = "OrderDetail.storeUnitName", groups = {Save.class, Update.class})
    @ApiModelProperty("库存单位名称")
    @TableField("store_unit_name")
    private String storeUnitName;
    @ExcelIgnore
    @ApiModelProperty("库存单位精度")
    @NotNull(message = "OrderDetail.storeUnitAccuracy", groups = {Save.class, Update.class})
    @TableField("store_unit_accuracy")
    private Integer storeUnitAccuracy;
    @ExcelIgnore
    @ApiModelProperty("库存单位舍入类型")
    @NotNull(message = "OrderDetail.storeUnitRoundOffType", groups = {Save.class, Update.class})
    @TableField("store_unit_round_off_type")
    private Integer storeUnitRoundOffType;

    @ExcelIgnore
    @DecimalMax(value = "9999999999.99", message = "OrderDetail.number", groups = {Save.class, Update.class})
    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;
    @ExcelIgnore
    @ApiModelProperty(value = "数量(基本单位)", hidden = true)
    @TableField(exist = false)
    private BigDecimal basicNumber;
    @ColumnWidth(10)
    @ExcelProperty("数量")
    @TableField(exist = false)
    private String numberFormat;

    @TableField(exist = false)
    private BigDecimal availableNumber;

    @ColumnWidth(20)
    @ExcelProperty("批号")
    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ColumnWidth(20)
    @ExcelProperty("生产日期")
    @ApiModelProperty("生产日期")
    @TableField("produce_date")
    private LocalDateTime produceDate;

    @ColumnWidth(20)
    @ExcelProperty("有效期至")
    @ApiModelProperty("有效期至")
    @TableField("period_date")
    private LocalDateTime periodDate;

    @ColumnWidth(20)
    @ExcelProperty("收货日期")
    @ApiModelProperty("收货日期")
    @TableField("delivery_date")
    private LocalDateTime deliveryDate;

    @ExcelIgnore
    @NotBlank(message = "OrderDetail.storeId", groups = {Save.class, Update.class})
    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;
    @ColumnWidth(20)
    @ExcelProperty("仓库")
    @TableField(exist = false)
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

    @ExcelIgnore
    @DecimalMax(value = "9999999999.99", message = "OrderDetail.price", groups = {Save.class, Update.class})
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @ColumnWidth(20)
    @ExcelProperty("单价")
    @TableField(exist = false)
    private String priceFormat;
    @ExcelIgnore
    @DecimalMax(value = "9999999999.99", message = "OrderDetail.includingTaxPrice", groups = {Save.class, Update.class})
    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    private BigDecimal includingTaxPrice;
    @ColumnWidth(20)
    @ExcelProperty("含税单价")
    @TableField(exist = false)
    private String includingTaxPriceFormat;

    @ExcelIgnore
    @ApiModelProperty("税种")
    @TableField("tax_id")
    private String taxId;
    @ColumnWidth(20)
    @ExcelProperty("税率")
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;
    @ExcelIgnore
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;
    @ExcelIgnore
    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;
    @ExcelIgnore
    @ApiModelProperty("税种分类[ratio、number]")
    @TableField("tax_type")
    private String taxType;

    @ExcelIgnore
    @ApiModelProperty("折扣率")
    @TableField("discount_rate")
    private BigDecimal discountRate;
    @ColumnWidth(20)
    @ExcelProperty("折扣率")
    @TableField(exist = false)
    private String discountRateFormat;

    @ExcelIgnore
    @ApiModelProperty("单价折扣额")
    @TableField("price_discount_amount")
    private BigDecimal priceDiscountAmount;
    @ColumnWidth(20)
    @ExcelProperty("单价折扣额")
    @TableField(exist = false)
    private String priceDiscountAmountFormat;

    @ExcelIgnore
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @ColumnWidth(20)
    @ExcelProperty("金额")
    @TableField(exist = false)
    private String amountFormat;

    @ExcelIgnore
    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;
    @ColumnWidth(20)
    @ExcelProperty("金额(本位币)")
    @TableField(exist = false)
    private String baseCurrencyAmountFormat;

    @ExcelIgnore
    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;
    @ColumnWidth(20)
    @ExcelProperty("税额")
    @TableField(exist = false)
    private String taxAmountFormat;

    @ExcelIgnore
    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;
    @ColumnWidth(20)
    @ExcelProperty("税额(本位币)")
    @TableField(exist = false)
    private String baseCurrencyTaxAmountFormat;

    @ExcelIgnore
    @ApiModelProperty("折扣金额")
    @TableField("discount_amount")
    private BigDecimal discountAmount;
    @ColumnWidth(20)
    @ExcelProperty("折扣金额")
    @TableField(exist = false)
    private String discountAmountFormat;

    @ExcelIgnore
    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;
    @ColumnWidth(20)
    @ExcelProperty("含税合计")
    @TableField(exist = false)
    private String amountIncludingTaxFormat;

    @ExcelIgnore
    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;
    @ColumnWidth(35)
    @ExcelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private String baseCurrencyAmountIncludingTaxFormat;

    @ExcelIgnore
    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ExcelIgnore
    @ApiModelProperty("源采购入库单id")
    @TableField("stock_in_order_detail_id")
    private String stockInOrderDetailId;


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
    @ApiModelProperty("关联单据明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ColumnWidth(40)
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
    @ApiModelProperty("乐观锁版本")
    @TableField("version")
    private Integer version;
    @ExcelIgnore
    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ExcelIgnore
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ExcelIgnore

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ExcelIgnore
    @ApiModelProperty("退货类型")
    @TableField("return_type")
    private String returnType;

    @ExcelIgnore
    @TableField(exist = false)
    private String sourcePurchaseOrderDetailId;

    @ExcelIgnore
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;
    @ExcelIgnore
    @TableField(exist = false)
    private String basicUnitId;
    @ExcelIgnore
    @TableField(exist = false)
    private String storeAndBasicConvert;
    @ExcelIgnore
    @TableField(exist = false)
    private String basicAndStoreConvert;
    @ExcelIgnore
    @TableField(exist = false)
    private PsiPurchaseStockInOrderDetail sourceDetail;
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal canReturnNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String canReturnNumberFormat;
    @ExcelIgnore
    @TableField(exist = false)
    private String purchaseOrderDetailId;

    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal storeNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String storeNumberFormat;
    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiStoreMaterialSpecific> specificList;
    @ExcelIgnore
    @TableField(exist = false)
    private String projectCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("补货数量")
    @TableField("replenishment_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal replenishmentQuantity;

    @ApiModelProperty("扣款数量")
    @TableField("deduction_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal deductionQuantity;

    @ApiModelProperty("已应付数量")
    @TableField("already_ap_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal alreadyApNumber;

    @ApiModelProperty("应付占用数量")
    @TableField("occupy_ap_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal occupyApNumber;

    @ApiModelProperty("可应付数量")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal canApNumber;

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

    public BigDecimal canReturnNumberNotNull() {
        if (Objects.isNull(canReturnNumber)) {
            return BigDecimal.ZERO;
        } else {
            return canReturnNumber;
        }
    }
}