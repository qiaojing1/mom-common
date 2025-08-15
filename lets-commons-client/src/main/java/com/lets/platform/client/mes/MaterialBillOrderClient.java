package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.MaterialBillOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.Date4ExportTemplateVo;
import com.lets.platform.model.common.dto.ExportWithTemplateDto;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrder;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillOrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 生产用料清单 feign接口
 * @author DING WEI
 * @date 2024/6/3 18:09
 * @version 1.0
 */
@FeignClient(value = "mes", fallback = MaterialBillOrderClientFallback.class)
public interface MaterialBillOrderClient {

    @PostMapping("/mesProduceMaterialBill/findByIds4MapAllCol")
    RespMsgBean<Map<String, MesProduceMaterialBillOrder>> findByIds4MapAllCol(@RequestBody Collection<String> detailIds);

    @PostMapping("/mesProduceMaterialBill/findByIds4ListAllCol")
    RespMsgBean<List<MesProduceMaterialBillOrder>> findByIds4ListAllCol(@RequestBody Collection<String> detailIds);

    @PostMapping("/produceMaterialBillOrderDetail/update4Allocation")
    RespMsgBean<Integer> update4Allocation(@RequestBody Collection<MesProduceMaterialBillOrderDetail> list);

    @PostMapping("/produceMaterialBillChangeOrder/batGetDate4ExportTemplate")
    RespMsgBean<List<Date4ExportTemplateVo>> batGetDate4ExportTemplate4BillChange(@RequestBody ExportWithTemplateDto dto);
}
