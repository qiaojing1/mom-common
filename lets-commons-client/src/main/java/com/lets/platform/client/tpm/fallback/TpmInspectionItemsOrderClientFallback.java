package com.lets.platform.client.tpm.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.client.TpmInspectionItemsOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmInspectionItemsOrder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


/**
 * TpmInspectionItemsOrderClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmInspectionItemsOrderClientFallback extends BaseController implements TpmInspectionItemsOrderClient {

    @Override
    public RespMsgBean<Page<TpmInspectionItemsOrder>> findPage(AutoConditionEntity entity) {
        return success(SUCCESS, new Page<>());
    }

    @Override
    public void statisticsCheckOverdue(String shiftId,LocalDateTime startLocalTime, LocalDateTime endLocalTime,String tenancyId) {

    }


    @Override
    public void autoSubmitOrder(String startTime, String endTime) {

    }

    @Override
    public void autoVoidOrder(String startTime, String endTime) {

    }
}
