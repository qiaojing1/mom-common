package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProduceJobUnlockLogClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProduceJobUnlockLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Map;

/**
 * 设备锁机-报工扫码记录
 * @author DING WEI
 * @date 2024/2/29 14:12
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MesProduceJobUnlockLogClientFallback.class)
public interface MesProduceJobUnlockLogClient {

    @PostMapping("/produceJobUnlockLog/findNewest")
    RespMsgBean<Map<String, MesProduceJobUnlockLog>> findNewest(@RequestBody Collection<String> deviceIds);
}
