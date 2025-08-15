package com.lets.platform.model.mes.vo;

import com.lets.platform.model.common.entity.CommonDeviceCollector;
import com.lets.platform.model.mes.entity.AutoLineModeling;
import lombok.Data;

import java.util.List;

/**
 * 设备锁机-自动线-建模-数据
 * @author: DING WEI
 * @date: 2024/7/4 11:30
 */
@Data
public class UnlockAutoLineModelingVo {

    private List<CommonDeviceCollector> deviceCollectorList;

    private AutoLineModeling autoLineModeling;
}
