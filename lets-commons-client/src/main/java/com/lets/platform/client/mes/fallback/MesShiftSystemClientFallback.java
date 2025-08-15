package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesShiftSystemClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesShiftSystem;
import com.lets.platform.model.mes.entity.MesShiftSystemDetail;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 班制
 * @author DING WEI
 * @date 2024/12/19 17:53
 * @version 1.0
 */
@Service
public class MesShiftSystemClientFallback extends BaseController implements MesShiftSystemClient {

    @Override
    public RespMsgBean<MesShiftSystem> getById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, MesShiftSystem>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, MesShiftSystem>> findByIdsWithDetail4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<MesShiftSystemDetail>>> findShiftDetailByIds(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<MesShiftSystemDetail>>> findAll() {
        return success(SUCCESS, new HashMap<>());
    }
}
