package com.lets.platform.model.mes.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 工单报工单数量
 * @author: DING WEI
 * @date: 2025/5/26 11:14
 */
@Data
public class ProduceReportNumberVo {

    @ApiModelProperty("总合格数量")
    private BigDecimal totalRichNumber;

    @ApiModelProperty("总报工数量=合格数量+不良数量")
    private BigDecimal totalReportNumber;

}
