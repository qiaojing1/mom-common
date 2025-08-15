package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ProductRepairOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProductRepairOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 产品维修工单 feign接口
 * @author DING WEI
 * @date 2025/6/5 10:39
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = ProductRepairOrderClientFallback.class)
public interface ProductRepairOrderClient {

    @PostMapping("/productRepairOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/productRepairOrder/findByIds")
    RespMsgBean<List<MesProductRepairOrder>> findByIds(@RequestBody Collection<String> ids);

    @PostMapping("/productRepairOrder/findByIds4Map")
    RespMsgBean<Map<String, MesProductRepairOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @GetMapping("/productRepairOrder/getById")
    RespMsgBean<MesProductRepairOrder> getById(@RequestParam("id") String id);

    @PostMapping("/productRepairOrder/updateList")
    RespMsgBean<Integer> updateList(@RequestBody List<MesProductRepairOrder> updateList);

}
