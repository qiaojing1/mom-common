package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.CooperateDeliveryOrderClient;
import com.lets.platform.client.psi.PurchaseDeliveryOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcReturnDto;
import com.lets.platform.model.psi.entity.PsiCooperateDeliverOrder;
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
public class CooperateDeliveryOrderClientFallback extends BaseController implements CooperateDeliveryOrderClient {

    @Override
    public RespMsgBean<Void> saveAndApprove(PsiCooperateDeliverOrder order) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Long> findBySourceDetailIds(List<String> detailIds) {
        return failure(FAILURE);
    }

}
