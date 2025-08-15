package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PsiPurchasePaymentRefundDocClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 应收单 服务降级
 * @author zhangweiyan
 * @date 2025/4/08 15:32
 * @version 1.0
 */
@Service
public class PsiPurchasePaymentRefundDocClientFallback extends BaseController implements PsiPurchasePaymentRefundDocClient {


    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
