package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.OrderCategoryFieldClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiOrderCategoryDetailField;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 单据类别字段默认值
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@Service
public class OrderCategoryFieldClientFallback extends BaseController implements OrderCategoryFieldClient {
    @Override
    public RespMsgBean<List<PsiOrderCategoryDetailField>> findByCategoryCode(String code) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<List<PsiOrderCategoryDetailField>> findByCategoryId(String id) {
        return success(SUCCESS);
    }
    @Override
    public RespMsgBean<Map<String, Map<String, PsiOrderCategoryDetailField>>> findByCategoryIds4Map(Collection<String> ids) {
        return success(SUCCESS);
    }

}
