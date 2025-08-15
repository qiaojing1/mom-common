package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 协同报价单-明细-特征属性
 * @author DING WEI
 * @since 2025-03-27
 */
@Getter
@Setter
@TableName("psi_cooperate_quote_order_detail_specific")
@ApiModel(value = "PsiCooperateQuoteOrderDetailSpecific对象", description = "协同报价单-明细-特征属性")
public class PsiCooperateQuoteOrderDetailSpecific extends BaseEntity {

    @ApiModelProperty("物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("物料特征属性")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征属性名称")
    @TableField("specific_name")
    private String specificName;

    @ApiModelProperty("物料特征属性值")
    @TableField("value")
    private String value;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    private String valueSource;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private String required;
}
