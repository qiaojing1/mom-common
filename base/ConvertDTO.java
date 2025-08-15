package com.lets.platform.common.pojo.base;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ConvertDTO {

    private String key;

    private String materialId;

    private String sourceUnitId;

    private String targetUnitId;

    private BigDecimal quantity;

    private BigDecimal result;
}
