package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PsiPurchaseApDocClientFallback;
import com.lets.platform.client.psi.fallback.PsiReservationClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiPurchaseApDoc;
import com.lets.platform.model.psi.entity.PsiPurchaseApDocDetail;
import com.lets.platform.model.psi.entity.PsiReservationRelationship;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 采购应付单 feign接口
 * @author zhangweiyan
 * @date 2025/3/25 15:01
 * @version 1.0
 */
@FeignClient(value = "psi", fallback = PsiReservationClientFallback.class)
public interface PsiReservationClient {

    @PostMapping("/psiReservationRelationship/getUseStoreListBatch")
    RespMsgBean<Map<String, List<PsiReservationRelationship>>> getUseStoreListBatch(@RequestBody Collection<String> useIds);
}
