package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PurchasePriceListClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiMaterialPurchase;
import com.lets.platform.model.psi.query.PurchasePriceQuery4Analysis;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 采购价目表 feign接口 服务降级
 * @author DING WEI
 * @date 2024/12/18 18:07
 * @version 1.0
 */
@Service
public class PurchasePriceListClientFallback extends BaseController implements PurchasePriceListClient {

    @Override
    public RespMsgBean<Map<String, PsiMaterialPurchase>> findPriceQuery4Analysis(PurchasePriceQuery4Analysis query4Analysis) {
        return success(SUCCESS, new HashMap<>());
    }
}
