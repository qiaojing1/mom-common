package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceOrderDetailClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产工单明细 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MesProduceOrderDetailClientFallback extends BaseController implements MesProduceOrderDetailClient {
    @Override
    public RespMsgBean<Long> findCount4FactoryModeId(String factoryModeId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean delByDetectOrderCode(List<CollectionDetectOrder> detectOrderCode) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean updateDetectNumber(List<MesProduceOrderDetail> details) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<MesProduceOrderDetail> getById4Detail(String id) {
        return success(SUCCESS);
    }
}
