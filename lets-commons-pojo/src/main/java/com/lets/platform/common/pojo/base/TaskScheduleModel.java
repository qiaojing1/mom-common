package com.lets.platform.common.pojo.base;

import lombok.Data;

import java.util.List;

/**
 * TaskScheduleModel
 * @author DING WEI
 * @date 12/28/21 3:07 PM
 * @version 1.0
 */
@Data
public class TaskScheduleModel {

    /**
     * 所选作业类型:
     * 1  -> 每天
     * 2  -> 每周
     * 3  -> 每月
     * 4  -> 间隔（每隔2个小时，每隔30分钟）
     * 5  -> 单次
     */
    Integer jobType;

    /** 一天的哪几小时 */
    List<Integer> hourOfDays;

    /**一周的哪几天*/
    List<Integer> dayOfWeeks;

    /**一个月的哪几天*/
    List<Integer> dayOfMonths;

    /**秒  */
    Integer second;

    /**分  */
    Integer minute;

    /**日  */
    Integer day;

    /**月  */
    Integer month;

    /**年  */
    Integer year;
    /**计划开始时间  */
    String startTime;
    /**计划结束时间  */
    String endTime;
    /**哪几个月  */
    List<Integer> months;

    private Boolean isShowSecondMinute = Boolean.TRUE;

}

