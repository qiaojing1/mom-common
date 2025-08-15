/*
 * csy
 */

package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ArchivingPlanClientFallback;
import com.lets.platform.client.mes.fallback.MaterialQuoteClientFallBack;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.vo.MesArchivingPlanVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 产品档案归档方案feign
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2024/09/24 17:38
 */
@FeignClient(value = "mes", fallback = MaterialQuoteClientFallBack.class)
public interface MaterialQuoteClient {
    @PostMapping("/materialQuote/handle")
    RespMsgBean<Map<String,Set<String>>> handle(@RequestBody Collection<String> ids);

    @PostMapping("/materialQuote/handleGroup")
    RespMsgBean<Map<String,Set<String>>> handleGroup(@RequestBody Collection<String> ids);
}
