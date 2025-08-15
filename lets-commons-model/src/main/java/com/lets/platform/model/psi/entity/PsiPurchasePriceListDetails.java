package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * <p>
 * 采购价目表明细
 * </p>
 *
 * @author csy
 * @since 2023-11-17
 */
@Getter
@Setter
@TableName("psi_purchase_price_list_details")
@ApiModel(value = "PsiPurchasePriceListDetails对象", description = "采购价目表明细")
public class PsiPurchasePriceListDetails extends BaseEntity {


    @ExcelProperty("价目表编码")
    @TableField(exist = false)
    private String priceListCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String priceListName;

    @ExcelIgnore
    @ApiModelProperty("采购价目表ID")
    @TableField("price_list_id")
    private String priceListId;

    @ApiModelProperty("行号")
    @TableField("row_index")
    @ExcelIgnore
    private Long rowIndex;

    @ApiModelProperty("物料编码ID")
    @ExcelIgnore
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelIgnore
    private String materialName;

    @ExcelIgnore
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ExcelIgnore
    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ExcelIgnore
    @ApiModelProperty("采购单位ID")
    @TableField("purchase_unit")
    private String purchaseUnit;

    @ExcelIgnore
    @ApiModelProperty("采购单位code")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String materialBasicUnitCode;

    @ExcelProperty("采购单位")
    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;

    @ExcelIgnore
    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;

    @ExcelIgnore
    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private String purchaseUnitRoundOffType;

    @ExcelIgnore
    @ApiModelProperty("单价")
    @TableField("price")
    @ValidBigDecimal(min = "0",max = "9999999999.99",message = "[单价] 范围0-9999999999.99",groups = {Save.class, Update.class}, includeMin = true)
    private BigDecimal price;
    @ExcelProperty("单价")
    @TableField(exist = false)
    private String priceStr;

    @ExcelIgnore
    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    @ValidBigDecimal(min = "0",max = "9999999999.99",message = "[含税单价] 范围0-9999999999.99",groups = {Save.class, Update.class}, includeMin = true)
    private BigDecimal includingTaxPrice;
    @ExcelProperty("含税单价")
    @TableField(exist = false)
    private String includingTaxPriceStr;

    @ExcelIgnore
    @ApiModelProperty("税种id")
    @TableField("tax_id")
    private String taxId;

    @ExcelIgnore
    @ApiModelProperty("税率")
    @TableField("tax_rate")
    private BigDecimal taxRate;

    @ApiModelProperty("税种id")
    @TableField("tax_name")
    @ExcelProperty("税率")
    private String taxName;

    @ExcelIgnore
    @ApiModelProperty("税种id")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ExcelIgnore
    @ApiModelProperty("税种id")
    @TableField("tax_type")
    private String taxType;

    @ExcelIgnore
    @ApiModelProperty("最低限价")
    @TableField("limit_price_low")
    private BigDecimal limitPriceLow;
    @ExcelProperty("最低限价")
    @TableField(exist = false)
    private String limitPriceLowStr;

    @ExcelIgnore
    @ApiModelProperty("最高限价")
    @TableField("limit_price_high")
    private BigDecimal limitPriceHigh;
    @ExcelProperty("最高限价")
    @TableField(exist = false)
    private String limitPriceHighStr;


    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("限定方式")
    private String limitType;


    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiPurchasePriceListMaterialCharacteristic> materialCharacteristicList;
}
