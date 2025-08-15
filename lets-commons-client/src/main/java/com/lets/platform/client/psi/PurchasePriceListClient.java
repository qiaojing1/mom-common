package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PurchasePriceListClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiMaterialPurchase;
import com.lets.platform.model.psi.query.PurchasePriceQuery4Analysis;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 采购价目表 feign接口
 * @author DING WEI
 * @date 2024/12/18 18:07
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = PurchasePriceListClientFallback.class)
public interface PurchasePriceListClient {

    @PostMapping("/psiPurchasePriceList/findPriceQuery4Analysis")
    RespMsgBean<Map<String, PsiMaterialPurchase>> findPriceQuery4Analysis(@RequestBody PurchasePriceQuery4Analysis query4Analysis);

}
