package com.lets.platform.common.pojo.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 日
 * @author: DING WEI
 * @date: 9/23/21 10:30 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Day {

    /** 年 */
    private Integer year;
    /** 季度 */
    private Integer quarter;
    /** 月 */
    private Integer month;
    /** 日 */
    private Integer day;
    /** yyyyMMdd格式化 */
    private String dayTimeFormat;
    /** 是否工作日 */
    private String workDay;
    /** 节假日 */
    private String holidayId;
    /** 周 */
    private Integer week;

}
