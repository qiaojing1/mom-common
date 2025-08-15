package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 销售发票登记源单相关数据
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-12
 */
@Getter
@Setter
@TableName("psi_sale_invoice_registration_source")
@ApiModel(value = "PsiSaleInvoiceRegistrationSource对象", description = "销售发票登记源单相关数据")
public class PsiSaleInvoiceRegistrationSource extends BaseEntity {

    @ApiModelProperty("销售发票登记单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售发票登记单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField("plan_tracking_number")
    private String planTrackingNumber;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Integer sourceLineNumber;

    @ApiModelProperty("源单物料明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("寄售调拨单调拨方向 1: 发出 2: 退回")
    @TableField("transfer_direction")
    private String transferDirection;

    @ApiModelProperty("库存单位ID")
    @TableField("inventory_unit_id")
    private String inventoryUnitId;

    @ApiModelProperty("库存单位名称")
    @TableField("inventory_unit_name")
    private String inventoryUnitName;

    @ApiModelProperty("库存单位精度")
    @TableField("inventory_unit_accuracy")
    private Integer inventoryUnitAccuracy;

    @ApiModelProperty("库存单位舍入方式")
    @TableField("inventory_unit_round_off_type")
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("库存数量")
    @TableField("inventory_quantity")
    private BigDecimal inventoryQuantity;

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

    @ApiModelProperty("销售数量")
    @TableField("sale_quantity")
    private BigDecimal saleQuantity;

    @ApiModelProperty("本次开票数量")
    @TableField("invoiced_quantity")
    private BigDecimal invoicedQuantity;

    @ApiModelProperty("开票占用数量")
    @TableField("invoiced_occupy_quantity")
    private BigDecimal invoicedOccupyQuantity;

    @ApiModelProperty("可开票数量")
    @TableField("unvoiced_quantity")
    private BigDecimal unvoicedQuantity;

    @ApiModelProperty("开票未税金额")
    @TableField("invoiced_unpaid_tax_amount")
    private BigDecimal invoicedUnpaidTaxAmount;

    @ApiModelProperty("未开票未税金额")
    @TableField("unvoiced_unpaid_tax_amount")
    private BigDecimal unvoicedUnpaidTaxAmount;

    @ApiModelProperty("金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("金额(本位币)")
    @TableField("base_currency_amount")
    private BigDecimal baseCurrencyAmount;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型名称")
    @TableField("source_order_type_name")
    private String sourceOrderTypeName;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别编码")
    @TableField("source_order_category_code")
    private String sourceOrderCategoryCode;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("源单主数据ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单物料明细单号")
    @TableField("source_detail_code")
    private String sourceDetailCode;

    @ApiModelProperty("物料ID")
    @TableField("source_material_id")
    private String sourceMaterialId;

    @ApiModelProperty("物料编码")
    @TableField("source_material_code")
    private String sourceMaterialCode;

    @ApiModelProperty("物料类型")
    @TableField("source_material_type")
    private String sourceMaterialType;

    @ApiModelProperty("物料名称")
    @TableField("source_material_name")
    private String sourceMaterialName;

    @ApiModelProperty("物料规格型号")
    @TableField("source_material_specs")
    private String sourceMaterialSpecs;

    @ApiModelProperty("特征属性名称")
    @TableField("source_material_characteristic_names")
    private String sourceMaterialCharacteristicNames;

    @ApiModelProperty("单价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;

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

    @ApiModelProperty("税额")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @ApiModelProperty("税额(本位币)")
    @TableField("base_currency_tax_amount")
    private BigDecimal baseCurrencyTaxAmount;

    @ApiModelProperty("含税合计")
    @TableField("amount_including_tax")
    private BigDecimal amountIncludingTax;

    @ApiModelProperty("含税合计(本位币)")
    @TableField("base_currency_amount_including_tax")
    private BigDecimal baseCurrencyAmountIncludingTax;

    @ApiModelProperty("过账日期")
    @TableField("posting_time")
    private LocalDateTime postingTime;

    @ApiModelProperty("过账日期")
    @TableField(exist = false)
    private LocalDateTime realPostingTime;

    @TableField("web_use_id")
    private String webUseId;

    @ApiModelProperty("可红字总数量")
    @TableField("needRedNumber")
    private BigDecimal needRedNumber;

    @ApiModelProperty("已红字数量")
    @TableField("alreadyRedNumber")
    private BigDecimal alreadyRedNumber;

    @ApiModelProperty("红字占用数量")
    @TableField("occupyRedNumber")
    private BigDecimal occupyRedNumber;

    public BigDecimal getNeedRedNumber() {
        return Objects.isNull(needRedNumber) ? BigDecimal.ZERO : needRedNumber;
    }

    public BigDecimal getAlreadyRedNumber() {
        return Objects.isNull(alreadyRedNumber) ? BigDecimal.ZERO : alreadyRedNumber;
    }

    public BigDecimal getOccupyRedNumber() {
        return Objects.isNull(occupyRedNumber) ? BigDecimal.ZERO : occupyRedNumber;
    }
}
