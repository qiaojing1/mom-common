package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 设备生产商
 *
 * @version 1.0
 * @ClassName DeviceManufacturerEntity
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
public class DeviceManufacturerEntity extends BaseDo {

    private String manufacturerName;

    private String tenancyId;

    private String excludeId;

}
