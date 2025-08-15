package com.lets.platform.model.common.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 历史加工参数
 * @author: DING WEI
 * @date: 2024/7/22 15:52
 */
@Data
public class HistoryProcessStatisticsDto {

    private Map<String, List<List<String>>> excelData;
    private Map<String, List<List<String>>> head;

}
