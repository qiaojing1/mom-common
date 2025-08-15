package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ProduceMergeConfigClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiProducePlan;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生产工单合并方案feign 服务降级
 */
@Service
public class ProduceMergeConfigClientFallback extends BaseController implements ProduceMergeConfigClient {

    @Override
    public RespMsgBean<Map<String, String>> matchConfig(List<PsiProducePlan> planList) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean generateMergeProduce(List<PsiProducePlan> planList) {
        return success(SUCCESS);
    }
}
