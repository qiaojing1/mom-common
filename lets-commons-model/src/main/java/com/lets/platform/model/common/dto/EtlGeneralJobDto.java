package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 生成任务 数据传输对象
 * @author: DING WEI
 * @date: 2022/7/6 14:26
 */
@Data
@ApiModel("生成任务 数据传输对象")
public class EtlGeneralJobDto {

    @NotBlank(message = "etlGeneralJob.designId")
    @ApiModelProperty("设计资源主键")
    private String designId;

    @NotBlank(message = "etlGeneralJob.type")
    @ApiModelProperty("运行类型[1点击运行,2定时运行]")
    private String type;

    @ApiModelProperty("定时运行的CRON表达式")
    private String cron;

    @ApiModelProperty("是否覆盖")
    private Boolean isCover;

}
