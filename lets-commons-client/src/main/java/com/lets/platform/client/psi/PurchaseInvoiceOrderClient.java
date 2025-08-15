package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PurchaseInvoiceOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 采购发票登记Feign 接口
 * @author DING WEI
 * @date 2024/4/8 16:47
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = PurchaseInvoiceOrderClientFallback.class)
public interface PurchaseInvoiceOrderClient {

    @PostMapping("/psiPurchaseInvoiceOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/psiPurchaseInvoiceOrder/getOrderCount")
    RespMsgBean<Long> getOrderCount();

}
