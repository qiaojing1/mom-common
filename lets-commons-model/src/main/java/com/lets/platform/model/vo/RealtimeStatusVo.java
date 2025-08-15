package com.lets.platform.model.collection.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 设备实时状态统计
 * @author: DING WEI
 * @date: 2024/1/4 19:55
 */
@Data
@ApiModel("设备实时状态统计")
public class RealtimeStatusVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("小类编码")
    private String smallStatusCode;
    @ApiModelProperty("小类名称")
    private String smallStatusName;
    @ApiModelProperty("小类颜色")
    private String smallStatusColor;

    @ApiModelProperty("状态的设备数量")
    private Integer number;

}
