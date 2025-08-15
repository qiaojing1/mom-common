package com.lets.platform.client.tpm.client;

import com.lets.platform.client.tpm.fallback.BorrowOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


@FeignClient(value = "tpm", fallback = BorrowOrderClientFallback.class)
public interface BorrowOrderClient {

    @PostMapping("/tpmAssetBorrowOrder/findOrderCount")
    RespMsgBean<Map<String, Long>> findOrderCount(@RequestBody List<String> deviceIds);

}
