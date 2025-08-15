package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PackageOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 采购订单Feign 接口
 * @author DING WEI
 * @date 2023/10/19 14:27
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = PackageOrderClientFallback.class)
public interface PackageOrderClient {

    @PostMapping("/psiPackageOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiShipOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateShipOrder(@RequestBody ExportWithTemplateDto dto);

}
