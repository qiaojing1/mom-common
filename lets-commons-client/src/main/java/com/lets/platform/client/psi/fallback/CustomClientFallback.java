package com.lets.platform.client.psi.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.client.psi.CustomClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiCustom;
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
public class CustomClientFallback extends BaseController implements CustomClient {
    @Override
    public RespMsgBean<PsiCustom> findById4Do(String id) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiCustom>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiCustom>> findByNames4Map(Collection<String> names) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, Integer>> findOrgQuoteTimes(Collection<String> orgIds) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, Integer>> findUserQuoteTimes(Collection<String> userIds) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, Integer>> findTaxQuoteTimes(Collection<String> taxIds) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, Integer>> findCurrencyQuoteTimes(Collection<String> currencyIds) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiCustom>> findList(PsiCustom query) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Page<PsiCustom>> defaultPage(AutoConditionEntity autoConditionEntity) {
        return success(SUCCESS, new Page<>());
    }
}
