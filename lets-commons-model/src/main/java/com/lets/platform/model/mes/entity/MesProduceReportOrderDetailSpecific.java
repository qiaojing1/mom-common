package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 生产报工单-明细-特征属性
 * </p>
 *
 * @author csy
 * @since 2023-12-22
 */
@Getter
@Setter
@TableName("mes_produce_report_order_detail_specific")
@ApiModel(value = "MesProduceReportOrderDetailSpecific对象", description = "生产报工单-明细-特征属性")
public class MesProduceReportOrderDetailSpecific extends BaseEntity {

    @ApiModelProperty("采购订单物料明细")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("采购订单")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("明细行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料")
    @TableField("material_id")
    private String materialId;

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
