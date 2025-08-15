package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产工单-工艺路线-明细-工序信息-工艺参数-副本
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_route_process_parameters")
@ApiModel(value = "MesProduceOrderRouteProcessParameters对象", description = "生产工单-工艺路线-明细-工序信息-工艺参数-副本")
public class MesProduceOrderRouteProcessParameters extends BaseEntity {

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty("生产工单明细主键")
    @TableField("detail_id")
    private String detailId;
    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺路线明细主键")
    @TableField("route_detail_id")
    private String routeDetailId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("参数主键")
    @TableField("parameters_id")
    private String parametersId;

    @ApiModelProperty("参数编码")
    @TableField("parameters_code")
    private String parametersCode;

    @ApiModelProperty("参数名称")
    @TableField("parameters_name")
    private String parametersName;

    @ApiModelProperty("数据项主键")
    @TableField("item_id")
    private String itemId;

    @ApiModelProperty("数据项原始标识")
    @TableField("item_source_field")
    private String itemSourceField;

    @ApiModelProperty("数据项名称")
    @TableField("item_field_name")
    private String itemFieldName;

    @ApiModelProperty("数据项字段")
    @TableField("item_field")
    private String itemField;

    @ApiModelProperty("标准值")
    @TableField("standard_value")
    private BigDecimal standardValue;

    @ApiModelProperty("最大值")
    @TableField("max_value")
    private BigDecimal maxValue;

    @ApiModelProperty("最小值")
    @TableField("min_value")
    private BigDecimal minValue;
}
