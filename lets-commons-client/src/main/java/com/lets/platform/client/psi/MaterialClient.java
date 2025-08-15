package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.MaterialClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.mes.entity.MesBomDetail;
import com.lets.platform.model.psi.dto.MaterialNameAndSpecsDTO;
import com.lets.platform.model.psi.entity.*;
import com.lets.platform.model.psi.query.GroupAndExtQuery;
import com.lets.platform.model.psi.vo.BomMaterialQueryParam;
import com.lets.platform.model.psi.vo.MaterialQueryParam;
import com.lets.platform.model.psi.vo.MaterialQueryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@FeignClient(value = "psi", fallback = MaterialClientFallback.class)
public interface MaterialClient {

    @PostMapping("/psiMaterial/findByCodes4BomMap")
    RespMsgBean<Map<String, PsiBomMaterial>> findByCodes4BomMap(@RequestBody BomMaterialQueryParam queryParam);

    @PostMapping("/psiMaterial/findByCodes4BomDetailMap")
    RespMsgBean<Map<String, PsiBomDetailMaterial>> findByCodes4BomDetailMap(@RequestBody BomMaterialQueryParam queryParam);

    @PostMapping("/psiMaterial/findByCodes4ProduceDetailMap")
    RespMsgBean<MaterialQueryVo> findByCodes4ProduceDetailMap(@RequestBody BomMaterialQueryParam queryParam);

    @PostMapping("/psiMaterial/findByNames4BomMap")
    RespMsgBean<Map<String, PsiBomMaterial>> findByNames4BomMap(@RequestBody BomMaterialQueryParam queryParam);

    @PostMapping("/psiMaterial/findByQuery4BomMap")
    RespMsgBean<Map<String, PsiBomMaterial>> findByQuery4BomMap(@RequestBody BomMaterialQueryParam queryParam);

    @GetMapping("/psiMaterial/findById4BomEffectivenessCheck")
    RespMsgBean<PsiBomMaterial> findById4BomEffectivenessCheck(@RequestParam("materialId") String materialId);

    @GetMapping("/psiMaterial/getById")
    RespMsgBean<PsiMaterial> getById(@RequestParam("id") String id);

    @GetMapping("/psiMaterial/findByCode")
    RespMsgBean<PsiMaterial> findByCode(@RequestParam("code") String code, @RequestParam("tenancyId") String tenancyId);

    @GetMapping("/psiMaterial/quality/getById")
    RespMsgBean<PsiMaterialQuality> getById4Quality(@RequestParam("id") String id);

    @PostMapping("/psiMaterial/quality/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterialQuality>> findByIds4MapQuality(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByIds4MapBomEffectivenessCheck")
    RespMsgBean<Map<String, PsiBomMaterial>> findByIds4MapBomEffectivenessCheck(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByIds4MapMaterialBill")
    RespMsgBean<Map<String, PsiBomMaterial>> findByIds4MapMaterialBill(@RequestBody Collection<String> materialIds, @RequestParam("isFindStore") Boolean isFindStore);

    @PostMapping("/psiMaterial/findByIds4MapMaterialBillV2")
    RespMsgBean<Map<String, PsiBomMaterial>> findByIds4MapMaterialBillV2(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterial>> findByIds4Map(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByIdsAndExt4Map")
    RespMsgBean<Map<String, PsiMaterial>> findByIdsAndExt4Map(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByIdsWithGroupName")
    RespMsgBean<Map<String, PsiMaterial>> findByIdsWithGroupName(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByCodes4Map")
    RespMsgBean<Map<String, PsiMaterial>> findByCodes4Map(@RequestBody Collection<String> materialCodes);

    @PostMapping("/psiMaterial/findByNames4List")
    RespMsgBean<List<PsiMaterial>> findByNames4List(@RequestBody Collection<String> materialNames);

    @GetMapping("/psiMaterial/inventory/findById4Inventory")
    RespMsgBean<PsiMaterialInventory> findById4Inventory(@RequestParam("materialId") String materialId,
                                                         @RequestParam(value = "isFindStoreName", required = false) String isFindStoreName);

    @PostMapping("/psiMaterial/findByIds4MapPerfect")
    RespMsgBean<Map<String, PsiMaterial>> findByIds4MapPerfect(@RequestBody Collection<String> ids);

    @PostMapping("/psiMaterial/inventory/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterialInventory>> findByIds4Map4Inventory(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/defaultList")
    RespMsgBean<List<PsiMaterial>> defaultFindList(@RequestBody(required = false) Map<String, Object> queryMap);

    @PostMapping("/psiMaterial/getAndCheckMaterial")
    RespMsgBean<List<PsiMaterial>> getAndCheckMaterial(@RequestBody MaterialQueryParam param);

    @PostMapping("/psiMaterial/getMaterialByMaterialIds")
    RespMsgBean<List<PsiMaterial>> getMaterialByMaterialIds(@RequestBody MaterialQueryParam param);

    @PostMapping("/psiMaterial/inventory/findByIds4Purchase")
    RespMsgBean<Map<String, PsiMaterialInventory>> findByIds4Purchase(@RequestBody Collection<String> materialIds);

    @GetMapping("/psiMaterial/purchase/findById")
    RespMsgBean<PsiMaterialPurchase> findById4Purchase(@RequestParam("id") String id);

    @PostMapping("/psiMaterial/purchase/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterialPurchase>> findByIds4MapPurchase(@RequestBody Collection<String> materialIds);

    @GetMapping("/psiMaterial/purchase/getDefaultSupplier")
    RespMsgBean<PsiMaterialPurchase> getDefaultSupplier(@RequestParam("id") String id);

    @PostMapping("/psiMaterial/purchase/getDefaultSupplierMap")
    RespMsgBean<Map<String, PsiMaterialPurchase>> getDefaultSupplierMap(@RequestBody Collection<String> ids);

    @PostMapping("/psiMaterial/getCharacteristicListByMaterialIds4Map")
    RespMsgBean<Map<String, List<PsiMaterialCharacteristic>>> getCharacteristicListByMaterialIds4Map(@RequestBody Collection<String> materialIds,
                                                                                                     @RequestParam("controlType") String controlType);

    @PostMapping("/psiMaterial/findById4BaseUnitMap")
    RespMsgBean<Map<String, PsiPurchaseMaterial>> findById4BaseUnitMap(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/production/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterialProduction>> findByIds4Map4Production(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/plan/findByIds4Map")
    RespMsgBean<Map<String, PsiMaterialPlan>> findByIds4Map4Plan(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/plan/findByIds4Map4PlanJoinMain")
    RespMsgBean<Map<String, PsiMaterialPlan>> findByIds4Map4PlanJoinMain(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findByGroupAndExt")
    RespMsgBean<Map<String, PsiUnplannedStockInOrderMaterial>> findByGroupAndExt(@RequestBody GroupAndExtQuery query);

    @PostMapping("/psiMaterial/findMaterial4InventoryWithGroupName")
     RespMsgBean<List<PsiMaterial>> findMaterial4InventoryWithGroupName(@RequestBody Collection<String> materialIds);

    /**
     * 直接查询, 不perfect
     *
     * @param queryMap
     * @return
     */
    @PostMapping("/psiMaterial/defaultListDo")
    RespMsgBean<List<PsiMaterial>> defaultListDo(@RequestBody(required = false) Map<String, Object> queryMap);

    @PostMapping("/psiMaterial/findMaterialForKitting")
    RespMsgBean<List<PsiMaterial>> findMaterialForKitting(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/clearProcessFile")
    RespMsgBean<Boolean> clearProcessFile(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/clearCurrencyProcessFile")
    RespMsgBean<Boolean> clearCurrencyProcessFile(@RequestBody Collection<String> materialIds);

    @PostMapping("/psiMaterial/findAndCreateMaterial4BomTemplate")
    RespMsgBean<List<MesBomDetail>> findAndCreateMaterial4BomTemplate(@RequestBody List<MesBomDetail> bomDetailList);

    @PostMapping("/psiMaterial/createMaterial")
    RespMsgBean<PsiMaterial> createMaterial(@RequestBody PsiMaterial entity);

    @GetMapping("/psiMaterial/getAllMaterialNameAndSpecs")
    RespMsgBean<List<MaterialNameAndSpecsDTO>> getAllMaterialNameAndSpecs(@RequestParam("tenancyId") String tenancyId);

    @PostMapping("/psiMaterial/getMaterialDoByStoreIds")
    RespMsgBean<List<PsiMaterialInventory>> getMaterialDoByStoreIds(@RequestBody  Collection<String> storeIds);

    @GetMapping("/psiMaterial/getLikeDrawingNumber")
    RespMsgBean<List<PsiMaterial>> getLikeDrawingNumber(@RequestParam("drawingNumber") String drawingNumber);
}
