package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PackageOrderClient;
import com.lets.platform.client.psi.StockTransferOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockTransferOrderClientFallback extends BaseController implements StockTransferOrderClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate( ExportWithTemplateDto dto) {
        return failure();
    }

}
