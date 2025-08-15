package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.OrderTrackClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.dto.InspectDTO;
import com.lets.platform.model.psi.entity.PsiOrderTrack;
import com.lets.platform.model.psi.entity.PsiPurchaseOrderDetail;
import com.lets.platform.model.psi.entity.PsiSaleOrderMaterial;
import com.lets.platform.model.psi.vo.UpdateOrderTrackVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangweiyan
 * @InterfaceName OrderTrackClient
 * @Description 计划跟踪号client
 * @Date 2024/4/22 11:23
 **/
@FeignClient(value = "psi",fallback = OrderTrackClientFallback.class)
public interface OrderTrackClient {

    @PostMapping("/psiOrderTrack/addTracks")
    RespMsgBean addTracks(@RequestBody List<PsiOrderTrack> psiOrderTracks);

    @PostMapping("/psiOrderTrack/deleteTracks")
    RespMsgBean deleteTracks(List<PsiOrderTrack> psiOrderTracks);

    @GetMapping("/psiOrderTrack/query")
    RespMsgBean<List<PsiOrderTrack>> queryByOrderIdAndDetailId(@RequestParam("orderIds") List<String> orderIds,
                                                               @RequestParam("detailIds")  List<String> detailIds);

    @GetMapping("/psiOrderTrack/deleteByOrderIdAndDetailId")
    RespMsgBean deleteByOrderIdAndDetailId(@RequestParam("orderIds") List<String> orderIds,
                                           @RequestParam("detailIds")  List<String> detailIds);

    @GetMapping("/psiOrderTrack/queryByTrackNo")
    RespMsgBean<List<PsiOrderTrack>> queryByTrackNo(@RequestParam("trackNo") String trackNo,
                                                    @RequestParam(value = "materialId", required = false)  String materialId);

    @GetMapping("/psiOrderTrack/updateOrderTimeAndStatus")
    RespMsgBean<Void> updateOrderTimeAndStatus(@RequestParam("orderTime") String orderTime,
                                               @RequestParam(value = "status") String status,
                                               @RequestParam("orderIds") String orderIds);

    @PostMapping("/psiOrderTrack/updateOrderTimeAndStatusBatch")
    RespMsgBean<Void> updateOrderTimeAndStatusBatch(@RequestBody Map<String, UpdateOrderTrackVo> updateMap);

    @PostMapping("/psiOrderTrack/querySaleInfo")
    RespMsgBean<List<PsiSaleOrderMaterial>> querySaleInfo(@RequestBody List<Map<String, String>> queryList);

    @PostMapping("/psiOrderTrack/queryPurchase")
    RespMsgBean<Map<String, PsiPurchaseOrderDetail>> queryPurchase(@RequestBody Set<String> detailIds);

    @PostMapping("/psiOrderTrack/queryInspectValue")
    RespMsgBean<Map<String, InspectDTO>> queryInspectValue(@RequestBody Set<String> detailIds);

    @PostMapping("/psiOrderTrack/findByOrderDetailIds")
    RespMsgBean<List<PsiOrderTrack>> findByOrderDetailIds(@RequestBody Set<String> detailIds);

    @PostMapping("/psiOrderTrack/findByRootDetailIds")
    RespMsgBean<List<PsiOrderTrack>> findByRootDetailIds(@RequestBody Set<String> detailIds);
}
