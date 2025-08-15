package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PurchaseDeliveryOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.annotation.EnableLog;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.common.pojo.base.FlowableProcess;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.model.base.enums.OrderStatusEnum;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.mes.dto.UpdateList4IqcDto;
import com.lets.platform.model.mes.dto.UpdateList4IqcReturnDto;
import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrder;
import com.lets.platform.model.psi.entity.PsiPurchaseDeliveryOrderDetail;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetailSpecific;
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
@FeignClient(value = "psi", fallback = PurchaseDeliveryOrderClientFallback.class)
public interface PurchaseDeliveryOrderClient {

    @PostMapping("/purchaseDeliveryOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/purchaseDeliveryOrder/getOrderCount")
    RespMsgBean<Long> getOrderCount();

    @PostMapping("/purchaseDeliveryOrderDetail/findByIds4Map")
    RespMsgBean<Map<String, PsiPurchaseDeliveryOrderDetail>> findByDetailIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/purchaseDeliveryOrder/findByIds4Map")
    RespMsgBean<Map<String, PsiPurchaseDeliveryOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/purchaseDeliveryOrderDetail/updateList")
    RespMsgBean<Integer> updateList(@RequestBody List<PsiPurchaseDeliveryOrderDetail> updateList);
    @PostMapping("/purchaseDeliveryOrderDetail/updateList4Iqc")
    RespMsgBean<UpdateList4IqcReturnDto> updateList4Iqc(@RequestBody UpdateList4IqcDto dto);

    @PostMapping("/psiPurchaseStockInOrder/findStockInEdSource")
    RespMsgBean<Map<String, Integer>> findStockInEdSource(@RequestBody Collection<java.lang.String> sourceDetailIds);


    @PostMapping("/purchaseDeliveryOrderDetailCharacteristic/findByDetailIds4Map")
    RespMsgBean<Map<String, List<PsiPurchaseOrderDetailSpecific>>> findSpecificByDetailIds4Map(@RequestBody Collection<String> detailsIds);

    @PostMapping("/purchaseDeliveryOrderDetail/writeBackNumber")
    RespMsgBean<String> writeBackNumber(@RequestBody Map<String, Integer> sourceDetailIdMapDeviceCount);

    @PostMapping("/purchaseDeliveryOrder/saveAndApprove")
    RespMsgBean<Void> saveAndApprove(@RequestBody PsiPurchaseDeliveryOrder order);

    @PostMapping("/purchaseDeliveryOrderDetail/findBySourceDetailIds")
    RespMsgBean<Long> findBySourceDetailIds(@RequestBody List<String> detailIds);

    @PostMapping("/purchaseDeliveryOrderDetail/delByDetectOrderCode")
    RespMsgBean<Integer> delByDetectOrderCode(@RequestBody List<CollectionDetectOrder> list);
}
