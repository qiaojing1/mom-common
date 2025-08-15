package com.lets.platform.client.psi;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.dto.MrpProduceOrderDTO;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillChangeOrderDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderChangeDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 计量单位Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "psi")
public interface MrpClient {

    @PostMapping("/psiPlanCalculationTask/onProduceOrderDeleteOrDisable")
    RespMsgBean<Void> onProduceOrderDeleteOrDisable(@RequestParam("detailId") String detailId);

    @PostMapping("/psiPlanCalculationTask/onProduceOrderUpdate")
    RespMsgBean<Void> onProduceOrderUpdate(@RequestBody MrpProduceOrderDTO<MesProduceOrderDetail> param);

    @PostMapping("/psiPlanCalculationTask/onProduceBillOrderUpdate")
    RespMsgBean<Void> onProduceBillOrderUpdate(@RequestBody MrpProduceOrderDTO<MesProduceOrderDetail> param);

    @PostMapping("/psiPlanCalculationTask/afterApprove")
    RespMsgBean<Void> afterApprove(@RequestBody List<MesProduceOrderChangeDetail> detailList);

    @PostMapping("/psiPlanCalculationTask/afterEffect")
    RespMsgBean<Void> afterEffect(@RequestBody List<MesProduceMaterialBillChangeOrderDetail> detailList);
}
