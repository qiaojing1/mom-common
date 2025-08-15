package com.lets.platform.client.tpm.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.client.TpmOutsourcingRepairOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmOutsourcingRepairOrder;
import org.springframework.stereotype.Service;


/**
 * TpmCallRepairOrderClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmOutsourcingRepairOrderClientFallback extends BaseController implements TpmOutsourcingRepairOrderClient {

    @Override
    public RespMsgBean<Page<TpmOutsourcingRepairOrder>> findPage(AutoConditionEntity entity) {
        return success(SUCCESS, new Page<>());
    }
}
