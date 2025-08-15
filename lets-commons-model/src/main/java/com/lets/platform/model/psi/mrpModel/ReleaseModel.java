package com.lets.platform.model.psi.mrpModel;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ReleaseModel {
    private String releaseSourceId;
    private String sourceDetailId;
    private String materialId;
    private BigDecimal quantity;
}
