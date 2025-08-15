package com.lets.platform.model.psi.query;

import lombok.Data;

import java.util.List;

@Data
public class BarcodeInventoryQuery {
    private String tenancyId;
    private String batchNumber;
    private String positionId;
    private List<BarcodeInventoryMaterial> materialList;
}

