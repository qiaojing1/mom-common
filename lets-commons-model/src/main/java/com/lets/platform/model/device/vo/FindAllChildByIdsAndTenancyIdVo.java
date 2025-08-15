package com.lets.platform.model.device.vo;

import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * @description: 查询结果
 * @author: DING WEI
 * @date: 2022/4/24 14:06
 */
@Data
public class FindAllChildByIdsAndTenancyIdVo {

    private Map<String, Set<String>> childIdsMap;

    private Map<String, DeviceFactoryModeVo> keyModeInfoMap;

}
