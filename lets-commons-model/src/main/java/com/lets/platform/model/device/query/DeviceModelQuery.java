package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 设备型号
 *
 * @version 1.0
 * @ClassName DeviceModelQuery
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备型号")
public class DeviceModelQuery extends PageQuery {

    @ApiModelProperty("型号编码")
    private String code;

    @ApiModelProperty("型号名称")
    private String modelName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

}
