package com.lets.platform.model.tpm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 员工点检分析
 * @author: zhangweiyan
 * @date: 2024/12/23 11:55
 */
@Data
@ApiModel("员工点检分析")
public class EmployeesInspectionItemsVo {

    @ApiModelProperty("明细id")
    private String id;

    @ApiModelProperty("人员名称")
    private String name;

    @ApiModelProperty("班组")
    private String teamsName;

    @ApiModelProperty("完成数量")
    private Integer finishCount;

    @ApiModelProperty("计划数量")
    private Integer scheduleCount;

    @ApiModelProperty("任务统计")
    private String dutySta;

    @ApiModelProperty("任务进度")
    private Integer taskProgress;

}
