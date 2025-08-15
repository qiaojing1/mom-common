package com.lets.platform.model.common.vo;

import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.common.entity.CommonProductionUnit;
import lombok.Data;

import java.util.Map;

/**
 * 生产单元、设备
 * @author: DING WEI
 * @date: 2024/12/17 14:14
 */
@Data
public class FactoryModeAndDeviceVo {

    private Map<String, CommonProductionUnit> factoryModeMap;

    private Map<String, CommonDevice> deviceMap;

}
