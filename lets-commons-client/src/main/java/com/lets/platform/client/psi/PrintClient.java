/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.PrintClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PrintEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @ClassName PrintClient
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/11/28
 */
@FeignClient(value = "psi", fallback = PrintClientFallback.class)
public interface PrintClient {

    @PostMapping("/print/doPrint")
    RespMsgBean doPrint(@RequestBody PrintEntity printEntity);

}
