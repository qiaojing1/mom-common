package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PurchaseStockInClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiPurchaseStockInOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 销售退货单 接口
 */
@FeignClient(value = "psi", fallback = PurchaseStockInClientFallback.class)
public interface PurchaseStockInClient {

    @PostMapping("/psiPurchaseStockInOrder/saveAndPosting")
    RespMsgBean<?> saveAndPosting(@RequestBody PsiPurchaseStockInOrder stockInOrder);
    @PostMapping("/psiPurchaseStockInOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto templateDto);
    @GetMapping("/psiPurchaseStockInOrder/findStockInWithDelivery")
    RespMsgBean<Map<String, Object>> findStockInWithDelivery();
    @GetMapping("/psiPurchaseStockInOrder/findStockInCount")
    RespMsgBean<Map<String, List<BigDecimal>>> findStockInCount(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime,
                                                          @RequestParam("queryType") String queryType);
    @GetMapping("/psiPurchaseStockInOrder/actualMaterialCollection")
    RespMsgBean<Map<String, List<BigDecimal>>> actualMaterialCollection(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime,
                                                                               @RequestParam("queryType") String queryType);
}
