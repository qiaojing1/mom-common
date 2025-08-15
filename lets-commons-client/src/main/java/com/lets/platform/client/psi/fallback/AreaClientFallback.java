package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.AreaClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

/**
 * StoreClient
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class AreaClientFallback extends BaseController implements AreaClient {
    @Override
    public RespMsgBean<PsiStorageArea> findById4Do(String id) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStorageArea>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStorageArea>> findByCodes4Map(Collection<String> codes) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, PsiStorageArea>> findByNames4Map(Collection<String> names) {
        return success(SUCCESS);
    }

}
