package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.CooperateDeliveryOrderClientFallback;
import com.lets.platform.client.psi.fallback.PurchaseDeliveryOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcReturnDto;
import com.lets.platform.model.psi.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 采购收货订单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/3/21 14:38
 */
@FeignClient(value = "psi", fallback = CooperateDeliveryOrderClientFallback.class)
public interface CooperateDeliveryOrderClient {

    @PostMapping("/psiCooperateDeliverOrder/saveAndApprove")
    RespMsgBean<Void> saveAndApprove(@RequestBody PsiCooperateDeliverOrder order);

    @PostMapping("/psiCooperateDeliverOrder/findBySourceDetailIds")
    RespMsgBean<Long> findBySourceDetailIds(@RequestBody List<String> detailIds);
}
