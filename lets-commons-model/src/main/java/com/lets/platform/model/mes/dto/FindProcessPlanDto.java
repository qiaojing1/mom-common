package com.lets.platform.model.mes.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 查询工序计划
 * @author: DING WEI
 * @date: 2025/3/26 9:52
 */
@Data
public class FindProcessPlanDto {

    @ApiModelProperty("上面所有工序的不合格数量")
    private BigDecimal beforePoorNumber;

    @ApiModelProperty("第一道工序的报工数量")
    private BigDecimal firstProcessReportNumber;

    @ApiModelProperty("首道工序是否完工")
    private Boolean firstProcessComplete;

    @ApiModelProperty("首道工序最后一次汇报单审核时间")
    private LocalDateTime firstCanScanComplete;

}
