package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmMaintenanceItemsPlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TpmMaintenanceItemsPlanClient
 * @author zhangweiyan
 * @date 2024/11/15 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmMaintenanceItemsPlanClientFallback.class)
public interface TpmMaintenanceItemsPlanClient {

    @GetMapping("/tpmMaintenanceItemsPlan/createMaintenanceOrder")
    RespMsgBean createMaintenanceOrder(@RequestParam("id") String id);
    @GetMapping("/tpmMaintenanceItemsPlan/createMaintenanceOrderSupplement")
    RespMsgBean createMaintenanceOrderSupplement(@RequestParam("tenancyId") String tenancyId);

}
