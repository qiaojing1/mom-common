package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.CollectionMaterialBaseClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.collection.entity.CollectionHeatBatchNo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CollectionMaterialBaseClientFallback extends BaseController implements CollectionMaterialBaseClient {

    @Override
    public RespMsgBean<List<CollectionHeatBatchNo>> queryList(@RequestBody List<CollectionHeatBatchNo> queryList) {
        return failure();
    }

    @Override
    public RespMsgBean<Void> iSaveOrUpdateBatch(List<CollectionHeatBatchNo> list) {
        return failure();
    }
}
