/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.client.collection.client;

import com.lets.platform.client.collection.fallback.DetectDictClientFallback;
import com.lets.platform.client.collection.fallback.QualityCertificationClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.collection.entity.CollectionDetectDict;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 设备历史状态
 *
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@FeignClient(value = "collection", fallback = DetectDictClientFallback.class)
public interface DetectDictClient {

    @PostMapping("/collectionDetectDict/queryByType")
    RespMsgBean<List<CollectionDetectDict>> queryByType(@RequestBody List<String> types);

    @GetMapping("/collectionDetectDict/findValveClassify")
     RespMsgBean<CollectionDetectDict> findValveClassify(@RequestParam("valveTypeId") String valveTypeId,@RequestParam("standardId") String standardId, @RequestParam("scope") String scope);
}
