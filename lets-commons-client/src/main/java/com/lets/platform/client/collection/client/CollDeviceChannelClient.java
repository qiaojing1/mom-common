package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceChannelClientFallback;
import com.lets.platform.model.collection.entity.CollDeviceChannels;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelClient
 * @Description TODO
 * @Date 2024/2/2 16:44
 **/
@FeignClient(value = "collection",fallback = CollDeviceChannelClientFallback.class)
public interface CollDeviceChannelClient {

    @PostMapping("/collDeviceChannels/findAllList")
    public List<CollDeviceChannels> findAllList();
}
