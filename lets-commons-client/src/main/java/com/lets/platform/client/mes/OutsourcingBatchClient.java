package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.OutsourcingBatchClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesProcessOutsourcingBatchDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 生产领料申请 feign接口
 * @author DING WEI
 * @date 2024/6/6 8:53
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = OutsourcingBatchClientFallback.class)
public interface OutsourcingBatchClient {

    @PostMapping("/processOutsourcingBatchOut/getSourceInfo")
    RespMsgBean<List<MesProcessOutsourcingBatchDetail>> getSourceInfo4Out(@RequestBody List<String> ids);

    @PostMapping("/processOutsourcingBatchIn/getSourceInfo")
    RespMsgBean<List<MesProcessOutsourcingBatchDetail>> getSourceInfo4In(@RequestBody List<String> ids);



}
