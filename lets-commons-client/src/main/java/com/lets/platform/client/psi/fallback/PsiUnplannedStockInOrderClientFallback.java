package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PsiUnplannedStockInOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiUnplannedStockInOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 计划外入库 服务降级
 * @author DING WEI
 * @date 2024/4/23 15:32
 * @version 1.0
 */
@Service
public class PsiUnplannedStockInOrderClientFallback extends BaseController implements PsiUnplannedStockInOrderClient {

    @Override
    public RespMsgBean<String> generateAndSubmitAuditPosting(PsiUnplannedStockInOrder order) {
        return failure(FAILURE, null);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
