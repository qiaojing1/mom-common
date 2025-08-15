package com.lets.platform.model.collection.vo.energy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 用(能耗)报表 展示对象
 * @author DING WEI
 * @date 2025/1/2 10:32
 * @version 1.0
 */
@Data
@ApiModel("用(能耗)报表 展示对象")
public class CollUseEnergyVo {

    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("设备备注")
    private String deviceRemark;

    @ApiModelProperty("数据")
    private List<CollUseEnergySubVo> data;
}
