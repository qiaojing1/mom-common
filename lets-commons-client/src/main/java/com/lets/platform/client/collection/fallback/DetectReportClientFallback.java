package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectReportClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.collection.entity.CollectionDetectReport;
import com.lets.platform.model.collection.entity.CollectionDetectReportVideo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;

/**
 * 设备历史状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class DetectReportClientFallback extends BaseController implements DetectReportClient {

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean updateStatus(List<CollectionDetectReport> reportList) {
        return success(SUCCESS);
    }


    @Override
    public RespMsgBean<CollectionDetectReport> defaultFindById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean removeByDetailIds(Collection<String> ids,String isMerge) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean saveBatchVideo(Collection<CollectionDetectReportVideo> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<CollectionDetectReportVideo>> getByDetailId(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<CollectionDetectReport>> findNotTransferVideo() {
        return success(SUCCESS);
    }
}
