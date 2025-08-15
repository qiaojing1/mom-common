package com.lets.platform.model.psi.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateSaleOrderQuantityDTO {
    private String detailId;
    private BigDecimal quantity;
    private BigDecimal beforeQuantity;
    private BigDecimal occupiedQuantity;
    private BigDecimal beforeOccupiedQuantity;
    private boolean isOver;
}

