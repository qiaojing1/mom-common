package com.lets.platform.model.mes.dto;

import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrderDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * IQC回写结果
 * @author: DING WEI
 * @date: 2025/1/20 16:24
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateList4IqcReturnDto {

    private Integer updateNumber;

    private Map<String, PsiPurchaseDeliveryOrderDetail> splitMap;

}
