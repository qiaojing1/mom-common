package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.OrderCategoryClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiBusinessConfig;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import com.lets.platform.model.psi.entity.PsiOrderCategoryDetailField;
import com.lets.platform.model.psi.entity.PsiOrderCategoryLimit;
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
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@FeignClient(value = "psi", fallback = OrderCategoryClientFallback.class)
public interface OrderCategoryClient {

    @GetMapping("/psiOrderCategory/findById4Do")
    RespMsgBean<PsiOrderCategory> findById4Do(@RequestParam("id") String id);
    @GetMapping("/psiOrderCategory/findById4DoWithLimit")
    RespMsgBean<PsiOrderCategory> findById4DoWithLimit(@RequestParam("id") String id);

    @GetMapping("/psiOrderCategory/findByCodeReturnInfoAndDetail")
    RespMsgBean<PsiOrderCategory> findByCodeReturnInfoAndDetail(@RequestParam("tenancyId") String tenancyId,
                                                                @RequestParam("code") String code);

    @GetMapping("/psiOrderCategory/findByIdReturnInfoAndDetail")
    RespMsgBean<PsiOrderCategory> findByIdReturnInfoAndDetail(@RequestParam("id") String id);

    @PostMapping("/psiOrderCategory/findByCodes4Map")
    RespMsgBean<Map<String, PsiOrderCategory>> findByCodes4Map(@RequestBody Collection<String> codes);
    @PostMapping("/psiOrderCategory/findByNames4Map")
    RespMsgBean<Map<String, PsiOrderCategory>> findByNames4Map(@RequestBody Collection<String> names);

    @GetMapping("/psiOrderCategory/findDefaultByOrderNature")
    RespMsgBean<PsiOrderCategory> findDefaultByOrderNature(@RequestParam(value = "tenancyId") String tenancyId, @RequestParam(value = "orderNature") String orderNature);

    @GetMapping("/psiOrderCategoryDetailField/findByOrderId")
    RespMsgBean<List<PsiOrderCategoryDetailField>> findByOrderId(@RequestParam(value = "orderNature") String orderNature,
                                                                 @RequestParam(value = "orderId", required = false) String orderId);

    @PostMapping("/psiOrderCategory/findByIds4Map")
    RespMsgBean<Map<String, PsiOrderCategory>> findByIds4Map(@RequestBody Collection<String> ids);

    @GetMapping("/psiOrderCategory/getListByMenuCode")
    RespMsgBean<List<PsiOrderCategory>> getListByMenuCode(@RequestParam(value = "menuCode", required = false) String menuCode);

    @GetMapping("/psiOrderCategory/getDefaultByBusinessCode")
    RespMsgBean<PsiOrderCategory> getDefaultByBusinessCode(@RequestParam(value = "businessCode") String businessCode);

    @GetMapping("/psiOrderCategory/getListByBusinessCode")
    RespMsgBean<List<PsiOrderCategory>> getListByBusinessCode(@RequestParam(value = "businessCode") String businessCode);

    @PostMapping("/psiOrderCategory/getListByMenuCodes")
    RespMsgBean<List<PsiOrderCategory>> getListByMenuCodes(@RequestBody List<String> menuCodes);

    @GetMapping("/psiOrderCategory/findLimitsByParentId")
    RespMsgBean<List<PsiOrderCategoryLimit>> findLimitsByParentId(@RequestParam("id") String id);

    @PostMapping("/psiOrderCategory/findBusinessConfig")
    RespMsgBean<List<PsiBusinessConfig>> findBusinessConfig(@RequestBody Map<String, Object> map);
}
