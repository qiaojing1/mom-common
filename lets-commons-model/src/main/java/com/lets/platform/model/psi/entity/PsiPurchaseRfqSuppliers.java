package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * <p>
 * 采购询价单供应商
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-18
 */
@Getter
@Setter
@TableName("psi_purchase_rfq_suppliers")
@ApiModel(value = "PsiPurchaseRfqSuppliers对象", description = "采购询价单供应商")
public class PsiPurchaseRfqSuppliers extends BaseEntity {

    @ApiModelProperty("采购询价单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("供应商id")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("供应商编码")
    @TableField("supplier_code")
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("供应商联系人id")
    @TableField("supplier_contact_id")
    private String supplierContactId;

    @ApiModelProperty("供应商联系人名称")
    @TableField("supplier_contact_name")
    private String supplierContactName;

    @ApiModelProperty("供应商联系人电话")
    @TableField("supplier_contact_phone")
    private String supplierContactPhone;

    @ApiModelProperty("供应商报价状态 1：未报价 2：部分报价 3：全部报价")
    @TableField(exist = false)
    private String quoteStatus;
    @ApiModelProperty("供应商报价状态 1：未报价 2：部分报价 3：全部报价")
    @TableField(exist = false)
    private String quoteStatusName;

    @ApiModelProperty("供应商报价日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate quoteDate;

    @ApiModelProperty("是否创建已提交的协同报价单[YN]")
    @TableField("cooperate_quote")
    private String cooperateQuote;
}
