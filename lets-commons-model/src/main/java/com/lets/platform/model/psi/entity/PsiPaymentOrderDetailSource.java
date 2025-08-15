package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 收款单物料明细源单
 * </p>
 *
 * @author csy
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("psi_payment_order_detail_source")
@ApiModel(value = "PsiPaymentOrderDetailSource对象", description = "收款单物料明细源单")
public class PsiPaymentOrderDetailSource extends BaseEntity {

    @ApiModelProperty("采购应收订单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("采购应收订单id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("源单id")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单code")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private String sourceLineNumber;

    @ApiModelProperty("原明细id")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("应付总金额")
    @TableField("should_amount")
    private BigDecimal shouldAmount;

    @ApiModelProperty("实付总金额")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("含税单价")
    @TableField("price_including_tax")
    private BigDecimal priceIncludingTax;

    @ApiModelProperty("手续费")
    @TableField("tax_amount")
    private BigDecimal taxAmount;

    @ApiModelProperty("采购订单id")
    @TableField("purchase_order_id")
    private String purchaseOrderId;
    @ApiModelProperty("采购订单code")
    @TableField("purchase_order_code")
    private String purchaseOrderCode;
    @ApiModelProperty("采购订单行号")
    @TableField("purchase_line_number")
    private String purchaseLineNumber;
    @ApiModelProperty("采购订单明细id")
    @TableField("purchase_detail_id")
    private String purchaseDetailId;
    @TableField("track_no")
    private String trackNo;

    @TableField("material_id")
    private String materialId;
    @TableField("material_code")
    private String materialCode;
    @TableField("material_name")
    private String materialName;
    @TableField("material_specs")
    private String materialSpecs;
    @TableField("material_type")
    private String materialType;
}
