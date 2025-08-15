package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Map;

/**
 * 首页配置-组件Feign 业务接口
 * @author DING WEI
 * @date 2024/1/24 11:10
 * @version 1.0
 */
@FeignClient(value = "uc")
public interface SysIndexConfigUnitClient {

    @PostMapping("/indexConfigUnit/findQuoteTimes")
    RespMsgBean<Map<String, Integer>> findQuoteTimes(@RequestBody Collection<String> datasourceIds);
}
