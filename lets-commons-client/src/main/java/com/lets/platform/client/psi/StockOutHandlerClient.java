package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.StockOutHandlerClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.psi.entity.PsiReservationRelationship;
import com.lets.platform.model.psi.entity.StockOutModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * StoreClient
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@FeignClient(value = "psi", fallback = StockOutHandlerClientFallback.class)
public interface StockOutHandlerClient {

    @PostMapping("/stockOutHandler/autoLock")
    RespMsgBean autoLock(@RequestBody List<StockOutModel> stockOutList);

    @PostMapping("/stockOutHandler/stockOut")
    RespMsgBean stockOut(@RequestBody List<StockOutModel> stockOutList);

    @PostMapping("/stockOutHandler/release")
    RespMsgBean release(@RequestBody List<StockOutModel> stockOutList);

    @PostMapping("/stockOutHandler/autoUnlock")
    RespMsgBean autoUnlock(@RequestBody List<StockOutModel> stockOutList);

    @GetMapping("/stockOutHandler/check")
    RespMsgBean<List<PsiReservationRelationship>> check(@RequestParam("orderId") String orderId, @RequestParam("menuCode") String menuCode);
}
