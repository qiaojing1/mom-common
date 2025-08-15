package com.lets.platform.model.psi.query;

import lombok.Data;

/**
 * 填入批号
 *
 * @author: DING WEI
 * @date: 2023/11/29 9:25
 */
@Data
public class BarcodeInventoryMaterial {
    private String materialId;
    private String materialSpecific;
    private String batchNumber;
    private String positionId;
}
