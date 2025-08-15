package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.ProduceOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.entity.*;
import com.lets.platform.model.psi.query.TaskDetailQuery;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class ProduceOrderClientFallback extends BaseController implements ProduceOrderClient {

    @Override
    public RespMsgBean<MesProduceOrder> findByDetailId4AllCol(String detailId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<MesProduceOrder>> findListByDetailId4AllCol(Collection<String> detailIds) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<MesProduceOrder>> findAllCol4UserReport(String factoryModeId, String today) {
        return success(FIND_SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProduceOrder>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<MesProduceOrderDetail> getById4Detail(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<MesProduceOrderDetail> getById4MainDetail(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> getDetailListById(String id) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, MesProduceOrderDetail>> findByIds4Map4dDetail(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Boolean> updateMoment4Detail(String id, String moment) {
        return failure(FAILURE, Boolean.FALSE);
    }

    @Override
    public RespMsgBean<Map<String, List<MesProduceOrderDetail>>> findDetailMapByMrpSourceDetailIds(Collection<String> mrpSourceDetailIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Integer> updateQualifiedNumber(List<MesProduceOrderDetail> list) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean updateOutsourcingNumber(List<MesProduceOrderDetail> updateList) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Void> updateQuantityBatch(Collection<MesProduceOrderDetail> updateList) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetailSpecific>> findDetailSpecificList(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> findSumBySourceDetailIds(Collection<String> sourceDetailIds) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<String> issue4ScheduledTasks(String tenancyId) {
        return failure(FAILURE, "MES服务异常");
    }

    @Override
    public RespMsgBean<Long> getSourceCount(String sourceId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<String>> batSaveOrder(List<MesProduceOrder> orderList) {
        return null;
    }

    @Override
    public RespMsgBean<Void> updateMrpQuantity(Collection<MesProduceOrderDetail> updateList) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetailSpecific>> findSpecificsByDetailIds(Collection<String> ids) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetailSerial>> findSerialByDetailIds(Collection<String> ids) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, MesProduceOrderDetail>> findByIds4MapWithSerialAndSpecific(Collection<String> ids) {
        return success(new HashMap<>());
    }

    @Override
    public RespMsgBean<List<MesProduceOrderBom>> getBomList(String billOrderId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderBomDetail>> getBomDetailList(String billOrderId) {
        return failure();
    }

    @Override
    public RespMsgBean<Void> updateCalculated(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<BaseEntity>> getTaskDetail(TaskDetailQuery query) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, MesProduceOrderDetail>> findProduceOrderDetailWithKitPickNumber(Collection<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderRouteProcess>> findRouteProcess(String orderId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MesProduceOrderDetail>> queryInProgressDetailList(Set<String> materialIds) {
        return failure();
    }
}
