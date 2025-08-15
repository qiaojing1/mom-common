package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * 销售订单物料明细特征属性
 *
 * @author FZY
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("psi_sale_order_material_characteristic")
@ApiModel(value = "PsiSaleOrderMaterialCharacteristic对象", description = "销售订单物料明细特征属性")
public class PsiSaleOrderMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("销售订单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @TableField(exist = false)
    private String deliveryId;


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null) {return false;}
        PsiSaleOrderMaterialCharacteristic that = (PsiSaleOrderMaterialCharacteristic) o;
        return getSpecificId().equals(that.getSpecificId()) &&
               getValue().equals(that.getValue()) &&
               getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpecificId(), getValue(), getName());
    }
}
