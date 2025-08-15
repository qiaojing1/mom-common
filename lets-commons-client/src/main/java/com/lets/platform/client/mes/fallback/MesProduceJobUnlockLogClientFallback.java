package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceJobUnlockLogClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProduceJobUnlockLog;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务降级
 * @author: DING WEI
 * @date: 2024/2/29 14:12
 */
@Service
public class MesProduceJobUnlockLogClientFallback extends BaseController implements MesProduceJobUnlockLogClient {

    @Override
    public RespMsgBean<Map<String, MesProduceJobUnlockLog>> findNewest(Collection<String> deviceIds) {
        return success(FIND_SUCCESS, new HashMap<>());
    }
}
