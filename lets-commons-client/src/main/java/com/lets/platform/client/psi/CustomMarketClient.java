package com.lets.platform.client.psi;

import cn.hutool.json.JSONObject;
import com.lets.platform.client.psi.fallback.CustomMarketClientFallback;
import com.lets.platform.client.psi.fallback.ExtClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.uc.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * CustomMarketClient
 * @author zhangweiyan
 * @date 2024/10/09 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = CustomMarketClientFallback.class)
public interface CustomMarketClient {

    @GetMapping("/psiSaleCustomerMarket/findSaleableUser")
    RespMsgBean<List<SysUser>> findSaleableUser(@RequestParam("customerId") String customerId);


}
