package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.StepTransferInOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 分步调出单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@FeignClient(value = "psi",fallback = StepTransferInOrderClientFallback.class)
public interface StepTransferInOrderClient {

    @PostMapping("/psiStepTransferInOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);
}
