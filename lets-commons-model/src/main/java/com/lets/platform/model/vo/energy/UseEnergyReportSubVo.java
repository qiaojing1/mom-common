package com.lets.platform.model.collection.vo.energy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 用(水、电、气)报表 展示明细对象
 * @author DING WEI
 * @date 2025/1/2 11:09
 * @version 1.0
 */
@Data
@ApiModel("用(水、电、气)报表 展示明细对象")
public class UseEnergyReportSubVo {

    @ApiModelProperty("表头")
    private String title;
    @ApiModelProperty("用量")
    private BigDecimal total;

}
