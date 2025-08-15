package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.CooperateQuoteClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 协同报价单
 * @author DING WEI
 * @date 2025/3/28 15:24
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = CooperateQuoteClientFallback.class)
public interface CooperateQuoteClient {

    @PostMapping("/psiCooperateQuoteOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
