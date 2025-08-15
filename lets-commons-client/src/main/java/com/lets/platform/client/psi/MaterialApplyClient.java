package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.MaterialApplyFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * StoreClient
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@FeignClient(value = "psi", fallback = MaterialApplyFallback.class)
public interface MaterialApplyClient {

    @PostMapping("/psiMaterialApply/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
