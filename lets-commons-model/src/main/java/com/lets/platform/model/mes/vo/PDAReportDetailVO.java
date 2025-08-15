package com.lets.platform.model.mes.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PDAReportDetailVO {

    private String id;

    private Integer status;

    private Integer inspectType;

    private BigDecimal availableQuantity;

    private BigDecimal reportQuantity;

    private BigDecimal qualifiedQuantity;

    private BigDecimal unqualifiedQuantity;

    private BigDecimal repairQuantity;

    private BigDecimal scrapQuantity;

    private BigDecimal defectQuantity;

    private LocalDate date;

    private String code;

    private String orderType = "生产派工单";

    private String factoryModeName;

    private String processId;

    private String processCode;

    private String processName;

    private String processSign;

    private String materialId;

    private String materialName;

    private String materialCode;

    private String materialSpecs;

    private String materialCharacteristicNames;

    private String unitId;

    private String unitCode;

    private String unitName;

    private Integer unitAccuracy;

    private Integer unitRoundOffType;

    @JsonFormat(pattern = "MM-dd HH:mm")
    private LocalDateTime planStartTime;

    @JsonFormat(pattern = "MM-dd HH:mm")
    private LocalDateTime planEndTime;

    private BigDecimal finishQuantity;

    private BigDecimal dispatchQuantity;

    private String batchNumber;

    private String trackNo;

    private String sourceOrderCustomerName;

    private BigDecimal workPrice;

    private String processPlanCode;

    private LocalDateTime processPlanStartTime;

    private LocalDateTime processPlanEndTime;

    private List<PDAReportRepairProcessVO> repairProcessList;
}
