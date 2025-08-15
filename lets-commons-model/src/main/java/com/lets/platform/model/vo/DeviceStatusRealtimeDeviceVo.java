package com.lets.platform.model.collection.vo;

import com.lets.platform.model.common.entity.CommonDeviceCollectorDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 非产线-设备实时状态 展示对象
 * @author: DING WEI
 * @date: 2025/4/8 18:56
 */
@Data
@ApiModel("非产线-设备实时状态 展示对象")
public class DeviceStatusRealtimeDeviceVo {

    @ApiModelProperty("设备主键")
    private String deviceId;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备状态-小类")
    private String deviceStatus;

    @ApiModelProperty("设备状态-小类颜色")
    private String deviceStatusColour;

    @ApiModelProperty("设备生产信息")
    private List<CommonDeviceCollectorDataItem> dataItemList;


}
