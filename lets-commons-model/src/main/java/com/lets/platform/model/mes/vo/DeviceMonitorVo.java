package com.lets.platform.model.mes.vo;

import com.lets.platform.model.common.entity.CommonHmiSettingDevices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 设备监控 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 18:23
 */
@Data
@ApiModel("设备监控 展示对象")
public class DeviceMonitorVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("当前设备主键")
    private String deviceId;
    @ApiModelProperty("当前设备编码")
    private String deviceCode;
    @ApiModelProperty("当前设备名称")
    private String deviceName;

    @ApiModelProperty("设备实时状态")
    private String smallStatusCode;
    @ApiModelProperty("设备实时状态名称")
    private String smallStatusName;

    @ApiModelProperty("点位数据")
    private List<DeviceRunParamItemVo> itemVoList;

    @ApiModelProperty("设备列表")
    private List<CommonHmiSettingDevices> deviceList;

}
