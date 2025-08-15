package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.OrderTrackClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.dto.InspectDTO;
import com.lets.platform.model.psi.entity.PsiOrderTrack;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetail;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterial;
import com.lets.platform.model.psi.vo.UpdateOrderTrackVo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

/**
 * @author zhangweiyan
 * @ClassName OrderTrackClientFallback
 * @Description TODO
 * @Date 2024/4/22 11:23
 **/
@Service
public class OrderTrackClientFallback extends BaseController implements OrderTrackClient {
    @Override
    public RespMsgBean addTracks(List<PsiOrderTrack> psiOrderTracks) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean deleteTracks(List<PsiOrderTrack> psiOrderTracks) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiOrderTrack>> queryByOrderIdAndDetailId(List<String> orderIds,
                                                  List<String> detailIds) {
        return success("查询失败", new ArrayList<>());
    }

    @Override
    public RespMsgBean deleteByOrderIdAndDetailId(List<String> orderIds, List<String> detailIds) {
        System.out.println("删除失败");
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiOrderTrack>> queryByTrackNo(String trackNo, String materialId) {
        return success("查询失败", new ArrayList<>());
    }

    @Override
    public RespMsgBean<Void> updateOrderTimeAndStatus(String orderTime, String status, String orderIds) {
        return success();
    }

    @Override
    public RespMsgBean<Void> updateOrderTimeAndStatusBatch(Map<String, UpdateOrderTrackVo> updateMap) {
        return success();
    }

    @Override
    public RespMsgBean<List<PsiSaleOrderMaterial>> querySaleInfo(List<Map<String, String>> queryList) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiPurchaseOrderDetail>> queryPurchase(Set<String> sourceOrderDetailIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, InspectDTO>> queryInspectValue(Set<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiOrderTrack>> findByOrderDetailIds(@RequestBody Set<String> detailIds) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiOrderTrack>> findByRootDetailIds(@RequestBody Set<String> detailIds) {
        return failure();
    }
}
