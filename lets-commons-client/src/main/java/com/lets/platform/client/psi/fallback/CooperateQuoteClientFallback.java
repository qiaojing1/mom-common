package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.CooperateQuoteClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 协同报价单
 * @author DING WEI
 * @date 2025/3/28 15:24
 * @version 1.0
 */
@Service
public class CooperateQuoteClientFallback extends BaseController implements CooperateQuoteClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
