package com.lets.platform.model.common.query;

import cn.hutool.core.date.DateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

@Data
@ApiModel("历史加工参数查询对象")
public class HistoryProcessStatisticsQuery {

    @ApiModelProperty(value = "采集器id", required = true)
    private String collectorId;

    @ApiModelProperty(value = "设备id", required = true)
    private String deviceId;

    @ApiModelProperty(hidden = true, required = false)
    private String tenancyId;

    @ApiModelProperty(value = "起始时间", required = true)
    private DateTime startDay;
    private Long startDayLong;

    @ApiModelProperty(value = "截止时间", required = true)
    private DateTime endDay;
    private Long endDayLong;

    @ApiModelProperty("是否排除结束时刻的数据[01]")
    private Integer excludeEndTime;
    @ApiModelProperty("匹配点位值")
    private String equalsValue;

    @ApiModelProperty(value = "需要查询的参数名称，将数据项的sourceField使用','拼接", required = true)
    private Map<String, String> itemKeys;

    @ApiModelProperty("数据频率 1为5秒钟一条数据 2为10秒钟一条数据")
    private int rate;

    private int maxSize = 10000;

    @ApiModelProperty("当前页")
    private int current = 1;

    @ApiModelProperty("当前页面大小")
    private int size = 200;

    @ApiModelProperty("排序字段")
    private String orderBy;

    @ApiModelProperty("排序方式,[DESC|ASC]")
    private String sort;

    @ApiModelProperty("是否去重[true、false]默认为false")
    private Boolean isDuplicate = Boolean.FALSE;
}
