package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesDncDispatchClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesDncDispatchRecord;
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
@FeignClient(value = "mes",fallback = MesDncDispatchClientFallback.class)
public interface MesDncDispatchRecordClient {

    @PostMapping("/mesDncDispatchRecord/findByNewestRecordByDeviceIds")
    RespMsgBean<Map<String,List<MesDncDispatchRecord>>> findByNewestRecordByDeviceIds(@RequestBody Collection<String> deviceIds);

    @PostMapping("/mesDncDispatchRecord/findDeviceId4DncDispatchPage")
    RespMsgBean<List<String>> findDeviceId4DncDispatchPage(@RequestBody MesDncDispatchRecord query);
}
