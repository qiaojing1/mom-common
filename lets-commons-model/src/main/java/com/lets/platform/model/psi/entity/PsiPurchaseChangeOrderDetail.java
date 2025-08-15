package com.lets.platform.model.psi.entity;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.enums.CloseStatusEnum;
import com.lets.platform.model.common.enums.TaxTypeEnum;
import com.lets.platform.model.psi.enums.ChangeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 采购变更单物料明细
 * </p>
 *
 * @author FZY
 * @since 2024-09-05
 */
@Getter
@Setter
@TableName("psi_purchase_change_order_detail")
@ApiModel(value = "PsiPurchaseChangeOrderDetail对象", description = "采购变更单物料明细")
public class PsiPurchaseChangeOrderDetail extends BaseEntity {

    @ApiModelProperty("采购变更单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("原单据物料明细ID")
    @TableField("source_id")
    private String sourceId;

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

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("可采购")
    @TableField("purchasable")
    private Integer purchasable;

    @ApiModelProperty("可存货")
    @TableField("storable")
    private Integer storable;

    @ApiModelProperty("批号控制方式[0不管控,1不可有批号,2必须有批号]")
    @TableField("lot_no_control_type")
    private String lotNoControlType;

    @ApiModelProperty("批号应用范围[0全部,1库存管理,2生产管理]")
    @TableField("lot_no_scope")
    private String lotNoScope;

    @ApiModelProperty("物料最小采购数量")
    @TableField("material_purchase_min_quantity")
    private BigDecimal materialPurchaseMinQuantity;

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

    @ApiModelProperty("采购数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("占用数量[在采购入库单提交审核时回写该字段]")
    @TableField("occupy_number")
    private BigDecimal occupyNumber;

    @ApiModelProperty("已入库数量[在采购入库单过账之后回写该数据]")
    @TableField("already_stock_in_number")
    private BigDecimal alreadyStockInNumber;

    @ApiModelProperty("已收货数量[在收货单审核通过回写]")
    @TableField("already_delivery_number")
    private BigDecimal alreadyDeliveryNumber;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("税种")
    @TableField("tax_id")
    private String taxId;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;

    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;

    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ApiModelProperty("税种分类[ratio、number]")
    @TableField("tax_type")
    private String taxType;

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

    @ApiModelProperty("承诺日期")
    @TableField("promise_date")
    private LocalDateTime promiseDate;

    @ApiModelProperty("交货日期")
    @TableField("delivery_date")
    private LocalDateTime deliveryDate;

    @ApiModelProperty("交货地址")
    @TableField("delivery_address")
    private String deliveryAddress;

    @ApiModelProperty("收货欠收比率（%）")
    @TableField("poor_crop_limit")
    private BigDecimal poorCropLimit;

    @ApiModelProperty("收货超收比率（%）")
    @TableField("rich_crop_limit")
    private BigDecimal richCropLimit;

    @ApiModelProperty("收货下限数量")
    @TableField("delivery_lower_number")
    private BigDecimal deliveryLowerNumber;

    @ApiModelProperty("收货上限数量")
    @TableField("delivery_upper_number")
    private BigDecimal deliveryUpperNumber;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("价目表明细id")
    @TableField("price_list_detail_id")
    private String priceListDetailId;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源销售订单单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("变更方式[0:修改;1:新增]")
    @TableField("change_type")
    private Integer changeType;

    @ApiModelProperty("变更方式名称")
    @TableField(exist = false)
    private String changeTypeName;

    @ApiModelProperty("变更前数量")
    @TableField("before_quantity")
    private BigDecimal beforeQuantity;

    @ApiModelProperty("变更前单价")
    @TableField("before_price")
    private BigDecimal beforePrice;

    @ApiModelProperty("变更前税种ID")
    @TableField("before_tax_id")
    private String beforeTaxId;

    @ApiModelProperty("变更前税种分类")
    @TableField("before_tax_type")
    private String beforeTaxType;

    @ApiModelProperty("变更前税种名称")
    @TableField("before_tax_name")
    private String beforeTaxName;

    @ApiModelProperty("变更前税率")
    @TableField("before_tax_rate")
    private BigDecimal beforeTaxRate;

    @ApiModelProperty("变更前税种精度")
    @TableField("before_tax_accuracy")
    private Integer beforeTaxAccuracy;

    @ApiModelProperty("变更前含税单价")
    @TableField("before_price_including_tax")
    private BigDecimal beforePriceIncludingTax;

    @ApiModelProperty("变更前折扣率")
    @TableField("before_discount_rate")
    private BigDecimal beforeDiscountRate;

    @ApiModelProperty("变更前单价折扣额")
    @TableField("before_price_discount_amount")
    private BigDecimal beforePriceDiscountAmount;

    @ApiModelProperty("变更前金额")
    @TableField("before_amount")
    private BigDecimal beforeAmount;

    @ApiModelProperty("变更前金额(本位币)")
    @TableField("before_base_currency_amount")
    private BigDecimal beforeBaseCurrencyAmount;

    @ApiModelProperty("变更前税额")
    @TableField("before_tax_amount")
    private BigDecimal beforeTaxAmount;

    @ApiModelProperty("变更前税额(本位币)")
    @TableField("before_base_currency_tax_amount")
    private BigDecimal beforeBaseCurrencyTaxAmount;

    @ApiModelProperty("变更前折扣金额")
    @TableField("before_discount_amount")
    private BigDecimal beforeDiscountAmount;

    @ApiModelProperty("变更前含税合计")
    @TableField("before_amount_including_tax")
    private BigDecimal beforeAmountIncludingTax;

    @ApiModelProperty("变更前含税合计(本位币)")
    @TableField("before_base_currency_amount_including_tax")
    private BigDecimal beforeBaseCurrencyAmountIncludingTax;

    @ApiModelProperty("变更前含税合计(本位币)")
    @TableField("before_remark")
    private String beforeRemark;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiPurchaseChangeOrderDetailSpecific> specificList;

    public PsiPurchaseChangeOrderDetail() {}

    public PsiPurchaseChangeOrderDetail(PsiPurchaseOrderDetail purchaseOrderDetail) {
        if (purchaseOrderDetail == null) {
            return;
        }
        this.lineNumber = purchaseOrderDetail.getLineNumber();
        this.materialId = purchaseOrderDetail.getMaterialId();
        this.materialCode = purchaseOrderDetail.getMaterialCode();
        this.materialName = purchaseOrderDetail.getMaterialName();
        this.materialSpecs = purchaseOrderDetail.getMaterialSpecs();
        this.materialType = purchaseOrderDetail.getMaterialType();
        this.materialCharacteristicNames = purchaseOrderDetail.getMaterialCharacteristicNames();
        this.purchasable = purchaseOrderDetail.getPurchasable();
        this.storable = purchaseOrderDetail.getStorable();
        this.lotNoControlType = purchaseOrderDetail.getLotNoControlType();
        this.lotNoScope = purchaseOrderDetail.getLotNoScope();
        this.materialPurchaseMinQuantity = purchaseOrderDetail.getMaterialPurchaseMinQuantity();
        this.purchaseUnitId = purchaseOrderDetail.getPurchaseUnitId();
        this.purchaseUnitCode = purchaseOrderDetail.getPurchaseUnitCode();
        this.purchaseUnitName = purchaseOrderDetail.getPurchaseUnitName();
        this.purchaseUnitAccuracy = purchaseOrderDetail.getPurchaseUnitAccuracy();
        this.purchaseUnitRoundOffType = purchaseOrderDetail.getPurchaseUnitRoundOffType();
        this.number = purchaseOrderDetail.getNumber();
        this.occupyNumber = purchaseOrderDetail.getOccupyNumber();
        this.alreadyStockInNumber = purchaseOrderDetail.getAlreadyStockInNumber();
        this.alreadyDeliveryNumber = purchaseOrderDetail.getAlreadyDeliveryNumber();
        this.price = purchaseOrderDetail.getPrice();
        this.priceIncludingTax = purchaseOrderDetail.getIncludingTaxPrice();
        this.taxId = purchaseOrderDetail.getTaxId();

        if (StrUtil.isNotEmpty(purchaseOrderDetail.getTaxId())) {
            this.taxName = purchaseOrderDetail.getTaxName();
            this.taxRate = purchaseOrderDetail.getTaxRate();
            this.taxAccuracy = purchaseOrderDetail.getTaxAccuracy();
            if (TaxTypeEnum.UNIT.getType().equals(purchaseOrderDetail.getTaxType())) {
                this.taxType = TaxTypeEnum.UNIT.getValue();
            } else {
                this.taxType = TaxTypeEnum.PROPORTION.getValue();
            }
        }

        this.discountRate = purchaseOrderDetail.getDiscountRate();
        this.priceDiscountAmount = purchaseOrderDetail.getPriceDiscountAmount();
        this.amount = purchaseOrderDetail.getAmount();
        this.baseCurrencyAmount = purchaseOrderDetail.getBaseCurrencyAmount();
        this.taxAmount = purchaseOrderDetail.getDetailTaxAmount();
        this.baseCurrencyTaxAmount = purchaseOrderDetail.getBaseCurrencyTaxAmount();
        this.discountAmount = purchaseOrderDetail.getDiscountAmount();
        this.amountIncludingTax = purchaseOrderDetail.getAmountIncludingTax();
        this.baseCurrencyAmountIncludingTax = purchaseOrderDetail.getBaseCurrencyAmountIncludingTax();
        this.promiseDate = purchaseOrderDetail.getPromiseDate();
        this.deliveryDate = purchaseOrderDetail.getDeliveryDate();
        this.deliveryAddress = purchaseOrderDetail.getDeliveryAddress();
        this.poorCropLimit = purchaseOrderDetail.getPoorCropLimit();
        this.richCropLimit = purchaseOrderDetail.getRichCropLimit();
        this.deliveryLowerNumber = purchaseOrderDetail.getDeliveryLowerNumber();
        this.deliveryUpperNumber = purchaseOrderDetail.getDeliveryUpperNumber();
        this.projectCode = purchaseOrderDetail.getProjectCode();
        this.contractCode = purchaseOrderDetail.getContractCode();
        this.remark = purchaseOrderDetail.getDetailRemark();
        this.priceListDetailId = purchaseOrderDetail.getPriceListDetailId();
        this.trackNo = purchaseOrderDetail.getTrackNo();
        this.sourceOrderCustomerId = purchaseOrderDetail.getSourceOrderCustomerId();
        this.sourceOrderCustomerName = purchaseOrderDetail.getSourceOrderCustomerName();
        this.sourceId = purchaseOrderDetail.getId();
        this.changeType = CloseStatusEnum.NORMAL.equals(purchaseOrderDetail.getDetailEnable()) ? ChangeTypeEnum.EDIT.getValue() : ChangeTypeEnum.NOT_EDIT.getValue();
        this.changeTypeName = ChangeTypeEnum.getName(this.changeType);
        this.beforeQuantity = purchaseOrderDetail.getNumber();
        this.beforePrice = purchaseOrderDetail.getPrice();
        this.beforeTaxId = purchaseOrderDetail.getTaxId();
        this.beforeTaxType = purchaseOrderDetail.getTaxType();
        this.beforeTaxName = purchaseOrderDetail.getTaxName();
        this.beforeTaxRate = purchaseOrderDetail.getTaxRate();
        this.beforeTaxAccuracy = purchaseOrderDetail.getTaxAccuracy();
        this.beforePriceIncludingTax = purchaseOrderDetail.getIncludingTaxPrice();
        this.beforeDiscountRate = purchaseOrderDetail.getDiscountRate();
        this.beforePriceDiscountAmount = purchaseOrderDetail.getPriceDiscountAmount();
        this.beforeAmount = purchaseOrderDetail.getAmount();
        this.beforeBaseCurrencyAmount = purchaseOrderDetail.getBaseCurrencyAmount();
        this.beforeTaxAmount = purchaseOrderDetail.getDetailTaxAmount();
        this.beforeBaseCurrencyTaxAmount = purchaseOrderDetail.getBaseCurrencyTaxAmount();
        this.beforeDiscountAmount = purchaseOrderDetail.getDiscountAmount();
        this.beforeAmountIncludingTax = purchaseOrderDetail.getAmountIncludingTax();
        this.beforeBaseCurrencyAmountIncludingTax = purchaseOrderDetail.getBaseCurrencyAmountIncludingTax();
        this.beforeRemark = purchaseOrderDetail.getDetailRemark();

        this.specificList = new ArrayList<>();
        List<PsiPurchaseOrderDetailSpecific> materialCharacteristicList = purchaseOrderDetail.getMaterialCharacteristicList();
        if (CollUtil.isNotEmpty(materialCharacteristicList)) {
            for (PsiPurchaseOrderDetailSpecific purchaseOrderDetailSpecific : materialCharacteristicList) {
                PsiPurchaseChangeOrderDetailSpecific specific = new PsiPurchaseChangeOrderDetailSpecific(purchaseOrderDetailSpecific);
                this.specificList.add(specific);
            }
        }
    }
}
