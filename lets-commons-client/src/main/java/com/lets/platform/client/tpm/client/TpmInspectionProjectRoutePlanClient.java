package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmInspectionProjectRoutePlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TpmInspectionProjectRoutePlanClient
 * @author zhangweiyan
 * @date 2024/12/18 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmInspectionProjectRoutePlanClientFallback.class)
public interface TpmInspectionProjectRoutePlanClient {

    @GetMapping("/tpmInspectionProjectRoutePlan/createProjectOrder")
    RespMsgBean createProjectOrder(@RequestParam("id") String id);
    @GetMapping("/tpmInspectionProjectRoutePlan/createInspectionRouteOrderSupplement")
    RespMsgBean createInspectionRouteOrderSupplement(@RequestParam("tenancyId") String tenancyId);

}
