package com.lets.platform.model.device.domain;

import lombok.Data;

/**
 * 查询全部设备的 资产状态已联网状态以及相关数量
 *
 * @version 1.0
 * @ClassName DeviceSimpleVo
 * @author: DING WEI
 * @create: 2021/05/14 15:43
 **/
@Data
public class DeviceSimpleDo {

    private String id;

    private String assetsStatus;

    private String internetStatus;

}
