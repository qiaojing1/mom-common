package com.lets.platform.client.mes;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.mes.fallback.MesProducePickingClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.GeneratePickingOrderDto;
import com.lets.platform.model.mes.entity.MesProducePicking;
import com.lets.platform.model.mes.entity.MesProducePickingDetail;
import com.lets.platform.model.psi.entity.StockOutModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 工单报工单 Feign接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = MesProducePickingClientFallback.class)
public interface MesProducePickingClient {

    @PostMapping("/mesProducePicking/pdaPosting")
    RespMsgBean<?> pdaPosting(@RequestBody MesProducePicking entity);

    @PostMapping("/mesProducePicking/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/mesProducePicking/getByCode")
    RespMsgBean<MesProducePicking> getByCode(@RequestParam("code") String code);

    @GetMapping("/mesProducePicking/defaultFindById")
    RespMsgBean<MesProducePicking> defaultFindById(@RequestParam("id") String id);

    @PostMapping("/mesProducePicking/findListByIds")
    RespMsgBean<List<MesProducePicking>> findListByIds(@RequestBody Collection<String> ids);

    @PostMapping("/mesProducePicking/defaultPage")
    RespMsgBean<Page<MesProducePicking>> defaultPage(@RequestBody AutoConditionEntity entity);

    @PostMapping("/mesProducePicking/generateReversePickingOrder")
    RespMsgBean<String> generateReversePickingOrder(@RequestBody GeneratePickingOrderDto dto);

    @GetMapping("/mesProducePicking/findStockOutModels")
    RespMsgBean<List<StockOutModel>> findStockOutModels(@RequestParam("orderId") String orderId);

    @PostMapping("/mesProducePickingDetail/findByIds4Map")
    RespMsgBean<Map<String, MesProducePickingDetail>> findByIds4Map4Detail(@RequestBody Collection<String> ids);

    @PostMapping("/mesProducePicking/findByIds4Map")
    RespMsgBean<Map<String,MesProducePicking>> findByIds4Map(@RequestBody Collection<String> ids);
}
