package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.AutoLineModelingClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 自动线建模 Feign接口
 * @author DING WEI
 * @date 2024/7/4 16:47
 * @version 1.0
 */
@Service
public class AutoLineModelingClientFallback extends BaseController implements AutoLineModelingClient {

    @Override
    public RespMsgBean<ConcurrentHashMap<String, Set<String>>> findAllAutoLineItemKeys(String tenancyId) {
        return success(SUCCESS, new ConcurrentHashMap<>());
    }

    @Override
    public RespMsgBean<Boolean> findAutoLineIdByDeviceId(String deviceId) {
        return success(SUCCESS, Boolean.FALSE);
    }
}
