package com.lets.platform.model.psi.mrpModel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * MRP计算 BOM模型
 */
@Data
public class BomModel {

    private String bomId;

    private String bomDetailId;

    private String bomCode;

    private String bomName;

    private Integer bomType;

    private String bomVersion;

    private String parentId;

    private String materialId;

    private String materialCode;

    private String materialName;

    private String materialSpecs;

    private String materialType;

    private String mustHasBom;

    private String pickingWay;

    private String subType;

    private UnitModel basicUnit;

    private UnitModel unit;

    private UnitModel subUnit;

    /**
     * 成品率
     */
    private BigDecimal finishProductRate;

    /**
     * 所属分组
     */
    private String groupId;

    /**
     * 忽略断阶
     */
    private String ignoreDisconnect;

    /**
     * 用量类型[1变动2固定]
     */
    private String dosageType;

    private BigDecimal numeratorDosage;

    private BigDecimal denominatorDosage;

    private BigDecimal fixedLoss;

    private Integer issueConsiderLoss;
    private BigDecimal changeLossRate;

    /**
     * 允许替代[Y/N]
     */
    private String allowReplace;

    private List<BomModel> children;

    private Integer status;

    private Integer enable;
}
