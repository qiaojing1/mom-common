package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollAlarmReasonFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollAlarmReason;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 报警原因配置表 Feign接口
 * @author DING WEI
 * @date 2024/11/27 9:41
 * @version 1.0
 */
@FeignClient(value = "collection",fallback = CollAlarmReasonFallback.class)
public interface CollAlarmReasonClient {

    @PostMapping("/collAlarmReason/findByCodes4Map")
    RespMsgBean<Map<String, CollAlarmReason>> findByCodes4Map(@RequestBody Collection<String> codes);

    @PostMapping("/collAlarmReason/batSave")
    RespMsgBean<Boolean> batSave(@RequestBody List<CollAlarmReason> list);
}
