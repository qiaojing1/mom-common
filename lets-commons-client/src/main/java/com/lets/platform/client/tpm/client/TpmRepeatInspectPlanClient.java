package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmRepeatInspectPlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.tpm.entity.TpmRepeatInspectPlan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 复检计划feign接口
 * @author DING WEI
 * @date 2025/7/15 13:55
 * @version 1.0
 */
@FeignClient(value = "tpm", fallback = TpmRepeatInspectPlanClientFallback.class)
public interface TpmRepeatInspectPlanClient {

    @GetMapping("/tpmRepeatInspectPlan/findByTenancyId")
    RespMsgBean<List<TpmRepeatInspectPlan>> findByTenancyId(@RequestParam("tenancyId") String tenancyId);

    @PostMapping("/tpmRepeatInspectPlan/reset")
    RespMsgBean<Integer> reset(@RequestBody List<TpmRepeatInspectPlan> list);

}
