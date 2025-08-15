package com.lets.platform.model.psi.mrpModel;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.model.psi.entity.PsiMaterial;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

/**
 * MRP计算 BOM模型
 */
@Data
public class MaterialModel {

    private final String materialId;

    private final String materialGroupId;

    private final String materialCode;

    private final String materialName;

    private final String materialSpecs;

    private final String materialType;

    private final BigDecimal safeQuantity;

    private final boolean purchaseDynamicLead;

    private final BigDecimal purchaseLeadDay;

    private final BigDecimal purchaseChangeLeadDay;

    private final BigDecimal purchaseVariableLotQuantity;

    private final boolean productionDynamicLead;

    private final BigDecimal productionLeadDay;

    private final BigDecimal productionChangeLeadDay;

    private final BigDecimal productionVariableLotQuantity;

    private final UnitModel basicUnit;

    private final UnitModel purchaseUnit;

    private final UnitModel inventoryUnit;

    private final UnitModel productionUnit;

    private final boolean inspectionDynamicLead;

    private final BigDecimal inspectionLeadDay;

    private final BigDecimal inspectionChangeLeadDay;

    private final BigDecimal inspectionVariableLotQuantity;

    private final String factoryModeId;

    public MaterialModel(PsiMaterial material, Map<String, UnitModel> unitModelMap) {
        this.materialId = material.getId();

        this.materialGroupId = material.getGroupId();

        this.materialCode = material.getCode();

        this.materialName = material.getName();

        this.materialSpecs = material.getSpecs();

        this.materialType = material.getType();

        this.purchaseDynamicLead = IsOrNotEnum.IS.equals(material.getMaterialPlan().getPurchaseDynamicLead());

        this.purchaseLeadDay = BigDecimal.valueOf(Optional.ofNullable(material.getMaterialPlan().getPurchaseLeadDay()).orElse(0L));

        this.purchaseChangeLeadDay = BigDecimal.valueOf(Optional.ofNullable(material.getMaterialPlan().getPurchaseChangeLeadDay()).orElse(0L));

        this.purchaseVariableLotQuantity = Optional.ofNullable(material.getMaterialPlan().getPurchaseVariableLotQuantity()).orElse(BigDecimal.ZERO);

        this.productionDynamicLead = IsOrNotEnum.IS.equals(material.getMaterialPlan().getProductionDynamicLead());

        this.productionLeadDay = BigDecimal.valueOf(Optional.ofNullable(material.getMaterialPlan().getProductionLeadDay()).orElse(0L));

        this.productionChangeLeadDay = BigDecimal.valueOf(Optional.ofNullable(material.getMaterialPlan().getProductionChangeLeadDay()).orElse(0L));

        this.productionVariableLotQuantity = Optional.ofNullable(material.getMaterialPlan().getProductionVariableLotQuantity()).orElse(BigDecimal.ZERO);

        this.inspectionDynamicLead = IsOrNotEnum.IS.equals(material.getMaterialPlan().getInspectionDynamicLead());

        this.inspectionLeadDay = BigDecimal.valueOf(Optional.ofNullable(material.getMaterialPlan().getInspectionLeadDay()).orElse(0L));

        this.inspectionChangeLeadDay = BigDecimal.valueOf(Optional.ofNullable(material.getMaterialPlan().getInspectionChangeLeadDay()).orElse(0L));

        this.inspectionVariableLotQuantity = Optional.ofNullable(material.getMaterialPlan().getInspectionVariableLotQuantity()).orElse(BigDecimal.ZERO);

        this.basicUnit = unitModelMap.get(material.getBasicUnitId());

        this.purchaseUnit = unitModelMap.get(material.getMaterialPurchase().getPurchaseUnitId());

        this.inventoryUnit = unitModelMap.get(material.getMaterialInventory().getInventoryUnitId());

        this.productionUnit = unitModelMap.get(material.getMaterialProduction().getProductionUnitId());

        this.safeQuantity = Optional.ofNullable(material.getMaterialInventory().getInventorySafeQuantity()).orElse(BigDecimal.ZERO);

        if (StrUtil.isNotEmpty(material.getMaterialProduction().getProductionLineId())) {

            this.factoryModeId = material.getMaterialProduction().getProductionLineId();
        } else if (StrUtil.isNotEmpty(material.getMaterialProduction().getProductionWorkshopId())) {

            this.factoryModeId = material.getMaterialProduction().getProductionWorkshopId();
        } else {

            this.factoryModeId = null;
        }
    }
}

