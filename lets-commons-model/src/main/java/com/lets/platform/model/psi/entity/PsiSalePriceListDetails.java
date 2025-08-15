package com.lets.platform.model.psi.entity;

import cn.hutool.core.collection.CollUtil;
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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 销售价目表明细
 * </p>
 *
 * @author csy
 * @since 2023-11-21
 */
@Getter
@Setter
@TableName("psi_sale_price_list_details")
@ApiModel(value = "PsiSalePriceListDetails对象", description = "销售价目表明细")
public class PsiSalePriceListDetails extends BaseEntity {

    @ExcelProperty("价目表编码")
    @TableField(exist = false)
    private String priceListCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String priceListName;

    @ApiModelProperty("采购价目表ID")
    @TableField("price_list_id")
    @ExcelIgnore
    private String priceListId;

    @ApiModelProperty("行号")
    @TableField("row_index")
    @ExcelIgnore
    private Long rowIndex;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("物料编码")
    @ExcelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelIgnore
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelIgnore
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    @ExcelIgnore
    private String materialCharacteristicNames;

    @ExcelIgnore
    @ApiModelProperty("销售单位ID")
    @TableField("sale_unit")
    private String saleUnit;

    @ExcelIgnore
    @ApiModelProperty("销售单位code")
    @TableField("sale_unit_code")
    private String saleUnitCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String materialBasicUnitCode;

    @ExcelProperty("销售单位")
    @ApiModelProperty("销售单位名称")
    @TableField("sale_unit_name")
    private String saleUnitName;

    @ExcelIgnore
    @ApiModelProperty("销售单位精度")
    @TableField("sale_unit_accuracy")
    private Integer saleUnitAccuracy;

    @ExcelIgnore
    @ApiModelProperty("销售单位舍入类型")
    @TableField("sale_unit_round_off_type")
    private String saleUnitRoundOffType;

    @ExcelIgnore
    @ApiModelProperty("单价")
    @TableField("price")
//    @ValidBigDecimal(max = "9999999999.99",message = "[单价] 范围0-9999999999.99",groups = {Save.class, Update.class})
    private BigDecimal price;
    @ExcelProperty("单价")
    @TableField(exist = false)
    private String priceStr;

    @ExcelIgnore
    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
//    @ValidBigDecimal(max = "9999999999.99",message = "[含税单价] 范围0-9999999999.99",groups = {Save.class, Update.class})
    private BigDecimal includingTaxPrice;
    @ExcelProperty("含税单价")
    @TableField(exist = false)
    private String includingTaxPriceStr;

    @ExcelIgnore
    @ApiModelProperty("税种id")
    @TableField("tax_id")
    private String taxId;

    @ExcelIgnore
    @ApiModelProperty("税率值")
    @TableField("tax_rate")
    private BigDecimal taxRate;

    @ApiModelProperty("税率")
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
    private String correspondingDoc;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("限定方式")
    private String limitType;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSalePriceListMaterialCharacteristic> materialCharacteristicList;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiSalePriceListDetails that = (PsiSalePriceListDetails) o;
        return materialId.equals(that.materialId) &&
                saleUnitCode.equals(that.saleUnitCode) &&
                sameList(materialCharacteristicList,that.materialCharacteristicList)&& sameList(that.materialCharacteristicList,materialCharacteristicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), materialId, saleUnit, materialCharacteristicList);
    }


    private boolean sameList(List<PsiSalePriceListMaterialCharacteristic> l1, List<PsiSalePriceListMaterialCharacteristic> l2) {
        boolean flag = false;
        int flagCount = 0;
        if (CollUtil.isEmpty(l1) && CollUtil.isEmpty(l2)) {
            return true;
        }
        if (l1.size() != l2.size()) {
            return false;
        }
        for (PsiSalePriceListMaterialCharacteristic characteristic : l2) {
            if (CollUtil.isEmpty(l1) || !l1.contains(characteristic)) {
                continue;
            }
            flagCount++;
        }
        if (flagCount == l1.size()) {
            flag = true;
        }
        return flag;
    }

    @Override
    public String toString() {
        return "PsiSalePriceListDetails{" +
                "priceListCode='" + priceListCode + '\'' +
                ", priceListName='" + priceListName + '\'' +
                ", priceListId='" + priceListId + '\'' +
                ", rowIndex=" + rowIndex +
                ", materialId='" + materialId + '\'' +
                ", materialCode='" + materialCode + '\'' +
                ", materialName='" + materialName + '\'' +
                ", materialSpecs='" + materialSpecs + '\'' +
                ", materialCharacteristicNames='" + materialCharacteristicNames + '\'' +
                ", saleUnit='" + saleUnit + '\'' +
                ", saleUnitCode='" + saleUnitCode + '\'' +
                ", materialBasicUnitCode='" + materialBasicUnitCode + '\'' +
                ", saleUnitName='" + saleUnitName + '\'' +
                ", saleUnitAccuracy=" + saleUnitAccuracy +
                ", saleUnitRoundOffType='" + saleUnitRoundOffType + '\'' +
                ", price=" + price +
                ", priceStr='" + priceStr + '\'' +
                ", includingTaxPrice=" + includingTaxPrice +
                ", includingTaxPriceStr='" + includingTaxPriceStr + '\'' +
                ", taxId='" + taxId + '\'' +
                ", taxRate=" + taxRate +
                ", taxName='" + taxName + '\'' +
                ", taxAccuracy=" + taxAccuracy +
                ", taxType='" + taxType + '\'' +
                ", limitPriceLow=" + limitPriceLow +
                ", limitPriceLowStr='" + limitPriceLowStr + '\'' +
                ", limitPriceHigh=" + limitPriceHigh +
                ", limitPriceHighStr='" + limitPriceHighStr + '\'' +
                ", remark='" + remark + '\'' +
                ", correspondingDoc='" + correspondingDoc + '\'' +
                ", limitType='" + limitType + '\'' +
                ", materialCharacteristicList=" + materialCharacteristicList +
                '}';
    }
}
