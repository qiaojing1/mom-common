package com.lets.platform.model.mes.kittingModel;

import com.lets.platform.model.psi.mrpModel.UnitModel;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class InProgressModel {
    private String materialId;
    private String materialCode;
    private String materialName;
    private String materialSpecs;
    private String materialCharacteristicNames;
    private UnitModel basicUnit;
    private UnitModel unit;
    private String sourceOrderId;
    private String sourceOrderCode;
    private String sourceDetailId;
    private Long sourceLineNumber;
    private String sourceOrderType;
    private String trackNo;
    private String sourceOrderCustomerId;
    private String sourceOrderCustomerName;
    /**
     * 基本单位数量
     **/
    private BigDecimal quantity;
    private BigDecimal occupiedQuantity;
    private LocalDateTime date;
}
