package com.lets.platform.client.psi.fallback;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.client.psi.StoreMaterialClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.psi.entity.PsiMaterialStoreNumberQuery;
import com.lets.platform.model.psi.entity.PsiMaterialStoreQuery;
import com.lets.platform.model.psi.entity.PsiStoreMaterial;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * StoreMaterialClient
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/17 14:26
 */
@Service
public class StoreMaterialClientFallback extends BaseController implements StoreMaterialClient {

    @Override
    public RespMsgBean<List<PsiMaterialStoreNumberQuery>> findStoreNumber(List<PsiMaterialStoreNumberQuery> numberQueries) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterialStoreNumberQuery>> findStoreNumber4Bill(List<PsiMaterialStoreNumberQuery> numberQueries, String storeType) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiStoreMaterial>> findByMaterialAndStore(@RequestBody PsiMaterialStoreQuery query) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialStoreNumberQuery>> findStoreNumberByMaterialIds(List<PsiMaterialStoreNumberQuery> queryList) {
        if (CollUtil.isNotEmpty(queryList)) {
            return success(SUCCESS, queryList.stream().collect(Collectors.toMap(PsiMaterialStoreNumberQuery::getMaterialId, a -> a, (k1, k2) -> k1)));
        } else {
            return success(SUCCESS, new HashMap<>());
        }
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialStoreNumberQuery>> findStoreNumberKeyMapByMaterialIds(List<PsiMaterialStoreNumberQuery> queryList) {
        if (CollUtil.isNotEmpty(queryList)) {
            return success(SUCCESS, queryList.stream().collect(Collectors.toMap(PsiMaterialStoreNumberQuery::getId, a -> a, (k1, k2) -> k1)));
        } else {
            return success(SUCCESS, new HashMap<>());
        }
    }
}
