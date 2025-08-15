package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SaleQuotationOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售报价单Feign 接口
 * @author DING WEI
 * @date 2025/1/9 11:37
 * @version 1.0
 */
@Service
public class SaleQuotationOrderClientFallback extends BaseController implements SaleQuotationOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

}
