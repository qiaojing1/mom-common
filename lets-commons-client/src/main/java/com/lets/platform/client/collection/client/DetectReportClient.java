package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.DetectReportClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.collection.entity.CollectionDetectReport;
import com.lets.platform.model.collection.entity.CollectionDetectReportVideo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * 设备历史状态
 *
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection", fallback = DetectReportClientFallback.class)
public interface DetectReportClient {

    @PostMapping("/collectionDetectReport/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @PostMapping("/collectionDetectReport/updateStatus")
    RespMsgBean updateStatus(@RequestBody List<CollectionDetectReport> reportList);

    @GetMapping("/collectionDetectReport/defaultFindById")
    RespMsgBean<CollectionDetectReport> defaultFindById(@RequestParam("id") String id);


    @PostMapping("/collectionDetectReportVideo/removeByDetailIds")
    public RespMsgBean removeByDetailIds(@RequestBody Collection<String> ids, @RequestParam("isMerge") String isMerge);

    @PostMapping("/collectionDetectReportVideo/saveBatchVideo")
    public RespMsgBean saveBatchVideo(@RequestBody Collection<CollectionDetectReportVideo> ids);

    @GetMapping("/collectionDetectReportVideo/getVideoByDetailId")
    public RespMsgBean<List<CollectionDetectReportVideo>> getByDetailId(@RequestParam("id") String id);

    @GetMapping("/collectionDetectReport/findNotTransferVideo")
    RespMsgBean<List<CollectionDetectReport>> findNotTransferVideo();

}
