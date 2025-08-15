package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollDeviceHistoryStatusClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.adapter.entity.AddSplitDataDto;
import com.lets.platform.model.collection.dto.HistoryDataHandlerDto;
import com.lets.platform.model.collection.dto.RepairDurationDto;
import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import com.lets.platform.model.collection.vo.CollDeviceHistoryStatusSummaryVo;
import com.lets.platform.model.common.entity.CommonShiftTimes;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 设备历史状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class CollDeviceHistoryStatusClientFallback extends BaseController implements CollDeviceHistoryStatusClient {

    public RespMsgBean<List<CollDeviceStatusHistory>> findNotSplitData() {
        return success(SUCCESS);
    }

    public RespMsgBean<Integer> addSplitData(@RequestBody AddSplitDataDto addSplitDataDto) {
        return success(SUCCESS);
    }

    public RespMsgBean<List<CollDeviceStatusHistory>> findEndTimeIsNullNotNewest(@RequestBody HistoryDataHandlerDto handlerDto) {
        return success(SUCCESS);
    }
    public RespMsgBean<Integer> updateEndTimeIsNullNotNewest(@RequestBody AddSplitDataDto addSplitDataDto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<Integer, Map<String, List<CollDeviceStatusHistory>>>> findByTimeFormatAndDeviceIds(HistoryDataHandlerDto handlerDto) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<CollDeviceStatusHistory>>> find4FaultRepairDuration(RepairDurationDto durationDto) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<CollDeviceStatusHistory>> findDevicesWhichNotHasRunningHis(LocalDateTime beginOfDay, LocalDateTime todayEndTime) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<CollDeviceStatusHistory>> findDevicesWithTargetStatus(@RequestParam("startTime") LocalDateTime beginOfDay,
                                                                           @RequestParam("endTime") LocalDateTime todayEndTime,
                                                                           @RequestParam("statusCode") String statusCode,
                                                                           @RequestBody List<String> deviceIds) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, List<CollDeviceHistoryStatusSummaryVo>>> findByHistoryStatusByShif(String date, Map<String, List<CommonShiftTimes>> shiftTimeMap) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<CollDeviceStatusHistory> findLastEndTimeByDate(String date, String tenancyId) {
        return success(FIND_SUCCESS, new CollDeviceStatusHistory());
    }

    @Override
    public RespMsgBean<Map<String, List<CollDeviceHistoryStatusSummaryVo>>> findByHistoryStatusByShifTime(LocalDateTime startTime, LocalDateTime endTime,String tenancyId,String shiftId) {
        return success(FIND_SUCCESS, new HashMap<>());
    }
}
