package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceChannelClientFallback;
import com.lets.platform.client.collection.fallback.CollRangeConfigClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollDeviceChannels;
import com.lets.platform.model.collection.entity.CollectionRangeConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelClient
 * @Description TODO
 * @Date 2024/2/2 16:44
 **/
@FeignClient(value = "collection", fallback = CollRangeConfigClientFallback.class)
public interface CollRangeConfigClient {

    @GetMapping("/collectionRangeConfig/findRangesByDeviceCode")
    RespMsgBean<List<CollectionRangeConfig>> findRangesByDeviceCode(@RequestParam("deviceCode") String deviceCode, @RequestParam("tenancyId") String tenancyId);
}
