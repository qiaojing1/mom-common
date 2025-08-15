package com.lets.platform.model.psi.mrpModel;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class IncomingModel {
    private String materialId;
    private String materialSpecific;
    private String materialSpecificNames;
    private UnitModel basicUnit;
    private String sourceId;
    private String sourceCode;
    private String sourceDetailId;
    private String sourceOrderType;
    /**
     * 基本单位数量
     **/
    private BigDecimal quantity;
    /**
     * 其他mrp运算占用数量
     **/
    private BigDecimal mrpOccupiedQuantity;
    /**
     * 本次mrp运算占用数量
     **/
    private BigDecimal occupiedQuantity;
    private LocalDateTime date;

    /**
     * mrp源单明细ID(上次计算的)
     **/
    private String mrpSourceDetailId;
}
