package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangweiyan
 * @ClassName MesArchivingPlanQuery
 * @Description 产品归档查询实体类
 * @Date 2024/9/20 14:20
 **/
@Getter
@Setter
@ApiModel("产品归档查询实体类")
public class MesArchivingPlanQuery {
    @ApiModelProperty("销售出库单表体id")
    private String saleStockOutDetailId;

    @ApiModelProperty("物料id")
    private String materialId;

    @ApiModelProperty("归档方案目录id")
    private String catalogueId;

    @ApiModelProperty("归档方案id")
    private String planId;

    @ApiModelProperty("计划跟踪号")
    private String trackNo;
}
