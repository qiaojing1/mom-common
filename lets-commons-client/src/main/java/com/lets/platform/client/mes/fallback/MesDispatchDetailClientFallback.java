package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesDispatchDetailClient;
import com.lets.platform.client.mes.MesDncPostbackRecordClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesDispatchDetail;
import com.lets.platform.model.mes.entity.MesDncPostbackRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 生产工单明细 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MesDispatchDetailClientFallback extends BaseController implements MesDispatchDetailClient {


    @Override
    public RespMsgBean delByDetectOrderCode(List<String> detectOrderCode) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateMerge(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<MesDispatchDetail>> findListByIds(Collection<String> ids) {
        return success(SUCCESS, new ArrayList<>());
    }
}
