package com.lets.platform.model.psi.query;

import lombok.Data;

@Data
public class BarcodeMaterialInventoryQuery {
    private String positionCode;
    private String barcode;
    private boolean ignoreBatchNumber;
    private boolean ignoreSpecific;
}

