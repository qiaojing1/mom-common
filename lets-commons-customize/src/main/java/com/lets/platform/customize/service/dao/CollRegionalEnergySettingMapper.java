package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lets.platform.model.collection.entity.CollRegionalEnergySetting;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * 计算公式 Mapper 接口
 * @author zhangweiyan
 * @since 2025-02-17
 */
public interface CollRegionalEnergySettingMapper extends BaseMapper<CollRegionalEnergySetting> {

    CollRegionalEnergySetting getByIdIgnoreHtml(@Param("id") String id);

    List<CollRegionalEnergySetting> getByTenancyIdIgnoreHtml(@Param("tenancyId") String tenancyId);

}
