package com.lets.platform.model.mes.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 派工单操作记录 撤销数据传输对象
 * @author: DING WEI
 * @date: 2024/1/22 13:56
 */
@Data
@ApiModel("派工单操作记录 撤销数据传输对象")
public class DispatchOperateRevokeDto {

    @NotBlank(message = "PrepareQuery.dispatchId")
    @ApiModelProperty("工序任务主键")
    private String dispatchId;

    @NotBlank(message = "PrepareQuery.hmiId")
    @ApiModelProperty("HMI主键")
    private String hmiId;

}
