package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysEqualsSymbolConfig;
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
public interface SysEqualSymbolConfigClient {

    @GetMapping(value = "/equalsSymbolConfig/findByTenancyId")
    RespMsgBean<List<SysEqualsSymbolConfig>> findByTenancyId(@RequestParam(value = "tenancyId", required = false) String tenancyId);

}
