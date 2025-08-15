package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.StoreMaterialClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiMaterialStoreNumberQuery;
import com.lets.platform.model.psi.entity.PsiMaterialStoreQuery;
import com.lets.platform.model.psi.entity.PsiStoreMaterial;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * StoreMaterialClient
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@FeignClient(value = "psi", fallback = StoreMaterialClientFallback.class)
public interface StoreMaterialClient {

    @PostMapping("/psiStoreMaterial/findStoreNumber")
    RespMsgBean<List<PsiMaterialStoreNumberQuery>> findStoreNumber(@RequestBody List<PsiMaterialStoreNumberQuery> numberQueries);

    @PostMapping("/psiStoreMaterial/findStoreNumber4Bill")
    RespMsgBean<List<PsiMaterialStoreNumberQuery>> findStoreNumber4Bill(@RequestBody List<PsiMaterialStoreNumberQuery> numberQueries,
                                                                        @RequestParam("storeType") String storeType);

    @PostMapping("/psiStoreMaterial/findByMaterialAndStore")
    RespMsgBean<List<PsiStoreMaterial>> findByMaterialAndStore(@RequestBody PsiMaterialStoreQuery query);

    @PostMapping("/psiStoreMaterial/findStoreNumberByMaterialIds")
    RespMsgBean<Map<String, PsiMaterialStoreNumberQuery>> findStoreNumberByMaterialIds(@RequestBody List<PsiMaterialStoreNumberQuery> queryList);

    @PostMapping("/psiStoreMaterial/findStoreNumberKeyMapByMaterialIds")
    RespMsgBean<Map<String, PsiMaterialStoreNumberQuery>> findStoreNumberKeyMapByMaterialIds(@RequestBody List<PsiMaterialStoreNumberQuery> queryList);
}
