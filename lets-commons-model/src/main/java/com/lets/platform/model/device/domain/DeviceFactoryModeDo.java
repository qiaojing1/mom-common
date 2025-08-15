package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 工厂建模
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeDo
 * @author: Qiao
 * @create: 2021/08/20 22:50
 **/
@Data
public class DeviceFactoryModeDo  extends BaseDo {
    private String modeId;

    private String modeName;

    private String modeCode;

    private String modeType;

    private String parentModeCode;

    private String status;

    private String managerUser;

    private String tenancyId;
}
