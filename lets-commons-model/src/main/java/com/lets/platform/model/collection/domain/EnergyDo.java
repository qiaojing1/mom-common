package com.lets.platform.model.collection.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 能耗-实体类
 *
 * @author: DING WEI
 * @date: 2022/12/3 11:50
 */
@Data
public class EnergyDo {

    private String id;

    /**
     * 设备主键
     */
    private String deviceId;

    private String deviceName;

    /**
     * 总量
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalAmount;

    /**
     * 正向无功电总量
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal uselessTotalAmount;

    private BigDecimal totalPrice;
    /**
     * 水、气 价格
     */
    private BigDecimal price;

    /**
     * 尖量
     */
    private BigDecimal tipAmount;

    private BigDecimal tipPrice;

    /**
     * 峰量
     */
    private BigDecimal peakAmount;

    private BigDecimal peakPrice;

    /**
     * 平量
     */
    private BigDecimal flatAmount;

    private BigDecimal flatPrice;

    /**
     * 谷量
     */
    private BigDecimal valleyAmount;

    private BigDecimal valleyPrice;

    /**
     * 租户主键
     */
    private String tenancyId;

    /**
     * 年
     */
    private Integer year;

    /**
     * 月
     */
    private Integer month;

    /**
     * 日
     */
    private Integer day;

    /**
     * 年月日
     */
    private Integer yearMonthDay;

    private String powerPeriod;

    private String powerPriceConfig;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer rank;
}
