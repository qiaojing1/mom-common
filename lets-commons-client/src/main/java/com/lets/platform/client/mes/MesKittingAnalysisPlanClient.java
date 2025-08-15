package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesKittingAnalysisPlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesKittingAnalysisPlan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 齐套分析方案 Feign接口
 * @author DING WEI
 * @date 2025/3/4 11:00
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MesKittingAnalysisPlanClientFallback.class)
public interface MesKittingAnalysisPlanClient {

    @GetMapping("/mesKittingAnalysisPlan/defaultFindById")
    RespMsgBean<MesKittingAnalysisPlan> defaultFindById(@RequestParam(value = "id", required = false) String id);

}
