package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SaleStockOutOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiSaleStockOutOrder;
import com.lets.platform.model.psi.vo.PsiSaleStockOutOrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 销售出库Feign 接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@FeignClient(value = "psi",fallback = SaleStockOutOrderClientFallback.class)
public interface SaleStockOutOrderClient {


    @PostMapping("/psiSaleStockOutOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/psiSaleStockOutOrder/queryByDetailIds")
    RespMsgBean<List<PsiSaleStockOutOrderVO>> queryByDetailIds(@RequestParam("id") String id);

    @PostMapping("/psiSaleStockOutOrder/saveAndPosting")
    RespMsgBean<?> saveAndPosting(@RequestBody PsiSaleStockOutOrder entity);

    @GetMapping("/psiSaleStockOutOrder/findDeliveryQuantity")
    RespMsgBean<Map<String, Object>> findDeliveryQuantity();

    @GetMapping("/psiSaleStockOutOrder/findDeliveryCount")
    RespMsgBean<Map<String, Object>> findDeliveryCount();

    @GetMapping("/psiSaleStockOutOrder/findDeliveryErrorCount")
    RespMsgBean<Map<String, Object>> findDeliveryErrorCount();

    @PostMapping("/psiSaleStockOutOrder/findCountBySourceDetailId")
    RespMsgBean<Long> findCountBySourceDetailId(@RequestBody List<String> ids);
}
