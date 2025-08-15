package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.psi.vo.PurchaseFinishDataVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 维保报告分析
 * @author: DING WEI
 * @date: 2025/1/14 18:11
 */
@Data
@ApiModel("维保报告分析")
public class MainReportAnalysisVo {

    @ApiModelProperty("维修统计-报修数量")
    private Integer callNumber;
    @ApiModelProperty("维修统计-完成数量")
    private Integer callFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修统计-完成率")
    private BigDecimal callFinishRate;
    @ApiModelProperty("维修统计-报修数量(上期)")
    private Integer callPreNumber;
    @ApiModelProperty("维修统计-完成数量(上期)")
    private Integer callPreFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修统计-完成率(上期)")
    private BigDecimal callPreFinishRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修统计-完成率环比")
    private BigDecimal callRate;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTTR[min]")
    private BigDecimal mttr;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTTR(上期)[min]")
    private BigDecimal preMttr;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTTR环比[%]")
    private BigDecimal mttrRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTBF[h]")
    private BigDecimal mtbf;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTBF(上期)[h]")
    private BigDecimal preMtbf;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTBF环比[%]")
    private BigDecimal mtbfRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障时长")
    private BigDecimal currentFaultRepairDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("运行时长")
    private BigDecimal currentDeviceRunDuration;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障损失分析-故障损失[H]")
    private BigDecimal faultLoss;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障损失分析-故障损失(上期)[H]")
    private BigDecimal preFaultLoss;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障损失分析-故障损失环比[%]")
    private BigDecimal faultLossRate;

    @ApiModelProperty("点检统计-报修数量")
    private Integer spotNumber;
    @ApiModelProperty("点检统计-完成数量")
    private Integer spotFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("点检统计-完成率")
    private BigDecimal spotFinishRate;
    @ApiModelProperty("点检统计-报修数量(上期)")
    private Integer spotPreNumber;
    @ApiModelProperty("点检统计-完成数量(上期)")
    private Integer spotPreFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("点检统计-完成率(上期)")
    private BigDecimal spotPreFinishRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("点检统计-完成率环比")
    private BigDecimal spotRate;

    @ApiModelProperty("保养统计-报修数量")
    private Integer mainNumber;
    @ApiModelProperty("保养统计-完成数量")
    private Integer mainFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养统计-完成率")
    private BigDecimal mainFinishRate;
    @ApiModelProperty("保养统计-报修数量(上期)")
    private Integer mainPreNumber;
    @ApiModelProperty("保养统计-完成数量(上期)")
    private Integer mainPreFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养统计-完成率(上期)")
    private BigDecimal mainPreFinishRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("保养统计-完成率环比")
    private BigDecimal mainRate;

    @ApiModelProperty("专业保养统计-报修数量")
    private Integer professionalMainNumber;
    @ApiModelProperty("专业保养统计-完成数量")
    private Integer professionalMainFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("专业保养统计-完成率")
    private BigDecimal professionalMainFinishRate;
    @ApiModelProperty("专业保养统计-报修数量(上期)")
    private Integer professionalMainPreNumber;
    @ApiModelProperty("专业保养统计-完成数量(上期)")
    private Integer professionalMainPreFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("专业保养统计-完成率(上期)")
    private BigDecimal professionalMainPreFinishRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("专业保养统计-完成率环比")
    private BigDecimal professionalMainRate;

    @ApiModelProperty("巡检统计-报修数量")
    private Integer inspectionNumber;
    @ApiModelProperty("巡检统计-完成数量")
    private Integer inspectionFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("巡检统计-完成率")
    private BigDecimal inspectionFinishRate;
    @ApiModelProperty("巡检统计-报修数量(上期)")
    private Integer inspectionPreNumber;
    @ApiModelProperty("巡检统计-完成数量(上期)")
    private Integer inspectionPreFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("巡检统计-完成率(上期)")
    private BigDecimal inspectionPreFinishRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("巡检统计-完成率环比")
    private BigDecimal inspectionRate;

    @ApiModelProperty("需复检数量")
    private Integer reInspectNumber;
    @ApiModelProperty("已复检数量")
    private Integer reInspectFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("复检覆盖率[%]")
    private BigDecimal reInspectNumberRate;
    @ApiModelProperty("合格数量")
    private Integer richReInspectFinishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("复检合格率[%]")
    private BigDecimal richReInspectNumberRate;

    @ApiModelProperty("设备故障率分析")
    private List<PurchaseFinishDataVo> deviceFaultRateList;
    @ApiModelProperty("设备完好率分析")
    private List<PurchaseFinishDataVo> deviceRunRateList;
}