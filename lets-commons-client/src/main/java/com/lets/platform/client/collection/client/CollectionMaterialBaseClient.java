package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.CollectionMaterialBaseClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.collection.entity.CollectionHeatBatchNo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "collection", fallback = CollectionMaterialBaseClientFallback.class)
public interface CollectionMaterialBaseClient {

    @GetMapping("/collectionHeatBatchNo/queryList")
    RespMsgBean<List<CollectionHeatBatchNo>> queryList(@RequestBody List<CollectionHeatBatchNo> queryList);

    @GetMapping("/collectionHeatBatchNo/iSaveOrUpdateBatch")
    RespMsgBean<Void> iSaveOrUpdateBatch(@RequestBody List<CollectionHeatBatchNo> list);
}
