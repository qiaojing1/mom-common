package com.lets.platform.model.psi.entity;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.enums.CloseStatusEnum;
import com.lets.platform.model.psi.enums.ChangeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * 销售变更单物料明细
 * </p>
 *
 * @author FZY
 * @since 2023-11-23
 */
@Getter
@Setter
@TableName("psi_sale_change_order_material")
@ApiModel(value = "PsiSaleChangeOrderMaterial对象", description = "销售变更单物料明细")
public class PsiSaleChangeOrderMaterial extends BaseEntity {

    @ApiModelProperty("原单据物料明细ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("变更方式[0:不可变更;1:修改;2:新增]")
    @TableField("change_type")
    private Integer changeType;

    @ApiModelProperty("变更方式名称")
    @TableField(exist = false)
    private String changeTypeName;

    @ApiModelProperty("销售变更单ID")
    @TableField("order_id")
    private String orderId;

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

    @ApiModelProperty("物料ID")
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

    @ApiModelProperty("物料起订量")
    @TableField("material_sale_min_quantity")
    private BigDecimal materialSaleMinQuantity;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit_id")
    private String saleUnitId;

    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ApiModelProperty("销售单位舍入类型")
    @TableField("sale_unit_round_off_type")
    private Integer saleUnitRoundOffType;

    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    private LocalDateTime needDate;

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

    @ApiModelProperty("超发上限(%)")
    @TableField("sale_over_limit")
    private BigDecimal saleOverLimit;

    @ApiModelProperty("超发下限(%)")
    @TableField("sale_under_limit")
    private BigDecimal saleUnderLimit;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("变更前项目编号")
    @TableField("before_project_code")
    private String beforeProjectCode;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("变更前合同编号")
    @TableField("before_contract_code")
    private String beforeContractCode;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("销售批量控制方式")
    @TableField("sale_lot_control_type")
    private String saleLotControlType;

    @ApiModelProperty("销售批量")
    @TableField("sale_lot_quantity")
    private BigDecimal saleLotQuantity;

    @ApiModelProperty("子件拆解方式")
    @TableField("sale_sub_disassembly_type")
    private String saleSubDisassemblyType;

    @ApiModelProperty("子件拆解方式")
    @TableField(exist = false)
    private String saleSubDisassemblyTypeName;

    @ApiModelProperty("变更前数量")
    @TableField("before_quantity")
    private BigDecimal beforeQuantity;

    @ApiModelProperty("变更前参考数量")
    @TableField("before_reference_quantity")
    private BigDecimal beforeReferenceQuantity;

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
    private String beforeTaxRate;

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

    @ApiModelProperty("金额(本位币变更前)")
    @TableField("before_base_currency_amount")
    private BigDecimal beforeBaseCurrencyAmount;

    @ApiModelProperty("变更前税额")
    @TableField("before_tax_amount")
    private BigDecimal beforeTaxAmount;

    @ApiModelProperty("税额(本位币变更前)")
    @TableField("before_base_currency_tax_amount")
    private BigDecimal beforeBaseCurrencyTaxAmount;

    @ApiModelProperty("变更前折扣金额")
    @TableField("before_discount_amount")
    private BigDecimal beforeDiscountAmount;

    @ApiModelProperty("变更前含税合计")
    @TableField("before_amount_including_tax")
    private BigDecimal beforeAmountIncludingTax;

    @ApiModelProperty("含税合计(本位币变更前)")
    @TableField("before_base_currency_amount_including_tax")
    private BigDecimal beforeBaseCurrencyAmountIncludingTax;

    @ApiModelProperty("变更前超发上限数量")
    @TableField("before_sale_over_quantity")
    private BigDecimal beforeSaleOverQuantity;

    @ApiModelProperty("变更前超发下限数量")
    @TableField("before_sale_under_quantity")
    private BigDecimal beforeSaleUnderQuantity;

    @ApiModelProperty("变更前备注")
    @TableField("before_remark")
    private String beforeRemark;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;

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

    @ApiModelProperty("超发上限数量")
    @TableField("sale_over_quantity")
    private BigDecimal saleOverQuantity;

    @ApiModelProperty("超发下限数量")
    @TableField("sale_under_quantity")
    private BigDecimal saleUnderQuantity;

    @ApiModelProperty("已出货通知数量")
    @TableField("delivery_quantity")
    private BigDecimal deliveryQuantity;

    @ApiModelProperty("出货通知占用数量")
    @TableField("delivery_occupied_quantity")
    private BigDecimal deliveryOccupiedQuantity;

    @ApiModelProperty("已出库数量")
    @TableField("stock_out_quantity")
    private BigDecimal stockOutQuantity;

    @ApiModelProperty("已出库可退货数量")
    @TableField("remain_return_quantity")
    private BigDecimal remainReturnQuantity;

    @ApiModelProperty("已退货数量")
    @TableField("return_quantity")
    private BigDecimal returnQuantity;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<PsiSaleChangeOrderMaterialCharacteristic> materialCharacteristicList;

    @ApiModelProperty("物料销售属性")
    @TableField(exist = false)
    private PsiMaterialSale materialSale;

    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("销售订单相关信息字段 供计划跟踪功能使用")
    @TableField(exist = false)
    private String saleOrderNo;

    @ApiModelProperty("订单要求")
    @TableField(exist = false)
    private PsiSaleChangeOrderMaterialDemand materialDemand;

    @ApiModelProperty("发货明细")
    @TableField(exist = false)
    private List<PsiSaleChangeOrderDelivery> saleChangeOrderDeliveryList;


    @ApiModelProperty("该物料所属的客户物料属性")
    @TableField(exist = false)
    private Map<String, PsiCustomerMaterialDetail> customerMaterialInfos;

    public PsiSaleChangeOrderMaterial() {
    }

    public PsiSaleChangeOrderMaterial(PsiSaleOrderMaterial saleOrderMaterial) {
        if (saleOrderMaterial == null) {
            return;
        }
        this.sourceId = saleOrderMaterial.getId();
        this.changeType = CloseStatusEnum.NORMAL.equals(saleOrderMaterial.getEnable()) ? ChangeTypeEnum.EDIT.getValue() : ChangeTypeEnum.NOT_EDIT.getValue();
        this.changeTypeName = ChangeTypeEnum.getName(this.changeType);
        this.lineNumber = saleOrderMaterial.getLineNumber();
        this.customerMaterialId = saleOrderMaterial.getCustomerMaterialId();
        this.customerMaterialCode = saleOrderMaterial.getCustomerMaterialCode();
        this.customerMaterialName = saleOrderMaterial.getCustomerMaterialName();
        this.materialId = saleOrderMaterial.getMaterialId();
        this.materialCode = saleOrderMaterial.getMaterialCode();
        this.materialType = saleOrderMaterial.getMaterialType();
        this.materialName = saleOrderMaterial.getMaterialName();
        this.materialSpecs = saleOrderMaterial.getMaterialSpecs();
        this.materialSaleMinQuantity = saleOrderMaterial.getMaterialSaleMinQuantity();
        this.materialCharacteristicNames = saleOrderMaterial.getMaterialCharacteristicNames();
        this.saleUnitId = saleOrderMaterial.getSaleUnitId();
        this.saleUnitAccuracy = saleOrderMaterial.getSaleUnitAccuracy();
        this.saleUnitRoundOffType = saleOrderMaterial.getSaleUnitRoundOffType();
        this.saleUnitName = saleOrderMaterial.getSaleUnitName();
        this.needDate = saleOrderMaterial.getNeedDate();
        this.referenceUnitId = saleOrderMaterial.getReferenceUnitId();
        this.referenceUnitName = saleOrderMaterial.getReferenceUnitName();
        this.referenceUnitAccuracy = saleOrderMaterial.getReferenceUnitAccuracy();
        this.referenceUnitRoundOffType = saleOrderMaterial.getReferenceUnitRoundOffType();
        this.referenceUnitRate = saleOrderMaterial.getReferenceUnitRate();
        this.saleOverLimit = saleOrderMaterial.getSaleOverLimit();
        this.saleUnderLimit = saleOrderMaterial.getSaleUnderLimit();
        this.projectCode = saleOrderMaterial.getProjectCode();
        this.beforeProjectCode = saleOrderMaterial.getProjectCode();
        this.contractCode = saleOrderMaterial.getContractCode();
        this.beforeContractCode = saleOrderMaterial.getContractCode();
        this.saleLotControlType = saleOrderMaterial.getSaleLotControlType();
        this.saleLotQuantity = saleOrderMaterial.getSaleLotQuantity();
        this.saleSubDisassemblyType = saleOrderMaterial.getSaleSubDisassemblyType();
        this.beforeQuantity = saleOrderMaterial.getQuantity();
        this.beforeReferenceQuantity = saleOrderMaterial.getReferenceQuantity();
        this.beforePrice = saleOrderMaterial.getPrice();
        this.beforeTaxId = saleOrderMaterial.getTaxId();
        this.beforeTaxType = saleOrderMaterial.getTaxType();
        this.beforeTaxName = saleOrderMaterial.getTaxName();
        this.beforeTaxRate = saleOrderMaterial.getTaxRate();
        this.beforeTaxAccuracy = saleOrderMaterial.getTaxAccuracy();
        this.beforePriceIncludingTax = saleOrderMaterial.getPriceIncludingTax();
        this.beforeDiscountRate = saleOrderMaterial.getDiscountRate();
        this.beforePriceDiscountAmount = saleOrderMaterial.getPriceDiscountAmount();
        this.beforeAmount = saleOrderMaterial.getAmount();
        this.beforeBaseCurrencyAmount = saleOrderMaterial.getBaseCurrencyAmount();
        this.beforeTaxAmount = saleOrderMaterial.getTaxAmount();
        this.beforeBaseCurrencyTaxAmount = saleOrderMaterial.getBaseCurrencyTaxAmount();
        this.beforeDiscountAmount = saleOrderMaterial.getDiscountAmount();
        this.beforeAmountIncludingTax = saleOrderMaterial.getAmountIncludingTax();
        this.beforeBaseCurrencyAmountIncludingTax = saleOrderMaterial.getBaseCurrencyAmountIncludingTax();
        this.beforeSaleOverQuantity = saleOrderMaterial.getSaleOverQuantity();
        this.beforeSaleUnderQuantity = saleOrderMaterial.getSaleUnderQuantity();
        this.beforeRemark = saleOrderMaterial.getRemark();
        this.quantity = saleOrderMaterial.getQuantity();
        this.referenceQuantity = saleOrderMaterial.getReferenceQuantity();
        this.price = saleOrderMaterial.getPrice();
        this.taxId = saleOrderMaterial.getTaxId();
        this.taxType = saleOrderMaterial.getTaxType();
        this.taxName = saleOrderMaterial.getTaxName();
        this.taxRate = saleOrderMaterial.getTaxRate();
        this.taxAccuracy = saleOrderMaterial.getTaxAccuracy();
        this.priceIncludingTax = saleOrderMaterial.getPriceIncludingTax();
        this.discountRate = saleOrderMaterial.getDiscountRate();
        this.priceDiscountAmount = saleOrderMaterial.getPriceDiscountAmount();
        this.amount = saleOrderMaterial.getAmount();
        this.baseCurrencyAmount = saleOrderMaterial.getBaseCurrencyAmount();
        this.taxAmount = saleOrderMaterial.getTaxAmount();
        this.baseCurrencyTaxAmount = saleOrderMaterial.getBaseCurrencyTaxAmount();
        this.discountAmount = saleOrderMaterial.getDiscountAmount();
        this.amountIncludingTax = saleOrderMaterial.getAmountIncludingTax();
        this.baseCurrencyAmountIncludingTax = saleOrderMaterial.getBaseCurrencyAmountIncludingTax();
        this.saleOverQuantity = saleOrderMaterial.getSaleOverQuantity();
        this.saleUnderQuantity = saleOrderMaterial.getSaleUnderQuantity();
        this.remark = saleOrderMaterial.getRemark();
        this.saleChangeOrderDeliveryList = new ArrayList<>();

        if (Objects.nonNull(saleOrderMaterial.getMaterialDemand())) {
            PsiSaleChangeOrderMaterialDemand demand = new PsiSaleChangeOrderMaterialDemand();
            BeanUtil.copyProperties(saleOrderMaterial.getMaterialDemand(), demand);
            demand.setBeforeTechnologyDemand(saleOrderMaterial.getMaterialDemand().getTechnologyDemand());
            demand.setBeforeOtherDemand(saleOrderMaterial.getMaterialDemand().getOtherDemand());
            demand.setBeforeQualityDemand(saleOrderMaterial.getMaterialDemand().getQualityDemand());
            demand.setBeforePackagingShippingDemand(saleOrderMaterial.getMaterialDemand().getPackagingShippingDemand());
            demand.toSaveEntity();
            demand.setOrderId(null);
            demand.setDetailId(null);
            this.materialDemand = demand;
        }
    }
}
