package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.ContractOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 合同管理Feign 接口
 * @author zhangweiyan
 * @date 2024/11/18 14:27
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = ContractOrderClientFallback.class)
public interface ContractOrderClient {

    @PostMapping("/psiContractOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
