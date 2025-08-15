package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectReportClient;
import com.lets.platform.client.collection.client.RemoteSupervisionClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备历史状态
 * @author: DING WEI
 * @date: 2023/12/1 8:59
 */
@Service
public class RemoteSupervisionClientFallback extends BaseController implements RemoteSupervisionClient {

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

}
