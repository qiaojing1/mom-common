package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PurchaseDeliveryOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcReturnDto;
import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrder;
import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrderDetail;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetailSpecific;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 采购收货订单Feign接口降级
 * @author DING WEI
 * @date 2024/3/21 14:40
 * @version 1.0
 */
@Service
public class PurchaseDeliveryOrderClientFallback extends BaseController implements PurchaseDeliveryOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Long> getOrderCount() {
        return success(SUCCESS, 0L);
    }

    @Override
    public RespMsgBean<Map<String, PsiPurchaseDeliveryOrderDetail>> findByDetailIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiPurchaseDeliveryOrder>> findByIds4Map(Collection<String> ids) {
        return failure();
    }

    @Override
    public RespMsgBean<Integer> updateList(List<PsiPurchaseDeliveryOrderDetail> updateList) {
        return failure(FAILURE, null);
    }

    @Override
    public RespMsgBean<UpdateList4IqcReturnDto> updateList4Iqc(UpdateList4IqcDto dto) {
        return failure(FAILURE, UpdateList4IqcReturnDto.builder().updateNumber(GlobalConstant.ZERO).splitMap(new HashMap<>()).build());
    }

    @Override
    public RespMsgBean<Map<String, Integer>> findStockInEdSource(Collection<String> sourceDetailIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<PsiPurchaseOrderDetailSpecific>>> findSpecificByDetailIds4Map(Collection<String> detailsIds) {
        return failure();
    }

    @Override
    public RespMsgBean<String> writeBackNumber(Map<String, Integer> sourceDetailIdMapDeviceCount) {
        return failure();
    }

    @Override
    public RespMsgBean<Void> saveAndApprove(PsiPurchaseDeliveryOrder order) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Long> findBySourceDetailIds(List<String> detailIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Integer> delByDetectOrderCode(List<CollectionDetectOrder> list) {
        return failure(FAILURE);
    }

}
