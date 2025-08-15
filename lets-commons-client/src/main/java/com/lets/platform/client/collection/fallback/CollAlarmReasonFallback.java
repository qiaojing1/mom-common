package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollAlarmReasonClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollAlarmReason;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 报警原因配置表 Feign接口 服务降级
 * @author DING WEI
 * @date 2024/11/27 9:42
 * @version 1.0
 */
@Service
public class CollAlarmReasonFallback extends BaseController implements CollAlarmReasonClient {

    @Override
    public RespMsgBean<Map<String, CollAlarmReason>> findByCodes4Map(Collection<String> codes) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Boolean> batSave(List<CollAlarmReason> list) {
        return failure(FAILURE, Boolean.FALSE);
    }
}
