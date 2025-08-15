package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmRepeatInspectPlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmRepeatInspectPlan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 复检计划feign接口 服务降级
 * @author DING WEI
 * @date 2025/7/15 13:55
 * @version 1.0
 */
@Service
public class TpmRepeatInspectPlanClientFallback extends BaseController implements TpmRepeatInspectPlanClient {

    @Override
    public RespMsgBean<List<TpmRepeatInspectPlan>> findByTenancyId(String tenancyId) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Integer> reset(List<TpmRepeatInspectPlan> list) {
        return failure(FAILURE);
    }
}
