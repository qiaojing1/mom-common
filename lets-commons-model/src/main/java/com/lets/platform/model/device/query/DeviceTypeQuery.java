package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 设备类型
 *
 * @version 1.0
 * @ClassName DeviceTypeQuery
 * @author: DING WEI
 * @create: 2021/05/12 16:14
 **/
@Data
@ApiModel("设备类型")
public class DeviceTypeQuery extends PageQuery {

    @ApiModelProperty("类型编码")
    private String code;

    @ApiModelProperty("类型名称")
    private String typeName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    private List<String> typeClassifys;

}
