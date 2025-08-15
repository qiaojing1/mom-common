package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 计划订单-特征属性
 *
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_specific")
@ApiModel(value = "PsiProducePlanSpecific对象", description = "计划订单-特征属性")
public class PsiProducePlanSpecific extends MaterialSpecific {

    @ApiModelProperty("物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;
}
