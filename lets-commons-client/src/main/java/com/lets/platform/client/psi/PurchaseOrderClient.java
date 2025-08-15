package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PurchaseOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiMaterialInTransitQuery;
import com.lets.platform.model.psi.entity.PsiPurchaseApplyOrderDetails;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 采购订单Feign 接口
 * @author DING WEI
 * @date 2023/10/19 14:27
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = PurchaseOrderClientFallback.class)
public interface PurchaseOrderClient {

    @PostMapping("/psiPurchaseOrder/getDate4ExportTemplate")
    RespMsgBean<Date4ExportTemplateVo> getDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiPurchaseOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiPurchaseOrder/findInTransit")
    RespMsgBean<List<PsiPurchaseOrderDetail>> findInTransit(@RequestBody PsiMaterialInTransitQuery query);

    @PostMapping("/psiPurchaseApplyOrder/findInTransit")
    RespMsgBean<List<PsiPurchaseApplyOrderDetails>> findInTransitApply(@RequestBody PsiMaterialInTransitQuery query);

    @GetMapping("/psiPurchaseOrder/getOrderCount")
    RespMsgBean<Long> getOrderCount();

    @PostMapping("/psiPurchaseOrder/findIdsBySourceOrderIdsStatus")
    RespMsgBean<Set<String>> findIdsBySourceOrderIdsStatus(@RequestBody Collection<String> sourceOrderIds, @RequestParam("ltStatus") Integer ltStatus);

    @PostMapping("/psiPurchaseOrder/closeBySourceDetailIds")
    RespMsgBean closeBySourceDetailIds(@RequestBody Collection<String> sourceDetailIds);

    @PostMapping("/psiPurchaseOrderDetail/defaultDisable")
    RespMsgBean<List<BaseBatchInformationVO>> defaultDisable(@RequestBody List<PsiPurchaseOrderDetail> list, @RequestParam(value = "force", required = false) String force);

    @PostMapping("/psiPurchaseOrderDetail/findByIds4Map")
    RespMsgBean<Map<String, PsiPurchaseOrderDetail>> findByIds4Map(@RequestBody List<String> ids);

    @PostMapping("/psiPurchaseOrderDetail/updateInspectNumber")
    RespMsgBean updateInspectNumber(@RequestBody List<PsiPurchaseOrderDetail> details);
}
