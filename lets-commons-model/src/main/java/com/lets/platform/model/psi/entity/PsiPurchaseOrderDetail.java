package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.constant.GlobalConstant;
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
 * 采购订单物料明细
 *
 * @author DING WEI
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("psi_purchase_order_detail")
@ApiModel(value = "PsiPurchaseOrderDetail对象", description = "采购订单物料明细")
public class PsiPurchaseOrderDetail extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String sheetName;

    @ExcelIgnore
    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;
    @ColumnWidth(20)
    @ExcelProperty("单据编号")
    @TableField(exist = false)
    private String orderCode;
    @ExcelIgnore
    @ExcelProperty("单据状态")
    @TableField(exist = false)
    private String orderStatus;
    @ExcelIgnore
    @ExcelProperty("采购部门")
    @TableField(exist = false)
    private String purchaseOrgId;
    @ExcelIgnore
    @ExcelProperty("采购人员")
    @TableField(exist = false)
    private String purchaseUserId;

    @ColumnWidth(10)
    @ExcelProperty("行号")
    @NotNull(message = "OrderDetail.lineNumber", groups = {Save.class, Update.class})
    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ExcelIgnore
    @ApiModelProperty("物料主键")
    @NotBlank(message = "OrderDetail.materialId", groups = {Save.class, Update.class})
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
    @ExcelIgnore
    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;
    @ExcelIgnore
    @ApiModelProperty("可采购")
    @TableField("purchasable")
    private Integer purchasable;
    @ExcelIgnore
    @ApiModelProperty("可存货")
    @TableField("storable")
    private Integer storable;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl1")
    private String extFlName1;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl2")
    private String extFlName2;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl3")
    private String extFlName3;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl4")
    private String extFlName4;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl5")
    private String extFlName5;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl6")
    private String extFlName6;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl7")
    private String extFlName7;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl8")
    private String extFlName8;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl9")
    private String extFlName9;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl10")
    private String extFlName10;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl11")
    private String extFlName11;
    @ExcelIgnore
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl12")
    private String extFlName12;
    @ExcelIgnore
    @ApiModelProperty("扩展规格备注一")
    @TableField("remark1")
    private String remark1;
    @ExcelIgnore
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
    @ApiModelProperty("采购单位")
    @TableField("purchase_unit_id")
    private String purchaseUnitId;
    @ExcelIgnore
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;
    @ColumnWidth(20)
    @ExcelProperty("采购单位")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;
    @ExcelIgnore
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;
    @ExcelIgnore
    @TableField("purchase_unit_round_off_type")
    private Integer purchaseUnitRoundOffType;
    @ExcelIgnore
    @TableField("material_purchase_min_quantity")
    private BigDecimal materialPurchaseMinQuantity;

    @ExcelIgnore
    @DecimalMax(value = "9999999999.99", message = "OrderDetail.number", groups = {Save.class, Update.class})
    @ApiModelProperty("实际用来下发或者计算的数量 没有外派检验=purchaseNumber； 如果有外派检验=（qualifiedNumber+giveInNumber）")
    @TableField("number")
    private BigDecimal number;
    @ColumnWidth(20)
    @ExcelProperty("采购数量")
    @TableField(exist = false)
    private String numberFormat;

    @ApiModelProperty("外派检验")
    @TableField("is_osqc")
    private String isOsqc;
    @TableField(exist = false)
    private String isOsqcName;

    @ApiModelProperty("合格数量")
    @TableField("qualified_number")
    private BigDecimal qualifiedNumber;
    @TableField(exist = false)
    private BigDecimal oldQualifiedNumber;

    @ApiModelProperty("让步接收数量")
    @TableField("give_in_number")
    private BigDecimal giveInNumber;
    @TableField(exist = false)
    private BigDecimal oldGiveInNumber;

    @ApiModelProperty("采购数量")
    @TableField("purchase_number")
    private BigDecimal purchaseNumber;

    @ApiModelProperty("检验占用数量")
    @TableField("inspect_occupy_number")
    private BigDecimal inspectOccupyNumber;
    @TableField(exist = false)
    private BigDecimal oldInspectOccupyNumber;

    @ExcelIgnore
    @ApiModelProperty("占用数量[在采购入库单提交审核时回写该字段]")
    @TableField("occupy_number")
    private BigDecimal occupyNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String occupyNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @ApiModelProperty("已入库数量[在采购入库单过账之后回写该数据]")
    @TableField("already_stock_in_number")
    private BigDecimal alreadyStockInNumber;
    @ExcelIgnore
    @ApiModelProperty("已收货数量[在采购收货单审核通过之后回写该数据]")
    @TableField("already_delivery_number")
    private BigDecimal alreadyDeliveryNumber;
    @ApiModelProperty("剩余收货数量[订单明细数量-关联已审核的采购收货单数量汇总；（支持负数）]")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal remainDeliveryNumber;
    @ExcelIgnore
    @ApiModelProperty("实际收货数量[关联已审核的采购收货单合格数量+让步接收数量汇总(需要质检) / 收货数量(没有质检)]")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal actualDeliveryNumber;

    @ApiModelProperty("剩余入库数量[订单明细数量-关联已审核的采购入库单数量汇总；（支持负数）]")
    @TableField(exist = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal remainStockInNumber;
    @ExcelIgnore
    @TableField(exist = false)
    private String alreadyStockInNumberFormat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @ApiModelProperty("已退货数量")
    @TableField(exist = false)
    private BigDecimal alreadyReturnNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ExcelIgnore
    @TableField(exist = false)
    private BigDecimal canReturnNumber;
    @ApiModelProperty("已下发数量")
    @TableField("issued_number")
    private BigDecimal issuedNumber;

    @ExcelIgnore
    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;
    @ColumnWidth(10)
    @ExcelProperty("单价")
    @TableField(exist = false)
    private String priceFormat;

    @ExcelIgnore
    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    private BigDecimal includingTaxPrice;
    @ColumnWidth(20)
    @ExcelProperty("含税单价")
    @TableField(exist = false)
    private String includingTaxPriceFormat;

    @ExcelIgnore
    @ApiModelProperty("税种主键")
    @TableField("tax_id")
    private String taxId;
    @ColumnWidth(20)
    @ExcelProperty("税种")
    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;
    @ExcelIgnore
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;
    @ColumnWidth(10)
    @ExcelProperty("税率")
    @ApiModelProperty("税率格式化")
    @TableField(exist = false)
    private String taxRateFormat;
    @ExcelIgnore
    @ApiModelProperty("税率精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;
    /**
     * @see com.lets.platform.model.common.enums.TaxTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    private String taxType;
    @ExcelIgnore
    @TableField(exist = false)
    private String taxTypeValue;

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
    @ColumnWidth(30)
    @ExcelProperty("单价折扣额")
    @TableField(exist = false)
    private String priceDiscountAmountFormat;

    @ExcelIgnore
    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;
    @ColumnWidth(10)
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
    private BigDecimal detailTaxAmount;
    @ColumnWidth(10)
    @ExcelProperty("税额")
    @TableField(exist = false)
    private String detailTaxAmountFormat;

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
    @ColumnWidth(25)
    @ExcelProperty("含税合计(本位币)")
    @TableField(exist = false)
    private String baseCurrencyAmountIncludingTaxFormat;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ColumnWidth(25)
    @ExcelProperty("承诺日期")
    @ApiModelProperty("承诺日期")
    @TableField("promise_date")
    private LocalDateTime promiseDate;
    @ExcelIgnore
    @TableField(exist = false)
    private String promiseDateFormat;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ColumnWidth(25)
    @ExcelProperty("交货日期")
    @NotNull(message = "OrderDetail.deliveryDate", groups = {Save.class, Update.class})
    @ApiModelProperty("交货日期")
    @TableField("delivery_date")
    private LocalDateTime deliveryDate;
    @ExcelIgnore
    @TableField(exist = false)
    private String deliveryDateFormat;

    @ColumnWidth(20)
    @ExcelProperty("交货地址")
    @ApiModelProperty("交货地址")
    @TableField("delivery_address")
    private String deliveryAddress;

    @ExcelIgnore
    @ApiModelProperty("收货欠收比率（%）")
    @TableField("poor_crop_limit")
    private BigDecimal poorCropLimit;
    @ColumnWidth(30)
    @ExcelProperty("收货欠收比率（%）")
    @TableField(exist = false)
    private String poorCropLimitFormat;

    @ExcelIgnore
    @ApiModelProperty("收货超收比率（%）")
    @TableField("rich_crop_limit")
    private BigDecimal richCropLimit;
    @ColumnWidth(30)
    @ExcelProperty("收货超收比率（%）")
    @TableField(exist = false)
    private String richCropLimitFormat;

    @ExcelIgnore
    @ApiModelProperty("收货下限数量")
    @TableField("delivery_lower_number")
    private BigDecimal deliveryLowerNumber;
    @ColumnWidth(30)
    @ExcelProperty("收货下限数量")
    @TableField(exist = false)
    private String deliveryLowerNumberFormat;

    @ExcelIgnore
    @ApiModelProperty("收货上限数量")
    @TableField("delivery_upper_number")
    private BigDecimal deliveryUpperNumber;
    @ColumnWidth(30)
    @ExcelProperty("收货上限数量")
    @TableField(exist = false)
    private String deliveryUpperNumberFormat;

    @ColumnWidth(20)
    @ExcelProperty("项目编号")
    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ColumnWidth(20)
    @ExcelProperty("合同编号")
    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ColumnWidth(30)
    @ExcelProperty("备注")
    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;

    @ExcelIgnore
    @TableField("source_order_id")
    private String sourceOrderId;
    @ExcelIgnore
    @TableField("source_order_code")
    private String sourceOrderCode;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ExcelIgnore
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ExcelIgnore
    @TableField("source_detail_id")
    private String sourceDetailId;
    @ExcelIgnore
    @TableField("source_detail_line_number")
    private Long sourceDetailLineNumber;

    @ExcelIgnore
    @TableField("price_list_detail_id")
    private String priceListDetailId;

    @ExcelIgnore
    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer detailEnable;
    @ColumnWidth(20)
    @ExcelProperty("行状态")
    @TableField(exist = false)
    private String detailEnableName;
    @TableField(exist = false)
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @TableField("replenishment_number")
    private BigDecimal replenishmentNumber;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiPurchaseOrderDetailSpecific> materialCharacteristicList;
    @ExcelIgnore
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ExcelIgnore
    @ApiModelProperty(value = "乐观锁版本", hidden = true)
    @TableField("version")
    private Integer version;

    @ExcelIgnore
    @TableField(exist = false)
    private PsiPurchaseOrder purchaseOrder;

    @ExcelIgnore
    @TableField(exist = false)
    private String storeUnitId;
    @ExcelIgnore
    @TableField(exist = false)
    private String storeUnitCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String tempDetailId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已开票金额")
    @TableField("invoice_amount")
    private BigDecimal invoiceAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("开票占用金额")
    @TableField("invoice_occupied_amount")
    private BigDecimal invoiceOccupiedAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("剩余开票金额")
    @TableField("remain_invoice_amount")
    private BigDecimal remainInvoiceAmount;

    @ExcelIgnore
    @ApiModelProperty("下发的采购申请信息")
    @TableField("apply_info")
    private String applyInfo;

    @ExcelIgnore
    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超需求数量=源单据已审核数量-源申请数量")
    @TableField("over_demand_number")
    private BigDecimal overDemandNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超需求未税金额=超订单入库数量*单价")
    @TableField("over_demand_not_tax_amount")
    private BigDecimal overDemandNotTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超需求含税金额=超订单入库数量*含税单价")
    @TableField("over_demand_including_tax_amount")
    private BigDecimal overDemandIncludingTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超订单入库数量=源单据已入库数量-源订单数量")
    @TableField("over_stock_in_number")
    private BigDecimal overStockInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超订单入库未税金额=超订单入库数量*单价")
    @TableField("over_stock_in_not_tax_amount")
    private BigDecimal overStockInNotTaxAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超订单入库含税金额=超订单入库数量*含税单价")
    @TableField("over_stock_in_including_tax_amount")
    private BigDecimal overStockInIncludingTaxAmount;
    @ApiModelProperty("单据审核时间")
    @TableField(exist = false)
    private LocalDateTime auditTime;
    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @ApiModelProperty("销售订单含税单价")
    @TableField(exist = false)
    private BigDecimal salePriceIncludingTax;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;

    @ApiModelProperty("关闭时间")
    @TableField("close_time")
    private LocalDateTime closeTime;

    @TableField(exist = false)
    private List<PsiPurchaseOrderDetailSerial> serials;
    @ApiModelProperty("流水号编码规则id")
    @TableField("rule_id")
    private String ruleId;
    @ApiModelProperty("流水号类型的编码规则明细id")
    @TableField("rule_detail_id")
    private String ruleDetailId;
    @ApiModelProperty("流水号类型的编码规则明细流水id")
    @TableField("rule_detail_serial_id")
    private String ruleDetailSerialId;
    @ApiModelProperty("序列号")
    @TableField(exist = false)
    private String serialNumber;

    @ExcelIgnore
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiPurchaseOrderDetailDemand purchaseMaterialDemand;

    @ApiModelProperty("是否有技术要求")
    @ExcelIgnore
    @TableField("is_purchase_material_demand")
    private String isPurchaseMaterialDemand;

    @ExcelIgnore
    @ApiModelProperty("确认交货状态")
    @TableField("confirm_delivery_status")
    private String confirmDeliveryStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private String confirmDeliveryStatusName;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("确认交货数量")
    @TableField("confirm_delivery_number")
    private BigDecimal confirmDeliveryNumber;
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("确认交货日期")
    @TableField("confirm_delivery_date")
    private LocalDateTime confirmDeliveryDate;
    @ExcelIgnore
    @ApiModelProperty("确认交货备注")
    @TableField("confirm_delivery_remark")
    private String confirmDeliveryRemark;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已送货数量")
    @TableField("already_deliver_number")
    private BigDecimal alreadyDeliverNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用送货数量")
    @TableField("occupy_deliver_number")
    private BigDecimal occupyDeliverNumber;

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
    public BigDecimal occupyNumberNotNull() {
        if (Objects.nonNull(occupyNumber)) {
            return occupyNumber;
        } else {
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal alreadyStockInNumberNotNull() {
        if (Objects.nonNull(alreadyStockInNumber)) {
            return alreadyStockInNumber;
        } else {
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal alreadyDeliveryNotNull() {
        if (Objects.isNull(alreadyDeliveryNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyDeliveryNumber;
        }
    }

    public BigDecimal richCropLimitNotNull() {
        if (Objects.isNull(richCropLimit)) {
            return BigDecimal.ZERO;
        } else {
            return richCropLimit;
        }
    }

    public BigDecimal richCropLimitDivideHundred() {
        if (Objects.isNull(richCropLimit)) {
            return BigDecimal.ZERO;
        } else {
            return richCropLimit.divide(BigDecimal.valueOf(GlobalConstant.ONE_HUNDRED), 3, BigDecimal.ROUND_HALF_UP);
        }
    }

    public BigDecimal poorCropLimitDivideHundred() {
        if (Objects.isNull(poorCropLimit)) {
            return BigDecimal.ZERO;
        } else {
            return poorCropLimit.divide(BigDecimal.valueOf(GlobalConstant.ONE_HUNDRED), 3, BigDecimal.ROUND_HALF_UP);
        }
    }

    public BigDecimal deliveryUpperNumberNotNull() {
        if (Objects.isNull(deliveryUpperNumber)) {
            return number.multiply(BigDecimal.ONE.add(richCropLimitDivideHundred()));
        } else {
            return deliveryUpperNumber;
        }
    }

    public BigDecimal deliveryLowerNumberNotNull() {
        if (Objects.isNull(deliveryLowerNumber)) {
            return number.multiply(BigDecimal.ONE.subtract(poorCropLimitDivideHundred()));
        } else {
            return deliveryLowerNumber;
        }
    }

    public BigDecimal priceNotNull() {
        if (Objects.isNull(price)) {
            return BigDecimal.ZERO;
        } else {
            return price;
        }
    }

    public BigDecimal includingTaxPriceNotNull() {
        if (Objects.isNull(includingTaxPrice)) {
            return BigDecimal.ZERO;
        } else {
            return includingTaxPrice;
        }
    }

    public BigDecimal issuedNumberNN() {
        if (Objects.isNull(issuedNumber)) {
            return BigDecimal.ZERO;
        } else {
            return issuedNumber;
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

    public BigDecimal inspectOccupyNumberNN() {
        if (Objects.isNull(inspectOccupyNumber)) {
            return BigDecimal.ZERO;
        } else {
            return inspectOccupyNumber;
        }
    }
}