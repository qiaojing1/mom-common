package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceStatusClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.entity.CommonDeviceStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Map;

/**
 * 设备状态配置
 * @author: zhangweiyan
 * @date: 2025/03/07 8:59
 */
@FeignClient(value = "collection",fallback = CollDeviceStatusClientFallback.class)
public interface CollDeviceStatusClient {

    @PostMapping("/commonDeviceStatus/findByIds4Map")
    RespMsgBean<Map<String, CommonDeviceStatus>> findByIds4Map(@RequestBody Collection<String> ids);
}
