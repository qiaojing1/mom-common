package com.lets.platform.model.device.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 设备供应商
 *
 * @version 1.0
 * @ClassName DeviceSupplierEntity
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
public class DeviceSupplierEntity extends BaseDo {

    private String supplierName;

    private String tenancyId;

    private String excludeId;

}
