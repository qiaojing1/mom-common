package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.ProducePlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiProducePlan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ProducePlanClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = ProducePlanClientFallback.class)
public interface ProducePlanClient {

    @PostMapping("/psiProducePlan/resetPlanStatus")
    RespMsgBean<Integer> resetPlanStatus(@RequestBody List<PsiProducePlan> list);

    @GetMapping("/psiProducePlan/findById")
    RespMsgBean<PsiProducePlan> findById(@RequestParam("id") String id);
}
