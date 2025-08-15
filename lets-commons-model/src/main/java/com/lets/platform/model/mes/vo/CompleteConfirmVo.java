package com.lets.platform.model.mes.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 完工确认 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 16:55
 */
@Data
@ApiModel("完工确认 展示对象")
public class CompleteConfirmVo {

    @ApiModelProperty("开工时长")
    private String workDuration;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("报工总数量")
    private BigDecimal totalReportNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("当前结存数量")
    private BigDecimal currentBalanceNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("已入库数量")
    private BigDecimal stockInEdNumber;

    @ApiModelProperty("单位名称")
    private String processUnitName;
}
