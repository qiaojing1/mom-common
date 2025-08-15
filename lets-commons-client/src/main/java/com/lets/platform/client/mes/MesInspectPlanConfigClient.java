package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesInspectPlanConfigClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.InspectPlanConfig;
import com.lets.platform.model.mes.entity.MesProduceReportOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 检验方案 Feign接口
 *
 * @author FZY
 */
@FeignClient(value = "mes", fallback = MesInspectPlanConfigClientFallback.class)
public interface MesInspectPlanConfigClient {

    @GetMapping("/inspectPlanConfig/getInspectPlanConfigList")
    RespMsgBean<List<InspectPlanConfig>> getInspectPlanConfigList(@RequestParam("inspectType") String inspectType);

}
