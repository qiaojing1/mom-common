package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProduceOrderDetailClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

/**
 * 生产工单明细 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = MesProduceOrderDetailClientFallback.class)
public interface MesProduceOrderDetailClient {

    @GetMapping("/mesProduceOrderDetail/findCount4FactoryModeId")
    RespMsgBean<Long> findCount4FactoryModeId(@RequestParam("factoryModeId") String factoryModeId);

    @PostMapping("/mesProduceOrderDetail/delByDetectOrderCode")
    RespMsgBean delByDetectOrderCode(@RequestBody List<CollectionDetectOrder> detectOrderCode);

    @PostMapping("/mesProduceOrderDetail/updateDetectNumber")
     RespMsgBean updateDetectNumber(@RequestBody List<MesProduceOrderDetail> details);

    @GetMapping("mesProduceOrderDetail/getById")
    RespMsgBean<MesProduceOrderDetail> getById4Detail(@RequestParam("id") String id);
}
