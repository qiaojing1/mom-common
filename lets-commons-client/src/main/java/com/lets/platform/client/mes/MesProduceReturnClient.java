package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProducePickingClientFallback;
import com.lets.platform.client.mes.fallback.MesProduceReturnClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProduceReturn;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 工单报工单 Feign接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = MesProduceReturnClientFallback.class)
public interface MesProduceReturnClient {

    @PostMapping("/mesProduceReturn/submitByPDA")
    RespMsgBean<String> submitByPDA(@RequestBody MesProduceReturn entity);
}
