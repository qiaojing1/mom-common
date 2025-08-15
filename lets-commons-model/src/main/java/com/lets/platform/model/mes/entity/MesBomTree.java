package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * MesBomTree对象
 * @author DING WEI
 * @since 2023-11-07
 */
@Getter
@Setter
@ApiModel(value = "MesBomTree对象", description = "BOM管理")
public class MesBomTree {

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

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;
    @ApiModelProperty("物料类型")
    private String materialType;
    private String materialTypeName;
    @ApiModelProperty("规格型号")
    private String materialSpecs;
    @ApiModelProperty("图号")
    private String drawingNumber;
    @ApiModelProperty("主材质")
    private String mainMaterial;
    @ApiModelProperty("净重")
    private String netWeight;
    @ApiModelProperty("物料分组")
    private String materialGroupId;
    private String materialGroupName;

    @ApiModelProperty(value = "必须有BOM")
    private String mustHasBom;

    @ApiModelProperty("生产单位")
    private String productUnitId;
    private String productUnitName;
    private Integer productUnitAccuracy;
    private Integer productUnitRoundOffType;

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
    @ApiModelProperty("子项单位")
    private String storeUnitId;
    private String storeUnitName;
    private Integer storeUnitAccuracy;
    private Integer storeUnitRoundOffType;
    @ApiModelProperty("是否关键件")
    private Integer productionKeyComponents;
    @ApiModelProperty("发料考虑损耗[01]")
    private Integer issueConsiderLoss;
    @ApiModelProperty("领料方式")
    private String pickingWay;

    private String tenancyId;

    private List<MesBomTree> children;

    private Set<String> parentIds;
    private Map<String, String> parentMap;
    private String typeName;
    private Integer type;

    @ApiModelProperty("节点颜色标记")
    private String colour;

    // CAD需求额外加的字段
    private String cadOriginalFilename;
    private String mainRepeatName;
    private String materialMatchKey;
    @ApiModelProperty("物料是否存在[YN]")
    private String materialExist;

}
