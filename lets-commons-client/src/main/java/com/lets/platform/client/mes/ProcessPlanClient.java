package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ProcessPlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.mes.entity.MesProcessPlan;
import com.lets.platform.model.mes.entity.MesProcessPlanDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderRouteProcess;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 工序计划 feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/5/28 10:57
 */
@FeignClient(value = "mes", fallback = ProcessPlanClientFallback.class)
public interface ProcessPlanClient {

    @GetMapping("/mesProcessPlan/findById4Do")
    RespMsgBean<MesProcessPlan> findById4Do(@RequestParam("id") String id);

    @PostMapping("/mesProcessPlan/findByIds4Map")
    RespMsgBean<Map<String, MesProcessPlan>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesProcessPlan/detail/findByIds4Map")
    RespMsgBean<Map<String, MesProcessPlanDetail>> findByIds4DetailMap(@RequestBody Collection<String> detailIds);
    @PostMapping("/mesProcessPlan/detail/findMapByTrackNo")
    RespMsgBean<Map<String, List<MesProcessPlan>>> findMapByTrackNo(@RequestBody Collection<String> trackNos);

    @PostMapping("/mesProcessPlan/findByIds4AllColList")
    RespMsgBean<List<MesProcessPlan>> findByIds4AllColList(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesProcessPlan/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/mesProduceOrderRouteProcess/findByIds4Map")
    RespMsgBean<Map<String, MesProduceOrderRouteProcess>> findByIds4RouteProcessMap(@RequestBody Collection<String> ids);

    @GetMapping("/mesProcessPlanDetail/findCanReceiveNum")
    RespMsgBean<MesProcessPlanDetail> findCanReceiveNum(@RequestParam("detailId") String detailId, @RequestParam("detectOrderCode") String detectOrderCode);

    @GetMapping("/mesProcessPlanDetail/findRepairPlanDetailBySourcePlan")
    RespMsgBean<Map<String, List<MesProcessPlanDetail>>> findRepairPlanDetailBySourcePlan(@RequestBody List<String> params);

    @PostMapping("/mesProcessPlanDetail/findMultiPreOrNextProcessBat")
    RespMsgBean<Map<String, Map<String, List<MesProcessPlanDetail>>>> findMultiPreOrNextProcessBat(@RequestBody Map<String, List<String>> params);

    @PostMapping("/mesProcessPlanDetail/findDevice4Dispatch")
    RespMsgBean<List<CommonDevice>> findDevice4Dispatch(@RequestBody  List<String> params);

    @PostMapping("/mesProcessPlan/findOutsourcingOutAndInOrderUnderReview")
    RespMsgBean<Map<String, List<Map<String, Object>>>> findOutsourcingOutAndInOrderUnderReview(@RequestBody Map<String, List<String>> params);

    @GetMapping("/mesProcessPlan/autoComplete")
    RespMsgBean<String> autoComplete(@RequestParam("tenancyId") String tenancyId);

    @GetMapping("/mesProcessPlan/getProcessDetailWithReceiveTime")
    RespMsgBean<List<MesProcessPlanDetail>> getProcessDetailWithReceiveTime(@RequestParam("produceDetailId") String produceDetailId);

    @PostMapping("/mesProcessPlan/getProcessDetailWithReceiveTimeByIds")
    RespMsgBean<Map<String,MesProcessPlanDetail>> getProcessDetailWithReceiveTimeByIds(@RequestBody Collection<String> ids);

    @PostMapping("/mesProcessPlan/findDetailMapByDispatchIds")
    RespMsgBean<Map<String, MesProcessPlanDetail>> findDetailMapByDispatchIds(@RequestBody Collection<String> dispatchIds);
}
