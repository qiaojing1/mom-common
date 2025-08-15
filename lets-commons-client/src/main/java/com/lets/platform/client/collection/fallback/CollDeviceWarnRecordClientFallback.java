package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollDeviceWarnRecordClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollDeviceWarnRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 报警记录feign接口
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class CollDeviceWarnRecordClientFallback extends BaseController implements CollDeviceWarnRecordClient {

    public RespMsgBean<List<CollDeviceWarnRecord>> findAllWarnRecord4Delayed(String time) {
        return success(SUCCESS);
    }

    public RespMsgBean<Integer> updateDealTime(List<CollDeviceWarnRecord> toUpdate) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<CollDeviceWarnRecord> findNewestByDeviceId(String deviceId) {
        return success(SUCCESS);
    }
}
