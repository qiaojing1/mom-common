package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.MaterialGroupClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiMaterialGroup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Map;

/**
 * 物料分组Feign接口
 * @author DING WEI
 * @date 2024/3/18 14:07
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = MaterialGroupClientFallback.class)
public interface MaterialGroupClient {

    @PostMapping("/psiMaterialGroup/findByCode4Map")
    RespMsgBean<Map<String, PsiMaterialGroup>> findByCode4Map(@RequestBody Collection<String> groupCodes);

    @PostMapping("/psiMaterialGroup/findByIds4Map")
    public RespMsgBean<Map<String, PsiMaterialGroup>> findByIds4Map(@RequestBody Collection<String> groupIds);
}
