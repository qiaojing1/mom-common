package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.StepTransferOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 分步调出Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/9/21 14:27
 */
@Service
public class StepTransferOrderClientFallback extends BaseController implements StepTransferOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }
}
