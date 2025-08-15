package com.lets.platform.client.adapter.client;

import com.lets.platform.client.adapter.AutoLineChangeClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@FeignClient(value = "adapter", fallback = AutoLineChangeClientFallback.class)
public interface AutoLineChangeClient {

    @PostMapping("/autoLineChange/change")
    RespMsgBean change(@RequestBody ConcurrentHashMap<String, Set<String>> autoLineItemMap);

    @GetMapping("/autoLineChange/isMemberExternal")
    RespMsgBean<Boolean> isMemberExternal(@RequestParam("deviceId") String deviceId, @RequestParam("code") String code);
}
