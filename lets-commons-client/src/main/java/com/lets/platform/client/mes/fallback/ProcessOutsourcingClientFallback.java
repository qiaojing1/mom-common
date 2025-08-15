package com.lets.platform.client.mes.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.mes.ProcessOutsourcingClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.dto.ProcessPlanRequestDto;
import com.lets.platform.model.mes.entity.*;
import com.lets.platform.model.psi.vo.CheckDistributeVo;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 工序委外 Feign接口 服务降级
 * @author DING WEI
 * @date 2024/5/7 10:58
 * @version 1.0
 */
@Service
public class ProcessOutsourcingClientFallback extends BaseController implements ProcessOutsourcingClient {

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateOut(ExportWithTemplateDto dto) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<MesProcessOutsourcingOut> findById4Out(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, MesProcessOutsourcingOut>> findByIds4OutMap(Collection<String> ids) {
        return success(new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProcessOutsourcingOut>> listOutByIds(Collection<String> ids) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<Integer> updateList4StockIn(List<MesProcessOutsourcingOut> list) {
        return failure();
    }

    @Override
    public RespMsgBean<MesProcessOutsourcingIn> findById4In(String id) {
        return success();
    }

    @Override
    public RespMsgBean<Page<MesProcessOutsourcingIn>> defaultPage4In(AutoConditionEntity autoConditionEntity) {
        return success(FIND_FAILURE, new Page<>());
    }

    @Override
    public RespMsgBean<List<MesProcessOutsourcingIn>> findByInProcessPlanIds(ProcessPlanRequestDto requestDto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Long> findCountBySourceDetailId(String sourceDetailId, String sourceOrderType) {
        return success(SUCCESS, 0L);
    }

    @Override
    public RespMsgBean<Map<String, Integer>> findCountByOutsourcingOutIds(Collection<String> sourceDetailIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Page<MesProcessOutsourcingOut>> defaultPage4Out(AutoConditionEntity autoConditionEntity) {
        return success(FIND_FAILURE, new Page<>());
    }

    @Override
    public RespMsgBean<Map<String, List<MesProcessOutsourcingOut>>> findBySourceDetailIds4Map(Collection<String> sourceDetailIds) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProcessOutsourcingOut>> findBySourceDetailId4List(String sourceDetailId) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessOutsourcingOut>> findOutsourcingStore4BillIssue(List<MesProduceMaterialBillOrder> outsourcingAllocationReverse) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<CheckDistributeVo> checkDistribute4In(AutoConditionEntity autoConditionEntity) {
        return success(FIND_FAILURE);
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateIn(ExportWithTemplateDto dto) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplateSettlement(ExportWithTemplateDto dto) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<Page<MesProcessOutsourcingSettlement>> defaultPage4Settlement(AutoConditionEntity autoConditionEntity) {
        return success(FIND_FAILURE, new Page<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessOutsourcingSettlement>> findByIds4SettlementMap(Collection<String> ids) {
        return success(FIND_FAILURE, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessOutsourcingSettlementDetail>> findByIds4SettlementDetailMap(Collection<String> ids) {
        return success(FIND_FAILURE, new HashMap<>());
    }

    @Override
    public RespMsgBean<Integer> updateList4PurchaseAp(List<MesProcessOutsourcingSettlementDetail> list) {
        return success(FAILURE);
    }
}
