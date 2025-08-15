package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.AreaClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = AreaClientFallback.class)
public interface AreaClient {

    @GetMapping("/psiStorageArea/findById4Do")
    RespMsgBean<PsiStorageArea> findById4Do(@RequestParam("id") String id);
    @PostMapping("/psiStorageArea/findByIds4Map")
    RespMsgBean<Map<String, PsiStorageArea>> findByIds4Map(@RequestBody Collection<String> ids);
    @PostMapping("/psiStorageArea/findByCodes4Map")
    RespMsgBean<Map<String, PsiStorageArea>> findByCodes4Map(@RequestBody Collection<String> codes);
    @PostMapping("/psiStorageArea/findByNames4Map")
    RespMsgBean<Map<String, PsiStorageArea>> findByNames4Map(@RequestBody Collection<String> names);

}
