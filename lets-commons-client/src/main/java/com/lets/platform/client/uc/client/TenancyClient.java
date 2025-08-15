package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysTenancy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 租户Feign 业务接口
 *
 * @ClassName TenancyClient
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
@FeignClient(value = "uc")
public interface TenancyClient {

    @GetMapping(value = "/sysTenancy/findById")
    RespMsgBean<SysTenancy> findById(@RequestParam("id") String id);

    @GetMapping(value = "/sysTenancy/findByCode")
    RespMsgBean<SysTenancy> findByCode4Do(@RequestParam("tenancyCode") String tenancyCode);

    @GetMapping(value = "/sysTenancy/findAll")
    RespMsgBean<List<SysTenancy>> findAll();

    @GetMapping(value = "/sysTenancy/updateStandardCurrency")
    RespMsgBean<Integer> updateStandardCurrency(@RequestParam("currencyId") String currencyId, @RequestParam("tenancyId") String tenancyId);
}
