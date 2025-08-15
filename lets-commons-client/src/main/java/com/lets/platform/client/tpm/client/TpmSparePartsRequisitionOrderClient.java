package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.TpmSparePartsRequisitionOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * TpmSparePartsRequisitionOrderClient
 * @author zhangweiyan
 * @date 2024/11/26 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmSparePartsRequisitionOrderClientFallback.class)
public interface TpmSparePartsRequisitionOrderClient {

    @PostMapping("/tpmSparePartsRequisitionOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
