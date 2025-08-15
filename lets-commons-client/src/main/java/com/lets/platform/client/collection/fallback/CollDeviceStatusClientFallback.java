package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollDeviceStatusClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.common.entity.CommonDeviceStatus;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 设备状态配置
 * @author: DING WEI
 * @date: 2025/3/27 8:59
 */
@Service
public class CollDeviceStatusClientFallback extends BaseController implements CollDeviceStatusClient {
    @Override
    public RespMsgBean<Map<String, CommonDeviceStatus>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }
}
