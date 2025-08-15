package com.lets.platform.model.device.vo;

import lombok.Data;

/**
 * 工厂建模
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeVo
 * @author: Qiao
 * @create: 2021/08/20 22:58
 **/
@Data
public class DeviceFactoryModeSimpleVo {

    private String lineModeId;
    private String lineModeName;
    private String workShopModeId;
    private String workShopModeName;
    private String factoryModeId;
    private String factoryModeName;

}
