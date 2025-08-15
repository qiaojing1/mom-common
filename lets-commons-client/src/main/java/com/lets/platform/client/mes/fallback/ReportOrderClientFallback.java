package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ReportOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProduceReportOrderDetail;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class ReportOrderClientFallback extends BaseController implements ReportOrderClient {

    public RespMsgBean<Map<String, MesProduceReportOrderDetail>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }

    public RespMsgBean<Integer> updateNumber(List<MesProduceReportOrderDetail> list, String operator) {
        return success(SUCCESS);
    }

    public RespMsgBean<Map<String, BigDecimal>> findCanStockInNumber(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Void> updateQuantityBatch(Collection<MesProduceReportOrderDetail> updateList) {
        return failure();
    }
}
