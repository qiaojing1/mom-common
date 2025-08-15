package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceReportOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.ReportDto;
import com.lets.platform.model.mes.entity.MesProduceReportOrder;
import com.lets.platform.model.mes.entity.MesProduceReportOrderDetail;
import com.lets.platform.model.mes.entity.MesProduceReportOrderDetailSerial;
import com.lets.platform.model.mes.vo.ProduceReportNumberVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 工单报工单 Feign接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MesProduceReportOrderClientFallback extends BaseController implements MesProduceReportOrderClient {

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    public RespMsgBean<List<MesProduceReportOrder>> getBarcodeInfo(Collection<String> detailIds) {
        return success(SUCCESS, new ArrayList<>());
    }

    public RespMsgBean<MesProduceReportOrderDetail> getDetailByDetailId(@RequestParam("id") String id) {
        return success(SUCCESS, null);
    }

    public RespMsgBean<List<MesProduceReportOrderDetail>> getDetailsByDetailIds(@RequestParam("ids") Collection<String> ids) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<MesProduceReportOrder> defaultFindById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, MesProduceReportOrder>> findByIds4Map(Collection<String> ids) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceReportOrderDetailSerial>> getSerialList(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<MesProduceReportOrder> generateProduceReportOrder4Sjdj(ReportDto reportDto) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Long> findCountBySourceDetailIdAndToday(String sourceDetailId) {
        return success(SUCCESS, 0L);
    }

    @Override
    public RespMsgBean<ProduceReportNumberVo> findNumberBySourceDetailIdAndToday(String sourceDetailId) {
        return success(SUCCESS, null);
    }
}
