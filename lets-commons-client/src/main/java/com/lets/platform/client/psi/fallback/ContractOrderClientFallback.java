package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.ContractOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购申请Feign 接口
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 2023/11/18 14:27
 */
@Service
public class ContractOrderClientFallback extends BaseController implements ContractOrderClient {
    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

}
