package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.PickingApplyClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProducePickingApply;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 领料申请 feign接口 服务降级
 * @author DING WEI
 * @date 2024/6/6 8:54
 * @version 1.0
 */
@Service
public class PickingApplyClientFallback extends BaseController implements PickingApplyClient {

    @Override
    public RespMsgBean<Map<String, MesProducePickingApply>> findByIds4MapAllCol(Collection<String> detailIds) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProducePickingApply>> findByIds4ListAllCol(Collection<String> detailIds) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }
}
