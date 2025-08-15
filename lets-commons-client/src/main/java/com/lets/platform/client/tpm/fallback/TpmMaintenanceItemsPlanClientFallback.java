package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmMaintenanceItemsPlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import org.springframework.stereotype.Service;


/**
 * TpmMaintenanceItemsPlanClient
 * @author zhangweiyan
 * @date 2024/11/15 14:26
 * @version 1.0
 */
@Service
public class TpmMaintenanceItemsPlanClientFallback extends BaseController implements TpmMaintenanceItemsPlanClient {
    @Override
    public RespMsgBean createMaintenanceOrder(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean createMaintenanceOrderSupplement(String tenancyId) {
        return success(SUCCESS);
    }


}
