package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.ProducePlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiProducePlan;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProducePlanClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class ProducePlanClientFallback  extends BaseController implements ProducePlanClient {
    @Override
    public RespMsgBean<Integer> resetPlanStatus(List<PsiProducePlan> list) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiProducePlan> findById(String id) {
        return success(SUCCESS);
    }
}
