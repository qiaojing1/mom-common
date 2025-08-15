package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 设备控制器
 *
 * @version 1.0
 * @ClassName DeviceControllerEntity
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
public class DeviceControllerEntity extends BaseDo {

    private String controllerName;

    private String tenancyId;

    private String excludeId;

}
