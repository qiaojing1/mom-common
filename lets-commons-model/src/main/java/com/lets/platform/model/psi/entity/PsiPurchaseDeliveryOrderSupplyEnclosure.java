package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 采购收货单-供货附件
 * @author DING WEI
 * @since 2025-04-03
 */
@Getter
@Setter
@TableName("psi_purchase_delivery_order_supply_enclosure")
@ApiModel(value = "PsiPurchaseDeliveryOrderSupplyEnclosure对象", description = "采购收货单-供货附件")
public class PsiPurchaseDeliveryOrderSupplyEnclosure extends BaseEntity {

    @ApiModelProperty("采购收货订单")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("供货资料名称")
    @TableField("supply_enclosure_name")
    private String supplyEnclosureName;

    @ApiModelProperty("供货资料文件主键")
    @TableField("supply_enclosure_file_id")
    private String supplyEnclosureFileId;
}
