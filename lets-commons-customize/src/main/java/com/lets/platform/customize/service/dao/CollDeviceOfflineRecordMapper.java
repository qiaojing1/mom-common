package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lets.platform.model.collection.entity.CollDeviceOfflineRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备异常掉线记录 Mapper 接口
 * @author DING WEI
 * @since 2023-11-27
 */
public interface CollDeviceOfflineRecordMapper extends BaseMapper<CollDeviceOfflineRecord> {

    List<CollDeviceOfflineRecord> findEndTimeIsNull();
    void replaceBatchOffline(@Param("list") List<CollDeviceOfflineRecord> list);

}
