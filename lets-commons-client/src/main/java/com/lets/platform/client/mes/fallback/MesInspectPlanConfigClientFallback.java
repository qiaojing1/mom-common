package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesInspectPlanConfigClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.InspectPlanConfig;
import com.lets.platform.model.mes.entity.MesProduceReportOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 检验方案 Feign接口
 *
 * @author FZY
 */
@Service
public class MesInspectPlanConfigClientFallback extends BaseController implements MesInspectPlanConfigClient {

    @Override
    public RespMsgBean<List<InspectPlanConfig>> getInspectPlanConfigList(String inspectType) {
        return failure();
    }
}
