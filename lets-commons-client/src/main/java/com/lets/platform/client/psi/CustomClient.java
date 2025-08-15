package com.lets.platform.client.psi;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.psi.fallback.CustomClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.psi.entity.PsiCustom;
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
 * 客户Feign接口
 * @author DING WEI
 * @date 2023/7/5 17:38
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = CustomClientFallback.class)
public interface CustomClient {

    @GetMapping("/psiCustom/findById4Do")
    RespMsgBean<PsiCustom> findById4Do(@RequestParam("id") String id);
    @PostMapping("/psiCustom/findByIds4Map")
    RespMsgBean<Map<String, PsiCustom>> findByIds4Map(@RequestBody Collection<String> ids);
    @PostMapping("/psiCustom/findByNames4Map")
    RespMsgBean<Map<String, PsiCustom>> findByNames4Map(@RequestBody Collection<String> names);

    @PostMapping("/psiCustom/findOrgQuoteTimes")
    RespMsgBean<Map<String, Integer>> findOrgQuoteTimes(@RequestBody Collection<String> orgIds);
    @PostMapping("/psiCustom/findUserQuoteTimes")
    RespMsgBean<Map<String, Integer>> findUserQuoteTimes(@RequestBody Collection<String> userIds);
    @PostMapping("/psiCustom/findTaxQuoteTimes")
    RespMsgBean<Map<String, Integer>> findTaxQuoteTimes(@RequestBody Collection<String> taxIds);
    @PostMapping("/psiCustom/findCurrencyQuoteTimes")
    RespMsgBean<Map<String, Integer>> findCurrencyQuoteTimes(@RequestBody Collection<String> currencyIds);
    @PostMapping("/psiCustom/findList")
    public RespMsgBean<List<PsiCustom>> findList(@RequestBody PsiCustom query);
    @PostMapping("/psiCustom/defaultPage")
    RespMsgBean<Page<PsiCustom>> defaultPage(@RequestBody() AutoConditionEntity autoConditionEntity);
}
