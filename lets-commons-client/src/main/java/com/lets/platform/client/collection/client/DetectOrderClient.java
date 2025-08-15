package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.DetectOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.collection.dto.DetectOrderFromMesDto;
import com.lets.platform.model.collection.entity.CollectionDetectOrder;
import com.lets.platform.model.collection.entity.CollectionDetectOrderProject;
import com.lets.platform.model.collection.entity.CollectionQualityCertification;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.common.dto.GetInspectItemInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 设备历史状态
 *
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection", fallback = DetectOrderClientFallback.class)
public interface DetectOrderClient {

    @PostMapping("/collectionDetectOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/collectionDetectOrder/generateOrderFromMes")
    RespMsgBean<Map<String, Object>> generateOrderFromMes(@RequestBody DetectOrderFromMesDto dto);

    @PostMapping("/collectionDetectOrder/findBySourceDetailIds")
    RespMsgBean<Map<String, List<CollectionDetectOrder>>> findBySourceDetailIds(@RequestBody Collection<String> sourceDetailIds);

    @PostMapping("/collectionDetectOrder/extractOrderInfo")
    RespMsgBean<CollectionDetectOrder> extractOrderInfo(@RequestBody GetInspectItemInfoDto dto);

    @PostMapping("/collectionDetectOrder/getDetectInspectItem")
    RespMsgBean<List<CollectionDetectOrderProject>> getDetectInspectItem(@RequestBody GetInspectItemInfoDto dto);

    @PostMapping("/collectionQualityCertification/batSave")
    RespMsgBean<String> batSaveQualityCertification(@RequestBody List<CollectionQualityCertification> list) ;
}
