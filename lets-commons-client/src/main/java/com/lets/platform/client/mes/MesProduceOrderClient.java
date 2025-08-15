package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProduceOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.PutInProduceOrderDto;
import com.lets.platform.model.mes.entity.MesProduceOrder;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSerial;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 生产工单 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = MesProduceOrderClientFallback.class)
public interface MesProduceOrderClient {

    @PostMapping("/mesProduceOrder/defaultSave")
    RespMsgBean<String> defaultSave(@RequestBody(required = false) MesProduceOrder entity);

    @PostMapping("/mesProduceOrder/defaultSaveAndStatus")
    RespMsgBean<PutInProduceOrderDto> defaultSaveAndStatus(@RequestBody PutInProduceOrderDto dto);

    @PostMapping("/mesProduceOrder/getMrpIncomingList")
    RespMsgBean<List<MesProduceOrderDetail>> getMrpIncomingList(@RequestParam("startDate") LocalDateTime startDate, @RequestParam("endDate") LocalDateTime endDate,
                                                                @RequestBody Collection<String> materialIds, @RequestParam("wipInventory") boolean wipInventory);

    @PostMapping("/mesProduceOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/mesProduceOrder/getBarcodeInfo")
    RespMsgBean<List<MesProduceOrder>> getBarcodeInfo(@RequestParam("detailIds") Collection<String> detailIds);

    @GetMapping("/mesProduceOrder/getById")
    RespMsgBean<MesProduceOrder> getById(@RequestParam("id") String id);

    @GetMapping("/mesProduceOrder/getSerialList")
    RespMsgBean<List<MesProduceOrderDetailSerial>> getSerialList(@RequestParam("detailIds") Collection<String> detailIds);

    @GetMapping("/mesProduceOrder/getBySourceOrderIds")
    RespMsgBean<List<MesProduceOrderDetail>> getBySourceOrderIds(@RequestParam("sourceOrderIds") Collection<String> sourceOrderIds);

    @PostMapping("/mesProduceOrder/findProduceOrderDetailList")
    RespMsgBean<List<MesProduceOrderDetail>> findProduceOrderDetailList(@RequestParam("startDate") LocalDate startDate,
                                                                        @RequestParam("endDate") LocalDate endDate,
                                                                        @RequestParam("orderCategoryIds") Set<String> orderCategoryIds,
                                                                        @RequestParam("materialId") String materialId,
                                                                        @RequestParam("materialSpecific") String materialSpecific,
                                                                        @RequestParam("ignoreMaterialSpecific") boolean ignoreMaterialSpecific,
                                                                        @RequestParam("wipInventory") boolean wipInventory);

    @GetMapping("/mesProduceOrder/getProduceOrderDetailById")
    RespMsgBean<MesProduceOrderDetail> getProduceOrderDetailById(@RequestParam("id") String id);

    @PostMapping("/mesProduceOrder/findProduceOrderDetailByIds")
    RespMsgBean<List<MesProduceOrderDetail>> findProduceOrderDetailByIds(@RequestBody Collection<String> detailIds);
}
