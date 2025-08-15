package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceHistoryStatusClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.adapter.entity.AddSplitDataDto;
import com.lets.platform.model.collection.dto.HistoryDataHandlerDto;
import com.lets.platform.model.collection.dto.RepairDurationDto;
import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import com.lets.platform.model.collection.vo.CollDeviceHistoryStatusSummaryVo;
import com.lets.platform.model.common.entity.CommonShiftTimes;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * 设备历史状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection",fallback = CollDeviceHistoryStatusClientFallback.class)
public interface CollDeviceHistoryStatusClient {

    @GetMapping("/collDeviceStatusHistory/findNotSplitData")
    RespMsgBean<List<CollDeviceStatusHistory>> findNotSplitData();

    @PostMapping("/collDeviceStatusHistory/addSplitData")
    RespMsgBean<Integer> addSplitData(@RequestBody AddSplitDataDto addSplitDataDto);

    @PostMapping("/collDeviceStatusHistory/findEndTimeIsNullNotNewest")
    RespMsgBean<List<CollDeviceStatusHistory>> findEndTimeIsNullNotNewest(@RequestBody HistoryDataHandlerDto handlerDto);
    @PostMapping("/collDeviceStatusHistory/updateEndTimeIsNullNotNewest")
    RespMsgBean<Integer> updateEndTimeIsNullNotNewest(@RequestBody AddSplitDataDto addSplitDataDto);

    @PostMapping("/collDeviceStatusHistory/findByTimeFormatAndDeviceIds")
    RespMsgBean<Map<Integer, Map<String, List<CollDeviceStatusHistory>>>> findByTimeFormatAndDeviceIds(@RequestBody HistoryDataHandlerDto handlerDto);

    @PostMapping("/collDeviceStatusHistory/find4FaultRepairDuration")
    RespMsgBean<Map<String, List<CollDeviceStatusHistory>>> find4FaultRepairDuration(@RequestBody RepairDurationDto durationDto);

    @PostMapping("/collDeviceStatusHistory/findDevicesWhichNotHasRunningHis")
    RespMsgBean<List<CollDeviceStatusHistory>> findDevicesWhichNotHasRunningHis(@RequestParam("startTime") LocalDateTime beginOfDay,
                                                                                @RequestParam("endTime") LocalDateTime todayEndTime);

    @PostMapping("/collDeviceStatusHistory/findDevicesWithTargetStatus")
    RespMsgBean<List<CollDeviceStatusHistory>> findDevicesWithTargetStatus(@RequestParam("startTime") LocalDateTime beginOfDay,
                                                                           @RequestParam("endTime") LocalDateTime todayEndTime,
                                                                           @RequestParam("statusCode") String statusCode,
                                                                           @RequestBody List<String> deviceIds);

    @ApiOperation("根据班次统计设备状态时长")
    @PostMapping("/collDeviceStatusHistory/findByHistoryStatusByShif")
    RespMsgBean<Map<String,List<CollDeviceHistoryStatusSummaryVo>>> findByHistoryStatusByShif(@RequestParam("date")  String date, @RequestBody Map<String, List<CommonShiftTimes>> shiftTimeMap);

    @GetMapping("/collDeviceStatusHistory/findLastEndTimeByDate")
    RespMsgBean<CollDeviceStatusHistory> findLastEndTimeByDate(@RequestParam("date")  String date, @RequestParam("tenancyId") String tenancyId);

    @ApiOperation("根据班次时间统计设备状态时长")
    @GetMapping("/collDeviceStatusHistory/findByHistoryStatusByShifTime")
    RespMsgBean<Map<String,List<CollDeviceHistoryStatusSummaryVo>>> findByHistoryStatusByShifTime(@RequestParam("startTime") LocalDateTime startTime,
                                                                                                  @RequestParam("endTime") LocalDateTime endTime,
                                                                                                  @RequestParam("tenancyId") String tenancyId,
                                                                                                  @RequestParam("shiftId") String shiftId);

}
