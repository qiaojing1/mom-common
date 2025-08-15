package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.EnergyJobClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.dto.energy.EnergySaveDto;
import com.lets.platform.model.collection.query.EnergyConfigQuery;
import com.lets.platform.model.collection.vo.energy.EnergyConfigVo;
import org.springframework.stereotype.Service;

/**
 * TODO
 * @author DING WEI
 * @date 2024/12/30 18:33
 * @version 1.0
 */
@Service
public class EnergyJobClientFallback extends BaseController implements EnergyJobClient {

    @Override
    public RespMsgBean save(EnergySaveDto saveDto) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<EnergyConfigVo> findEnergyConfig(EnergyConfigQuery query) {
        return success(FIND_SUCCESS, null);
    }
}
