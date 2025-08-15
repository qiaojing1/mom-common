package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ProductRepairOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProductRepairOrder;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 产品维修工单 feign接口 服务降级
 * @author DING WEI
 * @date 2025/6/5 10:40
 * @version 1.0
 */
@Service
public class ProductRepairOrderClientFallback extends BaseController implements ProductRepairOrderClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<MesProductRepairOrder>> findByIds(Collection<String> ids) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProductRepairOrder>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<MesProductRepairOrder> getById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Integer> updateList(List<MesProductRepairOrder> updateList) {
        return success(SUCCESS, GlobalConstant.ZERO);
    }
}
