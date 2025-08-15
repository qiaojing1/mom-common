package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.TransferOrderClientFallBack;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiTransferOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName TransferOrderClient
 * @Description TODO
 * @Date 2024/3/21 09:03
 **/
@FeignClient(value = "psi", fallback = TransferOrderClientFallBack.class)
public interface TransferOrderClient {
    @PostMapping("/psiTransferOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiTransferOrder/saveAndPosting")
    RespMsgBean<Void> saveAndPosting(@RequestBody PsiTransferOrder order);

    @PostMapping("/psiTransferOrder/findQuoteTimes")
    RespMsgBean<Map<String, Long>> findQuoteTimes(@RequestBody Collection<String> ids);

    @PostMapping("/psiTransferOrder/findCountBySourceDetailId")
    RespMsgBean<Long> findCountBySourceDetailId(@RequestBody List<String> ids);
}
