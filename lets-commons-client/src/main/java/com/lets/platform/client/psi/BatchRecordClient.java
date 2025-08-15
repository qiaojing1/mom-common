package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.BatchRecordClientClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.dto.FillBatchNumberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 批号档案 接口
 */
@FeignClient(value = "psi", fallback = BatchRecordClientClientFallback.class)
public interface BatchRecordClient {

    @PostMapping("/batchRecord/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto templateDto);

    @PostMapping("/batchRecord/fillBatchNumber")
    RespMsgBean<List<FillBatchNumberDto>> fillBatchNumber(@RequestBody List<FillBatchNumberDto> dataList);
}
