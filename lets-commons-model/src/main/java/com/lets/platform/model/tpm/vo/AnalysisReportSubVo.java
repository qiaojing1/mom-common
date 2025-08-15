package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 分析
 * @author: DING WEI
 * @date: 2024/12/17 11:55
 */
@Data
@ApiModel("分析")
public class AnalysisReportSubVo {

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("总时长(H)、总次数")
    private String total;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("占比")
    private BigDecimal proportion;
    @ApiModelProperty("环比")
    private String rate;

}
