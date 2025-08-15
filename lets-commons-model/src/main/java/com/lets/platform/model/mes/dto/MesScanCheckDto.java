package com.lets.platform.model.mes.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 工位机 扫码 数据传输对象
 * @author: DING WEI
 * @date: 2024/1/29 11:58
 */
@Data
@ApiModel("工位机 扫码 数据传输对象")
public class MesScanCheckDto {

    @NotBlank(message = "MesDispatchDetailQuery.hmiCode")
    @ApiModelProperty("HMI主键")
    private String hmiId;

    @NotBlank(message = "MesScanCheckDto.scanContent")
    @ApiModelProperty("扫描内容")
    private String scanContent;

}
