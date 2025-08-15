package com.lets.platform.model.mes.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 单件工序任务清单
 * @author DING WEI
 * @since 2024-02-22
 */
@Data
public class MesProduceJobSingletonProcessMaterial {

    @ApiModelProperty("工序物料1")
    private String processMaterial1;
    @ApiModelProperty("工序物料2")
    private String processMaterial2;
    @ApiModelProperty("工序物料3")
    private String processMaterial3;
    @ApiModelProperty("工序物料4")
    private String processMaterial4;
    @ApiModelProperty("工序物料5")
    private String processMaterial5;
    @ApiModelProperty("工序物料6")
    private String processMaterial6;
    @ApiModelProperty("工序物料7")
    private String processMaterial7;
    @ApiModelProperty("工序物料8")
    private String processMaterial8;
    @ApiModelProperty("工序物料9")
    private String processMaterial9;
    @ApiModelProperty("工序物料10")
    private String processMaterial10;

    @ApiModelProperty("工序物料1扫码时间")
    private LocalDateTime scanTime1;
    @ApiModelProperty("工序物料2扫码时间")
    private LocalDateTime scanTime2;
    @ApiModelProperty("工序物料3扫码时间")
    private LocalDateTime scanTime3;
    @ApiModelProperty("工序物料4扫码时间")
    private LocalDateTime scanTime4;
    @ApiModelProperty("工序物料5扫码时间")
    private LocalDateTime scanTime5;
    @ApiModelProperty("工序物料6扫码时间")
    private LocalDateTime scanTime6;
    @ApiModelProperty("工序物料7扫码时间")
    private LocalDateTime scanTime7;
    @ApiModelProperty("工序物料8扫码时间")
    private LocalDateTime scanTime8;
    @ApiModelProperty("工序物料9扫码时间")
    private LocalDateTime scanTime9;
    @ApiModelProperty("工序物料10扫码时间")
    private LocalDateTime scanTime10;

}
