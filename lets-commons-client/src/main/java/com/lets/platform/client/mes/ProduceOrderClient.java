package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ProduceOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.entity.*;
import com.lets.platform.model.psi.query.TaskDetailQuery;
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
@FeignClient(value = "mes", fallback = ProduceOrderClientFallback.class)
public interface ProduceOrderClient {

    @GetMapping("/mesProduceOrder/findById4AllCol")
    RespMsgBean<MesProduceOrder> findByDetailId4AllCol(@RequestParam("detailId") String detailId);

    @PostMapping("/mesProduceOrder/findListByDetailId4AllCol")
    RespMsgBean<List<MesProduceOrder>> findListByDetailId4AllCol(@RequestBody Collection<String> detailIds);

    @GetMapping("/mesProduceOrder/findAllCol4UserReport")
    RespMsgBean<List<MesProduceOrder>> findAllCol4UserReport(@RequestParam("factoryModeId") String factoryModeId, @RequestParam("today") String today);

    @PostMapping("/mesProduceOrder/findByIds4Map")
    RespMsgBean<Map<String, MesProduceOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @GetMapping("/mesProduceOrderDetail/getById")
    RespMsgBean<MesProduceOrderDetail> getById4Detail(@RequestParam("id") String id);

    @GetMapping("/mesProduceOrderDetail/getById4MainDetail")
    RespMsgBean<MesProduceOrderDetail> getById4MainDetail(@RequestParam("id") String id);

    @GetMapping("/mesProduceOrderDetail/getDetailListById")
    RespMsgBean<List<MesProduceOrderDetail>> getDetailListById(@RequestParam("id") String id);

    @PostMapping("/mesProduceOrderDetail/findByIds4Map")
    RespMsgBean<Map<String, MesProduceOrderDetail>> findByIds4Map4dDetail(@RequestBody Collection<String> ids);

    @GetMapping("/mesProduceOrderDetail/updateMoment4Detail")
    RespMsgBean<Boolean> updateMoment4Detail(@RequestParam("id") String id, @RequestParam("moment") String moment);

    @PostMapping("/mesProduceOrderDetail/findDetailMapByMrpSourceDetailIds")
    RespMsgBean<Map<String, List<MesProduceOrderDetail>>> findDetailMapByMrpSourceDetailIds(@RequestBody Collection<String> mrpSourceDetailIds);

    @PostMapping("/mesProduceOrderDetail/updateQualifiedNumber")
    RespMsgBean<Integer> updateQualifiedNumber(@RequestBody List<MesProduceOrderDetail> list);

    @PostMapping("/mesProduceOrderDetail/updateOutsourcingNumber")
    RespMsgBean updateOutsourcingNumber(@RequestBody List<MesProduceOrderDetail> updateList);

    @PostMapping("/mesProduceOrderDetail/updateQuantityBatch")
    RespMsgBean<Void> updateQuantityBatch(@RequestBody Collection<MesProduceOrderDetail> updateList);

    @PostMapping("/mesProduceOrderDetail/findDetailSpecificList")
    RespMsgBean<List<MesProduceOrderDetailSpecific>> findDetailSpecificList(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesProduceOrderDetail/findSumBySourceDetailIds")
    RespMsgBean<List<MesProduceOrderDetail>> findSumBySourceDetailIds(@RequestBody Collection<String> sourceDetailIds);

    @GetMapping("/mesProduceOrderDetail/issue4ScheduledTasks")
    RespMsgBean<String> issue4ScheduledTasks(@RequestParam("tenancyId") String tenancyId);

    @GetMapping("/mesProduceOrderDetail/getSourceCount")
    RespMsgBean<Long> getSourceCount(@RequestParam("sourceId") String sourceId);

    @PostMapping("/mesProduceOrder/batSaveOrder")
    RespMsgBean<List<String>> batSaveOrder(@RequestBody List<MesProduceOrder> orderList);

    @PostMapping("/mesProduceOrderDetail/updateMrpQuantity")
    RespMsgBean<Void> updateMrpQuantity(@RequestBody Collection<MesProduceOrderDetail> updateList);


    @PostMapping("/mesProduceOrderDetail/findSpecificsByDetailIds")
    RespMsgBean<List<MesProduceOrderDetailSpecific>> findSpecificsByDetailIds(@RequestBody Collection<String> ids);

    @PostMapping("/mesProduceOrderDetail/findSerialByDetailIds")
    RespMsgBean<List<MesProduceOrderDetailSerial>> findSerialByDetailIds(@RequestBody Collection<String> ids);

    @PostMapping("/mesProduceOrderDetail/findByIds4MapWithSerialAndSpecific")
    RespMsgBean<Map<String, MesProduceOrderDetail>> findByIds4MapWithSerialAndSpecific(@RequestBody Collection<String> ids);

    @GetMapping("/mesProduceOrder/getBomList")
    RespMsgBean<List<MesProduceOrderBom>> getBomList(@RequestParam("detailId") String detailId);

    @GetMapping("/mesProduceOrder/getBomDetailList")
    RespMsgBean<List<MesProduceOrderBomDetail>> getBomDetailList(@RequestParam("detailId") String detailId);

    @PostMapping("/mesProduceOrder/updateCalculated")
    RespMsgBean<Void> updateCalculated(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesProduceOrder/getTaskDetail")
    RespMsgBean<List<BaseEntity>> getTaskDetail(TaskDetailQuery query);

    @PostMapping("/mesProduceOrder/findProduceOrderDetailWithKitPickNumber")
    RespMsgBean<Map<String, MesProduceOrderDetail>> findProduceOrderDetailWithKitPickNumber(@RequestBody Collection<String> detailIds);

    @GetMapping("/mesProduceOrder/findRouteProcess")
    RespMsgBean<List<MesProduceOrderRouteProcess>> findRouteProcess(@RequestParam("orderId") String orderId);

    @PostMapping("/mesProduceOrder/queryInProgressDetailList")
    RespMsgBean<List<MesProduceOrderDetail>> queryInProgressDetailList(Set<String> materialIds);
}
