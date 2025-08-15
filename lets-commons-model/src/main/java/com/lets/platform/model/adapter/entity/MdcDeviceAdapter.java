package com.lets.platform.model.adapter.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("设备采集器信息")
public class MdcDeviceAdapter implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 设备 */
    private String deviceId;
    private String deviceCode;
    private String deviceName;
    private String assetsCode;
    @ApiModelProperty("设备类型分类[1电表,2天然气表,3水表,4压缩空气表,5其他设备]")
    private String classify;
    private String deviceTypeId;
    private String deviceModelId;
    private String deviceControllerId;
    private String factoryModeId;

    /** 采集器 tag_id的第二部分 */
    private String collectorCode;
    private String collectorId;

    /** 网关ID tag_id的第一部分 */
    private String gatewayId;
    private String gatewayCode;
    private String gatewayName;

    private String tenancyId;
    private String sourceStatus;  //源状态
    private String targetStatus;  //目标状态
    private String targetStatusName;  //目标状态
    private String targetBigStatus;  //目标状态
    private String targetBigStatusName;  //目标状态
    private Integer time;  //维持时长

}