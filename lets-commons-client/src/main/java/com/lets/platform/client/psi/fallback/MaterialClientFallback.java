package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.MaterialClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.model.mes.entity.MesBomDetail;
import com.lets.platform.model.psi.dto.MaterialNameAndSpecsDTO;
import com.lets.platform.model.psi.entity.*;
import com.lets.platform.model.psi.query.GroupAndExtQuery;
import com.lets.platform.model.psi.vo.BomMaterialQueryParam;
import com.lets.platform.model.psi.vo.MaterialQueryParam;
import com.lets.platform.model.psi.vo.MaterialQueryVo;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 物料Feign接口
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/5 17:38
 */
@Service
public class MaterialClientFallback extends BaseController implements MaterialClient {

    @Override
    public RespMsgBean<Map<String, PsiBomMaterial>> findByCodes4BomMap(BomMaterialQueryParam queryParam) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiBomDetailMaterial>> findByCodes4BomDetailMap(BomMaterialQueryParam queryParam) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<MaterialQueryVo> findByCodes4ProduceDetailMap(BomMaterialQueryParam queryParam) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiBomMaterial>> findByNames4BomMap(BomMaterialQueryParam queryParam) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiBomMaterial>> findByQuery4BomMap(BomMaterialQueryParam queryParam) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<PsiBomMaterial> findById4BomEffectivenessCheck(String materialId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiMaterial> getById(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiMaterial> findByCode(String code, String tenancyId) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<PsiMaterialQuality> getById4Quality(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialQuality>> findByIds4MapQuality(Collection<String> materialIds) {
        return failure();
    }

    @Override
    public RespMsgBean<Map<String, PsiBomMaterial>> findByIds4MapBomEffectivenessCheck(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiBomMaterial>> findByIds4MapMaterialBill(Collection<String> materialIds, Boolean isFindStore) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiBomMaterial>> findByIds4MapMaterialBillV2(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterial>> findByIds4Map(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterial>> findByIdsAndExt4Map(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterial>> findByIdsWithGroupName(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterial>> findByCodes4Map(Collection<String> materialCodes) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> findByNames4List(Collection<String> materialNames) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<PsiMaterialInventory> findById4Inventory(String materialId, String isFindStoreName) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterial>> findByIds4MapPerfect(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialInventory>> findByIds4Map4Inventory(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> defaultFindList(Map<String, Object> queryMap) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> getAndCheckMaterial(MaterialQueryParam param) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> getMaterialByMaterialIds(MaterialQueryParam param) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialInventory>> findByIds4Purchase(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<PsiMaterialPurchase> findById4Purchase(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialPurchase>> findByIds4MapPurchase(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<PsiMaterialPurchase> getDefaultSupplier(String id) {
        return success(SUCCESS);
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialPurchase>> getDefaultSupplierMap(Collection<String> ids) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, List<PsiMaterialCharacteristic>>> getCharacteristicListByMaterialIds4Map(Collection<String> materialIds, String controlType) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiPurchaseMaterial>> findById4BaseUnitMap(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialProduction>> findByIds4Map4Production(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialPlan>> findByIds4Map4Plan(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiMaterialPlan>> findByIds4Map4PlanJoinMain(Collection<String> materialIds) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<Map<String, PsiUnplannedStockInOrderMaterial>> findByGroupAndExt(GroupAndExtQuery query) {
        return success(SUCCESS, new HashMap<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> findMaterial4InventoryWithGroupName(Collection<String> materialIds) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> defaultListDo(Map<String, Object> queryMap) {
        return success(SUCCESS, new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> findMaterialForKitting(Collection<String> materialIds) {
        return null;
    }

    @Override
    public RespMsgBean<Boolean> clearProcessFile(Collection<String> materialIds) {
        return success(SUCCESS, Boolean.FALSE);
    }

    @Override
    public RespMsgBean<Boolean> clearCurrencyProcessFile(Collection<String> materialIds) {
        return success(SUCCESS, Boolean.FALSE);
    }

    @Override
    public RespMsgBean<List<MesBomDetail>> findAndCreateMaterial4BomTemplate(List<MesBomDetail> bomDetailList) {
        return success(FAILURE, new ArrayList<>());
    }

    @Override
    public RespMsgBean<PsiMaterial> createMaterial(PsiMaterial entity) {
        return failure();
    }

    @Override
    public RespMsgBean<List<MaterialNameAndSpecsDTO>> getAllMaterialNameAndSpecs(String tenancyId) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiMaterialInventory>> getMaterialDoByStoreIds(Collection<String> storeIds) {
        return success(SUCCESS,  new ArrayList<>());
    }

    @Override
    public RespMsgBean<List<PsiMaterial>> getLikeDrawingNumber(String drawingNumber) {
        return success(SUCCESS,  new ArrayList<>());    }
}
