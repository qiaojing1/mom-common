package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.DeviceComprehensiveEfficiencyFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollDeviceComprehensiveEfficiency;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 设备历史状态
 *
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection", fallback = DeviceComprehensiveEfficiencyFallback.class)
public interface DeviceComprehensiveEfficiencyClient {
    @GetMapping("/comprehensiveEfficiency/calcEfficiency")
    @ApiOperation("定时任务计算设备综合效率表")
    RespMsgBean<List<CollDeviceComprehensiveEfficiency>> calcEfficiency(@RequestParam(value = "date", required = false) String date);
}
