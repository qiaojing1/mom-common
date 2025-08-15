package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * 批次产品平衡率 查询对象
 * @author: DING WEI
 * @date: 2024/3/5 8:51
 */
@Data
@ApiModel("批次产品平衡率 查询对象")
public class BatchBalanceRateQuery {

    @ApiModelProperty("生产完成时间-开始")
    private LocalDateTime endTimeBegin;

    @ApiModelProperty("生产完成时间-结束")
    private LocalDateTime endTimeEnd;

    @NotBlank(message = "BatchBalanceRateQuery.materialId")
    @ApiModelProperty("物料主键")
    private String materialId;

    @NotBlank(message = "modeNotNull")
    @ApiModelProperty("生产单元")
    private String factoryModeId;

    @NotBlank(message = "RouteNotNull")
    @ApiModelProperty("工艺路线")
    private String routeId;

}
