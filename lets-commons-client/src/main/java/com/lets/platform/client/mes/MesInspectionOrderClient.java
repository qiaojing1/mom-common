package com.lets.platform.client.mes;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.mes.fallback.MesInspectionOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.*;
import com.lets.platform.model.mes.params.InspectSubmitParam;
import com.lets.platform.model.mes.query.SampleQuantityQuery;
import com.lets.platform.model.mes.vo.MesInspectionOrderVO;
import com.lets.platform.model.psi.dto.LimitStoreDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 检验单表 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/5/20 15:43
 */
@FeignClient(value = "mes", fallback = MesInspectionOrderClientFallback.class)
public interface MesInspectionOrderClient {

    @PostMapping("/mesInspectionOrder/defaultSave")
    RespMsgBean<String> defaultSave(@RequestBody(required = false) MesInspectionOrder entity);

    @PostMapping("/mesInspectionOrder/pda-submit")
    RespMsgBean<?> pdaSubmit(@RequestBody InspectSubmitParam param);

    @PostMapping("/mesInspectionOrder/findDetailListByDetailIds")
    RespMsgBean<List<MesInspectionOrderDetail>> findDetailListByDetailIds(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesInspectionOrder/findDetailListByIds")
    RespMsgBean<List<MesInspectionOrderDetail>> findDetailListByIds(@RequestBody Collection<String> ids);

    @PostMapping("/mesInspectionOrder/findUnqualifiedHandleList")
    RespMsgBean<List<MesInspectionOrderDetailUnqualifiedHandle>> findUnqualifiedHandleList(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesInspectionOrder/findByIds4Map")
    RespMsgBean<Map<String, MesInspectionOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesInspectionOrder/findDetailBySourceDetailIds")
    RespMsgBean<Set<String>> findDetailBySourceDetailIds(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesInspectionOrder/queryCount")
    RespMsgBean<Long> queryCount(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesInspectionOrder/findLimitStoreBySourceDetailId4Map")
    RespMsgBean<Map<String, LimitStoreDTO>> findLimitStoreBySourceDetailId4Map(@RequestBody Collection<String> sourceDetailIds);

    @PostMapping("/mesInspectionOrder/queryCrossCheckQuantityBatch")
    RespMsgBean<Set<SampleQuantityQuery>> queryCrossCheckQuantityBatch(@RequestBody Set<SampleQuantityQuery> queryList);

    @PostMapping("/mesInspectionOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/mesInspectionOrder/findReportFormPage")
    RespMsgBean<Page<MesInspectionOrderVO>> findReportForm(@RequestBody AutoConditionEntity autoConditionEntity);

    @GetMapping("/mesInspectionOrder/getSamplingPlanDetail")
    RespMsgBean<SamplingPlanConfigDetail> getSamplingPlanDetail(@RequestParam(value = "samplingPlanId") String samplingPlanId, @RequestParam(value = "batchQuantity") BigDecimal batchQuantity);

    @PostMapping("/mesInspectionItemsValues/findInspectionItemsValues")
    RespMsgBean<List<MesInspectionItemsValues>> getInspectionItemsValues(@RequestBody Set<String> inspectionItemIds);

    @GetMapping("/mesInspectionValues/findInspectionValues")
    RespMsgBean<List<MesInspectionValues>> findInspectionValues();

    @PostMapping("/mesInspectionOrder/isBind")
    RespMsgBean<Boolean> isBind(@RequestBody Set<String> barcodeIds);
    @GetMapping("/mesInspectionOrder/findDetailReportMap")
    RespMsgBean<List<Map<String, Object>>> findDetailReportMap(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime,
                                                                      @RequestParam("businessCodes") String businessCodes);

    @PostMapping("/mesInspectionOrder/findMaxAuditTimeBySourceDetailIds")
    RespMsgBean<MesInspectionOrder> findMaxAuditTimeBySourceDetailIds(@RequestBody Collection<String> sourceDetailIds);

    @GetMapping("/mesInspectionOrder/findByOrderId")
    RespMsgBean<MesInspectionOrder> findByOrderId(@RequestParam("orderId") String orderId);
}
