package com.lets.platform.client.mes.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.mes.MesInspectionOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.*;
import com.lets.platform.model.mes.params.InspectSubmitParam;
import com.lets.platform.model.mes.query.SampleQuantityQuery;
import com.lets.platform.model.mes.vo.MesInspectionOrderVO;
import com.lets.platform.model.psi.dto.LimitStoreDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class MesInspectionOrderClientFallback extends BaseController implements MesInspectionOrderClient {

    @Override
    public RespMsgBean<String> defaultSave(MesInspectionOrder entity) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<?> pdaSubmit(InspectSubmitParam param) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<MesInspectionOrderDetail>> findDetailListByDetailIds(Collection<String> detailIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<MesInspectionOrderDetail>> findDetailListByIds(Collection<String> ids) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<MesInspectionOrderDetailUnqualifiedHandle>> findUnqualifiedHandleList(Collection<String> detailIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Map<String, MesInspectionOrder>> findByIds4Map(Collection<String> ids) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Set<String>> findDetailBySourceDetailIds(Collection<String> detailIds) {
        return failure(FAILURE, new HashSet<>());
    }

    @Override
    public RespMsgBean<Long> queryCount(Collection<String> detailIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Map<String, LimitStoreDTO>> findLimitStoreBySourceDetailId4Map(Collection<String> sourceDetailIds) {return failure(FAILURE);}

    @Override
    public RespMsgBean<Set<SampleQuantityQuery>> queryCrossCheckQuantityBatch(Set<SampleQuantityQuery> queryList) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Page<MesInspectionOrderVO>> findReportForm(AutoConditionEntity autoConditionEntity) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<SamplingPlanConfigDetail> getSamplingPlanDetail(String samplingPlanId, BigDecimal batchQuantity) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<MesInspectionItemsValues>> getInspectionItemsValues(Set<String> inspectionItemIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<MesInspectionValues>> findInspectionValues() {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Boolean> isBind(Set<String> barcodeIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<Map<String, Object>>> findDetailReportMap(String startTime, String endTime, String businessCodes) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<MesInspectionOrder> findMaxAuditTimeBySourceDetailIds(Collection<String> sourceDetailIds) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<MesInspectionOrder> findByOrderId(String orderId) {
        return success(SUCCESS);
    }
}
