package com.lets.platform.model.collection.vo.energy;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 能耗配置信息
 * @author DING WEI
 * @date 2024/12/30 16:59
 * @version 1.0
 */
@Data
public class EnergyConfigVo {

    private String waterPriceId;
    @ApiModelProperty("水价")
    private BigDecimal waterPrice;

    private String gasPriceId;
    @ApiModelProperty("气价")
    private BigDecimal gasPrice;

    @ApiModelProperty("电价是否均价")
    private Boolean powerIsAve;
    @ApiModelProperty("电价-均价")
    private BigDecimal powerPrice;
    @ApiModelProperty("尖价")
    private BigDecimal tipPrice;
    @ApiModelProperty("峰价")
    private BigDecimal peakPrice;
    @ApiModelProperty("平价")
    private BigDecimal flatPrice;
    @ApiModelProperty("谷价")
    private BigDecimal valleyPrice;

    @ApiModelProperty("尖时段")
    private List<EnergyPeriodConfigVo> tipPeriod;
    @ApiModelProperty("峰时段")
    private List<EnergyPeriodConfigVo> peakPeriod;
    @ApiModelProperty("平时段")
    private List<EnergyPeriodConfigVo> flatPeriod;
    @ApiModelProperty("谷时段")
    private List<EnergyPeriodConfigVo> valleyPeriod;

}
