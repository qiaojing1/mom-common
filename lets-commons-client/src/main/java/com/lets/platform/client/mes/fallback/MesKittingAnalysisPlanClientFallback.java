package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesKittingAnalysisPlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesKittingAnalysisPlan;
import org.springframework.stereotype.Service;

/**
 * 齐套分析方案 Feign服务降级
 * @author DING WEI
 * @date 2025/3/4 11:01
 * @version 1.0
 */
@Service
public class MesKittingAnalysisPlanClientFallback extends BaseController implements MesKittingAnalysisPlanClient {

    @Override
    public RespMsgBean<MesKittingAnalysisPlan> defaultFindById(String id) {
        return success(SUCCESS);
    }
}
