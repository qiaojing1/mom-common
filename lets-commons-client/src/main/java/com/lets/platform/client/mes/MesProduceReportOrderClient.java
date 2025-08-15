package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProduceReportOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.ReportDto;
import com.lets.platform.model.mes.entity.MesProduceReportOrder;
import com.lets.platform.model.mes.entity.MesProduceReportOrderDetail;
import com.lets.platform.model.mes.entity.MesProduceReportOrderDetailSerial;
import com.lets.platform.model.mes.vo.ProduceReportNumberVo;
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
@FeignClient(value = "mes", fallback = MesProduceReportOrderClientFallback.class)
public interface MesProduceReportOrderClient {

    @PostMapping("/mesProduceReportOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/mesProduceReportOrder/getBarcodeInfo")
    RespMsgBean<List<MesProduceReportOrder>> getBarcodeInfo(@RequestParam("detailIds") Collection<String> detailIds);

    @GetMapping("/mesProduceReportOrderDetail/getById")
    RespMsgBean<MesProduceReportOrderDetail> getDetailByDetailId(@RequestParam("id") String id);

    @GetMapping("/mesProduceReportOrderDetail/getDetailsByDetailIds")
    RespMsgBean<List<MesProduceReportOrderDetail>> getDetailsByDetailIds(@RequestParam("ids") Collection<String> ids);

    @GetMapping("/mesProduceReportOrder/defaultFindById")
    RespMsgBean<MesProduceReportOrder> defaultFindById(@RequestParam("id") String id);

    @PostMapping("/mesProduceReportOrder/findByIds4Map")
    RespMsgBean<Map<String, MesProduceReportOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @GetMapping("/mesProduceReportOrder/getSerialList")
    RespMsgBean<List<MesProduceReportOrderDetailSerial>> getSerialList(@RequestParam("detailIds") Collection<String> detailIds);

    @PostMapping("/mesProduceReportOrder/generateProduceReportOrder4Sjdj")
    RespMsgBean<MesProduceReportOrder> generateProduceReportOrder4Sjdj(@RequestBody ReportDto reportDto);

    @GetMapping("/mesProduceReportOrder/findCountBySourceDetailIdAndToday")
    RespMsgBean<Long> findCountBySourceDetailIdAndToday(@RequestParam("sourceDetailId") String sourceDetailId);

    @GetMapping("/mesProduceReportOrder/findNumberBySourceDetailIdAndToday")
    RespMsgBean<ProduceReportNumberVo> findNumberBySourceDetailIdAndToday(@RequestParam("sourceDetailId") String sourceDetailId);
}
