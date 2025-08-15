package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.PickingApplyClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProducePickingApply;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 生产领料申请 feign接口
 * @author DING WEI
 * @date 2024/6/6 8:53
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = PickingApplyClientFallback.class)
public interface PickingApplyClient {

    @PostMapping("/producePickingApply/findByIds4MapAllCol")
    RespMsgBean<Map<String, MesProducePickingApply>> findByIds4MapAllCol(@RequestBody Collection<String> detailIds);

    @PostMapping("/producePickingApply/findByIds4ListAllCol")
    RespMsgBean<List<MesProducePickingApply>> findByIds4ListAllCol(@RequestBody Collection<String> detailIds);

    @PostMapping("/producePickingApply/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);
}
