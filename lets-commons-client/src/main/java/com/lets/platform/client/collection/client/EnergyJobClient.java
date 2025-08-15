package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.EnergyJobClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.dto.energy.EnergySaveDto;
import com.lets.platform.model.collection.query.EnergyConfigQuery;
import com.lets.platform.model.collection.vo.energy.EnergyConfigVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 能耗JOB Feign接口
 * @author DING WEI
 * @date 2022/12/3 9:34
 * @version 1.0
 */
@FeignClient(value = "collection", fallback = EnergyJobClientFallback.class)
public interface EnergyJobClient {

    @PostMapping("/energyJob/save")
    RespMsgBean save(@RequestBody EnergySaveDto saveDto);

    @PostMapping("/energyJob/findEnergyConfig")
    RespMsgBean<EnergyConfigVo> findEnergyConfig(@RequestBody EnergyConfigQuery query);
}
