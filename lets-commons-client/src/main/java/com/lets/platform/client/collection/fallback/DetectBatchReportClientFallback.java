package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectBatchReportClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 批次实验报告
 * @author: QIAO JING
 * @date: 2023/12/1 8:59
 */
@Service
public class DetectBatchReportClientFallback extends BaseController implements DetectBatchReportClient {

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

}
