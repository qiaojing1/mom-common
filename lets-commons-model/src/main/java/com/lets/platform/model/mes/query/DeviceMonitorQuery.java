package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 设备监控 查询对象
 * @author: DING WEI
 * @date: 2024/1/9 18:23
 */
@Data
@ApiModel("设备监控 查询对象")
public class DeviceMonitorQuery {

    @ApiModelProperty("当前设备主键")
    private String deviceId;

    @NotBlank(message = "PrepareQuery.hmiId")
    @ApiModelProperty("当前HMI主键")
    private String hmiId;

}
