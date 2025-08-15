package com.lets.platform.model.psi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * BOM物料信息
 * @author DING WEI
 * @date 2023/11/23 18:35
 * @version 1.0
 */
@Data
@ApiModel(value = "BOM物料信息")
public class PsiBomMaterial {

    private String id;

    @ApiModelProperty("物料编码")
    private String code;
    @ApiModelProperty("物料名称")
    private String name;
    @ApiModelProperty("规格型号")
    private String specs;
    @ApiModelProperty("助记码")
    private String mnemonicCode;
    @ApiModelProperty("旧编码")
    private String oldCode;
    @ApiModelProperty("图号")
    private String drawingNumber;
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料属性")
    private String type;
    private String typeName;

    private String groupId;
    private String groupName;

    @ApiModelProperty("单据状态")
    private Integer status;
    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    private Integer enable;

    @ApiModelProperty("生产单位")
    private String productionUnitId;
    private String productionUnitName;
    private Integer productionUnitAccuracy;
    private Integer productionUnitRoundOffType;

    @ApiModelProperty("子件单位")
    private String productionSubUnitId;
    private String productionSubUnitCode;
    private String productionSubUnitName;
    private Integer productionSubUnitAccuracy;
    private Integer productionSubUnitRoundOffType;

    @ApiModelProperty("是否关键件")
    private Integer productionKeyComponents;
    @ApiModelProperty("发料考虑损耗[01]")
    private Integer issueConsiderLoss;

    @ApiModelProperty("生命周期主键")
    private String lifeCycleId;
    @ApiModelProperty("生命周期是否启用")
    private Integer lifeCycleEnable;
    @ApiModelProperty("生命周期失效状态")
    private String loseEfficacy;

    @ApiModelProperty("默认发料仓库")
    private String productionIssueStoreId;
    private String productionIssueStoreName;
    private Integer productionIssueStoreEnable;
    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    private String productionIssueStoreEnableArea;
    @ApiModelProperty("默认发料库区")
    private String productionIssueAreaId;
    private String productionIssueAreaName;
    private Integer productionIssueAreaEnable;
    /**
     * @see com.lets.platform.common.pojo.enums.YesOrNo
     */
    private String productionIssueAreaEnablePosition;
    @ApiModelProperty("默认发料库位")
    private String productionIssuePositionId;
    private String productionIssuePositionName;
    private Integer productionIssuePositionEnable;
    /**
     * @see com.lets.platform.model.psi.enums.ProductionOverTypeEnum
     */
    @ApiModelProperty("超发控制方式")
    private Integer productionOverType;
    @ApiModelProperty("发料批量")
    private BigDecimal productionIssueLotQuantity;
    /**
     * @see com.lets.platform.model.psi.enums.ControlTypeEnum
     */
    @ApiModelProperty("发料批量控制方式")
    private String productionIssueLotControlType;

    @ApiModelProperty("启用保质期管理[0:不启用;1:启用]")
    private Integer expirationDateManaged;
    /**
     * @see com.lets.platform.model.psi.enums.ControlTypeEnum
     */
    @ApiModelProperty("保质期控制方式")
    private String expirationDateControlType;

    @ApiModelProperty("货架寿命")
    private Short shelfLife;
    @ApiModelProperty("货架寿命单位")
    private String shelfLifeUnit;

    @ApiModelProperty("库存单位")
    private String inventoryUnitId;
    private String inventoryUnitCode;
    private String inventoryUnitName;
    private Integer inventoryUnitAccuracy;
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("基本单位")
    private String basicUnitId;
    private String basicUnitCode;
    private String basicUnitName;
    private Integer basicUnitAccuracy;
    private Integer basicUnitRoundOffType;

    /**
     * @see com.lets.platform.model.psi.enums.PickStrategyEnum
     */
    @ApiModelProperty("拣货策略")
    private String pickStrategy;
    @ApiModelProperty("批号控制方式")
    private String lotNoControlType;
    @ApiModelProperty("批号控制范围")
    private String lotNoScope;
    @ApiModelProperty("库存属性-默认仓库")
    private String inventoryStoreId;
    private String inventoryStoreName;
    @ApiModelProperty("库存属性-默认库区")
    private String inventoryAreaId;
    private String inventoryAreaName;
    @ApiModelProperty("库存属性-默认库位")
    private String inventoryPositionId;
    private String inventoryPositionName;

    @ApiModelProperty("领料方式")
    private String pickingWay;
}
