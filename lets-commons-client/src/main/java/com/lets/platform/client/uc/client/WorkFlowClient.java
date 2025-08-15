package com.lets.platform.client.uc.client;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysWorkflow;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/6 8:47
 */
@FeignClient(value = "uc")
public interface WorkFlowClient {

    @GetMapping("/sysWorkflow/isFlowable")
    RespMsgBean<Boolean> isFlowable(@RequestParam("orderNature") String orderNature);

    @GetMapping("/sysWorkflow/isFlowable2")
    RespMsgBean<Boolean> isFlowable2(@RequestParam("orderNature") String orderNature, @RequestParam("tenancyId") String tenancyId);

    @GetMapping("/sysWorkflow/getFlowableInfo")
    RespMsgBean<SysWorkflow> getFlowableInfo(@RequestParam("orderNature") String orderNature);
}
