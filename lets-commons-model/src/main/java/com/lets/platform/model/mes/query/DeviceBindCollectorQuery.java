package com.lets.platform.model.mes.query;

import lombok.Data;

import java.util.Collection;

/**
 * HMI设备绑定采集器 查询对象
 * @author: DING WEI
 * @date: 2024/1/10 9:20
 */
@Data
public class DeviceBindCollectorQuery {

    private String hmiId;

    private Collection<String> deviceIds;

}
