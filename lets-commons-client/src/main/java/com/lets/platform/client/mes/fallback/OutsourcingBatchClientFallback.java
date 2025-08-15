package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.OutsourcingBatchClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProcessOutsourcingBatchDetail;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 生产用料清单 feign接口 服务降级
 * @author DING WEI
 * @date 2024/5/22 14:11
 * @version 1.0
 */
@Service
public class OutsourcingBatchClientFallback extends BaseController implements OutsourcingBatchClient {


    @Override
    public RespMsgBean<List<MesProcessOutsourcingBatchDetail>> getSourceInfo4Out(List<String> ids) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<MesProcessOutsourcingBatchDetail>> getSourceInfo4In(List<String> ids) {
        return success(new ArrayList<>());
    }
}
