package com.lets.platform.model.mes.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 设备运行参数 点位 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 18:23
 */
@Data
@ApiModel("设备运行参数 点位 展示对象")
public class DeviceRunParamItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("工艺参数名称")
    private String parametersName;

    @ApiModelProperty("工艺参数-主键")
    private String itemId;

    @ApiModelProperty("点位-名称")
    private String itemFieldName;

    @ApiModelProperty("当前运行值")
    private String currentValue;

    @ApiModelProperty("采集时间")
    private String collectionTime;

    @ApiModelProperty("是否正常")
    private String isNormal;

    @ApiModelProperty("标准值")
    private BigDecimal standardValue;
    @ApiModelProperty("最大值")
    private BigDecimal maxValue;
    @ApiModelProperty("最小值")
    private BigDecimal minValue;

}
