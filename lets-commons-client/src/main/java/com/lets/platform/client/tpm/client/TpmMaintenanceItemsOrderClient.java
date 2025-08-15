package com.lets.platform.client.tpm.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.fallback.TpmMaintenanceItemsOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.tpm.entity.TpmMaintenanceItemsOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

/**
 * TpmMaintenanceItemsOrderClient
 * @author zhangweiyan
 * @date 2025/02/07 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmMaintenanceItemsOrderClientFallback.class)
public interface TpmMaintenanceItemsOrderClient {

    @PostMapping("/tpmMaintenanceItemsOrder/findPage")
    RespMsgBean<Page<TpmMaintenanceItemsOrder>> findPage(@RequestBody() AutoConditionEntity entity);

    @GetMapping("/tpmMaintenanceItemsOrder/statisticsCheckOverdue")
    void statisticsCheckOverdue(@RequestParam(value = "shiftId", required = false) String shiftId,
                                @RequestParam(value = "startLocalTime", required = false) LocalDateTime startLocalTime,
                                @RequestParam(value = "endLocalTime", required = false) LocalDateTime endLocalTime,
                                @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/tpmMaintenanceItemsOrder/autoSubmitOrder")
    void autoSubmitOrder(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime);

    @GetMapping("/tpmMaintenanceItemsOrder/autoVoidOrder")
    void autoVoidOrder(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime);

}
