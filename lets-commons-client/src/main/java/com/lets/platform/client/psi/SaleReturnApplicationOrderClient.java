package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SaleReturnApplicationOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiSaleReturnApplicationOrder;
import com.lets.platform.model.psi.entity.PsiSaleReturnApplicationOrderMaterial;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 销售退货申请单 接口
 */
@FeignClient(value = "psi", fallback = SaleReturnApplicationOrderClientFallback.class)
public interface SaleReturnApplicationOrderClient {

    @PostMapping("/psiSaleReturnApplicationOrder/findByIds4Map")
    RespMsgBean<Map<String, PsiSaleReturnApplicationOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/psiSaleReturnApplicationOrder/findByIds4MapDetail")
    RespMsgBean<Map<String, PsiSaleReturnApplicationOrderMaterial>> findByIds4MapDetail(@RequestBody Collection<String> detailIds);

    @PostMapping("/psiSaleReturnApplicationOrder/updateDetailBatch")
    RespMsgBean<Void> updateDetailBatch(@RequestBody List<PsiSaleReturnApplicationOrderMaterial> detailList);
}
