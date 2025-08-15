package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SalePredictionOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售预测单Feign 接口 服务降级
 * @author DING WEI
 * @date 2024/7/19 16:36
 * @version 1.0
 */
@Service
public class SalePredictionOrderClientFallback extends BaseController implements SalePredictionOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
