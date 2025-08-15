package com.lets.platform.client.workflow;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.WorkFlowBusinessTraceDo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "uc")
public interface RecviceTaskManagerClient {
    @PostMapping("/flowableProcess/trigger")
    RespMsgBean trigger(@RequestBody WorkFlowBusinessTraceDo traceDo);

}
