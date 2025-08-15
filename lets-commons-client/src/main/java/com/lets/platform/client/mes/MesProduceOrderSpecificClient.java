package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProduceOrderSpecificClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSpecific;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 生产工单 特征属性
 * @author DING WEI
 * @date 2024/5/31 15:17
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MesProduceOrderSpecificClientFallback.class)
public interface MesProduceOrderSpecificClient {

    @PostMapping("/mesProduceOrderDetailSpecific/findByOrderIdsGroupDetailId")
    RespMsgBean<Map<String, List<MesProduceOrderDetailSpecific>>> findByOrderIdsGroupDetailId(@RequestBody Collection<String> orderIds);
}
