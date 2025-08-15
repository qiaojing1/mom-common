package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MesProduceMaterialBillClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrder;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

/**
 * 用料清单 Feign接口
 * @author DING WEI
 * @date 2024/6/5 15:39
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MesProduceMaterialBillClientFallback.class)
public interface MesProduceMaterialBillClient {

    @PostMapping("/mesProduceMaterialBill/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate(@RequestBody ExportWithTemplateDto dto);

    @GetMapping("/mesProduceMaterialBill/getBillDetailList")
    RespMsgBean<List<MesProduceMaterialBillOrderDetail>> getBillDetailList(@RequestParam("produceDetailId") String produceDetailId);

    @GetMapping("/mesProduceMaterialBill/getBillDetailListWithBatchNumber")
    RespMsgBean<List<MesProduceMaterialBillOrderDetail>> getBillDetailListWithBatchNumber(@RequestParam("produceDetailId") String produceDetailId);

}
