package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购价目表
 * </p>
 *
 * @author csy
 * @since 2023-11-17
 */
@Getter
@Setter
@TableName("psi_purchase_price_list_supplier")
@ApiModel(value = "PsiPurchasePriceListSupplier对象", description = "采购价目表")
public class PsiPurchasePriceListSupplier extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("价目表id")
    @TableField("price_list_id")
    @ExcelIgnore
    private String priceListId;

    @ApiModelProperty("供应商或分组id")
    @TableField("supplier_or_group_id")
    private String supplierOrGroupId;
    @TableField(exist = false)
    private String supplierCode;
    @TableField(exist = false)
    private String supplierName;

    @ApiModelProperty("0供应商,1分组")
    @TableField("type")
    private String type;
}
