package com.lets.platform.client.tpm.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.client.TpmRepairOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmRepairOrder;
import org.springframework.stereotype.Service;


/**
 * TpmRepairOrderClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmRepairOrderClientFallback extends BaseController implements TpmRepairOrderClient {

    @Override
    public RespMsgBean<Page<TpmRepairOrder>> findPage(AutoConditionEntity entity) {
        return success(SUCCESS, new Page<>());
    }
}
