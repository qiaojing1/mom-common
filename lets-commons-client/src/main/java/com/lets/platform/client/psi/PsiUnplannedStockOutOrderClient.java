package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PsiUnplannedStockOutOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiUnplannedStockOutOrder;
import com.lets.platform.model.psi.entity.PsiUnplannedStockOutOrderMaterial;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;

/**
 * 计划外出库 feign接口
 * @author DING WEI
 * @date 2024/6/27 15:01
 * @version 1.0
 */
@FeignClient(value = "psi", fallback = PsiUnplannedStockOutOrderClientFallback.class)
public interface PsiUnplannedStockOutOrderClient {

    @PostMapping("/psiUnplannedStockOutOrder/saveAndPosting")
    RespMsgBean<Void> saveAndPosting(@RequestBody PsiUnplannedStockOutOrder order);

    @PostMapping("/psiUnplannedStockOutOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiUnplannedStockOutOrder/findBySourceDetailIds")
    RespMsgBean<List<PsiUnplannedStockOutOrderMaterial>> findBySourceDetailIds(@RequestBody Collection<String> sourceDetailIds);
}
