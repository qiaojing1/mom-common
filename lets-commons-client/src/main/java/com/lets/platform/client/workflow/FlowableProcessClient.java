package com.lets.platform.client.workflow;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.FlowableProcess;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "uc")
public interface FlowableProcessClient {

    @GetMapping("/flowableProcess/startMessageBussiness")
    @ApiOperation("启动业务流程")
    RespMsgBean<?> startMessageBussiness(@RequestParam("menuCode") String menuCode, @RequestParam("bussinessKey") String bussinessKey,
                                      @RequestParam("id") String id);


    @GetMapping("/flowableProcess/isWorkflow")
    @ApiOperation("是否工作流")
    RespMsgBean<Boolean> isWorkflow(@RequestParam("menuCode") String menuCode);

    @PostMapping("/flowableProcess/submit")
    RespMsgBean<?> submit(@RequestBody FlowableProcess flowableProcess);
}
