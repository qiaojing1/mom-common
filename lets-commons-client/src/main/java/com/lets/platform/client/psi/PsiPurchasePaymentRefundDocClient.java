package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PsiPurchasePaymentRefundDocClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 应收单 feign接口
 * @author zhangweiyan
 * @date 2025/4/08 15:01
 * @version 1.0
 */
@FeignClient(value = "psi", fallback = PsiPurchasePaymentRefundDocClientFallback.class)
public interface PsiPurchasePaymentRefundDocClient {

    @PostMapping("/psiPurchasePaymentRefundDoc/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);
}
