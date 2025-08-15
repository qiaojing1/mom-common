package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ArchivingPlanClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.vo.MesArchivingPlanVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 产品档案归档方案feign
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2024/09/24 17:38
 */
@FeignClient(value = "mes", fallback = ArchivingPlanClientFallback.class)
public interface ArchivingPlanClient {
    @PostMapping("/mesArchivingPlan/getPrintData")
    RespMsgBean<List<ExportWithTemplateDto>> printData(@RequestBody MesArchivingPlanVo planVo);
}
