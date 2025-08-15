package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ProduceMaterialBillClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrder;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;
import com.lets.platform.model.psi.mrpModel.BomModel;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class ProduceMaterialBillClientFallback extends BaseController implements ProduceMaterialBillClient {

    public RespMsgBean<List<MesProduceMaterialBillOrder>> findByIds(Collection<String> ids) {
        return success(SUCCESS);
    }

    public RespMsgBean<Map<String, BomModel>> getMrpBomModelMap(Collection<String> ids) {
        return success(SUCCESS);
    }

    public RespMsgBean<Boolean> updateBatchById(Collection<MesProduceMaterialBillOrder> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<String> picking4ScheduledTasks(String tenancyId) {
        return failure(FAILURE, "MES服务异常");
    }

    @Override
    public RespMsgBean<Map<String, List<MesProduceMaterialBillOrderDetail>>> findBillMap(Set<String> produceOrderDetailIds, Integer status) {
        return success(new HashMap<>());
    }
}
