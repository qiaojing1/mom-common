package com.lets.platform.model.collection.vo.energy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 用(水、电、气)报表 展示对象
 * @author DING WEI
 * @date 2025/1/2 11:09
 * @version 1.0
 */
@Data
@ApiModel("用(水、电、气)报表 展示对象")
public class UseEnergyReportVo {

    @ApiModelProperty("设备")
    private String deviceId;

    @ApiModelProperty("数据")
    private List<UseEnergyReportSubVo> data;

}
