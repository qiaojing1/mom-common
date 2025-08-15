package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * MesBomTemplateTree对象
 * @author DING WEI
 * @date 2025/3/5 16:58
 * @version 1.0
 */
@Getter
@Setter
@ApiModel(value = "MesBomTemplateTree对象", description = "BOM管理")
public class MesBomTemplateTree {

    private String index;
    private String parentIndex;
    private String groupName;
    private String group;
    private String id;
    private String bomId;

    /**
     * @see com.lets.platform.model.mes.enums.BillSubTypeEnum
     */
    private String subType;

    private String code;

    private String name;

    private String materialId;
    private String materialCode;
    private String materialName;
    private String materialType;
    private String materialSpecs;
    private String materialGroupId;
    private String materialGroupName;

    private String productUnitName;
    private String bomVersion;
    private String bomVersionId;
    private String bomVersionDescribe;

    private String parentId;

    private String endlessLoop;
    private BigDecimal finishProductRate;
    private String dosageType;
    private String ignoreDisconnect;
    private BigDecimal numeratorDosage;
    private BigDecimal denominatorDosage;
    private BigDecimal fixedLoss;
    private BigDecimal changeLossRate;
    private String storeUnitId;
    private String storeUnitName;
    private Integer storeUnitAccuracy;
    private Integer storeUnitRoundOffType;

    private String tenancyId;

    private List<MesBomTemplateTree> children;

    private Set<String> parentIds;
    private String typeName;
    private Integer type;

}
