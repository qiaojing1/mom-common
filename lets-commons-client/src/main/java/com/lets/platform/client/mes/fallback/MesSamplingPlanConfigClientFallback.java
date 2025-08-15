package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesSamplingPlanConfigClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.SamplingPlanConfig;
import org.springframework.stereotype.Service;

/**
 * 抽样方案 Feign接口
 *
 * @author FZY
 */
@Service
public class MesSamplingPlanConfigClientFallback extends BaseController implements MesSamplingPlanConfigClient {

    @Override
    public RespMsgBean<SamplingPlanConfig> getFullInspectionConfig() {
        return null;
    }
}
