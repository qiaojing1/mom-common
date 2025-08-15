package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ProduceMaterialBillClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrder;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;
import com.lets.platform.model.psi.mrpModel.BomModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes",fallback = ProduceMaterialBillClientFallback.class)
public interface ProduceMaterialBillClient {

    @PostMapping("/mesProduceMaterialBill/findByIds")
    RespMsgBean<List<MesProduceMaterialBillOrder>> findByIds(@RequestBody Collection<String> ids);

    @PostMapping("/mesProduceMaterialBill/getMrpBomModelMap")
    RespMsgBean<Map<String, BomModel>> getMrpBomModelMap(@RequestBody Collection<String> ids);

    @PostMapping("/mesProduceMaterialBill/updateBatchById")
    RespMsgBean<Boolean> updateBatchById(@RequestBody Collection<MesProduceMaterialBillOrder> ids);

    @GetMapping("/produceMaterialBillOrderDetail/picking4ScheduledTasks")
    RespMsgBean<String> picking4ScheduledTasks(@RequestParam("tenancyId") String tenancyId);

    @PostMapping("/produceMaterialBillOrderDetail/findBillMap")
    RespMsgBean<Map<String, List<MesProduceMaterialBillOrderDetail>>> findBillMap(@RequestBody Set<String> produceOrderDetailIds, @RequestParam("status") Integer status);
}
