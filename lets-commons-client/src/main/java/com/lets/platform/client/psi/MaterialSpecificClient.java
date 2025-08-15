package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.MaterialSpecificClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiMaterialSpecific;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料特征管理Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "psi",fallback = MaterialSpecificClientFallback.class)
public interface MaterialSpecificClient {

    @GetMapping("/psiMaterialSpecific/findById4Do")
    RespMsgBean<PsiMaterialSpecific> findById4Do(@RequestParam("id") String id);
    @PostMapping("/psiMaterialSpecific/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterialSpecific>> findByIds4Map(@RequestBody Collection<String> ids);
    @PostMapping("/psiMaterialSpecific/findQuoteTimes")
    RespMsgBean<Map<String, Integer>> findQuoteTimes(@RequestBody Collection<String> userDictIds);
    @GetMapping("/psiMaterialSpecific/getByTenancyId")
    RespMsgBean<List<PsiMaterialSpecific>> getByTenancyId();
}
