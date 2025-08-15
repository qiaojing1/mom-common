package com.lets.platform.client.tpm.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.fallback.TpmInspectionItemsOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.tpm.entity.TpmInspectionItemsOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

/**
 * TpmInspectionItemsOrderClient
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2025/02/07 14:26
 */
@FeignClient(value = "tpm", fallback = TpmInspectionItemsOrderClientFallback.class)
public interface TpmInspectionItemsOrderClient {

    @PostMapping("/tpmInspectionItemsOrder/findPage")
    RespMsgBean<Page<TpmInspectionItemsOrder>> findPage(@RequestBody() AutoConditionEntity entity);

    @GetMapping("/tpmInspectionItemsOrder/statisticsCheckOverdue")
    void statisticsCheckOverdue(@RequestParam(value = "shiftId", required = false) String shiftId,
                                @RequestParam(value = "startLocalTime", required = false) LocalDateTime startLocalTime,
                                @RequestParam(value = "endLocalTime", required = false) LocalDateTime endLocalTime,
                                @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/tpmInspectionItemsOrder/autoSubmitOrder")
    void autoSubmitOrder(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime);

    @GetMapping("/tpmInspectionItemsOrder/autoVoidOrder")
    void autoVoidOrder(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime);
}
