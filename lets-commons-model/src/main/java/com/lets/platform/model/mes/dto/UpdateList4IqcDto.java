package com.lets.platform.model.mes.dto;

import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrderDetail;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * IQC回写
 * @author: DING WEI
 * @date: 2025/1/20 16:24
 */
@Data
public class UpdateList4IqcDto {

    private Map<String, PsiPurchaseDeliveryOrderDetail> deliveryDetailMap;

    /** 更新集合 */
    private List<PsiPurchaseDeliveryOrderDetail> updateList;
    /** 拆分集合 */
    private List<PsiPurchaseDeliveryOrderDetail> splitList;

    /** 修改采购收货单数量的源单主键(采购订单) */
    private Set<String> editNumberIds;

}
