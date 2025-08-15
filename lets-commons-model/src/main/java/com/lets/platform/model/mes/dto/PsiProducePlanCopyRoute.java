package com.lets.platform.model.mes.dto;

import com.lets.platform.model.psi.entity.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 工艺路线数据拷贝传输
 * @author: DING WEI
 * @date: 2023/12/6 11:22
 */
@Data
public class PsiProducePlanCopyRoute {

    private Set<String> produceDetailIds;

    private List<PsiProducePlanRoute> routeList;

    private List<PsiProducePlanRouteProductionUnit> unitList;
    private List<PsiProducePlanRouteFile> fileList;
    private List<PsiProducePlanRouteProcess> processList;
    private List<PsiProducePlanRouteProcessMaterial> processMaterialList;
    private List<PsiProducePlanRouteProcessDevice> processDeviceList;
    private List<PsiProducePlanRouteProcessParameters> processParamList;
    private List<PsiProducePlanRouteProcessFile> processFileList;

}
