package com.lets.platform.model.mes.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * 工序生产统计报表 查询对象
 * @author: DING WEI
 * @date: 2024/11/11 11:57
 */
@Data
@ApiModel("工序生产统计报表 查询对象")
public class ProcessProduceStatisticsQuery {

    @ApiModelProperty("生产日期")
    private List<LocalDateTime> orderTime;
    private LocalDateTime startOrderTime;
    private LocalDateTime endOrderTime;
    private List<String> betweenDays;
    private String daySubSelect;

    @ApiModelProperty("工序主键")
    private Collection<String> processIds;

    @ApiModelProperty("设备主键")
    private String deviceId;

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料规格")
    private String materialSpecs;

    @ApiModelProperty("操作员")
    private String operatorId;

    @ApiModelProperty(hidden = true)
    private Collection<String> deviceIds;
    @ApiModelProperty(hidden = true)
    private Collection<String> queryDeviceIds;

    @ApiModelProperty("当前页码")
    private int current;
    @ApiModelProperty("页码大小")
    private int size;
    @ApiModelProperty(hidden = true)
    private String tenancyId;
}
