package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesDncPostbackRecordClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesDncPostbackRecord;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 生产工单明细 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MesDncPostbackClientFallback extends BaseController implements MesDncPostbackRecordClient {

    @Override
    public RespMsgBean<Map<String,List<MesDncPostbackRecord>>> findByNewestRecordByDeviceIds(Collection<String> deviceIds) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<String>> findDeviceId4DncPostbackPage(MesDncPostbackRecord query) {
        return success(SUCCESS);
    }
}
