package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.BatchRecordClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.dto.FillBatchNumberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchRecordClientClientFallback extends BaseController implements BatchRecordClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto templateDto) {
        return failure();
    }

    @Override
    public RespMsgBean<List<FillBatchNumberDto>> fillBatchNumber(List<FillBatchNumberDto> dataList) {
        return failure();
    }
}
