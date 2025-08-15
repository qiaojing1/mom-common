package com.service;

import com.lets.platform.model.uc.entity.InitTenancyConfigDto;

/**
 * 初始化租户预置数据
 * @author: DING WEI
 * @date: 2023/7/17 16:23
 */
public interface Init4TenancyService {

    Boolean presetData(InitTenancyConfigDto configDto);

}
