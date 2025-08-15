package com.lets.platform.model.psi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * BOM物料-明细信息
 * @author DING WEI
 * @date 2023/11/23 18:35
 * @version 1.0
 */
@Data
@ApiModel(value = "BOM物料-明细信息")
public class PsiBomDetailMaterial {

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
    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料属性")
    private String type;
    private String typeName;

    @ApiModelProperty("单据状态")
    private Integer status;
    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    private Integer enable;

    private String groupId;

    @ApiModelProperty("库存单位")
    private String inventoryUnitId;
    private String inventoryUnitCode;
    private String inventoryUnitName;
    private Integer inventoryUnitAccuracy;
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("倒冲领料")
    private Integer productionIssueReversible;
    @ApiModelProperty("领料方式")
    private String pickingWay;

    @ApiModelProperty("发料考虑损耗")
    private Integer issueConsiderLoss;

    @ApiModelProperty("生产单位")
    private String productionUnitId;
    private String productionUnitCode;
    private String productionUnitName;
    private Integer productionUnitAccuracy;
    private Integer productionUnitRoundOffType;

    @ApiModelProperty("基本单位")
    private String basicUnitId;
    private String basicUnitCode;
    private String basicUnitName;
    private Integer basicUnitAccuracy;
    private Integer basicUnitRoundOffType;

    private String storable;

    private String inventoryStoreId;
    private String inventoryStoreName;
    private String inventoryAreaId;
    private String inventoryAreaName;
    private String inventoryPositionId;
    private String inventoryPositionName;

    private String lotNoControlType;
    private String lotNoScope;
    private BigDecimal productionDailyOutput;
    private String productionLineId;
    private String productionWorkshopId;
}
