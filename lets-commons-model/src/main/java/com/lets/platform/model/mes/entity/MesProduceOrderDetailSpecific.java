package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产工单-明细-特征属性
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_detail_specific")
@ApiModel(value = "MesProduceOrderDetailSpecific对象", description = "生产工单-明细-特征属性")
public class MesProduceOrderDetailSpecific extends MaterialSpecific {

    @ApiModelProperty("采购订单物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;
}
