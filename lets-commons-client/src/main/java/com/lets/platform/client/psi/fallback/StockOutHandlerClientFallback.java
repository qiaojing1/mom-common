package com.lets.platform.client.psi.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.psi.CustomClient;
import com.lets.platform.client.psi.StockOutHandlerClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiCustom;
import com.lets.platform.model.psi.entity.PsiReservationRelationship;
import com.lets.platform.model.psi.entity.StockOutModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 客户Feign接口
 * @author DING WEI
 * @date 2023/7/5 17:38
 * @version 1.0
 */
@Service
public class StockOutHandlerClientFallback extends BaseController implements StockOutHandlerClient {

    @Override
    public RespMsgBean autoLock(List<StockOutModel> stockOutList) {
        return success();
    }

    @Override
    public RespMsgBean stockOut(List<StockOutModel> stockOutList) {
        return success();
    }

    @Override
    public RespMsgBean release(List<StockOutModel> stockOutList) {
        return success();
    }

    @Override
    public RespMsgBean autoUnlock(List<StockOutModel> stockOutList) {
        return success();
    }

    @Override
    public RespMsgBean<List<PsiReservationRelationship>> check(String orderId, String menuCode) {
        return success();
    }
}
