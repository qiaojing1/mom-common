package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.DetectBatchReportClientFallback;
import com.lets.platform.client.collection.fallback.DetectReportClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 批次实验报告
 * @author: QIAO JING
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection",fallback = DetectBatchReportClientFallback.class)
public interface DetectBatchReportClient {

    @PostMapping("/collectionDetectBatchReport/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
