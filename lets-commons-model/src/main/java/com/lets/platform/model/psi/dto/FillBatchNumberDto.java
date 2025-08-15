package com.lets.platform.model.psi.dto;

import com.lets.platform.model.psi.entity.PsiReservationRelationship;
import com.lets.platform.model.psi.entity.PsiStoreMaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * 填入批号
 *
 * @author: DING WEI
 * @date: 2023/11/29 9:25
 */
@Data
@ApiModel("填入批号")
public class FillBatchNumberDto {

    @ApiModelProperty("行号")
    private String lineNumber;

    @ApiModelProperty("物料主键")
    private String materialId;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("物料特征KEY")
    private String materialSpecific;
    private String materialSpecificName;

    @ApiModelProperty("仓库")
    private String storeId;
    private String storeName;
    private String storeType;
    @ApiModelProperty("库区")
    private String areaId;
    private String areaName;
    @ApiModelProperty("库位")
    private String positionId;
    private String positionName;

    @ApiModelProperty("生产日期(排序字段)")
    private LocalDateTime produceTimeSort;
    @ApiModelProperty("生产日期")
    private LocalDateTime produceTime;
    @ApiModelProperty("保质期到期日")
    private LocalDateTime periodDate;
    @ApiModelProperty("库存数量")
    private BigDecimal availableNumber;
    @ApiModelProperty("库存单位")
    private String inventoryUnitId;
    private String inventoryUnitName;
    private Integer inventoryUnitAccuracy;
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("库存单位(用户自己选择)")
    private String paramInventoryUnitId;
    private Integer paramInventoryUnitAccuracy;
    private Integer paramInventoryUnitRoundOffType;
    @ApiModelProperty("数量(用户自己填写)")
    private BigDecimal paramNumber;
    @ApiModelProperty("是否需要填充批号[Y/N]")
    private String fill;
    @ApiModelProperty("剩余库存数量")
    private BigDecimal surplusAvailableNumber;
    @ApiModelProperty("拆分来源主键")
    private String splitFromId;

    @ApiModelProperty("基本单位")
    private String basicUnitId;

    @ApiModelProperty("入库日期")
    private LocalDateTime createTime;
    private String id;
    private String pickStrategy;

    @ApiModelProperty(hidden = true)
    private String storeKey;
    private List<PsiStoreMaterialSpecific> specifics;

    private String useId;

    private String bomDetailId;

    @ApiModelProperty(hidden = true)
    private Map<String, BigDecimal> relationshipQuantity;

    private List<PsiReservationRelationship> relationshipList;
}
