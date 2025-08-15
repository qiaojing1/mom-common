package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 采购收货单-明细-特征属性
 * @author DING WEI
 * @since 2024-03-19
 */
@Getter
@Setter
@TableName("psi_purchase_delivery_order_detail_characteristic")
@ApiModel(value = "PsiPurchaseDeliveryOrderDetailCharacteristic对象", description = "采购收货单-明细-特征属性")
public class PsiPurchaseDeliveryOrderDetailCharacteristic extends MaterialSpecific {

    @ApiModelProperty("采购收货单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("采购收货单物料明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
}
