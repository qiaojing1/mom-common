package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.BomTemplateClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.psi.entity.PsiMaterial;
import org.springframework.stereotype.Service;

/**
 * BOM模板 Feign接口
 * @author DING WEI
 * @date 2025/7/28 14:52
 * @version 1.0
 */
@Service
public class BomTemplateClientFallback extends BaseController implements BomTemplateClient {

    @Override
    public RespMsgBean<String> autoCreateBomByBomTemplate(PsiMaterial entity) {
        return failure(FAILURE, GlobalConstant.EMPTY_STR);
    }
}
