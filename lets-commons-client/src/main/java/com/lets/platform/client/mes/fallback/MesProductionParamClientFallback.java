package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProductionParamClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProductionArchiveList;
import com.lets.platform.model.mes.params.ProductionParamQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesProductionParamClientFallback extends BaseController implements MesProductionParamClient {

    @Override
    public RespMsgBean<List<ProductionParamQuery>> setProductionList(String menuCode, List<ProductionParamQuery> list) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Void> insertBatch(List<MesProductionArchiveList> MesProductionArchiveList) {
        return failure(FAILURE);
    }
}
