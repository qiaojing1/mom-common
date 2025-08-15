package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PurchaseOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiMaterialInTransitQuery;
import com.lets.platform.model.psi.entity.PsiPurchaseApplyOrderDetails;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

/**
 * 采购订单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@Service
public class PurchaseOrderClientFallback extends BaseController implements PurchaseOrderClient {

    @Override
    public RespMsgBean<Date4ExportTemplateVo> getDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiPurchaseOrderDetail>> findInTransit(@RequestBody PsiMaterialInTransitQuery query) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiPurchaseApplyOrderDetails>> findInTransitApply(PsiMaterialInTransitQuery query) {
        return failure();
    }

    @Override
    public RespMsgBean<Long> getOrderCount() {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Set<String>> findIdsBySourceOrderIdsStatus(Collection<String> sourceOrderIds, Integer notStatus) {
        return failure(FIND_FAILURE);
    }

    @Override
    public RespMsgBean closeBySourceDetailIds(Collection<String> sourceDetailIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<BaseBatchInformationVO>> defaultDisable(List<PsiPurchaseOrderDetail> list, String force) {
        return failure(FAILURE, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiPurchaseOrderDetail>> findByIds4Map(List<String> ids) {
        return failure(FIND_FAILURE);
    }

    @Override
    public RespMsgBean updateInspectNumber(List<PsiPurchaseOrderDetail> details) {
        return failure(FIND_FAILURE);
    }

}
