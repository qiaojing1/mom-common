package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 协同报价单-明细-交货计划
 * @author DING WEI
 * @since 2025-03-27
 */
@Getter
@Setter
@TableName("psi_cooperate_quote_order_detail_delivery_plan")
@ApiModel(value = "PsiCooperateQuoteOrderDetailDeliveryPlan对象", description = "协同报价单-明细-交货计划")
public class PsiCooperateQuoteOrderDetailDeliveryPlan extends BaseEntity {

    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("计划交货日期")
    @TableField("plan_delivery_date")
    private LocalDate planDeliveryDate;

    @ApiModelProperty("计划交货数量")
    @TableField("plan_delivery_number")
    private BigDecimal planDeliveryNumber;
}
