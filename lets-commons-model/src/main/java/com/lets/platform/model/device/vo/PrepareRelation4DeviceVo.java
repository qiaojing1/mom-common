package com.lets.platform.model.device.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 设备备品备件清单 展示对象
 * @author: DING WEI
 * @date: 2022/7/20 10:36
 */
@Data
@ApiModel("设备备品备件清单 展示对象")
public class PrepareRelation4DeviceVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("设备主键")
    private String deviceId;

    @ApiModelProperty("备件物料")
    private String materialId;
    @ApiModelProperty("备件物料编码")
    private String materialCode;
    @ApiModelProperty("备件物料名称")
    private String materialName;
    @ApiModelProperty("备件物料规格")
    private String specs;
    @ApiModelProperty("备件物料单位名称")
    private String unitName;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
