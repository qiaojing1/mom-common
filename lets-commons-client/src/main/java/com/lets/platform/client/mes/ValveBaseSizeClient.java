/*
 * csy
 */

package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.ArchivingPlanClientFallback;
import com.lets.platform.client.mes.fallback.ValveBaseSizeClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesValveSizeBase;
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
@FeignClient(value = "mes", fallback = ValveBaseSizeClientFallback.class)
public interface ValveBaseSizeClient {
    @PostMapping("/mesValveSizeBase/findByValveClassifyIds")
    RespMsgBean<List<MesValveSizeBase>> findByValveClassifyIds(@RequestBody List<String> valveClassifyIds) ;

    @PostMapping("/mesValveSizeBase/findByStandardIds")
    RespMsgBean<List<MesValveSizeBase>> findByStandardIds(@RequestBody List<String> standardIds) ;
}
