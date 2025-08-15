package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * MPS计划订单-特征属性
 *
 */
@Getter
@Setter
public class MesProcessOutsourcingOutSpecific extends MaterialSpecific {

    @ApiModelProperty("物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
}
