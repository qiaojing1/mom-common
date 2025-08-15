package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.OrderCategoryClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiBusinessConfig;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import com.lets.platform.model.psi.entity.PsiOrderCategoryDetailField;
import com.lets.platform.model.psi.entity.PsiOrderCategoryLimit;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

/**
 * StoreClient
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@Service
public class OrderCategoryClientFallback extends BaseController implements OrderCategoryClient {

    @Override
    public RespMsgBean<PsiOrderCategory> findById4Do(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiOrderCategory> findById4DoWithLimit(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiOrderCategory> findByCodeReturnInfoAndDetail(String tenancyId, String code) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiOrderCategory> findByIdReturnInfoAndDetail(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiOrderCategory>> findByCodes4Map(@RequestBody Collection<String> codes) {
        return success(SUCCESS);

    }

    @Override
    public RespMsgBean<Map<String, PsiOrderCategory>> findByNames4Map(Collection<String> names) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<PsiOrderCategory> findDefaultByOrderNature(String tenancyId, String orderNature) {
        return success(SUCCESS);

    }

    @Override
    public RespMsgBean<List<PsiOrderCategoryDetailField>> findByOrderId(String orderNature, String orderId) {
        return success(SUCCESS);

    }

    @Override
    public RespMsgBean<Map<String, PsiOrderCategory>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);

    }

    @Override
    public RespMsgBean<List<PsiOrderCategory>> getListByMenuCode(String menuCode) {
        return failure();
    }

    @Override
    public RespMsgBean<PsiOrderCategory> getDefaultByBusinessCode(String businessCode) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiOrderCategory>> getListByBusinessCode(String businessCode) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiOrderCategory>> getListByMenuCodes(List<String> menuCodes) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiOrderCategoryLimit>> findLimitsByParentId(String id) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiBusinessConfig>> findBusinessConfig(Map<String, Object> map) {
        return success(SUCCESS, new ArrayList<>());
    }
}
