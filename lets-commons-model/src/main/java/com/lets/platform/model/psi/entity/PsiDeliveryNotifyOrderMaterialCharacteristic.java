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
 * <p>
 * 销售出货通知单物料明细特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-06-05
 */
@Getter
@Setter
@TableName("psi_delivery_notify_order_material_characteristic")
@ApiModel(value = "PsiDeliveryNotifyOrderMaterialCharacteristic对象", description = "销售出货通知单物料明细特征属性")
public class PsiDeliveryNotifyOrderMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("销售出货通知单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("销售出货通知单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null) {return false;}
        PsiDeliveryNotifyOrderMaterialCharacteristic that = (PsiDeliveryNotifyOrderMaterialCharacteristic) o;
        return getSpecificId().equals(that.getSpecificId()) &&
                getValue().equals(that.getValue()) &&
                getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpecificId(), getValue(), getName());
    }
}
