package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.model.collection.entity.CollDeviceWarnRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备报警记录 Mapper 接口
 * @author DING WEI
 * @since 2023-11-28
 */
public interface CollDeviceWarnRecordMapper extends BaseMapper<CollDeviceWarnRecord> {

    Integer findCount(@Param(Constants.WRAPPER) Wrapper<CollDeviceWarnRecord> queryWrapper);

    List<CollDeviceWarnRecord> getEndTimeIsNull();

    CollDeviceWarnRecord findNewestByDeviceId(@Param("deviceId") String deviceId);

    List<CollDeviceWarnRecord> selectAllMess(@Param("startTime") String startTime);
    IPage<CollDeviceWarnRecord> findWarnStatisticsPage(Page<CollDeviceWarnRecord> page,
                                                       @Param(Constants.WRAPPER) Wrapper<CollDeviceWarnRecord> queryWrapper);

    Integer replaceBatchWarnRecord(@Param("list") List<CollDeviceWarnRecord> list);

    Integer update(CollDeviceWarnRecord record);
    Integer updateDealTime(@Param("list") List<CollDeviceWarnRecord> list);
    Integer batUpdateEndInfo(@Param("list") List<CollDeviceWarnRecord> list);

}
