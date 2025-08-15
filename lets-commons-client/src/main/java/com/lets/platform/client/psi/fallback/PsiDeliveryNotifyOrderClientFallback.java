package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.PsiDeliveryNotifyOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.base.BaseProcessEntity;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.psi.entity.PsiDeliveryNotifyOrder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 出货通知单Feign 接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2024/01/18 14:27
 */
@Service
public class PsiDeliveryNotifyOrderClientFallback extends BaseController implements PsiDeliveryNotifyOrderClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiDeliveryNotifyOrder>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS,new HashMap<>());
    }

    @Override
    public RespMsgBean<?> rowDisable(BaseProcessEntity<?> entity) {
        return success(SUCCESS);
    }
}
