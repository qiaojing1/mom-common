package com.lets.platform.model.adapter;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @description: 报警信息
 * @author: DING WEI
 * @date: 2022/4/11 9:02
 */
@Data
public class MdcWarnInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 设备主键 */
    private String deviceId;
    private String deviceCode;
    private String assetsCode;
    private String deviceName;
    private String deviceTypeId;
    private String deviceModelId;
    private String deviceControllerId;
    private String factoryModeId;
    /** 网关ID */
    private String gatewayId;
    /** 采集器编码 */
    private String collectionId;
    private String collectionCode;
    /** 采集时间 */
    private LocalDateTime collectionTime;
    /** 点位编码 */
    private String itemKey;
    /** 点位数据 */
    private String itemValue;
    /** 租户主键 */
    private String tenancyId;

}
