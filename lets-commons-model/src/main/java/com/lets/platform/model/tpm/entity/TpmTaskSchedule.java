package com.lets.platform.model.tpm.entity;

/**
 * @Classname TaskScheduleModel
 * @Description TODO
 * @Date 2024/11/11 16:14
 * @Created by qiaojing
 */
public class TpmTaskSchedule {


    /**
     * 所选作业类型:
     * 1  -> 每天
     * 2  -> 每月
     * 3  -> 每周
     * 4  -> 间隔（每隔2个小时，每隔30分钟）
     * 5  -> 单次
     * 6  -> 每年
     */
    Integer jobType;

    /**一周的哪几天*/
    Integer[] dayOfWeeks;

    /**一个月的哪几天*/
    Integer[] dayOfMonths;

    /**秒  */
    Integer second;

    /**分  */
    Integer minute;

    /**时  */
    Integer hour;

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
    Integer[] months;

    public Integer[] getMonths() {
        return months;
    }

    public void setMonths(Integer[] months) {
        this.months = months;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public Integer[] getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDayOfWeeks(Integer[] dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public Integer[] getDayOfMonths() {
        return dayOfMonths;
    }

    public void setDayOfMonths(Integer[] dayOfMonths) {
        this.dayOfMonths = dayOfMonths;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}

