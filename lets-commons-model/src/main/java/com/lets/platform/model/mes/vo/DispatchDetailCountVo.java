package com.lets.platform.model.mes.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 派工-明细 状态数量统计
 * @author DING WEI
 * @date 2024/1/5 16:46
 * @version 1.0
 */
@Data
@ApiModel(value = "派工-明细 状态数量统计")
public class DispatchDetailCountVo {

    @ApiModelProperty("状态")
    private Integer status;
    @ApiModelProperty("状态名称")
    private String statusName;
    @ApiModelProperty("数量")
    private Integer number;
}
