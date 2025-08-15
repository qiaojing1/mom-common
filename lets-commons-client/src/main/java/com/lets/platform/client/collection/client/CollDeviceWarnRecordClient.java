package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollDeviceWarnRecordClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollDeviceWarnRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 报警记录feign接口
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection",fallback = CollDeviceWarnRecordClientFallback.class)
public interface CollDeviceWarnRecordClient {

    @GetMapping("/collDeviceWarnRecord/findAllWarnRecord4Delayed")
    RespMsgBean<List<CollDeviceWarnRecord>> findAllWarnRecord4Delayed(@RequestParam("time") String time);

    @PostMapping("/collDeviceWarnRecord/updateDealTime")
    RespMsgBean<Integer> updateDealTime(@RequestBody List<CollDeviceWarnRecord> toUpdate);

    @GetMapping("collDeviceWarnRecord/findNewestByDeviceId")
    RespMsgBean<CollDeviceWarnRecord> findNewestByDeviceId(@RequestParam("deviceId") String deviceId);

}
