package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 协同送货单-供货附件
 * @author DING WEI
 * @since 2025-04-02
 */
@Getter
@Setter
@TableName("psi_cooperate_deliver_order_supply_enclosure")
@ApiModel(value = "PsiCooperateDeliverOrderSupplyEnclosure对象", description = "协同送货单-供货附件")
public class PsiCooperateDeliverOrderSupplyEnclosure extends BaseEntity {

    @ApiModelProperty("协同送货订单")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("供货资料名称")
    @TableField("supply_enclosure_name")
    private String supplyEnclosureName;

    @ApiModelProperty("供货资料文件主键")
    @TableField("supply_enclosure_file_id")
    private String supplyEnclosureFileId;
}
