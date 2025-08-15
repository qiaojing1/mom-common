package com.lets.platform.model.mes.entity;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 工艺路线数据拷贝传输
 * @author: DING WEI
 * @date: 2023/12/6 11:22
 */
@Data
public class MesProduceOrderCopyRoute {

    private Set<String> produceDetailIds;

    private List<MesProduceOrderRoute> routeList;

    private List<MesProduceOrderRouteProductionUnit> unitList;
    private List<MesProduceOrderRouteFile> fileList;
    private List<MesProduceOrderRouteProcess> processList;
    private List<MesProduceOrderRouteProcessMaterial> processMaterialList;
    private List<MesProduceOrderRouteProcessDevice> processDeviceList;
    private List<MesProduceOrderRouteProcessParameters> processParamList;
    private List<MesProduceOrderRouteProcessFile> processFileList;

}
