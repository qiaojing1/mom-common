package com.lets.platform.client.tpm.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.client.BorrowOrderClient;
import com.lets.platform.client.tpm.client.TpmCallRepairOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmCallRepairOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * TpmCallRepairOrderClient
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2025/01/22 14:26
 */
@Service
public class BorrowOrderClientFallback extends BaseController implements BorrowOrderClient {


    @Override
    public RespMsgBean<Map<String, Long>> findOrderCount(List<String> deviceIds) {
        return success(SUCCESS);
    }
}
