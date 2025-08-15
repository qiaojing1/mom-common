package com.lets.platform.model.psi.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

/**
 * MRP计算 单位模型
 */
@Getter
@Setter
public class StockOutModel {
    private String useId;
    private String detailId;
    private Long lineNumber;
    private String orderCode;
    private String orderType;
    private String materialId;
    private String materialSpecific;
    private String bomDetailId;
    private String storeId;
    private String areaId;
    private String positionId;
    private String batchNumber;
    /**
     * 实际出库数量(基本单位)
     */
    private BigDecimal quantity;

    private String stockInStoreId;
    private String stockInAreaId;
    private String stockInPositionId;

    /**
     * 相同rootDetailId且相同链上的所有orderDetailId
     */
    private Set<String> trackDetailIds;
    /**
     * 相同rootDetailId但不是相同链上的所有orderDetailId
     */
    private Set<String> otherChainTrackDetailIds;
}
