package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.AreaClientFallback;
import com.lets.platform.client.psi.fallback.ReceiptOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = ReceiptOrderClientFallback.class)
public interface ReceiptOrderClient {

    @GetMapping("/psiReceiptOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
