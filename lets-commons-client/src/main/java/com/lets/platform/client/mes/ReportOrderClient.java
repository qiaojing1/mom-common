package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ReportOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProduceReportOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = ReportOrderClientFallback.class)
public interface ReportOrderClient {

    @PostMapping("/mesProduceReportOrderDetail/findByIds4Map")
    RespMsgBean<Map<String, MesProduceReportOrderDetail>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesProduceReportOrderDetail/updateNumber")
    RespMsgBean<Integer> updateNumber(@RequestBody List<MesProduceReportOrderDetail> list, @RequestParam("operator") String operator);

    @PostMapping("/mesProduceReportOrder/findCanStockInNumber")
    RespMsgBean<Map<String, BigDecimal>> findCanStockInNumber(@RequestBody Collection<String> ids);

    @PostMapping("/mesProduceReportOrderDetail/updateQuantityBatch")
    RespMsgBean<Void> updateQuantityBatch(@RequestBody Collection<MesProduceReportOrderDetail> updateList);
}
