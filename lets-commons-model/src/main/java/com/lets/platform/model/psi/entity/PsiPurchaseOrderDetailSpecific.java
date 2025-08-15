package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购订单物料明细-特征属性
 * </p>
 *
 * @author DING WEI
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("psi_purchase_order_detail_specific")
@ApiModel(value = "PsiPurchaseOrderDetailSpecific对象", description = "采购订单物料明细-特征属性")
public class PsiPurchaseOrderDetailSpecific extends MaterialSpecific {

    @ApiModelProperty("采购订单物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;
}
