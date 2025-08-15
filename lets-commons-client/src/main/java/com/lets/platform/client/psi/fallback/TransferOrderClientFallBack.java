package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.TransferOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiTransferOrder;
import com.lets.platform.model.psi.entity.PsiUnplannedStockOutOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName TransferOrderClientFallBack
 * @Description TODO
 * @Date 2024/3/21 09:11
 **/
@Service
public class TransferOrderClientFallBack extends BaseController implements TransferOrderClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Void> saveAndPosting(PsiTransferOrder order) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, Long>> findQuoteTimes(Collection<String> ids) {
        return failure();
    }

    @Override
    public RespMsgBean<Long> findCountBySourceDetailId(List<String> ids) {
        return failure(FAILURE);
    }
}
