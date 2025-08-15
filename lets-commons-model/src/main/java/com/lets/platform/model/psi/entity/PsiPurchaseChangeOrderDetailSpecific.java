package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购变更单物料明细-特征属性
 * </p>
 *
 * @author FZY
 * @since 2024-09-05
 */
@Getter
@Setter
@TableName("psi_purchase_change_order_detail_specific")
@ApiModel(value = "PsiPurchaseChangeOrderDetailSpecific对象", description = "采购变更单物料明细-特征属性")
public class PsiPurchaseChangeOrderDetailSpecific extends MaterialSpecific {

    @ApiModelProperty("采购订单物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;

    public PsiPurchaseChangeOrderDetailSpecific() {}

    public PsiPurchaseChangeOrderDetailSpecific(PsiPurchaseOrderDetailSpecific purchaseOrderDetailSpecific) {
        if (purchaseOrderDetailSpecific == null) {
            return;
        }

        this.setSpecificId(purchaseOrderDetailSpecific.getSpecificId());
        this.setSpecificName(purchaseOrderDetailSpecific.getSpecificName());
        this.setValueSource(purchaseOrderDetailSpecific.getValueSource());
        this.setValue(purchaseOrderDetailSpecific.getValue());
        this.setName(purchaseOrderDetailSpecific.getName());
        this.setRequired(purchaseOrderDetailSpecific.getRequired());
    }
}
