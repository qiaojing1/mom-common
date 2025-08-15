package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 设备型号
 *
 * @version 1.0
 * @ClassName DeviceModelEntity
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
public class DeviceModelEntity extends BaseDo {

    private String modelName;

    private String tenancyId;

    private String excludeId;

}
