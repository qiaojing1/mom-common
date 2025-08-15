package com.lets.platform.model.collection.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

/**
 * 设备历史状态数据补偿 数据传输对象
 * @author: DING WEI
 * @date: 2024/1/17 14:09
 */
@Data
public class HistoryDataHandlerDto {

    private String startTime;

    private String endTime;

    /** 工序生产统计日报表 */
    private Collection<String> deviceIds;
    private LocalDate time;
}
