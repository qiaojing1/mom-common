package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceRealtimeStatusClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollDeviceStatusRealtime;
import com.lets.platform.model.collection.vo.CollDataItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 设备实时状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection",fallback = CollDeviceRealtimeStatusClientFallback.class)
public interface CollDeviceRealtimeStatusClient {

    @GetMapping("/collDeviceStatusRealtime/findById")
    RespMsgBean<CollDeviceStatusRealtime> findById(@RequestParam("id") String id);

    @PostMapping("/collDeviceStatusRealtime/findByIds4Map")
    RespMsgBean<Map<String, CollDeviceStatusRealtime>> findByIds4Map(@RequestBody Collection<String> ids);

    @GetMapping("/collDeviceStatusRealtime/findPointRealtimeData")
    RespMsgBean<List<CollDataItemVo>> findPointRealtimeData(@RequestParam("deviceId") String deviceId);

    @PostMapping("/collDeviceStatusRealtime/findProgramRealtimeData")
    RespMsgBean<Map<String,CollDataItemVo>> findProgramRealtimeData(@RequestBody Collection<String> deviceId,@RequestParam("programDataItemKey") String programDataItemKey);
    @GetMapping("/collDeviceStatusRealtime/findByBigStatusCode")
    RespMsgBean<List<CollDeviceStatusRealtime>> findByBigStatusCode(@RequestParam("bigStatusCode") String bigStatusCode,@RequestParam("tenancyId") String tenancyId);
}
