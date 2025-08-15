package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SupplierClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.psi.entity.PsiSupplier;
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
 * @ClassName SupplierClient
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/11/7
 */
@FeignClient(value = "psi",fallback = SupplierClientFallback.class)
public interface SupplierClient {

    @PostMapping("/psiSupplier/getById")
    RespMsgBean<PsiSupplier> getById(@RequestParam("id") String id);

    @PostMapping("/psiSupplier/findByIds4Map")
    RespMsgBean<Map<String, PsiSupplier>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/psiSupplier/findByCodes4Map")
    RespMsgBean<Map<String,PsiSupplier>> findByCodes4Map(@RequestBody Collection<String> codes,
                                                         @RequestParam(value = "isGroup", required = false) Integer isGroup);

    @PostMapping("/psiSupplier/findByNames4Map")
    RespMsgBean<Map<String,PsiSupplier>> findByNames4Map(@RequestBody Collection<String> names,
                                                         @RequestParam(value = "isGroup", required = false) Integer isGroup);

    @GetMapping("/psiSupplier/group/findList")
    @ApiOperation("分组列表查询")
    public RespMsgBean<List<PsiSupplier>> findList4Group(@RequestParam(value = "codeOrName", required = false) String codeOrName,
                                                         @RequestParam(value = "withAll", required = false) String withAll);

    @PostMapping("/psiSupplier/defaultList")
    RespMsgBean<List<PsiSupplier>> defaultList(@RequestBody Map<String, Object> queryMap);

    @PostMapping("/psiSupplier/findByList")
    RespMsgBean<List<PsiSupplier>> findByList(@RequestBody AutoConditionEntity autoConditionEntity);

}
