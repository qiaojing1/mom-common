package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SpaceAnalysisClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiSpecsAnalysis;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "psi", fallback = SpaceAnalysisClientFallback.class)
public interface SpaceAnalysisClient {
    @GetMapping("/psiSpecsAnalysis/analysisBySpecs")
    RespMsgBean<Map<String, Object>> analysis(@RequestParam("specs") String specs);

    @GetMapping("/psiSpecsAnalysis/defaultFindById")
    RespMsgBean<PsiSpecsAnalysis> defaultFindById(@RequestParam("id") String id);
}
