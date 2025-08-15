package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ProcessPlanClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.mes.entity.MesProcessPlan;
import com.lets.platform.model.mes.entity.MesProcessPlanDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderRouteProcess;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 工序计划单 feign接口 服务降级
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/5/22 14:11
 */
@Service
public class ProcessPlanClientFallback extends BaseController implements ProcessPlanClient {

    @Override
    public RespMsgBean<MesProcessPlan> findById4Do(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, MesProcessPlan>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessPlanDetail>> findByIds4DetailMap(Collection<String> detailIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<MesProcessPlan>>> findMapByTrackNo(Collection<String> trackNos) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProcessPlan>> findByIds4AllColList(Collection<String> detailIds) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(ExportWithTemplateDto dto) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProduceOrderRouteProcess>> findByIds4RouteProcessMap(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<MesProcessPlanDetail> findCanReceiveNum(String id, String detectOrderCode) {
        return success(SUCCESS, new MesProcessPlanDetail());
    }

    @Override
    public RespMsgBean<Map<String, List<MesProcessPlanDetail>>> findRepairPlanDetailBySourcePlan(List<String> params) {
        return success(new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, Map<String, List<MesProcessPlanDetail>>>> findMultiPreOrNextProcessBat(Map<String, List<String>> params) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<CommonDevice>> findDevice4Dispatch(List<String> params) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, List<Map<String, Object>>>> findOutsourcingOutAndInOrderUnderReview(Map<String, List<String>> params) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<String> autoComplete(String tenancyId) {
        return failure(FAILURE, "操作失败");
    }

    @Override
    public RespMsgBean<List<MesProcessPlanDetail>> getProcessDetailWithReceiveTime(String produceDetailId) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessPlanDetail>> getProcessDetailWithReceiveTimeByIds(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProcessPlanDetail>> findDetailMapByDispatchIds(Collection<String> dispatchIds) {
        return success(SUCCESS, new HashMap<>());
    }

}
