package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.SupplierClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiSupplier;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName SupplierClient
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/11/7
 */
@Service
public class SupplierClientFallback extends BaseController implements SupplierClient {

    @Override
    public RespMsgBean<PsiSupplier> getById(String id) {
        return success();
    }

    @Override
    public RespMsgBean<Map<String, PsiSupplier>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiSupplier>> findByCodes4Map(Collection<String> codes, Integer isGroup) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiSupplier>> findByNames4Map(Collection<String> names, Integer isGroup) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<PsiSupplier>> findList4Group(String codeOrName, String withAll) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiSupplier>> defaultList(Map<String, Object> queryMap) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiSupplier>> findByList(AutoConditionEntity autoConditionEntity) {
        return success(SUCCESS, new ArrayList<>());
    }

}
