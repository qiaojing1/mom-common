package com.lets.platform.client.tpm.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.fallback.TpmCallRepairOrderClientFallback;
import com.lets.platform.client.tpm.fallback.TpmRepeatInspectOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.tpm.entity.TpmRepeatInspectOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * TpmRepeatInspectOrderClient
 * @author zhangweiyan
 * @date 2025/02/07 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmRepeatInspectOrderClientFallback.class)
public interface TpmRepeatInspectOrderClient {

    @PostMapping("/tpmRepeatInspectOrder/findPage")
    RespMsgBean<Page<TpmRepeatInspectOrder>> findPage(@RequestBody() AutoConditionEntity entity);

}
