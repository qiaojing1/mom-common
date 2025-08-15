package com.lets.platform.model.psi.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 填入批号
 *
 * @author: DING WEI
 * @date: 2023/11/29 9:25
 */
@Data
public class BarcodeInventoryQuantity {
    private String barcodes;
    private List<String> barcodeList;
    private String materialId;
    private String materialCode;
    private String materialName;
    private String materialType;
    private String materialSpecs;
    private String materialSpecific;
    private String materialCharacteristicNames;
    /**
     * 基本单位数量
     */
    private BigDecimal quantity;
    private BigDecimal inventoryQuantity;
    private String basicUnitId;
    private String basicUnitCode;
    private String basicUnitName;
    private Integer basicUnitAccuracy;
    private String basicUnitRoundOffType;
    private String batchNumber;
    private LocalDateTime stockInTime;
    private String storeId;
    private String storeCode;
    private String storeName;
    private String areaId;
    private String areaCode;
    private String areaName;
    private String positionId;
    private String positionCode;
    private String positionName;
}
