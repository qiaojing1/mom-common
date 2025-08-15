package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 停机损失分析报表
 * @author: DING WEI
 * @date: 2024/12/17 11:37
 */
@Data
@ApiModel("停机损失分析报表")
public class ShutdownLossAnalysisReportVo {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("设备停机总时长(H)")
    private BigDecimal shutdownTotalDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("设备停机总时长(H)-上期")
    private BigDecimal preShutdownTotalDuration;
    @ApiModelProperty("设备停机总时长(H)环比")
    private String shutdownTotalDurationRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障停机总时长(H)")
    private BigDecimal repairTotalDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障停机总时长(min)")
    private BigDecimal repairTotalDurationMin;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障停机总时长(H)-上期")
    private BigDecimal preRepairTotalDuration;
    @ApiModelProperty("故障停机总时长(H)环比")
    private String repairTotalDurationRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划停机总时长(H)")
    private BigDecimal planTotalDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划停机总时长(min)")
    private BigDecimal planTotalDurationMin;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划停机总时长(H)-上期")
    private BigDecimal prePlanTotalDuration;
    @ApiModelProperty("计划停机总时长(H)环比")
    private String planTotalDurationRate;

    @ApiModelProperty("停机总次数")
    private Integer shutdownTotalTimes;
    @ApiModelProperty("停机总次数-上期")
    private Integer preShutdownTotalTimes;
    @ApiModelProperty("停机总次数环比")
    private String shutdownTotalTimesRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障停机次数")
    private Integer repairTotalTimes;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障停机次数-上期")
    private Integer preRepairTotalTimes;
    @ApiModelProperty("故障停机次数环比")
    private String repairTotalTimesRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划停机次数")
    private Integer planTotalTimes;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划停机次数-上期")
    private Integer prePlanTotalTimes;
    @ApiModelProperty("计划停机次数环比")
    private String planTotalTimesRate;

    @ApiModelProperty("停机时长分析-故障类型")
    private List<AnalysisReportSubVo> faultDurationList;
    @ApiModelProperty("停机时长分析-生产单元")
    private List<AnalysisReportSubVo> factoryModeDurationList;
    @ApiModelProperty("停机时长分析-设备")
    private List<AnalysisReportSubVo> deviceDurationList;

    @ApiModelProperty("停机次数分析-故障类型")
    private List<AnalysisReportSubVo> faultTimesList;
    @ApiModelProperty("停机次数分析-生产单元")
    private List<AnalysisReportSubVo> factoryModeTimesList;
    @ApiModelProperty("停机次数分析-设备")
    private List<AnalysisReportSubVo> deviceTimesList;
}
