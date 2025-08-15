package com.lets.platform.client.psi;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.psi.fallback.WipStockInOrderClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.model.mes.entity.MesProduceReportOrderVO;
import com.lets.platform.model.psi.entity.PsiWipCompletionStockInOrder;
import com.lets.platform.model.psi.vo.PsiWipCompletionStockInOrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 完工入库单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@FeignClient(value = "psi",fallback = WipStockInOrderClientFallback.class)
public interface WipStockInOrderClient {

    @PostMapping("/psiWipCompletionStockInOrder/saveBatch")
    RespMsgBean<Boolean> saveBatch(@RequestBody List<PsiWipCompletionStockInOrder> list);

    @PostMapping("/psiWipCompletionStockInOrder/saveAndPosting")
    RespMsgBean<?> saveAndPosting(@RequestBody PsiWipCompletionStockInOrder stockInOrder);
    @PostMapping("/psiWipCompletionStockInOrder/saveAndPostingIgnoreBack")
    RespMsgBean<?> saveAndPostingIgnoreBack(@RequestBody PsiWipCompletionStockInOrder stockInOrder);
    @PostMapping("/psiWipCompletionStockInOrder/saveAndWithStatus")
    RespMsgBean<?> saveAndWithStatus(@RequestBody PsiWipCompletionStockInOrder stockInOrder,
                                     @RequestParam(value = "status", required = false) Integer status);

    @PostMapping("/psiWipCompletionStockInOrder/findQuoteTimes")
    RespMsgBean<Map<String, Long>> findQuoteTimes(@RequestBody Collection<String> ids);

    @PostMapping("/psiWipCompletionStockInOrder/queryCount")
    RespMsgBean<Long> queryCount(@RequestBody Collection<String> ids);

    @PostMapping("/psiWipCompletionStockInOrder/findWithReportOrder")
    RespMsgBean<Map<String, Object>> findWithReportOrder(@RequestBody List<MesProduceReportOrderVO> reportOrderVOS);
    @PostMapping("/psiWipCompletionStockInOrder/findStockInCount")
    RespMsgBean<Map<String, List<BigDecimal>>> findStockInCount(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime,
                                                                       @RequestParam("queryType") String queryType,
                                                                       @RequestBody List<MesProduceReportOrderVO> reportOrderVOS);
    @PostMapping("/psiWipCompletionStockInOrder/queryPage")
    RespMsgBean<Page<PsiWipCompletionStockInOrderVO>> queryPage(@RequestBody AutoConditionEntity entity);
}
