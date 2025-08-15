package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmRepairDurationDayClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.tpm.dto.TpmRepairDurationDayTaskDto;
import com.lets.platform.model.tpm.entity.TpmRepairDurationDeviceDay;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

/**
 * 设备维修时长(天表)
 * @author DING WEI
 * @date 2024/12/9 15:14
 * @version 1.0
 */
@FeignClient(value = "tpm", fallback = TpmRepairDurationDayClientFallback.class)
public interface TpmRepairDurationDayClient {

    @GetMapping("/tpmRepairDurationDay/findBaseDataList")
    RespMsgBean<List<TpmRepairDurationDeviceDay>> findBaseDataList(@RequestParam("tenancyId") String tenancyId, @RequestParam("todayFormat") String todayFormat);

    @PostMapping("/tpmRepairDurationDay/batSave")
    RespMsgBean<String> batSave(@RequestBody TpmRepairDurationDayTaskDto taskDto);

    @PostMapping("/tpmRepairDurationDay/findDeviceRepairDuration")
    RespMsgBean<BigDecimal> findDeviceRepairDuration(@RequestBody Collection<String> deviceIds,
                                                     @RequestParam("tenancyId") String tenancyId,
                                                     @RequestParam("today") String today);
    @PostMapping("/analysisReport/findDevicePlanLossDuration")
    RespMsgBean<BigDecimal> findDevicePlanLossDuration(@RequestBody Collection<String> deviceIds,
                                                       @RequestParam("deviceId") String tenancyId,
                                                       @RequestParam("today") String today);
}
