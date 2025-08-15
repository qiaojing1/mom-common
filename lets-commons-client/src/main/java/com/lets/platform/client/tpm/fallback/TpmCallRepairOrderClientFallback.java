package com.lets.platform.client.tpm.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.tpm.client.TpmCallRepairOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.tpm.entity.TpmCallRepairOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * TpmCallRepairOrderClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmCallRepairOrderClientFallback extends BaseController implements TpmCallRepairOrderClient {

    @Override
    public RespMsgBean<Page<TpmCallRepairOrder>> findPage(AutoConditionEntity entity) {
        return success(SUCCESS, new Page<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
