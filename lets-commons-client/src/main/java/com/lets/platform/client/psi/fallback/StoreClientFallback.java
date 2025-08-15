package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.StoreClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiStoragePosition;
import com.lets.platform.model.psi.entity.PsiStorageStore;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class StoreClientFallback extends BaseController implements StoreClient {
    @Override
    public RespMsgBean<PsiStorageStore> findById4Do(String id) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStorageStore>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiStorageStore>> findByIds4MapAndJunior(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiStorageStore>> findByCodes4Map(Collection<String> codes) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStorageStore>> findByNames4Map(Collection<String> names) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiStorageStore>> findList4Power(Collection<String> ids) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiStorageStore>> getListInCharge(String userId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiStorageStore>> getListInCharges(Collection<String> userIds) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiStoragePosition>> findShelvingPosition(Collection<String> ids) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiStorageStore>> findMapByFactoryModeIds(Collection<String> factoryModeIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiStorageStore>> findMapBySupplierIds(Collection<String> supplierIds) {
        return success(SUCCESS, new HashMap<>());
    }
}
