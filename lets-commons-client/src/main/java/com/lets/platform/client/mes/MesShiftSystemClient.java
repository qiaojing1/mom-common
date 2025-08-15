package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesShiftSystemClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesShiftSystem;
import com.lets.platform.model.mes.entity.MesShiftSystemDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 班制
 * @author DING WEI
 * @date 2024/12/19 17:53
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MesShiftSystemClientFallback.class)
public interface MesShiftSystemClient {

    @GetMapping("/mesShiftSystem/getById")
    RespMsgBean<MesShiftSystem> getById(@RequestParam("id") String id);

    @PostMapping("/mesShiftSystem/findByIds4Map")
    RespMsgBean<Map<String, MesShiftSystem>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesShiftSystem/findByIdsWithDetail4Map")
    RespMsgBean<Map<String, MesShiftSystem>> findByIdsWithDetail4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesShiftSystem/findShiftDetailByIds")
    RespMsgBean<Map<String, List<MesShiftSystemDetail>>> findShiftDetailByIds(@RequestBody Collection<String> ids);

    @GetMapping("/mesShiftSystem/findAll")
    RespMsgBean<Map<String, List<MesShiftSystemDetail>>> findAll();
}
