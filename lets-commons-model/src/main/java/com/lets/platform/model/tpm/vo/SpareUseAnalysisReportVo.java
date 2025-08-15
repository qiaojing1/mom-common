package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 备件领用 分析报表
 * @author DING WEI
 * @date 2024/12/18 14:12
 * @version 1.0
 */
@Data
@ApiModel("备件领用 分析报表")
public class SpareUseAnalysisReportVo {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("备件消耗总量")
    private BigDecimal totalUseNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("备件消耗总量-上期")
    private BigDecimal preTotalUseNumber;
    @ApiModelProperty("备件消耗总量-环比")
    private String totalUseNumberRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修消耗量")
    private BigDecimal repairUseNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修消耗量-上期")
    private BigDecimal preRepairUseNumber;
    @ApiModelProperty("维修消耗量-环比")
    private String repairUseNumberRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养消耗量")
    private BigDecimal maintenanceUseNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养消耗量-上期")
    private BigDecimal preMaintenanceUseNumber;
    @ApiModelProperty("保养消耗量-环比")
    private String maintenanceUseNumberRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("备件消耗总量")
    private BigDecimal totalUseAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("备件消耗总量-上期")
    private BigDecimal preTotalUseAmount;
    @ApiModelProperty("备件消耗总量-环比")
    private String totalUseAmountRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修消耗量")
    private BigDecimal repairUseAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修消耗量-上期")
    private BigDecimal preRepairUseAmount;
    @ApiModelProperty("维修消耗量-环比")
    private String repairUseAmountRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养消耗量")
    private BigDecimal maintenanceUseAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养消耗量-上期")
    private BigDecimal preMaintenanceUseAmount;
    @ApiModelProperty("保养消耗量-环比")
    private String maintenanceUseAmountRate;

    @ApiModelProperty("备件消耗量分析-全部")
    private List<AnalysisReportSubVo> totalNumberList;
    @ApiModelProperty("备件消耗量分析-维修")
    private List<AnalysisReportSubVo> repairNumberList;
    @ApiModelProperty("备件消耗量分析-保养")
    private List<AnalysisReportSubVo> maintenanceNumberList;

    @ApiModelProperty("备件消耗金额分析-全部")
    private List<AnalysisReportSubVo> totalAmountList;
    @ApiModelProperty("备件消耗金额分析-维修")
    private List<AnalysisReportSubVo> repairAmountList;
    @ApiModelProperty("备件消耗金额分析-保养")
    private List<AnalysisReportSubVo> maintenanceAmountList;

    @ApiModelProperty("备件领用统计-折柱图(按日、或月分组)")
    private List<AnalysisReportSubVo> dayOrMonthNumberList;
    @ApiModelProperty("备件领用统计-折柱图(按日、或月分组)")
    private List<AnalysisReportSubVo> dayOrMonthAmountList;
}
