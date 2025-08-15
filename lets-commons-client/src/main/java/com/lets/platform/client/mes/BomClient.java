package com.lets.platform.client.mes;

import com.lets.platform.client.mes.fallback.BomClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.dto.BomAndBomDetail;
import com.lets.platform.model.mes.dto.FindCopyDataQuery;
import com.lets.platform.model.mes.dto.PsiProducePlanCopyBom;
import com.lets.platform.model.mes.entity.MesBom;
import com.lets.platform.model.mes.entity.MesBomTree;
import com.lets.platform.model.mes.entity.MesBomTreeWithMoreInfo;
import com.lets.platform.model.psi.mrpModel.BomModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 物料BOM Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "mes", fallback = BomClientFallback.class)
public interface BomClient {

    @PostMapping("/mesBom/findNewestUpdateTimeVersion")
    RespMsgBean<Map<String, MesBom>> findNewestUpdateTimeVersion(@RequestBody Collection<String> materialIds);

    @PostMapping("/mesBom/findByBomVersion4Map")
    RespMsgBean<Map<String, Map<String, MesBom>>> findByBomVersion4Map(@RequestBody Collection<String> bomVersionList,
                                                                       @RequestParam(value = "tenancyId", required = false) String tenancyId);

    @GetMapping("/mesBom/findAllChildMaterialById")
    RespMsgBean<Map<String, MesBomTree>> findAllChildMaterialById(@RequestParam("id") String id);

    @GetMapping("/mesBom/findById4Do")
    RespMsgBean<MesBom> findById4Do(@RequestParam("id") String id);

    @GetMapping("/mesBom/effectivenessCheckInnerServer")
    RespMsgBean<MesBomTreeWithMoreInfo> effectivenessCheckInnerServer(@RequestParam("bomId") String bomId);

    @PostMapping("/mesBom/findAllData4Copy4ProducePlan")
    RespMsgBean<PsiProducePlanCopyBom> findAllData4Copy4ProducePlan(@RequestBody FindCopyDataQuery query);

    @PostMapping("/mesBom/findByIds4Map")
    RespMsgBean<Map<String, MesBom>> findByIds4Map(@RequestBody Collection<String> ids);

    @PostMapping("/mesBom/getMrpBomModelMap")
    RespMsgBean<Map<String, BomModel>> getMrpBomModelMap(@RequestBody Collection<String> ids);

    @GetMapping("/mesBom/getWipMaterialIds")
    RespMsgBean<Set<String>> getWipMaterialIds(@RequestParam("bomId") String bomId);

    @PostMapping("/mesBom/getWipMaterialCodeMapByBomIds")
    RespMsgBean<Map<String, Set<String>>> getWipMaterialCodeMapByBomIds(@RequestBody Collection<String> bomIds);

    @PostMapping("/mesBom/findBomAndBomDetailList")
    RespMsgBean<BomAndBomDetail> findBomAndBomDetailList(@RequestBody Collection<String> bomIds);

    @PostMapping("/mesBom/findNewestEffectiveBomByMaterialId")
    RespMsgBean<Map<String, List<MesBomTree>>> findNewestEffectiveBomByMaterialId(@RequestBody Collection<String> materialIds);

    @PostMapping("/mesBom/getBomCountByStatusAndMaterialIds")
    RespMsgBean<Map<String, Integer>> getBomCountByStatusAndMaterialIds(@RequestBody Collection<String> materialIds,
                                                                        @RequestParam(value = "status", required = false) Integer status);
}
