package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmInspectionItemsPlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import org.springframework.stereotype.Service;


/**
 * TpmInspectionItemsPlanClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmInspectionItemsPlanClientFallback extends BaseController implements TpmInspectionItemsPlanClient {
    @Override
    public RespMsgBean createInspectionOrder(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean createInspectionOrderSupplement(String tenancyId) {
        return success(SUCCESS);
    }


}
