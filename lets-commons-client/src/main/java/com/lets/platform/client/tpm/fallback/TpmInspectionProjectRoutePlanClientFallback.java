package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmInspectionProjectRoutePlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import org.springframework.stereotype.Service;


/**
 * TpmInspectionProjectRoutePlanClientFallback
 * @author zhangweiyan
 * @date 2024/12/18 14:26
 * @version 1.0
 */
@Service
public class TpmInspectionProjectRoutePlanClientFallback extends BaseController implements TpmInspectionProjectRoutePlanClient {
    @Override
    public RespMsgBean createProjectOrder(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean createInspectionRouteOrderSupplement(String tenancyId) {
        return null;
    }
}
