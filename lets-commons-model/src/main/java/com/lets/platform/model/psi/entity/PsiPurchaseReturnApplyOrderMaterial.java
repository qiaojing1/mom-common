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
 * <p>
 * 采购退货申请单物料明细
 * </p>
 *
 * @author csy
 * @since 2023-11-28
 */
@Getter
@Setter
@TableName("psi_purchase_return_apply_order_material")
@ApiModel(value = "PsiPurchaseReturnApplyOrderMaterial对象", description = "采购退货申请单物料明细")
public class PsiPurchaseReturnApplyOrderMaterial extends BaseEntity {

    @ApiModelProperty("采购退货申请单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

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

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位Code")
    private String inventoryUnitCode;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入类型")
    @TableField("inventory_unit_round_off_type")
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("数量")
    @TableField("quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quantity;

    @ApiModelProperty("仓库")
    @TableField("store_id")
    private String storeId;
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区")
    @TableField("area_id")
    private String areaId;
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位")
    @TableField("position_id")
    private String positionId;
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("生产日期")
    @TableField("production_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime productionDate;

    @ApiModelProperty("保质期到期日")
    @TableField("expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expirationDate;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
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

    @ApiModelProperty("源单物料明细行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("关闭状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @TableField("already_return_number")
    private BigDecimal alreadyReturnNumber;

    @TableField("version")
    private Integer version;

    @ApiModelProperty("原始单据明细Id（采购订单）")
    @TableField("original_order_id")
    private String originalOrderId;

    @TableField(exist = false)
    private String returnOrderId;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("退货类型")
    @TableField("return_type")
    private String returnType;

    @TableField(exist = false)
    private String projectCode;
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








    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("price")
    private BigDecimal price;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("amount")
    private BigDecimal amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @TableField("tax_id")
    private String taxId;

    @TableField("tax_name")
    private String taxName;

    @TableField("tax_type")
    private String taxType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)

    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @TableField("tax_rate")
    private BigDecimal taxRate;

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
    private List<PsiPurchaseReturnApplyOrderMaterialCharacteristic> materialCharacteristicList;


    public BigDecimal alreadyReturnNumberNotNull() {
        if (Objects.isNull(alreadyReturnNumber)) {
            return BigDecimal.ZERO;
        } else {
            return alreadyReturnNumber;
        }
    }
}
