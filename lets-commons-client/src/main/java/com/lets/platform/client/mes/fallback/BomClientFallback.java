package com.lets.platform.client.mes.fallback;

import com.lets.platform.client.mes.BomClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.dto.BomAndBomDetail;
import com.lets.platform.model.mes.dto.FindCopyDataQuery;
import com.lets.platform.model.mes.dto.PsiProducePlanCopyBom;
import com.lets.platform.model.mes.entity.MesBom;
import com.lets.platform.model.mes.entity.MesBomTree;
import com.lets.platform.model.mes.entity.MesBomTreeWithMoreInfo;
import com.lets.platform.model.psi.mrpModel.BomModel;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class BomClientFallback extends BaseController implements BomClient {

    public RespMsgBean<Map<String, MesBom>> findNewestUpdateTimeVersion(Collection<String> materialIds) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, Map<String, MesBom>>> findByBomVersion4Map(Collection<String> bomVersionList, String tenancyId) {
        return success(SUCCESS, new HashMap<>());
    }

    public RespMsgBean<Map<String, MesBomTree>> findAllChildMaterialById(String id) {
        return success(SUCCESS);
    }

    public RespMsgBean<MesBom> findById4Do(String id) {
        return success(SUCCESS);
    }

    public RespMsgBean<MesBomTreeWithMoreInfo> effectivenessCheckInnerServer(String bomId) {
        return success(SUCCESS);
    }

    public RespMsgBean<PsiProducePlanCopyBom> findAllData4Copy4ProducePlan(FindCopyDataQuery query) {
        return success(SUCCESS);
    }

    public RespMsgBean<Map<String, MesBom>> findByIds4Map(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    public RespMsgBean<Map<String, BomModel>> getMrpBomModelMap(Collection<String> ids) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Set<String>> getWipMaterialIds(String bomId) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, Set<String>>> getWipMaterialCodeMapByBomIds(Collection<String> bomIds) {
        return failure(FAILURE);
    }

    @Override
    public RespMsgBean<BomAndBomDetail> findBomAndBomDetailList(Collection<String> bomIds) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, List<MesBomTree>>> findNewestEffectiveBomByMaterialId(Collection<String> materialIds) {
        return failure(new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, Integer>> getBomCountByStatusAndMaterialIds(Collection<String> materialIds, Integer status) {
        return success(SUCCESS, new HashMap<>());
    }


}
