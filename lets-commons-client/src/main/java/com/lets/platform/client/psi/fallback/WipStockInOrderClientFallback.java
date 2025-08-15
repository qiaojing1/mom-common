package com.lets.platform.client.psi.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.psi.WipStockInOrderClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesProduceReportOrderVO;
import com.lets.platform.model.psi.entity.PsiWipCompletionStockInOrder;
import com.lets.platform.model.psi.vo.PsiWipCompletionStockInOrderVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 完工入库单Feign 接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/10/19 14:27
 */
@Service
public class WipStockInOrderClientFallback extends BaseController implements WipStockInOrderClient {

    @Override
    public RespMsgBean<Boolean> saveBatch(List<PsiWipCompletionStockInOrder> list) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<?> saveAndPosting(PsiWipCompletionStockInOrder stockInOrder) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<?> saveAndPostingIgnoreBack(PsiWipCompletionStockInOrder stockInOrder) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<?> saveAndWithStatus(PsiWipCompletionStockInOrder stockInOrder, Integer status) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<Map<String, Long>> findQuoteTimes(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Long> queryCount(Collection<String> ids) {
        return success(SUCCESS, 0L);
    }

    @Override
    public RespMsgBean<Map<String, Object>> findWithReportOrder(List<MesProduceReportOrderVO> reportOrderVOS) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<BigDecimal>>> findStockInCount(String startTime, String endTime, String queryType, List<MesProduceReportOrderVO> reportOrderVOS) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Page<PsiWipCompletionStockInOrderVO>> queryPage(AutoConditionEntity entity) {
        return success(SUCCESS, new Page<>());
    }
}
