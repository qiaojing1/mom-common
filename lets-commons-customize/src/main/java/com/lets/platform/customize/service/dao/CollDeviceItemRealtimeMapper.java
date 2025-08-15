package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lets.platform.model.collection.entity.CollDeviceItemRealtime;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备数据项实时点位 Mapper 接口
 * @author DING WEI
 * @since 2023-11-27
 */
public interface CollDeviceItemRealtimeMapper extends BaseMapper<CollDeviceItemRealtime> {

    Integer replaceItemValue4OldParam(@Param("list") List<CollDeviceItemRealtime> list);

    void batSave(@Param("list") List<CollDeviceItemRealtime> list);
    void batUpdate(@Param("list") List<CollDeviceItemRealtime> list);
}
