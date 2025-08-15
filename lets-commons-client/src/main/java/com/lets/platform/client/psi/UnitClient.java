package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.UnitClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiUnit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 计量单位Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "psi", fallback = UnitClientFallback.class)
public interface UnitClient {

    @GetMapping("/psiUnit/getByIdOrCode")
    RespMsgBean<PsiUnit> getByIdOrCode(@RequestParam("idOrCode") String idOrCode);

    @GetMapping("/psiUnit/findById4Do")
    RespMsgBean<PsiUnit> findById4Do(@RequestParam("id") String id);

    @PostMapping("/psiUnit/findByIds4Map")
    RespMsgBean<Map<String, PsiUnit>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/psiUnit/findByNames4Map")
    RespMsgBean<Map<String, PsiUnit>> findByNames4Map(@RequestBody Collection<String> names);

    @PostMapping("/psiUnit/findByCodes4Map")
    RespMsgBean<Map<String, PsiUnit>> findByCodes4Map(@RequestBody Collection<String> codes);

    @GetMapping("/psiUnit/getAll4Map")
    RespMsgBean<Map<String, PsiUnit>> getAll4Map();

    @GetMapping("/psiUnit/getTenancyUnitList")
    RespMsgBean<List<PsiUnit>> getTenancyUnitList(@RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/psiUnit/listByIds")
    RespMsgBean<List<PsiUnit>> listByIds(@RequestBody Set<String> ids);
}
