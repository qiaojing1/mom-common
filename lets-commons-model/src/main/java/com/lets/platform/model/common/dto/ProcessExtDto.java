package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 工序定义Dto
 */
@Data
@ApiModel("工序定义入参(第三方同步数据)")
public class ProcessExtDto {

    @NotBlank(message = "ProcessExtDto.code")
    @ApiModelProperty(value = "工序编码", required = true)
    private String code;

    @NotBlank(message = "ProcessExtDto.name")
    @ApiModelProperty(value = "工序名称", required = true)
    private String name;

    @ApiModelProperty(value = "准备时长")
    private String readyDuration;

    @ApiModelProperty(value = "标准工时")
    private String standardDuration;

    @ApiModelProperty(value = "报工方式")
    private String reportWay;

    @ApiModelProperty(value = "质检标准")
    private String checkStandard;

}
