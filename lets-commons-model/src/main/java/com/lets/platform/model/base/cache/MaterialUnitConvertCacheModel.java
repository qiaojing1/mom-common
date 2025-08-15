package com.lets.platform.model.base.cache;

import com.lets.platform.model.psi.entity.PsiMaterialUnitConvert;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 单位转换
 */
@Data
public class MaterialUnitConvertCacheModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private String materialId;
    private String sourceUnitId;
    private String sourceUnitParentCode;
    private String targetUnitId;
    private String targetUnitParentCode;
    private BigDecimal sourceFactor;
    private BigDecimal targetFactor;

    public MaterialUnitConvertCacheModel(PsiMaterialUnitConvert materialUnitConvert) {
        if (materialUnitConvert != null) {
            this.type = materialUnitConvert.getType();
            this.materialId = materialUnitConvert.getMaterialId();
            this.sourceUnitId = materialUnitConvert.getSourceUnitId();
            this.sourceUnitParentCode = materialUnitConvert.getSourceUnitParentCode();
            this.targetUnitId = materialUnitConvert.getTargetUnitId();
            this.targetUnitParentCode = materialUnitConvert.getTargetUnitParentCode();
            this.sourceFactor = materialUnitConvert.getSourceFactor();
            this.targetFactor = materialUnitConvert.getTargetFactor();
        }
    }
}
