package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.CalibrateOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


@FeignClient(value = "tpm", fallback = CalibrateOrderClientFallback.class)
public interface CalibrateOrderClient {

    @PostMapping("/tpmAssetCalibrateOrder/findOrderCount")
    RespMsgBean<Map<String, Long>> findOrderCount(@RequestBody List<String> deviceIds);

}
