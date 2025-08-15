package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.MaterialSpecificClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiMaterialSpecific;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料特征管理Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MaterialSpecificClientFallback extends BaseController implements MaterialSpecificClient {
    @Override
    public RespMsgBean<PsiMaterialSpecific> findById4Do(String id) {
        return success(SUCCESS);

    }
    @Override
    public RespMsgBean<Map<String, PsiMaterialSpecific>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);

    }
    @Override
    public RespMsgBean<Map<String, Integer>> findQuoteTimes(Collection<String> userDictIds) {
        return success(SUCCESS);

    }

    @Override
    public RespMsgBean<List<PsiMaterialSpecific>> getByTenancyId() {
        return success(SUCCESS);
    }
}
