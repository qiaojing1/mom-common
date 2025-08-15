package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.UnitClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiUnit;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 计量单位Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class UnitClientFallback extends BaseController implements UnitClient {
    @Override
    public RespMsgBean<PsiUnit> getByIdOrCode(String idOrCode) {
        return failure();
    }

    @Override
    public RespMsgBean<PsiUnit> findById4Do(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiUnit>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiUnit>> findByNames4Map(Collection<String> names) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiUnit>> findByCodes4Map(Collection<String> codes) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiUnit>> getAll4Map() {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<List<PsiUnit>> getTenancyUnitList(String tenancyId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiUnit>> listByIds(Set<String> ids) {
        return failure();
    }
}
