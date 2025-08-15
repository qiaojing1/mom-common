/*
 * csy
 */

package com.lets.platform.model.mes.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @ClassName QuickModifyDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/5/6
 */
@Data
public class QuickModifyDto {
    @ApiModelProperty("需要修改的数据的id")
    private List<String> ids;

    @ApiModelProperty("计划开始时间")
    private LocalDateTime planStartTime;
    @ApiModelProperty("计划结束时间")
    private LocalDateTime planEndTime;
    @ApiModelProperty("工序类型")
    private String processType;
    @ApiModelProperty("委外单价")
    private BigDecimal outsourcePrice;
    @ApiModelProperty("税率")
    private String taxId;
    private String taxName;
    private BigDecimal taxRate;
    private String taxType;
    private Integer taxAccuracy;
    @ApiModelProperty("供应商")
    private String supplierId;
    private String supplierName;
    @ApiModelProperty("发出数量")
    private BigDecimal transferNumber;
    @ApiModelProperty("检验员")
    private String inspector;
    @ApiModelProperty("压力表号及量程")
    private String meterNo;
    @ApiModelProperty("不合格处理单号")
    private String unqualifiedHandleOrder;
    @ApiModelProperty("计件工资")
    private BigDecimal workPrice;
}
