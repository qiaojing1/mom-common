package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PurchaseInvoiceOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 采购发票登记 Feign接口降级
 * @author DING WEI
 * @date 2024/4/8 16:50
 * @version 1.0
 */
@Service
public class PurchaseInvoiceOrderClientFallback extends BaseController implements PurchaseInvoiceOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Long> getOrderCount() {
        return success(SUCCESS, 0L);
    }

}
