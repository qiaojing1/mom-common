/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.client.collection.fallback;

import com.lets.platform.client.collection.client.DetectReportClient;
import com.lets.platform.client.collection.client.QualityCertificationClient;
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
public class QualityCertificationClientFallback extends BaseController implements QualityCertificationClient {

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

}
