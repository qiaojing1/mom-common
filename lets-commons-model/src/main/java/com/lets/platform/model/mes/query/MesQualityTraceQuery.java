package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName MesQualityTraceQuery
 * @Description 质量追溯方案查询实体类
 * @Date 2024/6/3 14:20
 **/
@Getter
@Setter
@ApiModel("质量追溯方案查询实体类")
public class MesQualityTraceQuery {
    @ApiModelProperty("销售订单表体id 仅在通过销售订单查询质量追溯方案时需要")
    private String saleDetailId;

    @ApiModelProperty("物料id")
    private String materialId;

    @ApiModelProperty("追溯方案id")
    private String qualityTraceId;

    @ApiModelProperty("计划跟踪号")
    private String trackNo;
}
