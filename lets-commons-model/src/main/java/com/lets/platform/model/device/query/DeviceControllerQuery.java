package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 设备控制器
 *
 * @version 1.0
 * @ClassName DeviceControllerQuery
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备控制器")
public class DeviceControllerQuery extends PageQuery {

    @ApiModelProperty("控制器编码")
    private String code;

    @ApiModelProperty("控制器名称")
    private String controllerName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

}
