package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.AccountTermClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.dto.MrpProduceOrderDTO;
import com.lets.platform.model.mes.entity.MesProduceMaterialBillChangeOrderDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderChangeDetail;
import com.lets.platform.model.mes.entity.MesProduceOrderDetail;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

/**
 * 计量单位Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "psi",fallback = AccountTermClientFallback.class)
public interface AccountTermClient {

    @PostMapping("/psiAccountTerm/check")
    RespMsgBean<?> checkPostingTerm(@RequestBody LocalDate date);
}
