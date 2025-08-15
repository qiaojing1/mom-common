package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmDepreciationSchemeClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.tpm.entity.TpmDepreciationScheme;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Map;

/**
 * TpmDepreciationSchemeClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmDepreciationSchemeClientFallback.class)
public interface TpmDepreciationSchemeClient {

    @PostMapping("/tpmDepreciationScheme/findByIds4Map")
    RespMsgBean<Map<String, TpmDepreciationScheme>> findByIds4Map(@RequestBody() Collection<String> ids);

}
