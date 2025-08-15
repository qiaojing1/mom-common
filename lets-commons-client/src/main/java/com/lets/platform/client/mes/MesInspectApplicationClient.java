package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesInspectApplicationClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesInspectionApplicationOrder;
import com.lets.platform.model.mes.entity.MesInspectionApplicationOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 检验方案 Feign接口
 *
 * @author FZY
 */
@FeignClient(value = "mes", fallback = MesInspectApplicationClientFallback.class)
public interface MesInspectApplicationClient {

    @PostMapping("/mesInspectionApplicationOrder/findByIds4Map")
    RespMsgBean<Map<String, MesInspectionApplicationOrder>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesInspectionApplicationOrder/findDetailByIds")
    RespMsgBean<List<MesInspectionApplicationOrderDetail>> findDetailByIds(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesInspectionApplicationOrder/saveAndApprove")
    RespMsgBean<Void> saveAndApprove(@RequestBody MesInspectionApplicationOrder order);

    @PostMapping("/mesInspectionApplicationOrder/defaultSaveOrUpdate")
    RespMsgBean<String> defaultSaveOrUpdate(@RequestBody MesInspectionApplicationOrder order);
}
