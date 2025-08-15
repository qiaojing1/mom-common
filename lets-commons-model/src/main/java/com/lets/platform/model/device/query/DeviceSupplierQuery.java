package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 设备供应商
 *
 * @version 1.0
 * @ClassName DeviceSupplierQuery
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备供应商查询")
public class DeviceSupplierQuery extends PageQuery {

    private String code;

    private String supplierName;

    private String tenancyId;

}
