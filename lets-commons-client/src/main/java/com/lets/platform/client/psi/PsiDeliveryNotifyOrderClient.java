package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PsiDeliveryNotifyOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.base.BaseProcessEntity;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiDeliveryNotifyOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 出货通知单Feign 接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2024/01/18 14:27
 */
@FeignClient(value = "psi",fallback = PsiDeliveryNotifyOrderClientFallback.class)
public interface PsiDeliveryNotifyOrderClient {

    @PostMapping("/psiDeliveryNotifyOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/psiDeliveryNotifyOrder/findByIds4Map")
    RespMsgBean<Map<String, PsiDeliveryNotifyOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/psiDeliveryNotifyOrder/rowDisable")
    RespMsgBean<?> rowDisable(@RequestBody BaseProcessEntity<?> entity);
}
