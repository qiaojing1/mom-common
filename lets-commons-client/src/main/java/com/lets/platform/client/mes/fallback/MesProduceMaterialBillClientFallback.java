package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceMaterialBillClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 用料清单 服务降级
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/6/5 15:42
 */
@Service
public class MesProduceMaterialBillClientFallback extends BaseController implements MesProduceMaterialBillClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<MesProduceMaterialBillOrderDetail>> getBillDetailList(String produceDetailId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceMaterialBillOrderDetail>> getBillDetailListWithBatchNumber(String produceDetailId) {
        return failure();
    }
}
