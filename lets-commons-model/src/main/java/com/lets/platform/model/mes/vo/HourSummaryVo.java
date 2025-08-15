package com.lets.platform.model.mes.vo;

import lombok.Data;

import java.util.Map;

/**
 * @ClassName HourSummaryVo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/7/19
 */
@Data
public class HourSummaryVo {
    private String reporter;
    private String orgName;
    private String total;
    private Map<String, Integer> monthData;

}
