package com.lets.platform.model.mes.vo;

import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.mes.entity.MesProcessReportDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 任务执行 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 16:55
 */
@Data
@ApiModel("任务执行 展示对象")
public class TaskExecuteVo {

    @ApiModelProperty("HMI配置")
    private CommonHmiSettings hmiSettings;

    @ApiModelProperty("开工时长")
    private String workDuration;

    @ApiModelProperty("检验类型[1自检,2PQC]")
    private String inspectType;
    @ApiModelProperty("工序检验[0否1是]")
    private Integer processInspect;
    @ApiModelProperty("是否需要检验")
    private Boolean needInspect;
    @ApiModelProperty("工序计划明细主键")
    private String processPlanDetailId;

    @ApiModelProperty("汇报记录列表")
    private List<MesProcessReportDetail> reportList;

    @ApiModelProperty("是否自动计数 true、false")
    private Boolean deviceAutoCount;

}
