package com.lets.platform.model.tpm.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

/**
 * 分析报表 查询对象
 * @author: DING WEI
 * @date: 2024/12/17 11:30
 */
@Data
@ApiModel("分析报表 查询对象")
public class AnalysisReportQuery {

    @ApiModelProperty(value = "实际开始日期", hidden = true)
    private LocalDate actualStartDate;
    @ApiModelProperty("开始日期")
    private LocalDate startDate;
    @ApiModelProperty("结束日期")
    private LocalDate endDate;

    @ApiModelProperty("生产单元")
    private Collection<String> factoryModeIds;

    @ApiModelProperty("设备主键")
    private Collection<String> deviceIds;

    @ApiModelProperty("菜单编码")
    private String menuCode;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty("页码")
    private Integer current;
    @ApiModelProperty("大小")
    private Integer size;

}
