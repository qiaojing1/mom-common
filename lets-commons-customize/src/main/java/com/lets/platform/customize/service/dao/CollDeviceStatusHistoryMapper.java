package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lets.platform.model.collection.dto.HistoryDataHandlerDto;
import com.lets.platform.model.collection.dto.RepairDurationDto;
import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import com.lets.platform.model.collection.query.CollUsingRateQuery;
import com.lets.platform.model.common.entity.CommonDevice;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * 设备历史状态表 Mapper 接口
 * @author DING WEI
 * @since 2023-11-27
 */
public interface CollDeviceStatusHistoryMapper extends BaseMapper<CollDeviceStatusHistory> {

    void historyTimeSave(@Param("list") List<CollDeviceStatusHistory> list);

    void batSave(@Param("list") List<CollDeviceStatusHistory> list);
    void batUpdate(@Param("list") List<CollDeviceStatusHistory> list);

    List<CollDeviceStatusHistory> getAllHistory();
    List<CommonDevice> getAllStartLineTimeDevice();

    /**
     * 获取指定时间范围的数据
     * @param query
     * @return
     */
    List<CollDeviceStatusHistory> getSpecifiedRange(CollUsingRateQuery query);

    List<CollDeviceStatusHistory> findNotSplitData();
    List<CollDeviceStatusHistory> findEndTimeIsNullNotNewest(@Param("query") HistoryDataHandlerDto query);
    Integer updateEndTimeIsNullNotNewest(@Param("list") List<CollDeviceStatusHistory> list);

    List<CollDeviceStatusHistory> findLastLtTime(@Param("timeFormat") Integer timeFormat,
                                                 @Param("deviceIds") Collection<String> deviceIds);

    List<CollDeviceStatusHistory> find4FaultRepairDuration(@Param("query") RepairDurationDto durationDto);

    CollDeviceStatusHistory findFirstStatusByDeviceId(@Param("deviceId") String deviceId);

    List<CollDeviceStatusHistory> queryMoreThan24Hour(@Param("start") Integer start, @Param("end") Integer end);
}
