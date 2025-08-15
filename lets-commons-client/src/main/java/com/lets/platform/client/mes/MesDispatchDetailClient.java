package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesDispatchDetailClientFallback;
import com.lets.platform.client.mes.fallback.MesDncPostbackClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesDispatchDetail;
import com.lets.platform.model.mes.entity.MesDncPostbackRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 生产工单明细 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = MesDispatchDetailClientFallback.class)
public interface MesDispatchDetailClient {

    @PostMapping("/mesDispatchDetail/delByDetectOrderCode")
    RespMsgBean delByDetectOrderCode(@RequestBody List<String> detectOrderCode);

    @PostMapping("/mesDispatchDetail/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/mesDispatchDetail/batGetDate4ExportTemplateMerge")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateMerge(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/mesDispatchDetail/findListByIds")
    RespMsgBean<List<MesDispatchDetail>> findListByIds(@RequestBody Collection<String> ids);
}
