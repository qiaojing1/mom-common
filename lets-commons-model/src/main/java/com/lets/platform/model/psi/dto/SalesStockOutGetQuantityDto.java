package com.lets.platform.model.psi.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 销售出库 单位切换
 * @author: DING WEI
 * @date: 2023/12/12 10:59
 */
@Data
public class SalesStockOutGetQuantityDto {

    private String notifyMaterialId;
    private String sourceInventoryUnitId;
    private String targetInventoryUnitId;
    private String storeId;
    private String areaId;
    private String positionId;
    private String batchNumber;
    private BigDecimal quantity;
    private String materialId;
    private String materialSpecific;

}
