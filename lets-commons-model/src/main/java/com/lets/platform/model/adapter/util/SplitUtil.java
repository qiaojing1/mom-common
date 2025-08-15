package com.lets.platform.model.adapter.util;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.common.pojo.enums.MethodTypeEnum;
import com.lets.platform.common.pojo.util.IdUtil;
import com.lets.platform.model.adapter.enums.HistoryStatusDataSourceEnum;
import com.lets.platform.model.base.util.LdtUtils;
import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 数据分割
 *
 * @author: DING WEI
 * @date: 2023/12/16 12:16
 */
@Slf4j
public class SplitUtil {

    public static DateTimeFormatter formatTZ24 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    public static DateTimeFormatter formatTZ20 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
    public static DateTimeFormatter formatTZ23 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS'Z'");
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static DateTimeFormatter formatterSlash = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static DateTimeFormatter formatterSSS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
    public static DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static DateTimeFormatter formatterDate2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public static DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static DateTimeFormatter yyyyMM = DateTimeFormatter.ofPattern("yyyyMM");
    public static DateTimeFormatter yyyyMM_2 = DateTimeFormatter.ofPattern("yyyy/MM");
    public static DateTimeFormatter yyyyMM_3 = DateTimeFormatter.ofPattern("MM/dd");
    public static DateTimeFormatter yyyyMM_4 = DateTimeFormatter.ofPattern("yyyy年MM月");
    public static DateTimeFormatter yyyyMM_5 = DateTimeFormatter.ofPattern("MM-dd");
    public static DateTimeFormatter HHmmss = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static DateTimeFormatter HHmmss_2 = DateTimeFormatter.ofPattern("HHmmss");
    public static DateTimeFormatter MMdd = DateTimeFormatter.ofPattern("MM月dd日");
    public static ZoneOffset zoneOffset = ZoneOffset.of("+8");
    public static ZoneId shangHai = ZoneId.of("Asia/Shanghai");
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 分割数据到每一天
     *
     * @param oldStatus  上次状态信息
     * @param start      状态开始时间
     * @param end        状态结束时间
     * @param now4Server 服务器当前时间
     * @return
     * @author DING WEI
     * @date 2023/11/27 14:05
     * @version 1.0
     */
    public static List<CollDeviceStatusHistory> split2EveryDay(CollDeviceStatusHistory oldStatus, LocalDateTime start, LocalDateTime end,
                                                               LocalDateTime now4Server, HistoryStatusDataSourceEnum dataSourceEnum, Integer time, String sourceStatus, String targetStatus,
                                                               Object o) {
        List<CollDeviceStatusHistory> everyDayList = new ArrayList<>();
        if (Objects.nonNull(oldStatus) && Objects.nonNull(start) && Objects.nonNull(end) && end.isAfter(start)) {
            String tenancyId = oldStatus.getTenancyId();
            long between = ChronoUnit.DAYS.between(start.toLocalDate(), end.toLocalDate());
            if (between > 0) {
                Duration duration = Duration.between(Objects.nonNull(o) ? (LocalDateTime) o : end, end);
                if (time != 0 && StringUtils.isNotEmpty(sourceStatus) && StringUtils.isNotEmpty(targetStatus) && Objects.nonNull(o) && duration.getSeconds() <= time) {  //如果特殊处理的设备要等配置的时间到了再处理
                    Long endMill = LdtUtils.ldtToMill(end);
                    Long startMill = LdtUtils.ldtToMill(start);
                    Long dateTime = endMill - startMill;
                    if (dateTime > 0L) {
                        CollDeviceStatusHistory historyTime = new CollDeviceStatusHistory();
                        BeanUtils.copyProperties(oldStatus, historyTime);
                        historyTime.setTypeEnum(MethodTypeEnum.UPDATE);
                        historyTime.setStartTime(start);
                        historyTime.setEndTime(end);
                        historyTime.setDateTime(dateTime);
                        historyTime.setTimeFormat(Integer.parseInt(start.format(yyyyMMdd)));
                        historyTime.setCreateTime(now4Server);
                        historyTime.setUpdateTime(now4Server);
                        historyTime.setCreateUser("1001");
                        historyTime.setCreateUserName("超级管理员");
                        historyTime.setUpdateUser("1001");
                        historyTime.setUpdateUserName("超级管理员");
                        historyTime.setTenancyId(tenancyId);
                        historyTime.setDataSource(dataSourceEnum.getValue());
                        everyDayList.add(historyTime);
                    }
                } else {
                    for (long i = 0; i < between + 1; i++) {
                        LocalDateTime today = start.plusDays(i);
                        LocalDateTime tomorrow = start.plusDays(i + 1);
                        LocalDateTime startTime;
                        LocalDateTime endTime;
                        if (i == 0) {
                            startTime = LocalDateTime.of(today.toLocalDate(), start.toLocalTime());
                        } else {
                            startTime = LocalDateTime.of(today.toLocalDate(), LocalTime.MIN);
                        }
                        if (i == between) {
                            endTime = LocalDateTime.of(today.toLocalDate(), end.toLocalTime());
                        }else {
                            endTime = LocalDateTime.of(tomorrow.toLocalDate(), LocalTime.MIN);
                        }
                        Long endTimeMilli = LdtUtils.ldtToMill(endTime);
                        Long startTimeMilli = LdtUtils.ldtToMill(startTime);
                        Long dateTime = endTimeMilli - startTimeMilli;
                        if (dateTime > 0) {
                            CollDeviceStatusHistory historyTime = new CollDeviceStatusHistory();
                            BeanUtils.copyProperties(oldStatus, historyTime);
                            historyTime.setTypeEnum(MethodTypeEnum.UPDATE);
                            if (CollUtil.isNotEmpty(everyDayList)) {
                                historyTime.setId(IdUtil.getStrId());
                                historyTime.setTypeEnum(MethodTypeEnum.SAVE);
                            }
                            historyTime.setStartTime(startTime);
                            historyTime.setEndTime(endTime);
                            historyTime.setDateTime(dateTime);
                            historyTime.setTimeFormat(Integer.parseInt(startTime.format(yyyyMMdd)));
                            historyTime.setCreateTime(now4Server);
                            historyTime.setUpdateTime(now4Server);
                            historyTime.setCreateUser("1001");
                            historyTime.setCreateUserName("超级管理员");
                            historyTime.setUpdateUser("1001");
                            historyTime.setUpdateUserName("超级管理员");
                            historyTime.setTenancyId(tenancyId);
                            historyTime.setDataSource(dataSourceEnum.getValue());
                            everyDayList.add(historyTime);
                        }
                    }
                }

            } else {
                Long endMill = LdtUtils.ldtToMill(end);
                Long startMill = LdtUtils.ldtToMill(start);
                Long dateTime = endMill - startMill;
                if (dateTime > 0L) {
                    CollDeviceStatusHistory historyTime = new CollDeviceStatusHistory();
                    BeanUtils.copyProperties(oldStatus, historyTime);
                    historyTime.setTypeEnum(MethodTypeEnum.UPDATE);
                    historyTime.setStartTime(start);
                    historyTime.setEndTime(end);
                    historyTime.setDateTime(dateTime);
                    historyTime.setTimeFormat(Integer.parseInt(start.format(yyyyMMdd)));
                    historyTime.setCreateTime(now4Server);
                    historyTime.setUpdateTime(now4Server);
                    historyTime.setCreateUser("1001");
                    historyTime.setCreateUserName("超级管理员");
                    historyTime.setUpdateUser("1001");
                    historyTime.setUpdateUserName("超级管理员");
                    historyTime.setTenancyId(tenancyId);
                    historyTime.setDataSource(dataSourceEnum.getValue());
                    everyDayList.add(historyTime);
                }
            }
        }
        return everyDayList;
    }

    public static void main(String[] args) {
        CollDeviceStatusHistory old = new CollDeviceStatusHistory();
        old.setTenancyId("00000");
        LocalDateTime startTime = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        LocalDateTime now4Server = LocalDateTime.of(2023, 1, 2, 0, 0, 0);
        Long aLong = LdtUtils.ldtToMill(now4Server);
        LocalDateTime endTime = LdtUtils.millToLdt(aLong);
        List<CollDeviceStatusHistory> split2EveryDay = split2EveryDay(old, startTime, endTime, now4Server, HistoryStatusDataSourceEnum.OFF_LINE_SYS_INNER, 0, "", "", null);
        for (CollDeviceStatusHistory history : split2EveryDay) {
            System.out.println("start:" + history.getStartTime() + "   end:" + history.getEndTime());
        }

    }

}
