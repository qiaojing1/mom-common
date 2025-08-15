package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * MesBomTemplateTreeWithMoreInfo对象
 * @author DING WEI
 * @date 2025/3/5 16:58
 * @version 1.0
 */
@Getter
@Setter
@ApiModel(value = "MesBomTemplateTreeWithMoreInfo对象", description = "BOM管理")
public class MesBomTemplateTreeWithMoreInfo {

    @ApiModelProperty("跳转主键")
    private String jumpId;

    private String index;

    private String id;
    private String parentId;
    @ApiModelProperty("父项物料编码")
    private String parentMaterialId;
    private String parentMaterialCode;
    private String parentMaterialName;
    private String parentMaterialSpecs;
    private String parentMaterialUnitName;
    private String bomId;

    @ApiModelProperty("BOM编码")
    private String code;

    private String name;

    @ApiModelProperty("子项物料编码")
    private String materialId;
    @ApiModelProperty("子项物料编码")
    private String materialCode;
    @ApiModelProperty("子项物料名称")
    private String materialName;
    @ApiModelProperty("子项物料规格型号")
    private String materialSpecs;
    @ApiModelProperty("子项物料类型")
    private String materialType;

    @ApiModelProperty("是否必须有BOM")
    private String mustHasBom;

    @ApiModelProperty("子项BOM版本主键")
    private String bomVersionId;
    private String bomVersion;
    private String bomVersionDescribe;

    private String endlessLoop;
    private String hasEndlessLoop;

    @ApiModelProperty("子项库存单位")
    private String storeUnitId;
    private String storeUnitName;
    private Integer storeUnitAccuracy;
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("忽略断阶[NY]")
    private String ignoreDisconnect;
    private String ignoreDisconnectName;

    @ApiModelProperty("用量类型[1变动2固定]")
    private String dosageType;
    private String dosageTypeName;

    @ApiModelProperty("分子用量")
    private BigDecimal numeratorDosage;
    private String numeratorDosageFormat;

    @ApiModelProperty("分母用量")
    private BigDecimal denominatorDosage;
    private String denominatorDosageFormat;

    @ApiModelProperty("固定损耗")
    private BigDecimal fixedLoss;
    private String fixedLossFormat;

    @ApiModelProperty("变动损耗率(%)")
    private BigDecimal changeLossRate;
    private String changeLossRateFormat;

    @ApiModelProperty("允许替代[YN]")
    private String allowReplace;
    private String allowReplaceName;

    private String tenancyId;

    @ApiModelProperty("物料是否启用")
    private Integer materialEnable;
    private String materialEnableName;

    @ApiModelProperty("生命周期状态")
    private String materialLifeCycle;
    private String materialLifeCycleName;

    @ApiModelProperty("BOM类型")
    private Integer bomType;
    private String bomTypeName;

    @ApiModelProperty("BOM是否启用")
    private Integer enable;
    private String enableName;

    @ApiModelProperty("BOM数据状态")
    private Integer status;
    private String statusName;

    /**
     * @see com.lets.platform.model.mes.enums.BomEffectivenessStatusEnum
     */
    @ApiModelProperty("有效状态")
    private String effectivenessStatus;
    private String effectivenessStatusName;

    private List<MesBomTemplateTreeWithMoreInfo> children;

    private Set<String> parentIds;
}
