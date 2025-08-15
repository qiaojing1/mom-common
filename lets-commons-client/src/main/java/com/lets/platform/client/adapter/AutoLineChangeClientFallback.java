package com.lets.platform.client.adapter;

import com.lets.platform.client.adapter.client.AutoLineChangeClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AutoLineChangeClientFallback extends BaseController implements AutoLineChangeClient {

    @Override
    public RespMsgBean change(ConcurrentHashMap<String, Set<String>> autoLineItemMap) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Boolean> isMemberExternal(String deviceId, String code) {
        return success(SUCCESS, Boolean.FALSE);
    }
}
