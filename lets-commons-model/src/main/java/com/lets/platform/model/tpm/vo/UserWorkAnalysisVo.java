package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 人员工作分析
 * @author: DING WEI
 * @date: 2025/1/14 18:11
 */
@Data
@ApiModel("人员工作分析")
public class UserWorkAnalysisVo {

    @ApiModelProperty("人员主键")
    private String userId;
    @ApiModelProperty("人员名称")
    private String userName;
    @ApiModelProperty("总完成任务数量")
    private Integer totalFinishNumber;
    @ApiModelProperty("总任务数量")
    private Integer totalNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("任务进度")
    private BigDecimal finishRate;

    @ApiModelProperty("维修完成任务数量")
    private Integer repairFinishNumber;
    @ApiModelProperty("维修任务数量")
    private Integer repairNumber;
    @ApiModelProperty("保养完成任务数量")
    private Integer mainFinishNumber;
    @ApiModelProperty("保养任务数量")
    private Integer mainNumber;
    @ApiModelProperty("巡检完成任务数量")
    private Integer inspectionFinishNumber;
    @ApiModelProperty("巡检任务数量")
    private Integer inspectionNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("故障停机损失")
    private BigDecimal faultStopLoss;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTTR[min]")
    private BigDecimal mttr;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("维修分析-MTBF[H]")
    private BigDecimal mtbf;
}