package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollDeviceChannelClient;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollDeviceChannels;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelClient
 * @Description TODO
 * @Date 2024/2/2 16:44
 **/
@Service
public class CollDeviceChannelClientFallback extends BaseController implements CollDeviceChannelClient {

    public List<CollDeviceChannels> findAllList() {
        return new ArrayList<>();
    }
}
