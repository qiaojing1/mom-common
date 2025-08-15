package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 设备类型
 *
 * @version 1.0
 * @ClassName DeviceTypeEntity
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
public class DeviceTypeEntity extends BaseDo {

    private String typeName;

    private String tenancyId;

    private String excludeId;

    private String typeClassify;
    private String typeClassifyName;

    private String deviceId;

}
