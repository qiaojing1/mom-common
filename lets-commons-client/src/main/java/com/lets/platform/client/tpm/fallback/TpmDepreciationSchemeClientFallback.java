package com.lets.platform.client.tpm.fallback;

import com.lets.platform.client.tpm.client.TpmDepreciationSchemeClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.tpm.entity.TpmDepreciationScheme;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * TpmDepreciationSchemeClient
 * @author zhangweiyan
 * @date 2025/01/22 14:26
 * @version 1.0
 */
@Service
public class TpmDepreciationSchemeClientFallback extends BaseController implements TpmDepreciationSchemeClient {


    @Override
    public RespMsgBean<Map<String, TpmDepreciationScheme>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }
}
