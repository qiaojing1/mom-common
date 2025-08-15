package com.lets.platform.model.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 产线节拍 展示对象
 * @author: DING WEI
 * @date: 2025/4/17 11:37
 */
@Data
@ApiModel("产线节拍 展示对象")
public class ProduceLineBeatVo {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("理论产量")
    private BigDecimal theoreticalYield;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际产量-计划内")
    private BigDecimal actualPlanInYield;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际产量-计划外")
    private BigDecimal actualPlanOutYield;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("产量损失")
    private BigDecimal yieldLoss;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("理论节拍")
    private BigDecimal theoreticalBeat;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际节拍")
    private BigDecimal actualBeat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("理论加工时长(H)")
    private BigDecimal theoreticalRunDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际加工时长(H)")
    private BigDecimal actualRunDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("损失时间(H)")
    private BigDecimal lossDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划损失(H)")
    private BigDecimal planLossDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("非计划损失(H)")
    private BigDecimal unPlanLossDuration;

}