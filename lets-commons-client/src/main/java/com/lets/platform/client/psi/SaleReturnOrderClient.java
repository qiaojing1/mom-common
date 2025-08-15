package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SaleReturnOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiSaleReturnOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

/**
 * 销售退货单 接口
 */
@FeignClient(value = "psi", fallback = SaleReturnOrderClientFallback.class)
public interface SaleReturnOrderClient {

    @PostMapping("/psiSaleReturnOrder/saveAndPosting")
    RespMsgBean<?> saveAndPosting(@RequestBody PsiSaleReturnOrder stockInOrder);

    @PostMapping("/psiSaleReturnOrder/queryCount")
    RespMsgBean<Long> queryCount(@RequestBody Collection<String> ids);
}
