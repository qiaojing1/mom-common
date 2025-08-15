package com.lets.platform.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.lets.platform.client.psi.AreaClient;
import com.lets.platform.client.psi.OrderCategoryClient;
import com.lets.platform.client.psi.PositionClient;
import com.lets.platform.client.psi.StoreClient;
import com.lets.platform.client.uc.client.OrgClient;
import com.lets.platform.model.psi.dto.LimitStoreDTO;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import com.lets.platform.model.psi.entity.PsiStorageArea;
import com.lets.platform.model.psi.entity.PsiStoragePosition;
import com.lets.platform.model.psi.entity.PsiStorageStore;
import com.lets.platform.model.uc.entity.SysOrg;
import com.lets.platform.model.uc.enums.OrgTypeEnum;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitStoreUtil {
    public static LimitStoreDTO getLimitStore(String orderCategoryId, String orgId) {
        LimitStoreDTO limitStoreDTO = new LimitStoreDTO();

        String qualifiedStoreId = null;
        String qualifiedAreaId = null;
        String qualifiedPositionId = null;
        String defectStoreId = null;
        String defectAreaId = null;
        String defectPositionId = null;
        String scrapStoreId = null;
        String scrapAreaId = null;
        String scrapPositionId = null;
        String reworkStoreId = null;
        String reworkAreaId = null;
        String reworkPositionId = null;

        if (StrUtil.isNotEmpty(orgId)) {
            OrgClient orgClient = SpringUtil.getBean(OrgClient.class);
            SysOrg org = orgClient.getById(orgId).handler(null);
            if (org != null && OrgTypeEnum.DEALER.equals(org.getType())) {
                qualifiedStoreId = org.getQualifiedStoreId();
                qualifiedAreaId = org.getQualifiedAreaId();
                qualifiedPositionId = org.getQualifiedPositionId();
                defectStoreId = org.getDefectStoreId();
                defectAreaId = org.getDefectAreaId();
                defectPositionId = org.getDefectPositionId();
                scrapStoreId = org.getScrapStoreId();
                scrapAreaId = org.getScrapAreaId();
                scrapPositionId = org.getScrapPositionId();
                reworkStoreId = org.getReworkStoreId();
                reworkAreaId = org.getReworkAreaId();
                reworkPositionId = org.getReworkPositionId();
            }
        }

        if (StrUtil.isEmpty(qualifiedStoreId) || StrUtil.isEmpty(defectStoreId) || StrUtil.isEmpty(scrapStoreId) || StrUtil.isEmpty(reworkStoreId)) {
            OrderCategoryClient orderCategoryClient = SpringUtil.getBean(OrderCategoryClient.class);
            PsiOrderCategory orderCategory = orderCategoryClient.findById4Do(orderCategoryId).handler(null);

            if (orderCategory != null) {
                if (StrUtil.isEmpty(qualifiedStoreId)) {
                    qualifiedStoreId = orderCategory.getQualifiedStoreId();
                    qualifiedAreaId = orderCategory.getQualifiedAreaId();
                    qualifiedPositionId = orderCategory.getQualifiedPositionId();
                }
                if (StrUtil.isEmpty(defectStoreId)) {
                    defectStoreId = orderCategory.getDefectStoreId();
                    defectAreaId = orderCategory.getDefectAreaId();
                    defectPositionId = orderCategory.getDefectPositionId();
                }
                if (StrUtil.isEmpty(scrapStoreId)) {
                    scrapStoreId = orderCategory.getScrapStoreId();
                    scrapAreaId = orderCategory.getScrapAreaId();
                    scrapPositionId = orderCategory.getScrapPositionId();
                }
                if (StrUtil.isEmpty(reworkStoreId)) {
                    reworkStoreId = orderCategory.getReworkStoreId();
                    reworkAreaId = orderCategory.getReworkAreaId();
                    reworkPositionId = orderCategory.getReworkPositionId();
                }
            }
        }

        Set<String> storeIds = Stream.of(qualifiedStoreId, defectStoreId, scrapStoreId, reworkStoreId).filter(StrUtil::isNotEmpty).collect(Collectors.toSet());
        Set<String> areaIds = Stream.of(qualifiedAreaId, defectAreaId, scrapAreaId, reworkAreaId).filter(StrUtil::isNotEmpty).collect(Collectors.toSet());
        Set<String> positionIds = Stream.of(qualifiedPositionId, defectPositionId, scrapPositionId, reworkPositionId).filter(StrUtil::isNotEmpty).collect(Collectors.toSet());

        if (CollUtil.isNotEmpty(storeIds)) {
            StoreClient storeClient = SpringUtil.getBean(StoreClient.class);
            Map<String, PsiStorageStore> map = storeClient.findByIds4Map(storeIds).handler();
            PsiStorageStore qualifiedStore = map.get(qualifiedStoreId);
            if (qualifiedStore != null) {
                limitStoreDTO.setQualifiedStoreId(qualifiedStore.getId());
                limitStoreDTO.setQualifiedStoreName(qualifiedStore.getName());
            }
            PsiStorageStore defectStore = map.get(defectStoreId);
            if (defectStore != null) {
                limitStoreDTO.setDefectStoreId(defectStore.getId());
                limitStoreDTO.setDefectStoreName(defectStore.getName());
            }
            PsiStorageStore scrapStore = map.get(scrapStoreId);
            if (scrapStore != null) {
                limitStoreDTO.setScrapStoreId(scrapStore.getId());
                limitStoreDTO.setScrapStoreName(scrapStore.getName());
            }
            PsiStorageStore reworkStore = map.get(reworkStoreId);
            if (reworkStore != null) {
                limitStoreDTO.setReworkStoreId(reworkStore.getId());
                limitStoreDTO.setReworkStoreName(reworkStore.getName());
            }
        }

        if (CollUtil.isNotEmpty(areaIds)) {
            AreaClient areaClient = SpringUtil.getBean(AreaClient.class);
            Map<String, PsiStorageArea> map = areaClient.findByIds4Map(areaIds).handler();
            PsiStorageArea qualifiedArea = map.get(qualifiedAreaId);
            if (qualifiedArea != null) {
                limitStoreDTO.setQualifiedAreaId(qualifiedArea.getId());
                limitStoreDTO.setQualifiedAreaName(qualifiedArea.getName());
            }
            PsiStorageArea defectArea = map.get(defectAreaId);
            if (defectArea != null) {
                limitStoreDTO.setDefectAreaId(defectArea.getId());
                limitStoreDTO.setDefectAreaName(defectArea.getName());
            }
            PsiStorageArea scrapArea = map.get(scrapAreaId);
            if (scrapArea != null) {
                limitStoreDTO.setScrapAreaId(scrapArea.getId());
                limitStoreDTO.setScrapAreaName(scrapArea.getName());
            }
            PsiStorageArea reworkArea = map.get(reworkAreaId);
            if (reworkArea != null) {
                limitStoreDTO.setReworkAreaId(reworkArea.getId());
                limitStoreDTO.setReworkAreaName(reworkArea.getName());
            }
        }

        if (CollUtil.isNotEmpty(positionIds)) {
            PositionClient positionClient = SpringUtil.getBean(PositionClient.class);
            Map<String, PsiStoragePosition> map = positionClient.findByIds4Map(positionIds).handler();

            PsiStoragePosition qualifiedPosition = map.get(qualifiedPositionId);
            if (qualifiedPosition != null) {
                limitStoreDTO.setQualifiedPositionId(qualifiedPosition.getId());
                limitStoreDTO.setQualifiedPositionName(qualifiedPosition.getName());
            }
            PsiStoragePosition defectPosition = map.get(defectPositionId);
            if (defectPosition != null) {
                limitStoreDTO.setDefectPositionId(defectPosition.getId());
                limitStoreDTO.setDefectPositionName(defectPosition.getName());
            }
            PsiStoragePosition scrapPosition = map.get(scrapPositionId);
            if (scrapPosition != null) {
                limitStoreDTO.setScrapPositionId(scrapPosition.getId());
                limitStoreDTO.setScrapPositionName(scrapPosition.getName());
            }
            PsiStoragePosition reworkPosition = map.get(reworkPositionId);
            if (reworkPosition != null) {
                limitStoreDTO.setReworkPositionId(reworkPosition.getId());
                limitStoreDTO.setReworkPositionName(reworkPosition.getName());
            }
        }

        return limitStoreDTO;
    }

    public static void getLimitStoreBatch(Collection<LimitStoreDTO> limitStoreDTOS) {
        Set<String> orgIds = limitStoreDTOS.stream().map(LimitStoreDTO::getOrgId).filter(StrUtil::isNotEmpty).collect(Collectors.toSet());
        OrgClient orgClient = SpringUtil.getBean(OrgClient.class);
        Map<String, SysOrg> orgMap = orgClient.findByIds4Map(orgIds).handler();

        Set<String> orderCategoryIds = limitStoreDTOS.stream().map(LimitStoreDTO::getOrderCategoryId).filter(StrUtil::isNotEmpty).collect(Collectors.toSet());
        OrderCategoryClient orderCategoryClient = SpringUtil.getBean(OrderCategoryClient.class);
        Map<String, PsiOrderCategory> categoryMap = orderCategoryClient.findByIds4Map(orderCategoryIds).handler();

        Set<String> storeIds = new HashSet<>();
        Set<String> areaIds = new HashSet<>();
        Set<String> positionIds = new HashSet<>();

        for (LimitStoreDTO limitStoreDTO : limitStoreDTOS) {
            if (StrUtil.isNotEmpty(limitStoreDTO.getOrgId())) {
                SysOrg org = orgMap.get(limitStoreDTO.getOrgId());
                if (org != null && OrgTypeEnum.DEALER.equals(org.getType())) {
                    limitStoreDTO.setQualifiedStoreId(org.getQualifiedStoreId());
                    limitStoreDTO.setQualifiedAreaId(org.getQualifiedAreaId());
                    limitStoreDTO.setQualifiedPositionId(org.getQualifiedPositionId());
                    limitStoreDTO.setDefectStoreId(org.getDefectStoreId());
                    limitStoreDTO.setDefectAreaId(org.getDefectAreaId());
                    limitStoreDTO.setDefectPositionId(org.getDefectPositionId());
                    limitStoreDTO.setScrapStoreId(org.getScrapStoreId());
                    limitStoreDTO.setScrapAreaId(org.getScrapAreaId());
                    limitStoreDTO.setScrapPositionId(org.getScrapPositionId());
                    limitStoreDTO.setReworkStoreId(org.getReworkStoreId());
                    limitStoreDTO.setReworkAreaId(org.getReworkAreaId());
                    limitStoreDTO.setReworkPositionId(org.getReworkPositionId());
                }
            }

            PsiOrderCategory orderCategory = categoryMap.get(limitStoreDTO.getOrderCategoryId());
            if (orderCategory != null) {
                if (StrUtil.isEmpty(limitStoreDTO.getQualifiedStoreId())) {
                    limitStoreDTO.setQualifiedStoreId(orderCategory.getQualifiedStoreId());
                    limitStoreDTO.setQualifiedAreaId(orderCategory.getQualifiedAreaId());
                    limitStoreDTO.setQualifiedPositionId(orderCategory.getQualifiedPositionId());
                }
                if (StrUtil.isEmpty(limitStoreDTO.getDefectStoreId())) {
                    limitStoreDTO.setDefectStoreId(orderCategory.getDefectStoreId());
                    limitStoreDTO.setDefectAreaId(orderCategory.getDefectAreaId());
                    limitStoreDTO.setDefectPositionId(orderCategory.getDefectPositionId());
                }
                if (StrUtil.isEmpty(limitStoreDTO.getScrapStoreId())) {
                    limitStoreDTO.setScrapStoreId(orderCategory.getScrapStoreId());
                    limitStoreDTO.setScrapAreaId(orderCategory.getScrapAreaId());
                    limitStoreDTO.setScrapPositionId(orderCategory.getScrapPositionId());
                }
                if (StrUtil.isEmpty(limitStoreDTO.getReworkStoreId())) {
                    limitStoreDTO.setReworkStoreId(orderCategory.getReworkStoreId());
                    limitStoreDTO.setReworkAreaId(orderCategory.getReworkAreaId());
                    limitStoreDTO.setReworkPositionId(orderCategory.getReworkPositionId());
                }
            }

            storeIds.add(limitStoreDTO.getQualifiedStoreId());
            storeIds.add(limitStoreDTO.getDefectStoreId());
            storeIds.add(limitStoreDTO.getScrapStoreId());
            storeIds.add(limitStoreDTO.getReworkStoreId());
            areaIds.add(limitStoreDTO.getQualifiedAreaId());
            areaIds.add(limitStoreDTO.getDefectAreaId());
            areaIds.add(limitStoreDTO.getScrapAreaId());
            areaIds.add(limitStoreDTO.getReworkAreaId());
            positionIds.add(limitStoreDTO.getQualifiedPositionId());
            positionIds.add(limitStoreDTO.getDefectPositionId());
            positionIds.add(limitStoreDTO.getScrapPositionId());
            positionIds.add(limitStoreDTO.getReworkPositionId());
        }

        storeIds = storeIds.stream().filter(StrUtil::isNotEmpty).collect(Collectors.toSet());
        areaIds = areaIds.stream().filter(StrUtil::isNotEmpty).collect(Collectors.toSet());
        positionIds = positionIds.stream().filter(StrUtil::isNotEmpty).collect(Collectors.toSet());

        if (CollUtil.isNotEmpty(storeIds)) {
            StoreClient storeClient = SpringUtil.getBean(StoreClient.class);
            Map<String, PsiStorageStore> map = storeClient.findByIds4Map(storeIds).handler();

            for (LimitStoreDTO limitStoreDTO : limitStoreDTOS) {
                PsiStorageStore qualifiedStore = map.get(limitStoreDTO.getQualifiedStoreId());
                if (qualifiedStore != null) {
                    limitStoreDTO.setQualifiedStoreName(qualifiedStore.getName());
                }
                PsiStorageStore defectStore = map.get(limitStoreDTO.getDefectStoreId());
                if (defectStore != null) {
                    limitStoreDTO.setDefectStoreName(defectStore.getName());
                }
                PsiStorageStore scrapStore = map.get(limitStoreDTO.getScrapStoreId());
                if (scrapStore != null) {
                    limitStoreDTO.setScrapStoreName(scrapStore.getName());
                }
                PsiStorageStore reworkStore = map.get(limitStoreDTO.getReworkStoreId());
                if (reworkStore != null) {
                    limitStoreDTO.setReworkStoreName(reworkStore.getName());
                }
            }
        }

        if (CollUtil.isNotEmpty(areaIds)) {
            AreaClient areaClient = SpringUtil.getBean(AreaClient.class);
            Map<String, PsiStorageArea> map = areaClient.findByIds4Map(areaIds).handler();
            for (LimitStoreDTO limitStoreDTO : limitStoreDTOS) {
                PsiStorageArea qualifiedArea = map.get(limitStoreDTO.getQualifiedAreaId());
                if (qualifiedArea != null) {
                    limitStoreDTO.setQualifiedAreaName(qualifiedArea.getName());
                }
                PsiStorageArea defectArea = map.get(limitStoreDTO.getDefectAreaId());
                if (defectArea != null) {
                    limitStoreDTO.setDefectAreaName(defectArea.getName());
                }
                PsiStorageArea scrapArea = map.get(limitStoreDTO.getScrapAreaId());
                if (scrapArea != null) {
                    limitStoreDTO.setScrapAreaName(scrapArea.getName());
                }
                PsiStorageArea reworkArea = map.get(limitStoreDTO.getReworkAreaId());
                if (reworkArea != null) {
                    limitStoreDTO.setReworkAreaName(reworkArea.getName());
                }
            }
        }

        if (CollUtil.isNotEmpty(positionIds)) {
            PositionClient positionClient = SpringUtil.getBean(PositionClient.class);
            Map<String, PsiStoragePosition> map = positionClient.findByIds4Map(positionIds).handler();
            for (LimitStoreDTO limitStoreDTO : limitStoreDTOS) {
                PsiStoragePosition qualifiedPosition = map.get(limitStoreDTO.getQualifiedPositionId());
                if (qualifiedPosition != null) {
                    limitStoreDTO.setQualifiedPositionName(qualifiedPosition.getName());
                }
                PsiStoragePosition defectPosition = map.get(limitStoreDTO.getDefectPositionId());
                if (defectPosition != null) {
                    limitStoreDTO.setDefectPositionName(defectPosition.getName());
                }
                PsiStoragePosition scrapPosition = map.get(limitStoreDTO.getScrapPositionId());
                if (scrapPosition != null) {
                    limitStoreDTO.setScrapPositionName(scrapPosition.getName());
                }
                PsiStoragePosition reworkPosition = map.get(limitStoreDTO.getReworkPositionId());
                if (reworkPosition != null) {
                    limitStoreDTO.setReworkPositionName(reworkPosition.getName());
                }
            }
        }
    }
}
