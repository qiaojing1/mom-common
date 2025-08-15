package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ProcessReportClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.annotation.EnableLog;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.mes.dto.ReportDto;
import com.lets.platform.model.mes.entity.MesProcessReport;
import com.lets.platform.model.mes.entity.MesProcessReportDetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 工序汇报单 feign接口
 * @author DING WEI
 * @date 2024/5/22 14:09
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = ProcessReportClientFallback.class)
public interface ProcessReportClient {

    @PostMapping("/mesProcessReport/findByIds4Map")
    RespMsgBean<Map<String, MesProcessReport>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesProcessReportDetail/findByIds4Map")
    RespMsgBean<Map<String, MesProcessReportDetail>> findByIds4DetailMap(@RequestBody Collection<String> ids);

    @PostMapping("/mesProcessReportDetail/findByIds4DetailList")
    RespMsgBean<List<MesProcessReportDetail>> findByIds4DetailList(@RequestBody Collection<String> ids);

    @PostMapping("/mesProcessReportDetail/updateList4StockIn")
    RespMsgBean<Integer> updateList4StockIn(@RequestBody List<MesProcessReportDetail> list);

    @PostMapping("/mesProcessReport/report")
    RespMsgBean report(@Validated @RequestBody ReportDto reportDto);
}
