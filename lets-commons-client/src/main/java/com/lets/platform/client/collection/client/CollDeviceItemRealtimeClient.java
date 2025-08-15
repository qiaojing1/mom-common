package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceItemRealtimeFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollDeviceItemRealtime;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelClient
 * @Description TODO
 * @Date 2024/2/2 16:44
 **/
@FeignClient(value = "collection",fallback = CollDeviceItemRealtimeFallback.class)
public interface CollDeviceItemRealtimeClient {

    @PostMapping("/collDeviceItemRealtime/findByDeviceAndDataItem")
    RespMsgBean<Map<String, CollDeviceItemRealtime>> findByDeviceAndDataItem(@RequestBody Collection<String> deviceIds, @RequestParam("dataItem") String dataItem);
}
