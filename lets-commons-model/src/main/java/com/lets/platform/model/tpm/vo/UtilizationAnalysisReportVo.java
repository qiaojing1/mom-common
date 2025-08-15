package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 稼动率统计
 * @author DING WEI
 * @date 2024/12/18 14:12
 * @version 1.0
 */
@Data
@ApiModel("稼动率统计")
public class UtilizationAnalysisReportVo {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率统计-平均稼动率")
    private BigDecimal avgUtilization;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率统计-平均稼动率(上期)")
    private BigDecimal avgPreUtilization;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率统计-平均稼动率-环比")
    private BigDecimal avgUtilizationRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率统计-运行时长[H]")
    private BigDecimal runDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率统计-运行时长[H](上期)")
    private BigDecimal runPreDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("稼动率统计-运行时长(环比)")
    private BigDecimal runDurationRate;

    @ApiModelProperty("备件领用统计-折线图(按日、或月分组)")
    private List<AnalysisReportSubVo> dayOrMonthNumberList;
}
