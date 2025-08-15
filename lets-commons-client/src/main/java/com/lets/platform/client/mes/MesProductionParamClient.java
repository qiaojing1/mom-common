package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProductionParamClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProductionArchiveList;
import com.lets.platform.model.mes.params.ProductionParamQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "mes", fallback = MesProductionParamClientFallback.class)
public interface MesProductionParamClient {

    @PostMapping("/mesProductionParam/setProductionList")
    RespMsgBean<List<ProductionParamQuery>> setProductionList(@RequestParam("menuCode") String menuCode, @RequestBody List<ProductionParamQuery> list);

    @PostMapping("/mesProductionArchiveList/insertBatch")
    RespMsgBean<Void> insertBatch(@RequestBody List<MesProductionArchiveList> MesProductionArchiveList);
}
