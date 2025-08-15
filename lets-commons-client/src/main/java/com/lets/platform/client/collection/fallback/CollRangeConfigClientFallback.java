package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollRangeConfigClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollectionRangeConfig;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 量程配置
 * @author: csy
 * @date: 2024/6/24
 */
@Service
public class CollRangeConfigClientFallback extends BaseController implements CollRangeConfigClient {

    @Override
    public RespMsgBean<List<CollectionRangeConfig>> findRangesByDeviceCode(String deviceCode, String tenancyId) {
        return success(SUCCESS,new ArrayList<>());
    }
}
