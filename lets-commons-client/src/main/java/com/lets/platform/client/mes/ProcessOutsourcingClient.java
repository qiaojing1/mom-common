package com.lets.platform.client.mes;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.mes.fallback.ProcessOutsourcingClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.ProcessPlanRequestDto;
import com.lets.platform.model.mes.entity.*;
import com.lets.platform.model.psi.vo.CheckDistributeVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 工序委外 Feign接口
 * @author DING WEI
 * @date 2024/5/7 10:57
 * @version 1.0
 */
@FeignClient(value = "mes",fallback = ProcessOutsourcingClientFallback.class)
public interface ProcessOutsourcingClient {

    @PostMapping("/mesProcessOutsourcingOut/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateOut(@RequestBody ExportWithTemplateDto dto);
    @GetMapping("/mesProcessOutsourcingOut/findById")
    RespMsgBean<MesProcessOutsourcingOut> findById4Out(@RequestParam("id") String id);
    @PostMapping("/mesProcessOutsourcingOut/findByIds4Map")
    RespMsgBean<Map<String, MesProcessOutsourcingOut>> findByIds4OutMap(@RequestBody Collection<String> ids);
    @PostMapping("/mesProcessOutsourcingOut/listOutByIds")
    RespMsgBean<List<MesProcessOutsourcingOut>> listOutByIds(@RequestBody Collection<String> ids);
    @PostMapping("/mesProcessOutsourcingOut/updateList4StockIn")
    RespMsgBean<Integer> updateList4StockIn(@RequestBody List<MesProcessOutsourcingOut> list);

    @GetMapping("/mesProcessOutsourcingIn/findById")
    RespMsgBean<MesProcessOutsourcingIn> findById4In(@RequestParam("id") String id);
    @PostMapping("/mesProcessOutsourcingIn/defaultPage")
    RespMsgBean<Page<MesProcessOutsourcingIn>> defaultPage4In(@RequestBody AutoConditionEntity autoConditionEntity);
    @PostMapping("/mesProcessOutsourcingIn/findByInProcessPlanIds")
    RespMsgBean<List<MesProcessOutsourcingIn>> findByInProcessPlanIds(@RequestBody ProcessPlanRequestDto requestDto);
    @GetMapping("/mesProcessOutsourcingIn/findCountBySourceDetailId")
    RespMsgBean<Long> findCountBySourceDetailId(@RequestParam("sourceDetailId") String sourceDetailId,
                                                @RequestParam("sourceOrderType") String sourceOrderType);

    @PostMapping("/mesProcessOutsourcingIn/findCountByOutsourcingOutIds")
    RespMsgBean<Map<String, Integer>> findCountByOutsourcingOutIds(@RequestBody Collection<String> sourceDetailIds);
    @PostMapping("/mesProcessOutsourcingOut/defaultPage")
    RespMsgBean<Page<MesProcessOutsourcingOut>> defaultPage4Out(@RequestBody AutoConditionEntity autoConditionEntity);
    @PostMapping("/mesProcessOutsourcingOut/findBySourceDetailIds4Map")
    RespMsgBean<Map<String, List<MesProcessOutsourcingOut>>> findBySourceDetailIds4Map(@RequestBody Collection<String> sourceDetailIds);
    @PostMapping("/mesProcessOutsourcingOut/findBySourceDetailId4List")
    RespMsgBean<List<MesProcessOutsourcingOut>> findBySourceDetailId4List(@RequestParam("sourceDetailId") String sourceDetailId);

    @PostMapping("/mesProcessOutsourcingOut/findOutsourcingStore4BillIssue")
    RespMsgBean<Map<String, MesProcessOutsourcingOut>> findOutsourcingStore4BillIssue(@RequestBody List<MesProduceMaterialBillOrder> outsourcingAllocationReverse);

    @PostMapping("/mesProcessOutsourcingIn/checkDistribute")
    RespMsgBean<CheckDistributeVo> checkDistribute4In(@RequestBody AutoConditionEntity autoConditionEntity);

    @PostMapping("/mesProcessOutsourcingIn/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateIn(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/processOutsourcingSettlement/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateSettlement(@RequestBody ExportWithTemplateDto dto);
    @PostMapping("/processOutsourcingSettlement/defaultPage")
    RespMsgBean<Page<MesProcessOutsourcingSettlement>> defaultPage4Settlement(@RequestBody AutoConditionEntity autoConditionEntity);
    @PostMapping("/processOutsourcingSettlement/findByIds4Map")
    RespMsgBean<Map<String, MesProcessOutsourcingSettlement>> findByIds4SettlementMap(@RequestBody Collection<String> ids);
    @PostMapping("/processOutsourcingSettlementDetail/findByIds4Map")
    RespMsgBean<Map<String, MesProcessOutsourcingSettlementDetail>> findByIds4SettlementDetailMap(@RequestBody Collection<String> ids);
    @PostMapping("/processOutsourcingSettlementDetail/updateList4PurchaseAp")
    RespMsgBean<Integer> updateList4PurchaseAp(@RequestBody List<MesProcessOutsourcingSettlementDetail> list);
}
