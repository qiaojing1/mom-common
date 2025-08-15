package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.SalePredictionOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 销售预测单Feign 接口
 * @author DING WEI
 * @date 2024/7/19 16:34
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = SalePredictionOrderClientFallback.class)
public interface SalePredictionOrderClient {

    @PostMapping("/salePredictionOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

}
