package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PsiPurchaseApDocClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiPurchaseApDoc;
import com.lets.platform.model.psi.entity.PsiPurchaseApDocDetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 采购应付单 feign接口
 * @author zhangweiyan
 * @date 2025/3/25 15:01
 * @version 1.0
 */
@FeignClient(value = "psi", fallback = PsiPurchaseApDocClientFallback.class)
public interface PsiPurchaseApDocClient {

    @PostMapping("/psiPurchaseApDoc/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);
    @PostMapping("/psiPurchaseApDoc/autoGenerate")
    @ApiOperation(value = "自动生成应付单")
    RespMsgBean<?> autoGenerate(@RequestBody PsiPurchaseApDoc entity, @RequestParam("targetStatus") Integer targetStatus);

    @GetMapping("/psiPurchaseApDoc/findListBySourceOrderId")
    RespMsgBean<List<PsiPurchaseApDocDetail>> findListBySourceOrderId(@RequestParam("sourceOrderId") String sourceOrderId);
}
