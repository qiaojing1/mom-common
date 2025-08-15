package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PsiPurchaseApDocClient;
import com.lets.platform.client.psi.PsiUnplannedStockOutOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiPurchaseApDoc;
import com.lets.platform.model.psi.entity.PsiPurchaseApDocDetail;
import com.lets.platform.model.psi.entity.PsiUnplannedStockOutOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 采购应付单 服务降级
 * @author zhangweiyan
 * @date 2025/3/25 15:32
 * @version 1.0
 */
@Service
public class PsiPurchaseApDocClientFallback extends BaseController implements PsiPurchaseApDocClient {


    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<?> autoGenerate(PsiPurchaseApDoc entity, Integer targetStatus) {
        return success(FAILURE);
    }

    @Override
    public RespMsgBean<List<PsiPurchaseApDocDetail>> findListBySourceOrderId(String id) {
        return success(FAILURE);
    }
}
