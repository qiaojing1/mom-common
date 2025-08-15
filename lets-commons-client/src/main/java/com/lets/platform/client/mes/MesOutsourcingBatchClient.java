package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesOutsourcingBatchClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 委外合并发出接收
 * @author DING WEI
 * @date 2025/2/11 17:54
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MesOutsourcingBatchClientFallback.class)
public interface MesOutsourcingBatchClient {

    @PostMapping("/processOutsourcingBatchOut/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateOut(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/processOutsourcingBatchIn/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateIn(@RequestBody ExportWithTemplateDto dto);

}
