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
import java.util.Objects;

/**
 * 销售预测订单-物料明细
 *
 * @author DING WEI
 * @since 2024-07-13
 */
@Getter
@Setter
@TableName("psi_sale_prediction_order_detail")
@ApiModel(value = "PsiSalePredictionOrderDetail对象", description = "销售预测订单-物料明细")
public class PsiSalePredictionOrderDetail extends BaseEntity {

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @TableField(exist = false)
    private String orderCode;

    @TableField(exist = false)
    private String orderCategoryId;

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

    @ApiModelProperty("销售属性")
    @TableField(exist = false)
    private PsiMaterialSale materialSale;
    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("物料起订量")
    @TableField("material_sale_min_quantity")
    private BigDecimal materialSaleMinQuantity;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已执行数量")
    @TableField("already_quantity")
    private BigDecimal alreadyQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占用数量")
    @TableField("occupied_quantity")
    private BigDecimal occupiedQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;
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
    private BigDecimal detailTaxAmount;
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

    @ApiModelProperty("要货日期")
    @TableField("need_date")
    private LocalDateTime needDate;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("参考单位与销售单位比例")
    @TableField("reference_unit_rate")
    private BigDecimal referenceUnitRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("参考数量")
    @TableField("reference_quantity")
    private BigDecimal referenceQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发上限(%)")
    @TableField("sale_over_limit")
    private BigDecimal saleOverLimit;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发下限(%)")
    @TableField("sale_under_limit")
    private BigDecimal saleUnderLimit;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发上限数量")
    @TableField("sale_over_quantity")
    private BigDecimal saleOverQuantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("超发下限数量")
    @TableField("sale_under_quantity")
    private BigDecimal saleUnderQuantity;

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

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String detailRemark;
    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;
    @TableField("can_enable")
    private Integer detailCanEnable;

    @ApiModelProperty("销售批量控制方式")
    @TableField("sale_lot_control_type")
    private String saleLotControlType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("销售批量")
    @TableField("sale_lot_quantity")
    private BigDecimal saleLotQuantity;

    @ApiModelProperty("子件拆解方式")
    @TableField("sale_sub_disassembly_type")
    private String saleSubDisassemblyType;

    @ApiModelProperty("MRP已计算数量")
    @TableField("mrp_calculated_quantity")
    private BigDecimal mrpCalculatedQuantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("需补货数量")
    @TableField("replenishment_quantity")
    private BigDecimal replenishmentQuantity;

    @ApiModelProperty("源单明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private List<PsiSaleOrderMaterialCharacteristic> materialCharacteristicList;

    @TableField("calculated")
    @ApiModelProperty("是否已计划运算(新计划运算)")
    private int calculated;

    @TableField("calculate_time")
    @ApiModelProperty("计算时间")
    private LocalDateTime calculateTime;

    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("订货客户ID")
    @TableField(exist = false)
    private String orderCustomerId;

    @ApiModelProperty("订货客户名称")
    @TableField(exist = false)
    private String orderCustomerName;

    @TableField(exist = false)
    private String materialGroupId;

    @TableField(exist = false)
    private String orderType;

    public BigDecimal quantityNN() {
        if (Objects.isNull(quantity)) {
            return BigDecimal.ZERO;
        } else {
            return quantity;
        }
    }

    public BigDecimal alreadyQuantityNN() {
        if (Objects.isNull(alreadyQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyQuantity;
        }
    }

    public BigDecimal occupiedQuantityNN() {
        if (Objects.isNull(occupiedQuantity)) {
            return BigDecimal.ZERO;
        } else {
            return occupiedQuantity;
        }
    }
}
