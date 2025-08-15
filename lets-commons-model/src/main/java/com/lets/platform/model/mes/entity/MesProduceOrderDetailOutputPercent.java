package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 生产工单-明细-产值分配
 * @author DING WEI
 * @since 2025-07-28
 */
@Getter
@Setter
@TableName("mes_produce_order_detail_output_percent")
@ApiModel(value = "MesProduceOrderDetailOutputPercent对象", description = "生产工单-明细-产值分配")
public class MesProduceOrderDetailOutputPercent extends BaseEntity {

    @ApiModelProperty("生产工单物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("产值比例")
    @TableField("output_percent")
    private BigDecimal outputPercent;
}
