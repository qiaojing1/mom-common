package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceReturnClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProduceReturn;
import org.springframework.stereotype.Service;

@Service
public class MesProduceReturnClientFallback extends BaseController implements MesProduceReturnClient {

    @Override
    public RespMsgBean<String> submitByPDA(MesProduceReturn entity) {
        return failure(FAILURE);
    }
}
