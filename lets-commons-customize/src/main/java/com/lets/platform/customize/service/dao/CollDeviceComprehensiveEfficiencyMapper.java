package com.lets.platform.customize.service.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.model.collection.entity.CollDeviceComprehensiveEfficiency;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lets.platform.model.tpm.entity.TpmAssetCalibrateOrder;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 设备综合效率表 Mapper 接口
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-05-27
 */
public interface CollDeviceComprehensiveEfficiencyMapper extends BaseMapper<CollDeviceComprehensiveEfficiency> {

    IPage<CollDeviceComprehensiveEfficiency> findPage(Page<Object> objectPage, @Param(Constants.WRAPPER) QueryWrapper<CollDeviceComprehensiveEfficiency> queryWrapper);
    IPage<CollDeviceComprehensiveEfficiency> findPageByDevice(Page<Object> objectPage, @Param(Constants.WRAPPER) QueryWrapper<CollDeviceComprehensiveEfficiency> queryWrapper);
}
