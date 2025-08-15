package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.AutoLineModelingClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 自动线建模 Feign接口
 * @author DING WEI
 * @date 2024/7/4 16:15
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = AutoLineModelingClientFallback.class)
public interface AutoLineModelingClient {

    @GetMapping("/autoLineModeling/findAllAutoLineItemKeys")
    RespMsgBean<ConcurrentHashMap<String, Set<String>>> findAllAutoLineItemKeys(@RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/autoLineModeling/findAutoLineIdByDeviceId")
    RespMsgBean<Boolean> findAutoLineIdByDeviceId(@RequestParam("deviceId") String deviceId);
}
