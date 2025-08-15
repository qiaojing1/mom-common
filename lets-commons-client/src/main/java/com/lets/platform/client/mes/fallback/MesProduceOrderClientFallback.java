package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.MesProduceOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.PutInProduceOrderDto;
import com.lets.platform.model.mes.entity.MesProduceOrder;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderDetailSerial;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 生产工单 Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MesProduceOrderClientFallback extends BaseController implements MesProduceOrderClient {

    public RespMsgBean<String> defaultSave(MesProduceOrder entity) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PutInProduceOrderDto> defaultSaveAndStatus(PutInProduceOrderDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> getMrpIncomingList(LocalDateTime startDate, LocalDateTime endDate, Collection<String> materialIds, boolean wipInventory) {
        return failure();
    }

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    public RespMsgBean<List<MesProduceOrder>> getBarcodeInfo(Collection<String> detailIds) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<MesProduceOrder> getById(String id) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetailSerial>> getSerialList(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> getBySourceOrderIds(Collection<String> sourceOrderIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> findProduceOrderDetailList(LocalDate startDate,
                                                                               LocalDate endDate,
                                                                               Set<String> orderCategoryIds,
                                                                               String materialId,
                                                                               String materialSpecific,
                                                                               boolean ignoreMaterialSpecific,
                                                                               boolean wipInventory) {
        return failure();
    }

    @Override
    public RespMsgBean<MesProduceOrderDetail> getProduceOrderDetailById(String id) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> findProduceOrderDetailByIds(Collection<String> detailIds) {
        return failure();
    }
}
