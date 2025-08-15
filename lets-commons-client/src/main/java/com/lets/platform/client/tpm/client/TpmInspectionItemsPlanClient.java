package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmInspectionItemsPlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;

/**
 * TpmInspectionItemsPlanClient
 * @author QIAO JING
 * @date 2024/11/15 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmInspectionItemsPlanClientFallback.class)
public interface TpmInspectionItemsPlanClient {

    @GetMapping("/tpmInspectionItemsPlan/createInspectionOrder")
    RespMsgBean createInspectionOrder(@RequestParam("id") String id);
    @GetMapping("/tpmInspectionItemsPlan/createInspectionOrderSupplement")
    RespMsgBean createInspectionOrderSupplement(@RequestParam("tenancyId") String tenancyId);

}
