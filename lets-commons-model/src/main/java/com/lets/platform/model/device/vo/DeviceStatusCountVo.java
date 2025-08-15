package com.lets.platform.model.device.vo;

import lombok.Data;

import java.util.List;

/**
 * 查询全部设备的 资产状态已联网状态以及相关数量
 *
 * @version 1.0
 * @ClassName DeviceSimpleVo
 * @author: DING WEI
 * @create: 2021/05/14 15:43
 **/
@Data
public class DeviceStatusCountVo {

    private Integer totalDevice;

    private List<StatusCountVo> assetsStatus;

    private List<StatusCountVo> internetStatus;

}
