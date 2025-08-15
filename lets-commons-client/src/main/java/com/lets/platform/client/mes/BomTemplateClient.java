package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.BomTemplateClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiMaterial;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * BOM模板 Feign接口
 * @author DING WEI
 * @date 2025/7/28 14:51
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = BomTemplateClientFallback.class)
public interface BomTemplateClient {

    @PostMapping("/mesBomTemplate/autoCreateBomByBomTemplate")
    RespMsgBean<String> autoCreateBomByBomTemplate(@RequestBody PsiMaterial entity);

}
