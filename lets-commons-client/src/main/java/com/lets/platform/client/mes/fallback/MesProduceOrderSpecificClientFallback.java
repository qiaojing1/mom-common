package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceOrderSpecificClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSpecific;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生产工单 特征属性 服务降级
 * @author DING WEI
 * @date 2024/5/31 15:18
 * @version 1.0
 */
@Service
public class MesProduceOrderSpecificClientFallback extends BaseController implements MesProduceOrderSpecificClient {

    @Override
    public RespMsgBean<Map<String, List<MesProduceOrderDetailSpecific>>> findByOrderIdsGroupDetailId(Collection<String> orderIds) {
        return success(FIND_SUCCESS, new HashMap<>());
    }
}
