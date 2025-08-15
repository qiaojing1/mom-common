package com.lets.platform.client.psi;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiPlanProgram;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 计划运算
 */
@FeignClient(value = "psi")
public interface PlanCalculationClient {
    @GetMapping("/psiPlanProgram/defaultFindById")
    RespMsgBean<PsiPlanProgram> findById(@RequestParam("id") String id);
}
