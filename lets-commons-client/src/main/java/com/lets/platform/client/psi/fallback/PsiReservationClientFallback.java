package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PsiPurchaseApDocClient;
import com.lets.platform.client.psi.PsiReservationClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiPurchaseApDoc;
import com.lets.platform.model.psi.entity.PsiPurchaseApDocDetail;
import com.lets.platform.model.psi.entity.PsiReservationRelationship;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 采购应付单 服务降级
 * @author zhangweiyan
 * @date 2025/3/25 15:32
 * @version 1.0
 */
@Service
public class PsiReservationClientFallback extends BaseController implements PsiReservationClient {


    @Override
    public RespMsgBean<Map<String, List<PsiReservationRelationship>>> getUseStoreListBatch(Collection<String> useIds) {
        return success(new HashMap<>());
    }
}
