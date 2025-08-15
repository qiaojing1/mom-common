package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollDeviceItemRealtimeClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollDeviceItemRealtime;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelClient
 * @Description TODO
 * @Date 2024/2/2 16:44
 **/
@Service
public class CollDeviceItemRealtimeFallback extends BaseController implements CollDeviceItemRealtimeClient {

    public RespMsgBean<Map<String, CollDeviceItemRealtime>> findByDeviceAndDataItem(Collection<String> deviceIds, String dataItem) {
        return success(SUCCESS);
    }
}
