package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MaterialBillOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrder;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 生产用料清单 feign接口 服务降级
 * @author DING WEI
 * @date 2024/5/22 14:11
 * @version 1.0
 */
@Service
public class MaterialBillOrderClientFallback extends BaseController implements MaterialBillOrderClient {

    @Override
    public RespMsgBean<Map<String, MesProduceMaterialBillOrder>> findByIds4MapAllCol(Collection<String> detailIds) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProduceMaterialBillOrder>> findByIds4ListAllCol(Collection<String> detailIds) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Integer> update4Allocation(Collection<MesProduceMaterialBillOrderDetail> list) {
        return failure(FAILURE, 0);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate4BillChange(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }
}
