package com.lets.platform.model.mes.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProducePickingApplyVO {
    private String key;
    private String orderId;
    private String orderCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;
    private String produceOrderId;
    private String produceOrderCode;
    private Long produceLineNumber;
    private String produceOrderDetailId;
    private String produceMaterialId;
    private String produceMaterialCode;
    private String produceMaterialName;
    private String produceMaterialSpecs;
    private String produceMaterialSpecificName;
    private BigDecimal produceQuantity;
    private BigDecimal quantity;
    private String trackNo;
    private String sourceOrderCustomerId;
    private String sourceOrderCustomerName;
}
