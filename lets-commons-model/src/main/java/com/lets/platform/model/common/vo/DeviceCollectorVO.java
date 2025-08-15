package com.lets.platform.model.common.vo;

import com.lets.platform.model.common.entity.CommonDeviceCollector;
import com.lets.platform.model.common.entity.CommonDeviceCollectorDataItem;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 采集配置
 * @author FZY
 * @since 2023-10-31
 */
@Getter
@Setter
@ApiModel(value = "CommonDeviceCollector分页查询对象", description = "采集配置分页查询对象")
public class DeviceCollectorVO {

    private String id;

    private String deviceId;

    private String deviceCode;

    private String deviceName;

    private String deviceModelId;

    private String deviceModelName;

    private String deviceTypeId;

    private String deviceTypeName;

    private Integer hasCollectors;

    private String hasCollectorsName;

    private List<CommonDeviceCollector> details;

    private List<CommonDeviceCollectorDataItem> dataItemList;
}
