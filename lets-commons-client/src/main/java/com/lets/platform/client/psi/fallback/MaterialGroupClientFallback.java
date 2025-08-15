package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.MaterialGroupClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiMaterialGroup;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 物料分组Feign接口-服务降级
 * @author DING WEI
 * @date 2024/3/18 14:07
 * @version 1.0
 */
@Service
public class MaterialGroupClientFallback extends BaseController implements MaterialGroupClient {

    @Override
    public RespMsgBean<Map<String, PsiMaterialGroup>> findByCode4Map(Collection<String> groupCodes) {
        return success(FIND_SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialGroup>> findByIds4Map(Collection<String> groupIds) {
        return success(FIND_SUCCESS, new HashMap<>());
    }
}
