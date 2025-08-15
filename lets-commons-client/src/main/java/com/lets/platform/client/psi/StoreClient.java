package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.StoreClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiStoragePosition;
import com.lets.platform.model.psi.entity.PsiStorageStore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = StoreClientFallback.class)
public interface StoreClient {

    @GetMapping("/psiStorageStore/findById4Do")
    RespMsgBean<PsiStorageStore> findById4Do(@RequestParam("id") String id);
    @PostMapping("/psiStorageStore/findByIds4Map")
    RespMsgBean<Map<String, PsiStorageStore>> findByIds4Map(@RequestBody Collection<String> ids);
    @PostMapping("/psiStorageStore/findByIds4MapAndJunior")
    RespMsgBean<Map<String, PsiStorageStore>> findByIds4MapAndJunior(@RequestBody Collection<String> ids);
    @PostMapping("/psiStorageStore/findByCodes4Map")
    RespMsgBean<Map<String, PsiStorageStore>> findByCodes4Map(@RequestBody Collection<String> codes);
    @PostMapping("/psiStorageStore/findByNames4Map")
    RespMsgBean<Map<String, PsiStorageStore>> findByNames4Map(@RequestBody Collection<String> names);
    @PostMapping("/psiStorageStore/findList4Power")
    RespMsgBean<List<PsiStorageStore>> findList4Power(@RequestBody Collection<String> ids);
    @GetMapping("/psiStorageStore/getListInCharge")
    RespMsgBean<List<PsiStorageStore>> getListInCharge(@RequestParam(value = "userId",required = false) String userId);
    @PostMapping("/psiStorageStore/getListInCharges")
    RespMsgBean<List<PsiStorageStore>> getListInCharges(@RequestBody Collection<String> userIds);
    @PostMapping("/psiStorageStore/findShelvingPosition")
    RespMsgBean<List<PsiStoragePosition>> findShelvingPosition(@RequestBody Collection<String> ids);

    @PostMapping("/psiStorageStore/findMapByFactoryModeIds")
    RespMsgBean<Map<String, PsiStorageStore>> findMapByFactoryModeIds(@RequestBody Collection<String> factoryModeIds);
    @PostMapping("/psiStorageStore/findMapBySupplierIds")
    RespMsgBean<Map<String, PsiStorageStore>> findMapBySupplierIds(@RequestBody Collection<String> supplierIds);
}
