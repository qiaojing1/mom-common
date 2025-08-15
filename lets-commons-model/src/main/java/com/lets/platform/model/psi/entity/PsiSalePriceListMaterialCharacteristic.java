package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * <p>
 * 销售价目标物料明细特征属性
 * </p>
 *
 * @author csy
 * @since 2023-11-21
 */
@Getter
@Setter
@TableName("psi_sale_price_list_material_characteristic")
@ApiModel(value = "PsiSalePriceListMaterialCharacteristic对象", description = "销售价目标物料明细特征属性")
public class PsiSalePriceListMaterialCharacteristic extends BaseEntity {

    @ApiModelProperty("销售价目表物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售价目表ID")
    @TableField("price_list_id")
    private String priceListId;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Integer required;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料特征属性ID")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征属性名称")
    @TableField("specific_name")
    private String specificName;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    private String valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("VALUE")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("NAME")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiSalePriceListMaterialCharacteristic that = (PsiSalePriceListMaterialCharacteristic) o;
        return specificId.equals(that.specificId) &&
                value.equals(that.value) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specificId, value, name);
    }

    @Override
    public String toString() {
        return "PsiSalePriceListMaterialCharacteristic{" +
                "parentId='" + parentId + '\'' +
                ", priceListId='" + priceListId + '\'' +
                ", required=" + required +
                ", materialId='" + materialId + '\'' +
                ", specificId='" + specificId + '\'' +
                ", specificName='" + specificName + '\'' +
                ", valueSource='" + valueSource + '\'' +
                ", value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
