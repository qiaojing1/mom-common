package com.lets.platform.client.mes.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.mes.MesProducePickingClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.GeneratePickingOrderDto;
import com.lets.platform.model.mes.entity.MesProducePicking;
import com.lets.platform.model.mes.entity.MesProducePickingDetail;
import com.lets.platform.model.psi.entity.StockOutModel;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 工单报工单 Feign接口
 *
 * @author QIAO JING
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MesProducePickingClientFallback extends BaseController implements MesProducePickingClient {

    @Override
    public RespMsgBean<?> pdaPosting(MesProducePicking entity) {
        return success(SUCCESS);
    }

    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<MesProducePicking> getByCode(String code) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<MesProducePicking> defaultFindById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<MesProducePicking>> findListByIds(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Page<MesProducePicking>> defaultPage(AutoConditionEntity entity) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<String> generateReversePickingOrder(GeneratePickingOrderDto dto) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<List<StockOutModel>> findStockOutModels(String orderId) {
        return success(SUCCESS,new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProducePickingDetail>> findByIds4Map4Detail(Collection<String> ids) {
        return success(SUCCESS,new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProducePicking>> findByIds4Map(Collection<String> ids) {
        return failure();
    }
}
