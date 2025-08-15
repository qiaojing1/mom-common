package com.lets.platform.model.collection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 查询时序库参数
 * @author: DING WEI
 * @date: 2024/5/9 13:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryInfluxDbDto {

    private String itemKey;
    private List<String> itemKeys;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String deviceId;
    private String collectorId;

    public QueryInfluxDbDto(String itemKey, LocalDateTime startTime, LocalDateTime endTime, String deviceId) {
        this.itemKey = itemKey;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deviceId = deviceId;
    }
    public QueryInfluxDbDto(String itemKey, LocalDateTime startTime, LocalDateTime endTime, String deviceId,String collectorId) {
        this.itemKey = itemKey;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deviceId = deviceId;
        this.collectorId = collectorId;
    }
}
