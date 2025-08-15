package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.model.collection.entity.CollDeviceStatusRealtime;
import com.lets.platform.model.collection.vo.RealtimeStatusVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * 设备实时状态表 Mapper 接口
 * @author DING WEI
 * @since 2023-11-27
 */
@Mapper
public interface CollDeviceStatusRealtimeMapper extends BaseMapper<CollDeviceStatusRealtime> {

    CollDeviceStatusRealtime findById(@Param("id") String id);

    IPage<CollDeviceStatusRealtime> findPage(Page<CollDeviceStatusRealtime> page,
                                             @Param(Constants.WRAPPER) Wrapper<CollDeviceStatusRealtime> queryWrapper);

    void realTimeSave(@Param("list") List<CollDeviceStatusRealtime> list);

    List<RealtimeStatusVo> findRealtimeStatus(@Param("tenancyId") String tenancyId,@Param("deviceIds") Set<String> deviceIds);
}
