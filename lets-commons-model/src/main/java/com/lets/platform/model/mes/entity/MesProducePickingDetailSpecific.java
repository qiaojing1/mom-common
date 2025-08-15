package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产领料单-明细-特征属性
 * @author DING WEI
 * @since 2023-12-13
 */
@Getter
@Setter
@TableName("mes_produce_picking_detail_specific")
@ApiModel(value = "MesProducePickingDetailSpecific对象", description = "生产领料单-明细-特征属性")
public class MesProducePickingDetailSpecific extends MaterialSpecific {

    @ApiModelProperty("订单物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("订单")
    @TableField("order_id")
    private String orderId;
}
