package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;

/**
 * 设备备品备件清单 查询对象
 * @author: DING WEI
 * @date: 2022/7/20 10:36
 */
@Data
@ApiModel("设备备品备件清单 查询对象")
public class DevicePrepareRelationQuery extends PageQuery {

    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty(hidden = true)
    private Collection<String> materialIds;

    @ApiModelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    private String materialName;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

}
