package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SaleOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.dto.UpdateSaleOrderQuantityDTO;
import com.lets.platform.model.psi.entity.PsiSaleOrder;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterial;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterialDemand;
import com.lets.platform.model.psi.vo.PsiSaleOrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 销售订单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@FeignClient(value = "psi", fallback = SaleOrderClientFallback.class)
public interface SaleOrderClient {

    @GetMapping("/psiSaleOrder/getOrderCount")
    RespMsgBean<Long> getOrderCount();

    @PostMapping("/psiSaleOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiSaleOrder/queryByDetailIds")
    RespMsgBean<List<PsiSaleOrderVO>> queryByDetailIds(@RequestBody List<String> sourceIds);

    @GetMapping("/psiSaleOrderMaterialDemand/findMaterialDemand")
    RespMsgBean<PsiSaleOrderMaterialDemand> findMaterialDemand(@RequestParam("planId") String planId);

    @GetMapping("/psiSaleOrderMaterial/findById")
    RespMsgBean<PsiSaleOrderMaterial> findById(@RequestParam("id") String id);

    @GetMapping("/psiSaleOrderMaterialDemand/findSaleMaterial4ProduceOrder")
    RespMsgBean<PsiSaleOrderMaterial> findSaleMaterial4ProduceOrder(@RequestParam("producePlanId") String producePlanId);

    @PostMapping("/psiSaleOrderMaterial/findByIds4Map")
    RespMsgBean<Map<String, PsiSaleOrderMaterial>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/psiSaleOrder/updateProduceQuantity")
    RespMsgBean<Void> updateProduceQuantity(@RequestBody List<UpdateSaleOrderQuantityDTO> updateSaleOrderQuantityDTOS);

    @PostMapping("/psiSaleOrder/defaultSave")
    RespMsgBean<String> defaultSave(@RequestBody PsiSaleOrder saleOrder);
}
