package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesSamplingPlanConfigClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.SamplingPlanConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 抽样方案 Feign接口
 *
 * @author FZY
 */
@FeignClient(value = "mes", fallback = MesSamplingPlanConfigClientFallback.class)
public interface MesSamplingPlanConfigClient {

    @GetMapping("/samplingPlanConfig/getFullInspectionConfig")
    RespMsgBean<SamplingPlanConfig> getFullInspectionConfig();

}
