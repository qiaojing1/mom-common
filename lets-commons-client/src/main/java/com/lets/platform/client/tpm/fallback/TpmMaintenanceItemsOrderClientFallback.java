package com.lets.platform.client.tpm.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.client.TpmMaintenanceItemsOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmMaintenanceItemsOrder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


/**
 * TpmMaintenanceItemsOrderClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmMaintenanceItemsOrderClientFallback extends BaseController implements TpmMaintenanceItemsOrderClient {

    @Override
    public RespMsgBean<Page<TpmMaintenanceItemsOrder>> findPage(AutoConditionEntity entity) {
        return success(SUCCESS, new Page<>());
    }

    @Override
    public void statisticsCheckOverdue(String shiftId,LocalDateTime startLocalTime, LocalDateTime endLocalTime, String tenancyId) {

    }

    @Override
    public void autoSubmitOrder(String startTime, String endTime) {

    }

    @Override
    public void autoVoidOrder(String startTime, String endTime) {

    }
}
