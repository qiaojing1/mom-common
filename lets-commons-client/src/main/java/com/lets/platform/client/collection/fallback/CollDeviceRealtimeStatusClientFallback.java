package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollDeviceRealtimeStatusClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollDeviceStatusRealtime;
import com.lets.platform.model.collection.vo.CollDataItemVo;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 设备实时状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class CollDeviceRealtimeStatusClientFallback extends BaseController implements CollDeviceRealtimeStatusClient {

    @Override
    public RespMsgBean<CollDeviceStatusRealtime> findById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, CollDeviceStatusRealtime>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<CollDataItemVo>> findPointRealtimeData(String deviceId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, CollDataItemVo>> findProgramRealtimeData(Collection<String> deviceId, String programDataItemKey) {
        return success(SUCCESS,new HashMap<>());
    }

    @Override
    public RespMsgBean<List<CollDeviceStatusRealtime>> findByBigStatusCode(String bigStatusCode, String tenancyId) {
        return success(SUCCESS, new ArrayList<>());
    }


}
