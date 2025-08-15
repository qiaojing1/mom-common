package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 设备生产商
 *
 * @version 1.0
 * @ClassName DeviceManufacturerQuery
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备生产商查询")
public class DeviceManufacturerQuery extends PageQuery {

    @ApiModelProperty("生产商编码")
    private String code;

    @ApiModelProperty("生产商名称")
    private String manufacturerName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

}
