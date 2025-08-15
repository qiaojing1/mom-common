package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesOutsourcingBatchClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 委外合并发出接收
 * @author DING WEI
 * @date 2025/2/11 17:55
 * @version 1.0
 */
@Service
public class MesOutsourcingBatchClientFallback extends BaseController implements MesOutsourcingBatchClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateOut(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateIn(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
