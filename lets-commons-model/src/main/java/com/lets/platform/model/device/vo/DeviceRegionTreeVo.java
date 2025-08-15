package com.lets.platform.model.device.vo;

import lombok.Data;

import java.util.List;

/**
 * 设备区域树形结构数据展示对象
 *
 * @version 1.0
 * @ClassName DeviceRegionTreeVo
 * @author: DING WEI
 * @create: 2021/05/14 09:32
 **/
@Data
public class DeviceRegionTreeVo {

    private String factoryId;
    private String factoryName;

    private String workshopId;
    private String workshopName;

    private String productionLineId;
    private String productionLineName;

    private List<DeviceRegionTreeVo> child;

}
