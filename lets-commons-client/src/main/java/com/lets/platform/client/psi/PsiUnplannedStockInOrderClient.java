package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PsiUnplannedStockInOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiUnplannedStockInOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 计划外入库 feign接口
 * @author DING WEI
 * @date 2024/4/23 15:31
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = PsiUnplannedStockInOrderClientFallback.class)
public interface PsiUnplannedStockInOrderClient {

    @PostMapping("/psiUnplannedStockInOrder/generateAndSubmitAuditPosting")
    RespMsgBean<String> generateAndSubmitAuditPosting(@RequestBody PsiUnplannedStockInOrder order);

    @PostMapping("/psiUnplannedStockInOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);
}
