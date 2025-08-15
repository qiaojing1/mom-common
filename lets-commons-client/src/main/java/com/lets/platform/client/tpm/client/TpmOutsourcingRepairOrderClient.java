package com.lets.platform.client.tpm.client;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.fallback.TpmCallRepairOrderClientFallback;
import com.lets.platform.client.tpm.fallback.TpmOutsourcingRepairOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.tpm.entity.TpmOutsourcingRepairOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * TpmOutsourcingRepairOrderClient
 * @author zhangweiyan
 * @date 2025/02/07 14:26
 * @version 1.0
 */
@FeignClient(value = "tpm",fallback = TpmOutsourcingRepairOrderClientFallback.class)
public interface TpmOutsourcingRepairOrderClient {

    @PostMapping("/tpmOutsourcingRepairOrder/findPage")
    RespMsgBean<Page<TpmOutsourcingRepairOrder>> findPage(@RequestBody() AutoConditionEntity entity);

}
