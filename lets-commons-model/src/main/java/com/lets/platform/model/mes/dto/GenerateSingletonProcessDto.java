package com.lets.platform.model.mes.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 生成单件工序任务清单-数据传输对象
 * @author: DING WEI
 * @date: 2024/2/22 10:20
 */
@Data
public class GenerateSingletonProcessDto {

    private String jobOrderId;
    private String jobOrderCode;
    private LocalDateTime jobOrderTime;
    private String jobOrderDetailId;
    private String routeId;
    private String routeName;
    private String materialId;
    private String materialCode;
    private String materialName;
    private String materialSpecs;
    private String drawingNo;
    private String drawingVersion;
    private String factoryModeId;
    private String factoryModeName;

    private String batchNumber;
    private BigDecimal number;

}
